package io.swagger.client.service.impl;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.AccountsApi;
import io.swagger.client.exception.BadRequestException;
import io.swagger.client.exception.InvalidTokenException;
import io.swagger.client.model.PageOfAccountSearchModel;
import io.swagger.client.service.AccountService;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountsApi accountsApi;


    public AccountServiceImpl(AccountsApi accountsApi) {
        this.accountsApi = accountsApi;
    }

    @PostConstruct
    private void authenticate(){
        refreshToken();
    }


    @Override
    @Retryable(value = InvalidTokenException.class, maxAttempts = 2)
    public PageOfAccountSearchModel getAllAccounts(String activeStatus, String filter, Integer pageLimit, Integer pageOffset, List<String> sort) {
        PageOfAccountSearchModel result = null;
        try {
            result = accountsApi.readAccountsUsingGET1(activeStatus, filter, pageLimit, pageOffset, sort);
        } catch (ApiException e) {
            if (e.getResponseBody().contains("invalid_token")) {
                refreshToken();
            }
            else
                throw new BadRequestException(e.getResponseBody());
        }
        return result;
    }


    private static String base64EncodedBasicAuthentication() {
        String auth = System.getenv("CLIENT_ID") + ":" + System.getenv("CLIENT_SECRET");
        return Base64.getEncoder().encodeToString(auth.getBytes());
    }


    private void refreshToken() {
        try {
            OAuthClient client = new OAuthClient(new URLConnectionClient());

            OAuthClientRequest request =
                    OAuthClientRequest.tokenLocation(System.getenv("TOKEN_URL"))
                            .setGrantType(GrantType.CLIENT_CREDENTIALS)
                            .setClientId(System.getenv("CLIENT_ID"))
                            .setClientSecret(System.getenv("CLIENT_SECRET"))
                            .buildQueryMessage();
            request.addHeader("Accept", "application/json");
            request.addHeader("Content-Type", "application/json");
            request.addHeader("Authorization", "Basic " + base64EncodedBasicAuthentication());

            OAuthAccessTokenResponse token = client.accessToken(request, OAuth.HttpMethod.POST, OAuthJSONAccessTokenResponse.class);
            String accessToken = token.getAccessToken();
            System.out.println(token.getBody() + "\n");
            ApiClient defaultClient = Configuration.getDefaultApiClient();
            io.swagger.client.auth.OAuth OAuth2ClientCredentials = (io.swagger.client.auth.OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
            OAuth2ClientCredentials.setAccessToken(accessToken);

        } catch (Exception exn) {
            exn.printStackTrace();
        }
    }

}
