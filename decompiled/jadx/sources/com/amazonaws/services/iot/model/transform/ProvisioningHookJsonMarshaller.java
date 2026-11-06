package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ProvisioningHook;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProvisioningHookJsonMarshaller {
    private static ProvisioningHookJsonMarshaller instance;

    public static ProvisioningHookJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProvisioningHookJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProvisioningHook provisioningHook, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (provisioningHook.getPayloadVersion() != null) {
            String payloadVersion = provisioningHook.getPayloadVersion();
            awsJsonWriter.name("payloadVersion");
            awsJsonWriter.value(payloadVersion);
        }
        if (provisioningHook.getTargetArn() != null) {
            String targetArn = provisioningHook.getTargetArn();
            awsJsonWriter.name("targetArn");
            awsJsonWriter.value(targetArn);
        }
        awsJsonWriter.endObject();
    }
}
