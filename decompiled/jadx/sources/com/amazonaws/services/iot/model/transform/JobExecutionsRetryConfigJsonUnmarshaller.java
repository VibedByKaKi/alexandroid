package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.JobExecutionsRetryConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionsRetryConfigJsonUnmarshaller implements Unmarshaller<JobExecutionsRetryConfig, JsonUnmarshallerContext> {
    private static JobExecutionsRetryConfigJsonUnmarshaller instance;

    public static JobExecutionsRetryConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionsRetryConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public JobExecutionsRetryConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobExecutionsRetryConfig jobExecutionsRetryConfig = new JobExecutionsRetryConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("criteriaList")) {
                jobExecutionsRetryConfig.setCriteriaList(new ListUnmarshaller(RetryCriteriaJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobExecutionsRetryConfig;
    }
}
