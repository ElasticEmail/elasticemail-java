

# ApiKeyPayload

Create a new ApiKey
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the ApiKey for ease of reference. |  [optional]
**accessLevel** | **List&lt;AccessLevel&gt;** | Access level or permission to be assigned to this ApiKey. |  [optional]
**expires** | **OffsetDateTime** | Date this ApiKey expires. |  [optional]
**restrictAccessToIPRange** | **List&lt;String&gt;** | Which IPs can use this ApiKey |  [optional]
**subaccount** | **String** | Email of the subaccount for which this ApiKey should be created |  [optional]



