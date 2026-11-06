package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.MetricDimension;
import com.amazonaws.services.iot.model.MetricToRetain;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MetricToRetainJsonMarshaller {
    private static MetricToRetainJsonMarshaller instance;

    public static MetricToRetainJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MetricToRetainJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MetricToRetain metricToRetain, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (metricToRetain.getMetric() != null) {
            String metric = metricToRetain.getMetric();
            awsJsonWriter.name("metric");
            awsJsonWriter.value(metric);
        }
        if (metricToRetain.getMetricDimension() != null) {
            MetricDimension metricDimension = metricToRetain.getMetricDimension();
            awsJsonWriter.name("metricDimension");
            MetricDimensionJsonMarshaller.getInstance().marshall(metricDimension, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
