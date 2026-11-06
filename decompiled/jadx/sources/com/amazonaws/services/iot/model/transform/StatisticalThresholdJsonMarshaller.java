package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.StatisticalThreshold;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StatisticalThresholdJsonMarshaller {
    private static StatisticalThresholdJsonMarshaller instance;

    public static StatisticalThresholdJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StatisticalThresholdJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StatisticalThreshold statisticalThreshold, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (statisticalThreshold.getStatistic() != null) {
            String statistic = statisticalThreshold.getStatistic();
            awsJsonWriter.name("statistic");
            awsJsonWriter.value(statistic);
        }
        awsJsonWriter.endObject();
    }
}
