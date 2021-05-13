
# AccountSearchModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountCategory1** | [**ReferenceModel**](ReferenceModel.md) | Account category1. |  [optional]
**accountCategory2** | [**ReferenceModel**](ReferenceModel.md) | Account category2. |  [optional]
**accountCategory3** | [**ReferenceModel**](ReferenceModel.md) | Account category3. |  [optional]
**accountCategory4** | [**ReferenceModel**](ReferenceModel.md) | Account category4. |  [optional]
**accountCategory5** | [**ReferenceModel**](ReferenceModel.md) | Account category5. |  [optional]
**accountCategory6** | [**ReferenceModel**](ReferenceModel.md) | Account category6. |  [optional]
**accountCategory7** | [**ReferenceModel**](ReferenceModel.md) | Account category7. |  [optional]
**accountCategory8** | [**ReferenceModel**](ReferenceModel.md) | Account category8. |  [optional]
**accountCategory9** | [**ReferenceModel**](ReferenceModel.md) | Account category9. |  [optional]
**accountCategory10** | [**ReferenceModel**](ReferenceModel.md) | Account category10. |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Account type |  [optional]
**activeStatus** | [**ActiveStatusEnum**](#ActiveStatusEnum) | Account status. |  [optional]
**attachments** | **Boolean** | Attachments |  [optional]
**banCode** | **String** | Account BAN code |  [optional]
**bank** | [**ReferenceModel**](ReferenceModel.md) | Account bank | 
**branch** | [**ReferenceModel**](ReferenceModel.md) | Account branch | 
**branchDescription** | **String** | Account branch description |  [optional]
**calendar** | [**ReferenceModel**](ReferenceModel.md) | Account calendar | 
**closedAccount** | **Boolean** | Is account closed. Default value false |  [optional]
**closingDate** | [**LocalDate**](LocalDate.md) | Closing date |  [optional]
**code** | **String** | Account code. | 
**company** | [**ReferenceModel**](ReferenceModel.md) | Account company | 
**countryCode** | **String** | Account country code | 
**creationDate** | [**LocalDate**](LocalDate.md) | Creation date |  [optional]
**currency** | [**ReferenceModel**](ReferenceModel.md) | Account currency | 
**defaultGroup** | [**ReferenceModel**](ReferenceModel.md) | Default group. |  [optional]
**description** | **String** | Account description. |  [optional]
**description2** | **String** | Account description2. |  [optional]
**documents** | **Boolean** | Documents. |  [optional]
**glAccount** | [**ReferenceModel**](ReferenceModel.md) | Account GL |  [optional]
**ibanCode** | **String** | Account IBAN code |  [optional]
**internalAccountCode** | **String** | Internal account code |  [optional]
**marker1** | **Boolean** | Marker1. |  [optional]
**marker2** | **Boolean** | Marker2. |  [optional]
**marker3** | **Boolean** | Marker3. |  [optional]
**signatoryUsers** | **Long** | Signatory users. |  [optional]
**statementIdentifier** | **String** | Account statement identifier |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Account status |  [optional]
**updateDate** | [**LocalDate**](LocalDate.md) | Update date |  [optional]
**uuid** | [**UUID**](UUID.md) | UUID of the account. | 
**zbaIdentifier** | **String** | Account ZBA identifier |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
BANK_ACCOUNT | &quot;BANK_ACCOUNT&quot;
INTERCOMPANY_ACCOUNT | &quot;INTERCOMPANY_ACCOUNT&quot;
OTHER_ACCOUNT | &quot;OTHER_ACCOUNT&quot;
SHARED_ACCOUNT | &quot;SHARED_ACCOUNT&quot;


<a name="ActiveStatusEnum"></a>
## Enum: ActiveStatusEnum
Name | Value
---- | -----
OPENED | &quot;OPENED&quot;
CLOSED | &quot;CLOSED&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
CREATION_TO_VALIDATE | &quot;CREATION_TO_VALIDATE&quot;
CREATION_VALIDATED | &quot;CREATION_VALIDATED&quot;
AVAILABLE_FOR_BANK_INTEGRATION | &quot;AVAILABLE_FOR_BANK_INTEGRATION&quot;
CLOSURE_REQUESTED | &quot;CLOSURE_REQUESTED&quot;
CLOSURE_VALIDATE | &quot;CLOSURE_VALIDATE&quot;
BANK_CONTRACT_TO_INACTIVATE | &quot;BANK_CONTRACT_TO_INACTIVATE&quot;
CLOSED | &quot;CLOSED&quot;



