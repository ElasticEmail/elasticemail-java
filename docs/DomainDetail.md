

# DomainDetail

Domain data, with information about domain records.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | Name of selected domain. |  [optional] |
|**defaultDomain** | **Boolean** | True, if domain is used as default. Otherwise, false, |  [optional] |
|**spf** | **Boolean** | True, if SPF record is verified |  [optional] |
|**dkim** | **Boolean** | True, if DKIM record is verified |  [optional] |
|**MX** | **Boolean** | True, if MX record is verified |  [optional] |
|**DMARC** | **Boolean** |  |  [optional] |
|**isRewriteDomainValid** | **Boolean** | True, if tracking CNAME record is verified |  [optional] |
|**verify** | **Boolean** | True, if DKIM, SPF, or tracking are still to be verified |  [optional] |
|**type** | **TrackingType** |  |  [optional] |
|**trackingStatus** | **TrackingValidationStatus** |  |  [optional] |
|**certificateStatus** | **CertificateValidationStatus** |  |  [optional] |
|**certificateValidationError** | **String** |  |  [optional] |
|**trackingTypeUserRequest** | **TrackingType** |  |  [optional] |
|**VERP** | **Boolean** |  |  [optional] |
|**customBouncesDomain** | **String** |  |  [optional] |
|**isCustomBouncesDomainDefault** | **Boolean** |  |  [optional] |
|**isMarkedForDeletion** | **Boolean** |  |  [optional] |
|**ownership** | **DomainOwner** |  |  [optional] |



