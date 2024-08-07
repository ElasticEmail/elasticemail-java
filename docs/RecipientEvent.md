

# RecipientEvent

Detailed information about message recipient

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionID** | **String** | ID number of transaction |  [optional] |
|**msgID** | **String** | ID number of selected message. |  [optional] |
|**fromEmail** | **String** | Default From: email address. |  [optional] |
|**to** | **String** | Ending date for search in YYYY-MM-DDThh:mm:ss format. |  [optional] |
|**subject** | **String** | Default subject of email. |  [optional] |
|**eventType** | **EventType** |  |  [optional] |
|**eventDate** | **OffsetDateTime** | Creation date |  [optional] |
|**channelName** | **String** | Name of selected channel. |  [optional] |
|**messageCategory** | **MessageCategory** |  |  [optional] |
|**nextTryOn** | **OffsetDateTime** | Date of next try |  [optional] |
|**message** | **String** | Content of message, HTML encoded |  [optional] |
|**ipAddress** | **String** | IP which this email was sent through |  [optional] |
|**poolName** | **String** | Name of an IP pool this email was sent through |  [optional] |



