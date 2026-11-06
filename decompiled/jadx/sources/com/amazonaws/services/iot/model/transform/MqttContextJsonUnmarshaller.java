package com.amazonaws.services.iot.model.transform;

import androidx.autofill.HintConstants;
import com.amazonaws.services.iot.model.MqttContext;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MqttContextJsonUnmarshaller implements Unmarshaller<MqttContext, JsonUnmarshallerContext> {
    private static MqttContextJsonUnmarshaller instance;

    public static MqttContextJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new MqttContextJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public MqttContext unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MqttContext mqttContext = new MqttContext();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(HintConstants.AUTOFILL_HINT_USERNAME)) {
                mqttContext.setUsername(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("password")) {
                mqttContext.setPassword(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("clientId")) {
                mqttContext.setClientId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mqttContext;
    }
}
