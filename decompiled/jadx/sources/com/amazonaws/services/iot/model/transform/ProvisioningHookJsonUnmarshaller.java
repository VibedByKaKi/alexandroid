package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ProvisioningHook;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ProvisioningHookJsonUnmarshaller implements Unmarshaller<ProvisioningHook, JsonUnmarshallerContext> {
    private static ProvisioningHookJsonUnmarshaller instance;

    public static ProvisioningHookJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProvisioningHookJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProvisioningHook unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProvisioningHook provisioningHook = new ProvisioningHook();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("payloadVersion")) {
                provisioningHook.setPayloadVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("targetArn")) {
                provisioningHook.setTargetArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return provisioningHook;
    }
}
