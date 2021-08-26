

# SmtpCredentialsPayload

Create new SMTP Credentials

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Credential for ease of reference. It must be a valid email address. | 
**expires** | **OffsetDateTime** | Date this SmtpCredential expires. |  [optional]
**restrictAccessToIPRange** | **List&lt;String&gt;** | Which IPs can use this SmtpCredential |  [optional]
**subaccount** | **String** | Email of the subaccount for which this SmtpCredential should be created |  [optional]



