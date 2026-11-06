package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuditNotificationTarget;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditNotificationTargetJsonMarshaller {
    private static AuditNotificationTargetJsonMarshaller instance;

    public static AuditNotificationTargetJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuditNotificationTargetJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuditNotificationTarget auditNotificationTarget, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (auditNotificationTarget.getTargetArn() != null) {
            String targetArn = auditNotificationTarget.getTargetArn();
            awsJsonWriter.name("targetArn");
            awsJsonWriter.value(targetArn);
        }
        if (auditNotificationTarget.getRoleArn() != null) {
            String roleArn = auditNotificationTarget.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (auditNotificationTarget.getEnabled() != null) {
            Boolean enabled = auditNotificationTarget.getEnabled();
            awsJsonWriter.name("enabled");
            awsJsonWriter.value(enabled.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
