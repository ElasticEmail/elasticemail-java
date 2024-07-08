

# EmailJobStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **String** | ID number of your attachment |  [optional] |
|**status** | **String** | Name of status: submitted, complete, in_progress |  [optional] |
|**recipientsCount** | **Integer** |  |  [optional] |
|**failed** | [**List&lt;EmailJobFailedStatus&gt;**](EmailJobFailedStatus.md) |  |  [optional] |
|**failedCount** | **Integer** | Total emails failed. |  [optional] |
|**sent** | **List&lt;String&gt;** |  |  [optional] |
|**sentCount** | **Integer** | Total emails sent. |  [optional] |
|**delivered** | **List&lt;String&gt;** | Number of delivered messages |  [optional] |
|**deliveredCount** | **Integer** |  |  [optional] |
|**pending** | **List&lt;String&gt;** |  |  [optional] |
|**pendingCount** | **Integer** |  |  [optional] |
|**opened** | **List&lt;String&gt;** | Number of opened messages |  [optional] |
|**openedCount** | **Integer** | Total emails opened. |  [optional] |
|**clicked** | **List&lt;String&gt;** | Number of clicked messages |  [optional] |
|**clickedCount** | **Integer** | Total emails clicked |  [optional] |
|**unsubscribed** | **List&lt;String&gt;** | Number of unsubscribed messages |  [optional] |
|**unsubscribedCount** | **Integer** | Total emails unsubscribed |  [optional] |
|**abuseReports** | **List&lt;String&gt;** |  |  [optional] |
|**abuseReportsCount** | **Integer** |  |  [optional] |
|**messageIDs** | **List&lt;String&gt;** | List of all MessageIDs for this job. |  [optional] |



