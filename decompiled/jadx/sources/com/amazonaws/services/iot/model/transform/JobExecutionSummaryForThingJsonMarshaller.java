package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazonaws.services.iot.model.JobExecutionSummary;
import com.amazonaws.services.iot.model.JobExecutionSummaryForThing;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionSummaryForThingJsonMarshaller {
    private static JobExecutionSummaryForThingJsonMarshaller instance;

    public static JobExecutionSummaryForThingJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionSummaryForThingJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobExecutionSummaryForThing jobExecutionSummaryForThing, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobExecutionSummaryForThing.getJobId() != null) {
            String jobId = jobExecutionSummaryForThing.getJobId();
            awsJsonWriter.name(Constants.SubmitFeedbackContentDetails.REQUEST_JOB_ID);
            awsJsonWriter.value(jobId);
        }
        if (jobExecutionSummaryForThing.getJobExecutionSummary() != null) {
            JobExecutionSummary jobExecutionSummary = jobExecutionSummaryForThing.getJobExecutionSummary();
            awsJsonWriter.name("jobExecutionSummary");
            JobExecutionSummaryJsonMarshaller.getInstance().marshall(jobExecutionSummary, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
