package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TaskStatisticsForAuditCheck;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TaskStatisticsForAuditCheckJsonMarshaller {
    private static TaskStatisticsForAuditCheckJsonMarshaller instance;

    public static TaskStatisticsForAuditCheckJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TaskStatisticsForAuditCheckJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TaskStatisticsForAuditCheck taskStatisticsForAuditCheck, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (taskStatisticsForAuditCheck.getTotalFindingsCount() != null) {
            Long totalFindingsCount = taskStatisticsForAuditCheck.getTotalFindingsCount();
            awsJsonWriter.name("totalFindingsCount");
            awsJsonWriter.value(totalFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getFailedFindingsCount() != null) {
            Long failedFindingsCount = taskStatisticsForAuditCheck.getFailedFindingsCount();
            awsJsonWriter.name("failedFindingsCount");
            awsJsonWriter.value(failedFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getSucceededFindingsCount() != null) {
            Long succeededFindingsCount = taskStatisticsForAuditCheck.getSucceededFindingsCount();
            awsJsonWriter.name("succeededFindingsCount");
            awsJsonWriter.value(succeededFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getSkippedFindingsCount() != null) {
            Long skippedFindingsCount = taskStatisticsForAuditCheck.getSkippedFindingsCount();
            awsJsonWriter.name("skippedFindingsCount");
            awsJsonWriter.value(skippedFindingsCount);
        }
        if (taskStatisticsForAuditCheck.getCanceledFindingsCount() != null) {
            Long canceledFindingsCount = taskStatisticsForAuditCheck.getCanceledFindingsCount();
            awsJsonWriter.name("canceledFindingsCount");
            awsJsonWriter.value(canceledFindingsCount);
        }
        awsJsonWriter.endObject();
    }
}
