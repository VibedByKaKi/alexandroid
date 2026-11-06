package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SqsAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SqsActionJsonMarshaller {
    private static SqsActionJsonMarshaller instance;

    public static SqsActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SqsActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SqsAction sqsAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (sqsAction.getRoleArn() != null) {
            String roleArn = sqsAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (sqsAction.getQueueUrl() != null) {
            String queueUrl = sqsAction.getQueueUrl();
            awsJsonWriter.name("queueUrl");
            awsJsonWriter.value(queueUrl);
        }
        if (sqsAction.getUseBase64() != null) {
            Boolean useBase64 = sqsAction.getUseBase64();
            awsJsonWriter.name("useBase64");
            awsJsonWriter.value(useBase64.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
