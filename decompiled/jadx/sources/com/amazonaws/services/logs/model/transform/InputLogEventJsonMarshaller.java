package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.InputLogEvent;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class InputLogEventJsonMarshaller {
    private static InputLogEventJsonMarshaller instance;

    public static InputLogEventJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new InputLogEventJsonMarshaller();
        }
        return instance;
    }

    public void marshall(InputLogEvent inputLogEvent, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (inputLogEvent.getTimestamp() != null) {
            Long timestamp = inputLogEvent.getTimestamp();
            awsJsonWriter.name("timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (inputLogEvent.getMessage() != null) {
            String message = inputLogEvent.getMessage();
            awsJsonWriter.name("message");
            awsJsonWriter.value(message);
        }
        awsJsonWriter.endObject();
    }
}
