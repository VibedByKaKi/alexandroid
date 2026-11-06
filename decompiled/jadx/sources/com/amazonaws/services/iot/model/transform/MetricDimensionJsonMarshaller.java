package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.MetricDimension;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MetricDimensionJsonMarshaller {
    private static MetricDimensionJsonMarshaller instance;

    public static MetricDimensionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MetricDimensionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MetricDimension metricDimension, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (metricDimension.getDimensionName() != null) {
            String dimensionName = metricDimension.getDimensionName();
            awsJsonWriter.name("dimensionName");
            awsJsonWriter.value(dimensionName);
        }
        if (metricDimension.getOperator() != null) {
            String operator = metricDimension.getOperator();
            awsJsonWriter.name("operator");
            awsJsonWriter.value(operator);
        }
        awsJsonWriter.endObject();
    }
}
