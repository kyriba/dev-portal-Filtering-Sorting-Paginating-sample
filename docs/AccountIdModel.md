
# AccountIdModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**banStructure** | [**BanStructureEnum**](#BanStructureEnum) | Type of the BAN. Default &#x3D; LBAN_1_STRUCTURE |  [optional]
**value** | **String** | Account Id value. Account Id length depends on country. IBAN value should include country code and control key. | 
**accountNature** | [**AccountNatureEnum**](#AccountNatureEnum) | Account nature. Default &#x3D; CURRENT_ACCOUNT |  [optional]
**statementIdentifier** | **String** | Statement identifier. |  [optional]
**feeStatementIdentifier** | **String** | Fee statement identifier. |  [optional]
**description** | **String** | Account Id description. |  [optional]
**reportingFilterType** | [**ReportingFilterTypeEnum**](#ReportingFilterTypeEnum) | Reporting filter type. Default &#x3D; KEY_1 |  [optional]
**establishment** | [**ReferenceModel**](ReferenceModel.md) | Establishment. |  [optional]


<a name="BanStructureEnum"></a>
## Enum: BanStructureEnum
Name | Value
---- | -----
BBAN_STRUCTURE | &quot;BBAN_STRUCTURE&quot;
IBAN_STRUCTURE | &quot;IBAN_STRUCTURE&quot;
LBAN_0_STRUCTURE | &quot;LBAN_0_STRUCTURE&quot;
LBAN_1_STRUCTURE | &quot;LBAN_1_STRUCTURE&quot;
LBAN_2_STRUCTURE | &quot;LBAN_2_STRUCTURE&quot;
LBAN_3_STRUCTURE | &quot;LBAN_3_STRUCTURE&quot;
LBAN_4_STRUCTURE | &quot;LBAN_4_STRUCTURE&quot;
LBAN_5_STRUCTURE | &quot;LBAN_5_STRUCTURE&quot;
LBAN_6_STRUCTURE | &quot;LBAN_6_STRUCTURE&quot;
LBAN_7_STRUCTURE | &quot;LBAN_7_STRUCTURE&quot;
LBAN_8_STRUCTURE | &quot;LBAN_8_STRUCTURE&quot;
LBAN_9_STRUCTURE | &quot;LBAN_9_STRUCTURE&quot;


<a name="AccountNatureEnum"></a>
## Enum: AccountNatureEnum
Name | Value
---- | -----
CURRENT_ACCOUNT | &quot;CURRENT_ACCOUNT&quot;
SAVINGS_ACCOUNT | &quot;SAVINGS_ACCOUNT&quot;
INVESTMENT_ACCOUNT | &quot;INVESTMENT_ACCOUNT&quot;
CUSTODY_ACCOUNT | &quot;CUSTODY_ACCOUNT&quot;
OTHER | &quot;OTHER&quot;


<a name="ReportingFilterTypeEnum"></a>
## Enum: ReportingFilterTypeEnum
Name | Value
---- | -----
_1 | &quot;KEY_1&quot;
_2 | &quot;KEY_2&quot;
_3 | &quot;KEY_3&quot;
_4 | &quot;KEY_4&quot;
_5 | &quot;KEY_5&quot;



