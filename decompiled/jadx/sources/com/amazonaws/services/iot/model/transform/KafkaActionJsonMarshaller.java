package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.KafkaAction;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class KafkaActionJsonMarshaller {
    private static KafkaActionJsonMarshaller instance;

    public static KafkaActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KafkaActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KafkaAction kafkaAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (kafkaAction.getDestinationArn() != null) {
            String destinationArn = kafkaAction.getDestinationArn();
            awsJsonWriter.name("destinationArn");
            awsJsonWriter.value(destinationArn);
        }
        if (kafkaAction.getTopic() != null) {
            String topic = kafkaAction.getTopic();
            awsJsonWriter.name("topic");
            awsJsonWriter.value(topic);
        }
        if (kafkaAction.getKey() != null) {
            String key = kafkaAction.getKey();
            awsJsonWriter.name("key");
            awsJsonWriter.value(key);
        }
        if (kafkaAction.getPartition() != null) {
            String partition = kafkaAction.getPartition();
            awsJsonWriter.name("partition");
            awsJsonWriter.value(partition);
        }
        if (kafkaAction.getClientProperties() != null) {
            Map<String, String> clientProperties = kafkaAction.getClientProperties();
            awsJsonWriter.name("clientProperties");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry : clientProperties.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    awsJsonWriter.value(value);
                }
            }
            awsJsonWriter.endObject();
        }
        awsJsonWriter.endObject();
    }
}
