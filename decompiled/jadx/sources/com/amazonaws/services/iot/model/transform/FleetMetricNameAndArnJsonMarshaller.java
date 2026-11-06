package com.amazonaws.services.iot.model.transform;

import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazonaws.services.iot.model.FleetMetricNameAndArn;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FleetMetricNameAndArnJsonMarshaller {
    private static FleetMetricNameAndArnJsonMarshaller instance;

    public static FleetMetricNameAndArnJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FleetMetricNameAndArnJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FleetMetricNameAndArn fleetMetricNameAndArn, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (fleetMetricNameAndArn.getMetricName() != null) {
            String metricName = fleetMetricNameAndArn.getMetricName();
            awsJsonWriter.name(ShortcutConstants.METRIC_NAME_KEY);
            awsJsonWriter.value(metricName);
        }
        if (fleetMetricNameAndArn.getMetricArn() != null) {
            String metricArn = fleetMetricNameAndArn.getMetricArn();
            awsJsonWriter.name("metricArn");
            awsJsonWriter.value(metricArn);
        }
        awsJsonWriter.endObject();
    }
}
