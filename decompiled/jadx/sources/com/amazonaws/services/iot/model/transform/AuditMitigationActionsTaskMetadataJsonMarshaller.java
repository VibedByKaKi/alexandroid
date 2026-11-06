package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuditMitigationActionsTaskMetadata;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditMitigationActionsTaskMetadataJsonMarshaller {
    private static AuditMitigationActionsTaskMetadataJsonMarshaller instance;

    public static AuditMitigationActionsTaskMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuditMitigationActionsTaskMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuditMitigationActionsTaskMetadata auditMitigationActionsTaskMetadata, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (auditMitigationActionsTaskMetadata.getTaskId() != null) {
            String taskId = auditMitigationActionsTaskMetadata.getTaskId();
            awsJsonWriter.name("taskId");
            awsJsonWriter.value(taskId);
        }
        if (auditMitigationActionsTaskMetadata.getStartTime() != null) {
            Date startTime = auditMitigationActionsTaskMetadata.getStartTime();
            awsJsonWriter.name("startTime");
            awsJsonWriter.value(startTime);
        }
        if (auditMitigationActionsTaskMetadata.getTaskStatus() != null) {
            String taskStatus = auditMitigationActionsTaskMetadata.getTaskStatus();
            awsJsonWriter.name("taskStatus");
            awsJsonWriter.value(taskStatus);
        }
        awsJsonWriter.endObject();
    }
}
