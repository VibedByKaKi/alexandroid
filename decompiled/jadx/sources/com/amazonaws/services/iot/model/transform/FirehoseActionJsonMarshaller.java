package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.FirehoseAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FirehoseActionJsonMarshaller {
    private static FirehoseActionJsonMarshaller instance;

    public static FirehoseActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FirehoseActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FirehoseAction firehoseAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (firehoseAction.getRoleArn() != null) {
            String roleArn = firehoseAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (firehoseAction.getDeliveryStreamName() != null) {
            String deliveryStreamName = firehoseAction.getDeliveryStreamName();
            awsJsonWriter.name("deliveryStreamName");
            awsJsonWriter.value(deliveryStreamName);
        }
        if (firehoseAction.getSeparator() != null) {
            String separator = firehoseAction.getSeparator();
            awsJsonWriter.name("separator");
            awsJsonWriter.value(separator);
        }
        if (firehoseAction.getBatchMode() != null) {
            Boolean batchMode = firehoseAction.getBatchMode();
            awsJsonWriter.name("batchMode");
            awsJsonWriter.value(batchMode.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
