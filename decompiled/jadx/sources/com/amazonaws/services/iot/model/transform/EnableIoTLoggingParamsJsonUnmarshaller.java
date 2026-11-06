package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.EnableIoTLoggingParams;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class EnableIoTLoggingParamsJsonUnmarshaller implements Unmarshaller<EnableIoTLoggingParams, JsonUnmarshallerContext> {
    private static EnableIoTLoggingParamsJsonUnmarshaller instance;

    public static EnableIoTLoggingParamsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new EnableIoTLoggingParamsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public EnableIoTLoggingParams unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EnableIoTLoggingParams enableIoTLoggingParams = new EnableIoTLoggingParams();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("roleArnForLogging")) {
                enableIoTLoggingParams.setRoleArnForLogging(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("logLevel")) {
                enableIoTLoggingParams.setLogLevel(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return enableIoTLoggingParams;
    }
}
