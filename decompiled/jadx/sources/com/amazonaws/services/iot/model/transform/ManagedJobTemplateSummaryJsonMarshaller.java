package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ManagedJobTemplateSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ManagedJobTemplateSummaryJsonMarshaller {
    private static ManagedJobTemplateSummaryJsonMarshaller instance;

    public static ManagedJobTemplateSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ManagedJobTemplateSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ManagedJobTemplateSummary managedJobTemplateSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (managedJobTemplateSummary.getTemplateArn() != null) {
            String templateArn = managedJobTemplateSummary.getTemplateArn();
            awsJsonWriter.name("templateArn");
            awsJsonWriter.value(templateArn);
        }
        if (managedJobTemplateSummary.getTemplateName() != null) {
            String templateName = managedJobTemplateSummary.getTemplateName();
            awsJsonWriter.name("templateName");
            awsJsonWriter.value(templateName);
        }
        if (managedJobTemplateSummary.getDescription() != null) {
            String description = managedJobTemplateSummary.getDescription();
            awsJsonWriter.name("description");
            awsJsonWriter.value(description);
        }
        if (managedJobTemplateSummary.getEnvironments() != null) {
            List<String> environments = managedJobTemplateSummary.getEnvironments();
            awsJsonWriter.name("environments");
            awsJsonWriter.beginArray();
            for (String str : environments) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (managedJobTemplateSummary.getTemplateVersion() != null) {
            String templateVersion = managedJobTemplateSummary.getTemplateVersion();
            awsJsonWriter.name("templateVersion");
            awsJsonWriter.value(templateVersion);
        }
        awsJsonWriter.endObject();
    }
}
