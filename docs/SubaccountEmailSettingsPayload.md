

# SubaccountEmailSettingsPayload

Settings related to sending emails

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requiresEmailCredits** | **Boolean** | True, if Account needs credits to send emails. Otherwise, false |  [optional] |
|**emailSizeLimit** | **Integer** | Maximum size of email including attachments in MB&#39;s |  [optional] |
|**dailySendLimit** | **Integer** | Amount of emails Account can send daily |  [optional] |
|**maxContacts** | **Integer** | Maximum number of contacts the Account can have. 0 means that parent account&#39;s limit is used. |  [optional] |
|**enablePrivateIPPurchase** | **Boolean** | Can the SubAccount purchase Private IP for themselves |  [optional] |
|**poolName** | **String** | Name of your custom IP Pool to be used in the sending process |  [optional] |
|**validSenderDomainOnly** | **Boolean** |  |  [optional] |



