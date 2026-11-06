package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.MetricFilterMatchRecord;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MetricFilterMatchRecordJsonMarshaller {
    private static MetricFilterMatchRecordJsonMarshaller instance;

    public static MetricFilterMatchRecordJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MetricFilterMatchRecordJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MetricFilterMatchRecord metricFilterMatchRecord, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (metricFilterMatchRecord.getEventNumber() != null) {
            Long eventNumber = metricFilterMatchRecord.getEventNumber();
            awsJsonWriter.name("eventNumber");
            awsJsonWriter.value(eventNumber);
        }
        if (metricFilterMatchRecord.getEventMessage() != null) {
            String eventMessage = metricFilterMatchRecord.getEventMessage();
            awsJsonWriter.name("eventMessage");
            awsJsonWriter.value(eventMessage);
        }
        if (metricFilterMatchRecord.getExtractedValues() != null) {
            Map<String, String> extractedValues = metricFilterMatchRecord.getExtractedValues();
            awsJsonWriter.name("extractedValues");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry : extractedValues.entrySet()) {
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
