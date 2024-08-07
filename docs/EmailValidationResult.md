

# EmailValidationResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | **String** | Local part of an email |  [optional] |
|**domain** | **String** | Name of selected domain. |  [optional] |
|**email** | **String** | Full email address that was verified |  [optional] |
|**suggestedSpelling** | **String** | Suggested spelling if a possible mistake was found |  [optional] |
|**disposable** | **Boolean** | Does the email have a temporary domain |  [optional] |
|**role** | **Boolean** | Is an email a role email (e.g. info@, noreply@ etc.) |  [optional] |
|**reason** | **String** | All detected issues |  [optional] |
|**dateAdded** | **OffsetDateTime** | Added date |  [optional] |
|**result** | **EmailValidationStatus** |  |  [optional] |
|**predictedScore** | **BigDecimal** | Predicted score |  [optional] |
|**predictedStatus** | **EmailPredictedValidationStatus** |  |  [optional] |



