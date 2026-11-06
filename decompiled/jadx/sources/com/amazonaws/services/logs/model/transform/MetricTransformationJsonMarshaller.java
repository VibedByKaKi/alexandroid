package com.amazonaws.services.logs.model.transform;

import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazonaws.services.logs.model.MetricTransformation;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MetricTransformationJsonMarshaller {
    private static MetricTransformationJsonMarshaller instance;

    public static MetricTransformationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MetricTransformationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MetricTransformation metricTransformation, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (metricTransformation.getMetricName() != null) {
            String metricName = metricTransformation.getMetricName();
            awsJsonWriter.name(ShortcutConstants.METRIC_NAME_KEY);
            awsJsonWriter.value(metricName);
        }
        if (metricTransformation.getMetricNamespace() != null) {
            String metricNamespace = metricTransformation.getMetricNamespace();
            awsJsonWriter.name("metricNamespace");
            awsJsonWriter.value(metricNamespace);
        }
        if (metricTransformation.getMetricValue() != null) {
            String metricValue = metricTransformation.getMetricValue();
            awsJsonWriter.name("metricValue");
            awsJsonWriter.value(metricValue);
        }
        if (metricTransformation.getDefaultValue() != null) {
            Double defaultValue = metricTransformation.getDefaultValue();
            awsJsonWriter.name("defaultValue");
            awsJsonWriter.value(defaultValue);
        }
        awsJsonWriter.endObject();
    }
}
