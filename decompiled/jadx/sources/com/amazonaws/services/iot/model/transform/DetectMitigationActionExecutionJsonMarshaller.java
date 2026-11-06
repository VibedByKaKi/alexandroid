package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DetectMitigationActionExecution;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DetectMitigationActionExecutionJsonMarshaller {
    private static DetectMitigationActionExecutionJsonMarshaller instance;

    public static DetectMitigationActionExecutionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectMitigationActionExecutionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectMitigationActionExecution detectMitigationActionExecution, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (detectMitigationActionExecution.getTaskId() != null) {
            String taskId = detectMitigationActionExecution.getTaskId();
            awsJsonWriter.name("taskId");
            awsJsonWriter.value(taskId);
        }
        if (detectMitigationActionExecution.getViolationId() != null) {
            String violationId = detectMitigationActionExecution.getViolationId();
            awsJsonWriter.name("violationId");
            awsJsonWriter.value(violationId);
        }
        if (detectMitigationActionExecution.getActionName() != null) {
            String actionName = detectMitigationActionExecution.getActionName();
            awsJsonWriter.name("actionName");
            awsJsonWriter.value(actionName);
        }
        if (detectMitigationActionExecution.getThingName() != null) {
            String thingName = detectMitigationActionExecution.getThingName();
            awsJsonWriter.name("thingName");
            awsJsonWriter.value(thingName);
        }
        if (detectMitigationActionExecution.getExecutionStartDate() != null) {
            Date executionStartDate = detectMitigationActionExecution.getExecutionStartDate();
            awsJsonWriter.name("executionStartDate");
            awsJsonWriter.value(executionStartDate);
        }
        if (detectMitigationActionExecution.getExecutionEndDate() != null) {
            Date executionEndDate = detectMitigationActionExecution.getExecutionEndDate();
            awsJsonWriter.name("executionEndDate");
            awsJsonWriter.value(executionEndDate);
        }
        if (detectMitigationActionExecution.getStatus() != null) {
            String status = detectMitigationActionExecution.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (detectMitigationActionExecution.getErrorCode() != null) {
            String errorCode = detectMitigationActionExecution.getErrorCode();
            awsJsonWriter.name("errorCode");
            awsJsonWriter.value(errorCode);
        }
        if (detectMitigationActionExecution.getMessage() != null) {
            String message = detectMitigationActionExecution.getMessage();
            awsJsonWriter.name("message");
            awsJsonWriter.value(message);
        }
        awsJsonWriter.endObject();
    }
}
