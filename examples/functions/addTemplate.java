/*
 * Add Template
 * Creates a new email template with an HTML and a plain-text body.
 *
 * Required access level: ModifyTemplates
 */

import com.elasticemail.api.TemplatesApi;
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.ApiKeyAuth;
import com.elasticemail.model.BodyContentType;
import com.elasticemail.model.BodyPart;
import com.elasticemail.model.Template;
import com.elasticemail.model.TemplatePayload;
import com.elasticemail.model.TemplateScope;

public class addTemplate {
    public static void main(String[] args) {
        String apiKey = System.getenv("ELASTICEMAIL_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println("Set the ELASTICEMAIL_API_KEY environment variable to your Elastic Email API key.");
            System.exit(1);
        }

        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath("https://api.elasticemail.com/v4");
        ApiKeyAuth apikey = (ApiKeyAuth) client.getAuthentication("apikey");
        apikey.setApiKey(apiKey);

        TemplatesApi templates = new TemplatesApi(client);

        TemplatePayload template = new TemplatePayload()
            .name("My new template")
            .subject("Default subject")
            .addBodyItem(new BodyPart()
                .contentType(BodyContentType.HTML)
                .content("<p>My template</p>")
                .charset("utf-8"))
            .addBodyItem(new BodyPart()
                .contentType(BodyContentType.PLAIN_TEXT)
                .content("My template")
                .charset("utf-8"))
            .templateScope(TemplateScope.PERSONAL);

        try {
            Template created = templates.templatesPost(template);
            System.out.println(created);
        } catch (ApiException e) {
            System.err.println("Elastic Email API error " + e.getCode() + ": " + e.getResponseBody());
            System.exit(1);
        }
    }
}
