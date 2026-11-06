package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.RegistrationConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RegistrationConfigJsonMarshaller {
    private static RegistrationConfigJsonMarshaller instance;

    public static RegistrationConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RegistrationConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RegistrationConfig registrationConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (registrationConfig.getTemplateBody() != null) {
            String templateBody = registrationConfig.getTemplateBody();
            awsJsonWriter.name("templateBody");
            awsJsonWriter.value(templateBody);
        }
        if (registrationConfig.getRoleArn() != null) {
            String roleArn = registrationConfig.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (registrationConfig.getTemplateName() != null) {
            String templateName = registrationConfig.getTemplateName();
            awsJsonWriter.name("templateName");
            awsJsonWriter.value(templateName);
        }
        awsJsonWriter.endObject();
    }
}
