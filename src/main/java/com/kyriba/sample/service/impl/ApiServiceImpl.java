package com.kyriba.sample.service.impl;

import com.kyriba.sample.ApiClient;
import com.kyriba.sample.ApiException;
import com.kyriba.sample.api.ApiOperations;
import com.kyriba.sample.exception.InvalidTokenException;
import com.kyriba.sample.exception.BadRequestException;
import com.kyriba.sample.model.PageOfAccountSearchModel;
import com.kyriba.sample.service.AccountService;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final ApiOperations apiOperations;
    @Value("${access.token.url}")
    String tokenUrl;
    @Value("${client.id}")
    String clientId;
    @Value("${client.secret}")
    String clientSecret;


    public AccountServiceImpl(@Qualifier("apiOperations") ApiOperations apiOperations) {
        this.apiOperations = apiOperations;
    }

    @PostConstruct
    private void authenticate() {
        refreshToken();
    }


    @Override
    public PageOfAccountSearchModel getAllAccounts(String activeStatus, String filter, Integer pageLimit, Integer pageOffset, List<String> sort) {
        PageOfAccountSearchModel result;
        try {
            result = apiOperations.readAccountsUsingGET1(activeStatus, filter, pageLimit, pageOffset, sort);
        } catch (InvalidTokenException e) {
            refreshToken();
            result = getAllAccounts(activeStatus, filter, pageLimit, pageOffset, sort);
            System.out.println(result);
            return result;
        } catch
        (ApiException e) {
            throw new BadRequestException(e.getResponseBody());
        }
        return result;
    }


    private String base64EncodedBasicAuthentication() {
        String auth = clientId + ":" + clientSecret;
        return Base64.getEncoder().encodeToString(auth.getBytes());
    }


    private void refreshToken() {
        try {
            OAuthClient client = new OAuthClient(new URLConnectionClient());

            OAuthClientRequest request =
                    OAuthClientRequest.tokenLocation(tokenUrl)
                            .setGrantType(GrantType.CLIENT_CREDENTIALS)
                            .setClientId(clientId)
                            .setClientSecret(clientSecret)
                            .buildQueryMessage();
            request.addHeader("Accept", "application/json");
            request.addHeader("Content-Type", "application/json");
            request.addHeader("Authorization", "Basic " + base64EncodedBasicAuthentication());

            OAuthAccessTokenResponse token = client.accessToken(request, OAuth.HttpMethod.POST, OAuthJSONAccessTokenResponse.class);
            String accessToken = token.getAccessToken();
            System.out.println(token.getBody());
            ApiClient defaultClient = apiOperations.getApiClient();
            com.kyriba.sample.auth.OAuth OAuth2ClientCredentials = (com.kyriba.sample.auth.OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
            OAuth2ClientCredentials.setAccessToken(accessToken);

        } catch (Exception exn) {
            exn.printStackTrace();
        }
    }

    @Override
    public String getBaseUrl() {
        return apiOperations.getApiClient().getBasePath();
    }

    @Override
    public String getRequestMapping() {
        return apiOperations.getRequestMapping();
    }
}
