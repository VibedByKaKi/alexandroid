package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Allowed;
import com.amazonaws.services.iot.model.Policy;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AllowedJsonMarshaller {
    private static AllowedJsonMarshaller instance;

    public static AllowedJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AllowedJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Allowed allowed, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (allowed.getPolicies() != null) {
            List<Policy> policies = allowed.getPolicies();
            awsJsonWriter.name("policies");
            awsJsonWriter.beginArray();
            for (Policy policy : policies) {
                if (policy != null) {
                    PolicyJsonMarshaller.getInstance().marshall(policy, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
