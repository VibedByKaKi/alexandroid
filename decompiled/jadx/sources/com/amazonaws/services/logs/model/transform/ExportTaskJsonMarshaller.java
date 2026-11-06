package com.amazonaws.services.logs.model.transform;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazonaws.services.logs.model.ExportTask;
import com.amazonaws.services.logs.model.ExportTaskExecutionInfo;
import com.amazonaws.services.logs.model.ExportTaskStatus;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ExportTaskJsonMarshaller {
    private static ExportTaskJsonMarshaller instance;

    public static ExportTaskJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ExportTaskJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ExportTask exportTask, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (exportTask.getTaskId() != null) {
            String taskId = exportTask.getTaskId();
            awsJsonWriter.name("taskId");
            awsJsonWriter.value(taskId);
        }
        if (exportTask.getTaskName() != null) {
            String taskName = exportTask.getTaskName();
            awsJsonWriter.name("taskName");
            awsJsonWriter.value(taskName);
        }
        if (exportTask.getLogGroupName() != null) {
            String logGroupName = exportTask.getLogGroupName();
            awsJsonWriter.name("logGroupName");
            awsJsonWriter.value(logGroupName);
        }
        if (exportTask.getFrom() != null) {
            Long from = exportTask.getFrom();
            awsJsonWriter.name("from");
            awsJsonWriter.value(from);
        }
        if (exportTask.getTo() != null) {
            Long to = exportTask.getTo();
            awsJsonWriter.name(TypedValues.TransitionType.S_TO);
            awsJsonWriter.value(to);
        }
        if (exportTask.getDestination() != null) {
            String destination = exportTask.getDestination();
            awsJsonWriter.name(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY);
            awsJsonWriter.value(destination);
        }
        if (exportTask.getDestinationPrefix() != null) {
            String destinationPrefix = exportTask.getDestinationPrefix();
            awsJsonWriter.name("destinationPrefix");
            awsJsonWriter.value(destinationPrefix);
        }
        if (exportTask.getStatus() != null) {
            ExportTaskStatus status = exportTask.getStatus();
            awsJsonWriter.name("status");
            ExportTaskStatusJsonMarshaller.getInstance().marshall(status, awsJsonWriter);
        }
        if (exportTask.getExecutionInfo() != null) {
            ExportTaskExecutionInfo executionInfo = exportTask.getExecutionInfo();
            awsJsonWriter.name("executionInfo");
            ExportTaskExecutionInfoJsonMarshaller.getInstance().marshall(executionInfo, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
