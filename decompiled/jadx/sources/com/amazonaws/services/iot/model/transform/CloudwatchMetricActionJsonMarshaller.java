package com.amazonaws.services.iot.model.transform;

import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazonaws.services.iot.model.CloudwatchMetricAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CloudwatchMetricActionJsonMarshaller {
    private static CloudwatchMetricActionJsonMarshaller instance;

    public static CloudwatchMetricActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CloudwatchMetricActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CloudwatchMetricAction cloudwatchMetricAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (cloudwatchMetricAction.getRoleArn() != null) {
            String roleArn = cloudwatchMetricAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (cloudwatchMetricAction.getMetricNamespace() != null) {
            String metricNamespace = cloudwatchMetricAction.getMetricNamespace();
            awsJsonWriter.name("metricNamespace");
            awsJsonWriter.value(metricNamespace);
        }
        if (cloudwatchMetricAction.getMetricName() != null) {
            String metricName = cloudwatchMetricAction.getMetricName();
            awsJsonWriter.name(ShortcutConstants.METRIC_NAME_KEY);
            awsJsonWriter.value(metricName);
        }
        if (cloudwatchMetricAction.getMetricValue() != null) {
            String metricValue = cloudwatchMetricAction.getMetricValue();
            awsJsonWriter.name("metricValue");
            awsJsonWriter.value(metricValue);
        }
        if (cloudwatchMetricAction.getMetricUnit() != null) {
            String metricUnit = cloudwatchMetricAction.getMetricUnit();
            awsJsonWriter.name("metricUnit");
            awsJsonWriter.value(metricUnit);
        }
        if (cloudwatchMetricAction.getMetricTimestamp() != null) {
            String metricTimestamp = cloudwatchMetricAction.getMetricTimestamp();
            awsJsonWriter.name("metricTimestamp");
            awsJsonWriter.value(metricTimestamp);
        }
        awsJsonWriter.endObject();
    }
}
