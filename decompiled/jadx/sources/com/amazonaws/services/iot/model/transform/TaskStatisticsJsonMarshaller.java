package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TaskStatistics;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TaskStatisticsJsonMarshaller {
    private static TaskStatisticsJsonMarshaller instance;

    public static TaskStatisticsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TaskStatisticsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TaskStatistics taskStatistics, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (taskStatistics.getTotalChecks() != null) {
            Integer totalChecks = taskStatistics.getTotalChecks();
            awsJsonWriter.name("totalChecks");
            awsJsonWriter.value(totalChecks);
        }
        if (taskStatistics.getInProgressChecks() != null) {
            Integer inProgressChecks = taskStatistics.getInProgressChecks();
            awsJsonWriter.name("inProgressChecks");
            awsJsonWriter.value(inProgressChecks);
        }
        if (taskStatistics.getWaitingForDataCollectionChecks() != null) {
            Integer waitingForDataCollectionChecks = taskStatistics.getWaitingForDataCollectionChecks();
            awsJsonWriter.name("waitingForDataCollectionChecks");
            awsJsonWriter.value(waitingForDataCollectionChecks);
        }
        if (taskStatistics.getCompliantChecks() != null) {
            Integer compliantChecks = taskStatistics.getCompliantChecks();
            awsJsonWriter.name("compliantChecks");
            awsJsonWriter.value(compliantChecks);
        }
        if (taskStatistics.getNonCompliantChecks() != null) {
            Integer nonCompliantChecks = taskStatistics.getNonCompliantChecks();
            awsJsonWriter.name("nonCompliantChecks");
            awsJsonWriter.value(nonCompliantChecks);
        }
        if (taskStatistics.getFailedChecks() != null) {
            Integer failedChecks = taskStatistics.getFailedChecks();
            awsJsonWriter.name("failedChecks");
            awsJsonWriter.value(failedChecks);
        }
        if (taskStatistics.getCanceledChecks() != null) {
            Integer canceledChecks = taskStatistics.getCanceledChecks();
            awsJsonWriter.name("canceledChecks");
            awsJsonWriter.value(canceledChecks);
        }
        awsJsonWriter.endObject();
    }
}
