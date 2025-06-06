

# EmailStatus

Status information of the specified email

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **String** | Email address this email was sent from. |  [optional] |
|**to** | **String** | Email address this email was sent to. |  [optional] |
|**date** | **OffsetDateTime** | Date the email was submitted. |  [optional] |
|**status** | **LogJobStatus** |  |  [optional] |
|**statusName** | **String** | Name of email&#39;s status |  [optional] |
|**statusChangeDate** | **OffsetDateTime** | Date of last status change. |  [optional] |
|**dateSent** | **OffsetDateTime** | Date when the email was sent |  [optional] |
|**dateOpened** | **OffsetDateTime** | Date when the email changed the status to &#39;opened&#39; |  [optional] |
|**dateClicked** | **OffsetDateTime** | Date when the email changed the status to &#39;clicked&#39; |  [optional] |
|**errorMessage** | **String** | Detailed error or bounced message. |  [optional] |
|**transactionID** | **String** | ID number of transaction |  [optional] |
|**envelopeFrom** | **String** | Envelope from address |  [optional] |
|**errorCategory** | **MessageCategoryEnum** |  |  [optional] |



