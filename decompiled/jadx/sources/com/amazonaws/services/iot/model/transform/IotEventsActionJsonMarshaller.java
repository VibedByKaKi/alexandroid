package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.IotEventsAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IotEventsActionJsonMarshaller {
    private static IotEventsActionJsonMarshaller instance;

    public static IotEventsActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new IotEventsActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(IotEventsAction iotEventsAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (iotEventsAction.getInputName() != null) {
            String inputName = iotEventsAction.getInputName();
            awsJsonWriter.name("inputName");
            awsJsonWriter.value(inputName);
        }
        if (iotEventsAction.getMessageId() != null) {
            String messageId = iotEventsAction.getMessageId();
            awsJsonWriter.name("messageId");
            awsJsonWriter.value(messageId);
        }
        if (iotEventsAction.getBatchMode() != null) {
            Boolean batchMode = iotEventsAction.getBatchMode();
            awsJsonWriter.name("batchMode");
            awsJsonWriter.value(batchMode.booleanValue());
        }
        if (iotEventsAction.getRoleArn() != null) {
            String roleArn = iotEventsAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
