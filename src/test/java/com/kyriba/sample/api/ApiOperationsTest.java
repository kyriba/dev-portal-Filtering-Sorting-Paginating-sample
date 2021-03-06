/*
 * Accounts
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kyriba.sample.api;

import com.kyriba.sample.exception.ApiException;

import org.junit.Test;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * API tests for AccountsApi
 */
@Ignore
public class ApiOperationsTest {

     @Autowired
    private ApiOperations api;
    
    /**
     * List accounts.yaml (all accounts.yaml or a selection of accounts.yaml).
     *
     * An empty list is returned if no accounts.yaml are available. The following fields can be used for filter and sort: - **code** - **uuid** - **description** - **company.uuid** - **company.code** - **branch.uuid** - **branch.code** - **bank.uuid** - **bank.code** - **currency.uuid** - **currency.code** - **country.code** - **accountType** available values &#x3D; {BANK_ACCOUNT,INTERCOMPANY_ACCOUNT,OTHER_ACCOUNT,SHARED_ACCOUNT} - **banCode** - **creationDate** - **updateDate** - **closingDate** - **activeStatus** available values &#x3D; {OPENED,CLOSED} - **statementIdentifier**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountsUsingGET1Test() throws ApiException {
        String activeStatus = null;
        String filter = null;
        Integer pageLimit = null;
        Integer pageOffset = null;
        List<String> sort = null;
        String response = api.readAccountsUsingGET1(activeStatus, filter, pageLimit, pageOffset, sort);

        // TODO: test validations
    }
    
}
