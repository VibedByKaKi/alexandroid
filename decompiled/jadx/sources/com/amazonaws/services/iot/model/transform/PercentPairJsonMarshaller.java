package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.PercentPair;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PercentPairJsonMarshaller {
    private static PercentPairJsonMarshaller instance;

    public static PercentPairJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PercentPairJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PercentPair percentPair, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (percentPair.getPercent() != null) {
            Double percent = percentPair.getPercent();
            awsJsonWriter.name("percent");
            awsJsonWriter.value(percent);
        }
        if (percentPair.getValue() != null) {
            Double value = percentPair.getValue();
            awsJsonWriter.name("value");
            awsJsonWriter.value(value);
        }
        awsJsonWriter.endObject();
    }
}
