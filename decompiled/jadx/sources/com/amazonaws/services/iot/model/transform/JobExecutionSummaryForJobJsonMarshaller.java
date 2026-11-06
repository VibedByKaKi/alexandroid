package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.JobExecutionSummary;
import com.amazonaws.services.iot.model.JobExecutionSummaryForJob;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionSummaryForJobJsonMarshaller {
    private static JobExecutionSummaryForJobJsonMarshaller instance;

    public static JobExecutionSummaryForJobJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionSummaryForJobJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobExecutionSummaryForJob jobExecutionSummaryForJob, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobExecutionSummaryForJob.getThingArn() != null) {
            String thingArn = jobExecutionSummaryForJob.getThingArn();
            awsJsonWriter.name("thingArn");
            awsJsonWriter.value(thingArn);
        }
        if (jobExecutionSummaryForJob.getJobExecutionSummary() != null) {
            JobExecutionSummary jobExecutionSummary = jobExecutionSummaryForJob.getJobExecutionSummary();
            awsJsonWriter.name("jobExecutionSummary");
            JobExecutionSummaryJsonMarshaller.getInstance().marshall(jobExecutionSummary, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
