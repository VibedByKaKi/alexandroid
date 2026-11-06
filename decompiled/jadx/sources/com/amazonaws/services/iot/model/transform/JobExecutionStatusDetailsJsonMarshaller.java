package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.JobExecutionStatusDetails;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class JobExecutionStatusDetailsJsonMarshaller {
    private static JobExecutionStatusDetailsJsonMarshaller instance;

    public static JobExecutionStatusDetailsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new JobExecutionStatusDetailsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(JobExecutionStatusDetails jobExecutionStatusDetails, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (jobExecutionStatusDetails.getDetailsMap() != null) {
            Map<String, String> detailsMap = jobExecutionStatusDetails.getDetailsMap();
            awsJsonWriter.name("detailsMap");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry : detailsMap.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    awsJsonWriter.value(value);
                }
            }
            awsJsonWriter.endObject();
        }
        awsJsonWriter.endObject();
    }
}
