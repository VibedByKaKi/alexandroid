package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.JobExecutionsRetryConfig;
import com.amazonaws.services.iot.model.RetryCriteria;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionsRetryConfigJsonMarshaller {
    private static JobExecutionsRetryConfigJsonMarshaller instance;

    public static JobExecutionsRetryConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionsRetryConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobExecutionsRetryConfig jobExecutionsRetryConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobExecutionsRetryConfig.getCriteriaList() != null) {
            List<RetryCriteria> criteriaList = jobExecutionsRetryConfig.getCriteriaList();
            awsJsonWriter.name("criteriaList");
            awsJsonWriter.beginArray();
            for (RetryCriteria retryCriteria : criteriaList) {
                if (retryCriteria != null) {
                    RetryCriteriaJsonMarshaller.getInstance().marshall(retryCriteria, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
