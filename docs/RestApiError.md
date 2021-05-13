
# RestApiError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | One of a server-defined set of error codes. | 
**details** | [**List&lt;RestApiError&gt;**](RestApiError.md) | An array of details about specific errors that led to this reported error. |  [optional]
**innererror** | [**InnerError**](InnerError.md) | An object containing more specific information than the current object about the error. |  [optional]
**message** | **String** | A human-readable representation of the error. | 
**target** | **String** | The target of the error. |  [optional]



