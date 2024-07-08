

# CampaignOptions

Different send options for a Campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deliveryOptimization** | **DeliveryOptimizationType** |  |  [optional] |
|**trackOpens** | **Boolean** | Should the opens be tracked? If no value has been provided, Account&#39;s default setting will be used. |  [optional] |
|**trackClicks** | **Boolean** | Should the clicks be tracked? If no value has been provided, Account&#39;s default setting will be used. |  [optional] |
|**scheduleFor** | **OffsetDateTime** | Date when this Campaign is scheduled to be sent on |  [optional] |
|**triggerFrequency** | **Double** | How often (in minutes) to send the campaign |  [optional] |
|**triggerCount** | **Integer** | How many times send the campaign |  [optional] |
|**splitOptions** | [**SplitOptions**](SplitOptions.md) |  |  [optional] |



