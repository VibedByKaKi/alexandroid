package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AbortConfig;
import com.amazonaws.services.iot.model.AbortCriteria;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AbortConfigJsonMarshaller {
    private static AbortConfigJsonMarshaller instance;

    public static AbortConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AbortConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AbortConfig abortConfig, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (abortConfig.getCriteriaList() != null) {
            List<AbortCriteria> criteriaList = abortConfig.getCriteriaList();
            awsJsonWriter.name("criteriaList");
            awsJsonWriter.beginArray();
            for (AbortCriteria abortCriteria : criteriaList) {
                if (abortCriteria != null) {
                    AbortCriteriaJsonMarshaller.getInstance().marshall(abortCriteria, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
