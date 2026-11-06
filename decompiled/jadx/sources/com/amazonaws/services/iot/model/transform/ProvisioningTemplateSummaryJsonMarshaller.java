package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ProvisioningTemplateSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProvisioningTemplateSummaryJsonMarshaller {
    private static ProvisioningTemplateSummaryJsonMarshaller instance;

    public static ProvisioningTemplateSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProvisioningTemplateSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProvisioningTemplateSummary provisioningTemplateSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (provisioningTemplateSummary.getTemplateArn() != null) {
            String templateArn = provisioningTemplateSummary.getTemplateArn();
            awsJsonWriter.name("templateArn");
            awsJsonWriter.value(templateArn);
        }
        if (provisioningTemplateSummary.getTemplateName() != null) {
            String templateName = provisioningTemplateSummary.getTemplateName();
            awsJsonWriter.name("templateName");
            awsJsonWriter.value(templateName);
        }
        if (provisioningTemplateSummary.getDescription() != null) {
            String description = provisioningTemplateSummary.getDescription();
            awsJsonWriter.name("description");
            awsJsonWriter.value(description);
        }
        if (provisioningTemplateSummary.getCreationDate() != null) {
            Date creationDate = provisioningTemplateSummary.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        if (provisioningTemplateSummary.getLastModifiedDate() != null) {
            Date lastModifiedDate = provisioningTemplateSummary.getLastModifiedDate();
            awsJsonWriter.name("lastModifiedDate");
            awsJsonWriter.value(lastModifiedDate);
        }
        if (provisioningTemplateSummary.getEnabled() != null) {
            Boolean enabled = provisioningTemplateSummary.getEnabled();
            awsJsonWriter.name("enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        if (provisioningTemplateSummary.getType() != null) {
            String type = provisioningTemplateSummary.getType();
            awsJsonWriter.name("type");
            awsJsonWriter.value(type);
        }
        awsJsonWriter.endObject();
    }
}
