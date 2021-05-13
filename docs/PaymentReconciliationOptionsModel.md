
# PaymentReconciliationOptionsModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankReportingPolicy** | [**BankReportingPolicyEnum**](#BankReportingPolicyEnum) | Real Bank account used for Checks. Default &#x3D; CURRENT_ACCOUNT |  [optional]
**separateReportingAccount** | [**ReferenceModel**](ReferenceModel.md) | Separate bank account. Required if bankReportingPolicy &#x3D; SEPARATE_ACCOUNT | 


<a name="BankReportingPolicyEnum"></a>
## Enum: BankReportingPolicyEnum
Name | Value
---- | -----
CURRENT_ACCOUNT | &quot;CURRENT_ACCOUNT&quot;
SEPARATE_ACCOUNT | &quot;SEPARATE_ACCOUNT&quot;



