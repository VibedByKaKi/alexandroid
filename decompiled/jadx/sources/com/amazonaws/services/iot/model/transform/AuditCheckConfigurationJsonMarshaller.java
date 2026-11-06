package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuditCheckConfiguration;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditCheckConfigurationJsonMarshaller {
    private static AuditCheckConfigurationJsonMarshaller instance;

    public static AuditCheckConfigurationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuditCheckConfigurationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuditCheckConfiguration auditCheckConfiguration, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (auditCheckConfiguration.getEnabled() != null) {
            Boolean enabled = auditCheckConfiguration.getEnabled();
            awsJsonWriter.name("enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
