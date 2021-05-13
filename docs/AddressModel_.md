
# AddressModel_

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **String** | City. |  [optional]
**country** | [**ReferenceModel**](ReferenceModel.md) | Country. Passed as either a UUID or Code. | 
**homepage** | **String** | Web site. |  [optional]
**state** | **String** | State. |  [optional]
**street1** | **String** | Street 1. |  [optional]
**street2** | **String** | Street 2. |  [optional]
**zipCode** | **String** | ZIP code. Note: the max field length depends on the Country setup. The default value is 10c but a smaller value may be defined in your Country setup. |  [optional]



