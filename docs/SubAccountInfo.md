

# SubAccountInfo

Detailed information about SubAccount.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**publicAccountID** | **String** | Public key for limited access to your Account such as contact/add so you can use it safely on public websites. |  [optional]
**email** | **String** | Proper email address. |  [optional]
**settings** | [**SubaccountSettingsInfo**](SubaccountSettingsInfo.md) | SubAccount settings |  [optional]
**lastActivity** | **OffsetDateTime** | Date of last activity on Account |  [optional]
**emailCredits** | **Integer** | Amount of email credits |  [optional]
**totalEmailsSent** | **Long** | Amount of emails sent from this Account |  [optional]
**reputation** | **Double** | Numeric reputation |  [optional]
**status** | [**AccountStatusEnum**](AccountStatusEnum.md) | Account&#39;s current status. |  [optional]
**contactsCount** | **Integer** | How many contacts this SubAccount has stored |  [optional]



