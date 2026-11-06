package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AuditTaskMetadata;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AuditTaskMetadataJsonMarshaller {
    private static AuditTaskMetadataJsonMarshaller instance;

    public static AuditTaskMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuditTaskMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuditTaskMetadata auditTaskMetadata, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (auditTaskMetadata.getTaskId() != null) {
            String taskId = auditTaskMetadata.getTaskId();
            awsJsonWriter.name("taskId");
            awsJsonWriter.value(taskId);
        }
        if (auditTaskMetadata.getTaskStatus() != null) {
            String taskStatus = auditTaskMetadata.getTaskStatus();
            awsJsonWriter.name("taskStatus");
            awsJsonWriter.value(taskStatus);
        }
        if (auditTaskMetadata.getTaskType() != null) {
            String taskType = auditTaskMetadata.getTaskType();
            awsJsonWriter.name("taskType");
            awsJsonWriter.value(taskType);
        }
        awsJsonWriter.endObject();
    }
}
