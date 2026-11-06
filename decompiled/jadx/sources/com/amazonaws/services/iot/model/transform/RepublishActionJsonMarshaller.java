package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.RepublishAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RepublishActionJsonMarshaller {
    private static RepublishActionJsonMarshaller instance;

    public static RepublishActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RepublishActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RepublishAction republishAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (republishAction.getRoleArn() != null) {
            String roleArn = republishAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (republishAction.getTopic() != null) {
            String topic = republishAction.getTopic();
            awsJsonWriter.name("topic");
            awsJsonWriter.value(topic);
        }
        if (republishAction.getQos() != null) {
            Integer qos = republishAction.getQos();
            awsJsonWriter.name("qos");
            awsJsonWriter.value(qos);
        }
        awsJsonWriter.endObject();
    }
}
