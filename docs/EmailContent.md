

# EmailContent

Proper e-mail content

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | [**List&lt;BodyPart&gt;**](BodyPart.md) | List of e-mail body parts, with user-provided MIME types (text/html, text/plain etc) |  [optional]
**merge** | **Map&lt;String, String&gt;** | A key-value collection of custom merge fields, shared between recipients. Should be used in e-mail body like so: {firstname}, {lastname} etc. |  [optional]
**attachments** | [**List&lt;MessageAttachment&gt;**](MessageAttachment.md) | Attachments provided by sending binary data |  [optional]
**headers** | **Map&lt;String, String&gt;** | A key-value collection of custom e-mail headers. |  [optional]
**postback** | **String** | Postback header. |  [optional]
**envelopeFrom** | **String** | E-mail with an optional name to be used as the envelope from address (e.g.: John Doe &lt;email@domain.com&gt;) |  [optional]
**from** | **String** | Your e-mail with an optional name (e.g.: John Doe &lt;email@domain.com&gt;) |  [optional]
**replyTo** | **String** | To what address should the recipients reply to (e.g. John Doe &lt;email@domain.com&gt;) |  [optional]
**subject** | **String** | Default subject of email. |  [optional]
**templateName** | **String** | Name of template. |  [optional]
**attachFiles** | **List&lt;String&gt;** | Names of previously uploaded files that should be sent as downloadable attachments |  [optional]
**utm** | [**Utm**](Utm.md) |  |  [optional]



