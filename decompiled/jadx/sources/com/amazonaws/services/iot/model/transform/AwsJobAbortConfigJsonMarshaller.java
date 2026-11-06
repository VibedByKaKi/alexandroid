package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AwsJobAbortConfig;
import com.amazonaws.services.iot.model.AwsJobAbortCriteria;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AwsJobAbortConfigJsonMarshaller {
    private static AwsJobAbortConfigJsonMarshaller instance;

    public static AwsJobAbortConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AwsJobAbortConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AwsJobAbortConfig awsJobAbortConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (awsJobAbortConfig.getAbortCriteriaList() != null) {
            List<AwsJobAbortCriteria> abortCriteriaList = awsJobAbortConfig.getAbortCriteriaList();
            awsJsonWriter.name("abortCriteriaList");
            awsJsonWriter.beginArray();
            for (AwsJobAbortCriteria awsJobAbortCriteria : abortCriteriaList) {
                if (awsJobAbortCriteria != null) {
                    AwsJobAbortCriteriaJsonMarshaller.getInstance().marshall(awsJobAbortCriteria, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
