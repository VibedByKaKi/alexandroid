package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.JobTemplateSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobTemplateSummaryJsonMarshaller {
    private static JobTemplateSummaryJsonMarshaller instance;

    public static JobTemplateSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobTemplateSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobTemplateSummary jobTemplateSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobTemplateSummary.getJobTemplateArn() != null) {
            String jobTemplateArn = jobTemplateSummary.getJobTemplateArn();
            awsJsonWriter.name("jobTemplateArn");
            awsJsonWriter.value(jobTemplateArn);
        }
        if (jobTemplateSummary.getJobTemplateId() != null) {
            String jobTemplateId = jobTemplateSummary.getJobTemplateId();
            awsJsonWriter.name("jobTemplateId");
            awsJsonWriter.value(jobTemplateId);
        }
        if (jobTemplateSummary.getDescription() != null) {
            String description = jobTemplateSummary.getDescription();
            awsJsonWriter.name("description");
            awsJsonWriter.value(description);
        }
        if (jobTemplateSummary.getCreatedAt() != null) {
            Date createdAt = jobTemplateSummary.getCreatedAt();
            awsJsonWriter.name("createdAt");
            awsJsonWriter.value(createdAt);
        }
        awsJsonWriter.endObject();
    }
}
