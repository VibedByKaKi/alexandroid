package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazonaws.services.iot.model.JobSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobSummaryJsonMarshaller {
    private static JobSummaryJsonMarshaller instance;

    public static JobSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobSummary jobSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobSummary.getJobArn() != null) {
            String jobArn = jobSummary.getJobArn();
            awsJsonWriter.name("jobArn");
            awsJsonWriter.value(jobArn);
        }
        if (jobSummary.getJobId() != null) {
            String jobId = jobSummary.getJobId();
            awsJsonWriter.name(Constants.SubmitFeedbackContentDetails.REQUEST_JOB_ID);
            awsJsonWriter.value(jobId);
        }
        if (jobSummary.getThingGroupId() != null) {
            String thingGroupId = jobSummary.getThingGroupId();
            awsJsonWriter.name("thingGroupId");
            awsJsonWriter.value(thingGroupId);
        }
        if (jobSummary.getTargetSelection() != null) {
            String targetSelection = jobSummary.getTargetSelection();
            awsJsonWriter.name("targetSelection");
            awsJsonWriter.value(targetSelection);
        }
        if (jobSummary.getStatus() != null) {
            String status = jobSummary.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (jobSummary.getCreatedAt() != null) {
            Date createdAt = jobSummary.getCreatedAt();
            awsJsonWriter.name("createdAt");
            awsJsonWriter.value(createdAt);
        }
        if (jobSummary.getLastUpdatedAt() != null) {
            Date lastUpdatedAt = jobSummary.getLastUpdatedAt();
            awsJsonWriter.name("lastUpdatedAt");
            awsJsonWriter.value(lastUpdatedAt);
        }
        if (jobSummary.getCompletedAt() != null) {
            Date completedAt = jobSummary.getCompletedAt();
            awsJsonWriter.name("completedAt");
            awsJsonWriter.value(completedAt);
        }
        if (jobSummary.getIsConcurrent() != null) {
            Boolean isConcurrent = jobSummary.getIsConcurrent();
            awsJsonWriter.name("isConcurrent");
            awsJsonWriter.value(isConcurrent.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
