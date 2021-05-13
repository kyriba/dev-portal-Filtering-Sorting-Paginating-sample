package io.swagger.client.controller;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.AccountsApi;
import io.swagger.client.model.PageOfAccountSearchModel;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Base64;

@Controller(value = "/accounts")
public class AccountsApiController {
    private AccountsApi accountsApi;
    private static String accessToken;

    static {

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
            accessToken = token.getAccessToken();
            System.out.println(token.getBody()+ "\n");

        } catch (Exception exn) {
            exn.printStackTrace();
        }
    }

    private static String base64EncodedBasicAuthentication() {
        String auth = System.getenv("CLIENT_ID") + ":" + System.getenv("CLIENT_SECRET");
        return Base64.getEncoder().encodeToString(auth.getBytes());
    }

    public AccountsApiController(AccountsApi accountsApi) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        io.swagger.client.auth.OAuth OAuth2ClientCredentials = (io.swagger.client.auth.OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
        OAuth2ClientCredentials.setAccessToken(accessToken);
        this.accountsApi = accountsApi;
    }

    @GetMapping
    public String getAccounts(Model model){
        PageOfAccountSearchModel result = null;
        try {
            result = accountsApi.readAccountsUsingGET1(null, null, null, null, null);
//            AccountDetailsDto result = accountsApi.read("C05-DEMO-EUR");
//              AccountDetailsDto result = apiInstance.readAccountUsingGET3(UUID.fromString("123e4567-e89b-12d3-a456-426655440001"));
            System.out.println(result);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
        model.addAttribute("result", result);
        return "accounts-list";
    }


}
