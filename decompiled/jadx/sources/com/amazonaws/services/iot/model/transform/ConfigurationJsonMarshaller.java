package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Configuration;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ConfigurationJsonMarshaller {
    private static ConfigurationJsonMarshaller instance;

    public static ConfigurationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ConfigurationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Configuration configuration, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (configuration.getEnabled() != null) {
            Boolean enabled = configuration.getEnabled();
            awsJsonWriter.name("Enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
