package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.IndexingFilter;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IndexingFilterJsonMarshaller {
    private static IndexingFilterJsonMarshaller instance;

    public static IndexingFilterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new IndexingFilterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(IndexingFilter indexingFilter, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (indexingFilter.getNamedShadowNames() != null) {
            List<String> namedShadowNames = indexingFilter.getNamedShadowNames();
            awsJsonWriter.name("namedShadowNames");
            awsJsonWriter.beginArray();
            for (String str : namedShadowNames) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
