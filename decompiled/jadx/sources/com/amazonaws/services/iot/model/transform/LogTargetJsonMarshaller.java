package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.accessory.metrics.MetricsConstants;
import com.amazonaws.services.iot.model.LogTarget;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class LogTargetJsonMarshaller {
    private static LogTargetJsonMarshaller instance;

    public static LogTargetJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LogTargetJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LogTarget logTarget, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (logTarget.getTargetType() != null) {
            String targetType = logTarget.getTargetType();
            awsJsonWriter.name("targetType");
            awsJsonWriter.value(targetType);
        }
        if (logTarget.getTargetName() != null) {
            String targetName = logTarget.getTargetName();
            awsJsonWriter.name(MetricsConstants.Firmware.TARGET_NAME);
            awsJsonWriter.value(targetName);
        }
        awsJsonWriter.endObject();
    }
}
