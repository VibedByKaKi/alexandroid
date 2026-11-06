package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.JobExecutionSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionSummaryJsonMarshaller {
    private static JobExecutionSummaryJsonMarshaller instance;

    public static JobExecutionSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobExecutionSummary jobExecutionSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobExecutionSummary.getStatus() != null) {
            String status = jobExecutionSummary.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (jobExecutionSummary.getQueuedAt() != null) {
            Date queuedAt = jobExecutionSummary.getQueuedAt();
            awsJsonWriter.name("queuedAt");
            awsJsonWriter.value(queuedAt);
        }
        if (jobExecutionSummary.getStartedAt() != null) {
            Date startedAt = jobExecutionSummary.getStartedAt();
            awsJsonWriter.name("startedAt");
            awsJsonWriter.value(startedAt);
        }
        if (jobExecutionSummary.getLastUpdatedAt() != null) {
            Date lastUpdatedAt = jobExecutionSummary.getLastUpdatedAt();
            awsJsonWriter.name("lastUpdatedAt");
            awsJsonWriter.value(lastUpdatedAt);
        }
        if (jobExecutionSummary.getExecutionNumber() != null) {
            Long executionNumber = jobExecutionSummary.getExecutionNumber();
            awsJsonWriter.name("executionNumber");
            awsJsonWriter.value(executionNumber);
        }
        if (jobExecutionSummary.getRetryAttempt() != null) {
            Integer retryAttempt = jobExecutionSummary.getRetryAttempt();
            awsJsonWriter.name("retryAttempt");
            awsJsonWriter.value(retryAttempt);
        }
        awsJsonWriter.endObject();
    }
}
