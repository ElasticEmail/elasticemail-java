

# NewSmtpCredentials

Newly generated SMTP Credentials with Token

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** | Unique token to be used in the system |  [optional]
**accessLevel** | [**AccessLevel**](AccessLevel.md) | Access level of this Smtp Credential. |  [optional]
**name** | **String** | Name of the key. |  [optional]
**dateCreated** | **OffsetDateTime** | Date this SmtpCredential was created. |  [optional]
**lastUse** | **OffsetDateTime** | Date this SmtpCredential was last used. |  [optional]
**expires** | **OffsetDateTime** | Date this SmtpCredential expires. |  [optional]
**restrictAccessToIPRange** | **List&lt;String&gt;** | Which IPs can use this SmtpCredential |  [optional]



