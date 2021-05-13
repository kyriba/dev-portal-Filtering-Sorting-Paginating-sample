# AccountsApi

All URIs are relative to *https://demo.kyriba.com/gateway/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST1**](AccountsApi.md#createUsingPOST1) | **POST** /v1/accounts | Create a new account.
[**deleteByCodeUsingDELETE1**](AccountsApi.md#deleteByCodeUsingDELETE1) | **DELETE** /v1/accounts/code&#x3D;{code} | Delete a specific account identified by a code.
[**deleteUsingDELETE1**](AccountsApi.md#deleteUsingDELETE1) | **DELETE** /v1/accounts/{uuid} | Delete a specific account identified by a uuid.
[**readAccountUsingGET1**](AccountsApi.md#readAccountUsingGET1) | **GET** /v1/accounts/code&#x3D;{code} | Get details about a specific Account identified by a code.
[**readAccountUsingGET3**](AccountsApi.md#readAccountUsingGET3) | **GET** /v1/accounts/{uuid} | Get details about a specific Account identified by a uuid.
[**readAccountsUsingGET1**](AccountsApi.md#readAccountsUsingGET1) | **GET** /v1/accounts | List accounts (all accounts or a selection of accounts).
[**updateUsingPUT1**](AccountsApi.md#updateUsingPUT1) | **PUT** /v1/accounts/code&#x3D;{code} | Update a specific account identified by a code.
[**updateUsingPUT3**](AccountsApi.md#updateUsingPUT3) | **PUT** /v1/accounts/{uuid} | Update a specific account identified by a uuid.


<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> ResponseIdModel createUsingPOST1(accountCreateDto)

Create a new account.

A resource is created by using its code. The filed \&quot;uuid\&quot; is not accepted in the payload. The \&quot;uuid\&quot; value will be generated automatically by the system if the resource is successfully created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
Account accountCreateDto = new Account(); // Account | Account
try {
    ResponseIdModel result = apiInstance.createUsingPOST1(accountCreateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountCreateDto** | [**Account**](Account.md)| Account |

### Return type

[**ResponseIdModel**](ResponseIdModel.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteByCodeUsingDELETE1"></a>
# **deleteByCodeUsingDELETE1**
> ResponseIdModel deleteByCodeUsingDELETE1(code)

Delete a specific account identified by a code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String code = "code_example"; // String | Code of the account
try {
    ResponseIdModel result = apiInstance.deleteByCodeUsingDELETE1(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#deleteByCodeUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Code of the account |

### Return type

[**ResponseIdModel**](ResponseIdModel.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUsingDELETE1"></a>
# **deleteUsingDELETE1**
> ResponseIdModel deleteUsingDELETE1(uuid)

Delete a specific account identified by a uuid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
UUID uuid = new UUID(); // UUID | UUID of the account
try {
    ResponseIdModel result = apiInstance.deleteUsingDELETE1(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#deleteUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| UUID of the account |

### Return type

[**ResponseIdModel**](ResponseIdModel.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAccountUsingGET1"></a>
# **readAccountUsingGET1**
> AccountDetailsDto readAccountUsingGET1(code)

Get details about a specific Account identified by a code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String code = "code_example"; // String | The code of the Account returned by GET /accounts.
try {
    AccountDetailsDto result = apiInstance.readAccountUsingGET1(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#readAccountUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The code of the Account returned by GET /accounts. |

### Return type

[**AccountDetailsDto**](AccountDetailsDto.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readAccountUsingGET3"></a>
# **readAccountUsingGET3**
> AccountDetailsDto readAccountUsingGET3(uuid)

Get details about a specific Account identified by a uuid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
UUID uuid = new UUID(); // UUID | The UUID of the Account returned by GET /accounts.
try {
    AccountDetailsDto result = apiInstance.readAccountUsingGET3(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#readAccountUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)| The UUID of the Account returned by GET /accounts. |

### Return type

[**AccountDetailsDto**](AccountDetailsDto.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="readAccountsUsingGET1"></a>
# **readAccountsUsingGET1**
> PageOfAccountSearchModel readAccountsUsingGET1(activeStatus, filter, pageLimit, pageOffset, sort)

List accounts (all accounts or a selection of accounts).

An empty list is returned if no accounts are available. The following fields can be used for filter and sort: - **code** - **uuid** - **description** - **company.uuid** - **company.code** - **branch.uuid** - **branch.code** - **bank.uuid** - **bank.code** - **currency.uuid** - **currency.code** - **country.code** - **accountType** available values &#x3D; {BANK_ACCOUNT,INTERCOMPANY_ACCOUNT,OTHER_ACCOUNT,SHARED_ACCOUNT} - **banCode** - **creationDate** - **updateDate** - **closingDate** - **activeStatus** available values &#x3D; {OPENED,CLOSED} - **statementIdentifier**  

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String activeStatus = "activeStatus_example"; // String | activeStatus
String filter = "filter_example"; // String | Filter represents search query on RSQL language. The fields which can be used in filter query are defined in description for endpoint.  The following RSQL comparing operators are supported: == : Evaluates to true if the attribute is equal to the value. != : Evaluates to true if the attribute is not equal to the value. =in= : Evaluates to true if the attribute exactly matches any of the values in the list. =out= : Evaluates to true if the attribute does not match any of the values in the list. ==ABC* : Similar to SQL like 'ABC%. ==*ABC : Similar to SQL like '%ABC. ==*ABC* : Similar to SQL like '%ABC%. =lt= : Evaluates to true if the attribute is less than the value. =gt= : Evaluates to true if the attribute is greater than the value. =le= : Evaluates to true if the attribute is less than or equal to the value. =ge= : Evaluates to true if the attribute is greater than or equal to the value.  Logical Operators: RSQL expression is composed of one or more comparisons, related to each other with logical operators: Logical AND '**;**' or '**and**' Logical OR '**,**' or '**or**'.  Argument can be a single value, or multiple values in parenthesis separated by comma. Value that doesn’t contain any reserved character or a white space can be unquoted, other arguments must be enclosed in single or double quotes.
Integer pageLimit = 56; // Integer | Limit the number of records per page.
Integer pageOffset = 56; // Integer | Page Offset means the number of records you want to skip before starting reading.
List<String> sort = Arrays.asList("sort_example"); // List<String> | Specify the comma-separated list of fields used to order the records. By default, ascending ordering is used. Example: **-code** means descending order by field {code}.
try {
    PageOfAccountSearchModel result = apiInstance.readAccountsUsingGET1(activeStatus, filter, pageLimit, pageOffset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#readAccountsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activeStatus** | **String**| activeStatus | [optional] [enum: OPENED, CLOSED]
 **filter** | **String**| Filter represents search query on RSQL language. The fields which can be used in filter query are defined in description for endpoint.  The following RSQL comparing operators are supported: &#x3D;&#x3D; : Evaluates to true if the attribute is equal to the value. !&#x3D; : Evaluates to true if the attribute is not equal to the value. &#x3D;in&#x3D; : Evaluates to true if the attribute exactly matches any of the values in the list. &#x3D;out&#x3D; : Evaluates to true if the attribute does not match any of the values in the list. &#x3D;&#x3D;ABC* : Similar to SQL like &#39;ABC%. &#x3D;&#x3D;*ABC : Similar to SQL like &#39;%ABC. &#x3D;&#x3D;*ABC* : Similar to SQL like &#39;%ABC%. &#x3D;lt&#x3D; : Evaluates to true if the attribute is less than the value. &#x3D;gt&#x3D; : Evaluates to true if the attribute is greater than the value. &#x3D;le&#x3D; : Evaluates to true if the attribute is less than or equal to the value. &#x3D;ge&#x3D; : Evaluates to true if the attribute is greater than or equal to the value.  Logical Operators: RSQL expression is composed of one or more comparisons, related to each other with logical operators: Logical AND &#39;**;**&#39; or &#39;**and**&#39; Logical OR &#39;**,**&#39; or &#39;**or**&#39;.  Argument can be a single value, or multiple values in parenthesis separated by comma. Value that doesn’t contain any reserved character or a white space can be unquoted, other arguments must be enclosed in single or double quotes. | [optional]
 **pageLimit** | **Integer**| Limit the number of records per page. | [optional]
 **pageOffset** | **Integer**| Page Offset means the number of records you want to skip before starting reading. | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Specify the comma-separated list of fields used to order the records. By default, ascending ordering is used. Example: **-code** means descending order by field {code}. | [optional]

### Return type

[**PageOfAccountSearchModel**](PageOfAccountSearchModel.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUsingPUT1"></a>
# **updateUsingPUT1**
> ResponseIdModel updateUsingPUT1(accountDto, code)

Update a specific account identified by a code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
Account accountDto = new Account(); // Account | Account
String code = "code_example"; // String | The code of the account
try {
    ResponseIdModel result = apiInstance.updateUsingPUT1(accountDto, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountDto** | [**Account**](Account.md)| Account |
 **code** | **String**| The code of the account |

### Return type

[**ResponseIdModel**](ResponseIdModel.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT3"></a>
# **updateUsingPUT3**
> ResponseIdModel updateUsingPUT3(accountDto, uuid)

Update a specific account identified by a uuid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2ClientCredentials
OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
Account accountDto = new Account(); // Account | Account
UUID uuid = new UUID(); // UUID | The UUID of the account
try {
    ResponseIdModel result = apiInstance.updateUsingPUT3(accountDto, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateUsingPUT3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountDto** | [**Account**](Account.md)| Account |
 **uuid** | [**UUID**](.md)| The UUID of the account |

### Return type

[**ResponseIdModel**](ResponseIdModel.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

