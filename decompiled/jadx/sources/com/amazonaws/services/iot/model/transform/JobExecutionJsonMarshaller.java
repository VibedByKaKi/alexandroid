package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazonaws.services.iot.model.JobExecution;
import com.amazonaws.services.iot.model.JobExecutionStatusDetails;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionJsonMarshaller {
    private static JobExecutionJsonMarshaller instance;

    public static JobExecutionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobExecution jobExecution, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobExecution.getJobId() != null) {
            String jobId = jobExecution.getJobId();
            awsJsonWriter.name(Constants.SubmitFeedbackContentDetails.REQUEST_JOB_ID);
            awsJsonWriter.value(jobId);
        }
        if (jobExecution.getStatus() != null) {
            String status = jobExecution.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (jobExecution.getForceCanceled() != null) {
            Boolean forceCanceled = jobExecution.getForceCanceled();
            awsJsonWriter.name("forceCanceled");
            awsJsonWriter.value(forceCanceled.booleanValue());
        }
        if (jobExecution.getStatusDetails() != null) {
            JobExecutionStatusDetails statusDetails = jobExecution.getStatusDetails();
            awsJsonWriter.name("statusDetails");
            JobExecutionStatusDetailsJsonMarshaller.getInstance().marshall(statusDetails, awsJsonWriter);
        }
        if (jobExecution.getThingArn() != null) {
            String thingArn = jobExecution.getThingArn();
            awsJsonWriter.name("thingArn");
            awsJsonWriter.value(thingArn);
        }
        if (jobExecution.getQueuedAt() != null) {
            Date queuedAt = jobExecution.getQueuedAt();
            awsJsonWriter.name("queuedAt");
            awsJsonWriter.value(queuedAt);
        }
        if (jobExecution.getStartedAt() != null) {
            Date startedAt = jobExecution.getStartedAt();
            awsJsonWriter.name("startedAt");
            awsJsonWriter.value(startedAt);
        }
        if (jobExecution.getLastUpdatedAt() != null) {
            Date lastUpdatedAt = jobExecution.getLastUpdatedAt();
            awsJsonWriter.name("lastUpdatedAt");
            awsJsonWriter.value(lastUpdatedAt);
        }
        if (jobExecution.getExecutionNumber() != null) {
            Long executionNumber = jobExecution.getExecutionNumber();
            awsJsonWriter.name("executionNumber");
            awsJsonWriter.value(executionNumber);
        }
        if (jobExecution.getVersionNumber() != null) {
            Long versionNumber = jobExecution.getVersionNumber();
            awsJsonWriter.name("versionNumber");
            awsJsonWriter.value(versionNumber);
        }
        if (jobExecution.getApproximateSecondsBeforeTimedOut() != null) {
            Long approximateSecondsBeforeTimedOut = jobExecution.getApproximateSecondsBeforeTimedOut();
            awsJsonWriter.name("approximateSecondsBeforeTimedOut");
            awsJsonWriter.value(approximateSecondsBeforeTimedOut);
        }
        awsJsonWriter.endObject();
    }
}
