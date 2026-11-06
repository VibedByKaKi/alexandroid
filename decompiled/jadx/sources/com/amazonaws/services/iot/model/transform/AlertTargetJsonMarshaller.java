package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AlertTarget;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AlertTargetJsonMarshaller {
    private static AlertTargetJsonMarshaller instance;

    public static AlertTargetJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AlertTargetJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AlertTarget alertTarget, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (alertTarget.getAlertTargetArn() != null) {
            String alertTargetArn = alertTarget.getAlertTargetArn();
            awsJsonWriter.name("alertTargetArn");
            awsJsonWriter.value(alertTargetArn);
        }
        if (alertTarget.getRoleArn() != null) {
            String roleArn = alertTarget.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
