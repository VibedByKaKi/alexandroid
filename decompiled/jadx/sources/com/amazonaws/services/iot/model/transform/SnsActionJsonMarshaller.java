package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SnsAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SnsActionJsonMarshaller {
    private static SnsActionJsonMarshaller instance;

    public static SnsActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SnsActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SnsAction snsAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (snsAction.getTargetArn() != null) {
            String targetArn = snsAction.getTargetArn();
            awsJsonWriter.name("targetArn");
            awsJsonWriter.value(targetArn);
        }
        if (snsAction.getRoleArn() != null) {
            String roleArn = snsAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (snsAction.getMessageFormat() != null) {
            String messageFormat = snsAction.getMessageFormat();
            awsJsonWriter.name("messageFormat");
            awsJsonWriter.value(messageFormat);
        }
        awsJsonWriter.endObject();
    }
}
