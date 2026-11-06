package com.amazonaws.services.iot.model.transform;

import androidx.autofill.HintConstants;
import com.amazonaws.services.iot.model.MqttContext;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MqttContextJsonMarshaller {
    private static MqttContextJsonMarshaller instance;

    public static MqttContextJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MqttContextJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MqttContext mqttContext, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (mqttContext.getUsername() != null) {
            String username = mqttContext.getUsername();
            awsJsonWriter.name(HintConstants.AUTOFILL_HINT_USERNAME);
            awsJsonWriter.value(username);
        }
        if (mqttContext.getPassword() != null) {
            ByteBuffer password = mqttContext.getPassword();
            awsJsonWriter.name("password");
            awsJsonWriter.value(password);
        }
        if (mqttContext.getClientId() != null) {
            String clientId = mqttContext.getClientId();
            awsJsonWriter.name("clientId");
            awsJsonWriter.value(clientId);
        }
        awsJsonWriter.endObject();
    }
}
