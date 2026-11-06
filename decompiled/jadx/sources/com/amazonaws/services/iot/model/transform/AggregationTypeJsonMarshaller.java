package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AggregationType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AggregationTypeJsonMarshaller {
    private static AggregationTypeJsonMarshaller instance;

    public static AggregationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AggregationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AggregationType aggregationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (aggregationType.getName() != null) {
            String name = aggregationType.getName();
            awsJsonWriter.name("name");
            awsJsonWriter.value(name);
        }
        if (aggregationType.getValues() != null) {
            List<String> values = aggregationType.getValues();
            awsJsonWriter.name("values");
            awsJsonWriter.beginArray();
            for (String str : values) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
