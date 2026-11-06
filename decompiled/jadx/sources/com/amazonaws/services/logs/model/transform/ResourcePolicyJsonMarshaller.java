package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.ResourcePolicy;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ResourcePolicyJsonMarshaller {
    private static ResourcePolicyJsonMarshaller instance;

    public static ResourcePolicyJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ResourcePolicyJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ResourcePolicy resourcePolicy, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (resourcePolicy.getPolicyName() != null) {
            String policyName = resourcePolicy.getPolicyName();
            awsJsonWriter.name("policyName");
            awsJsonWriter.value(policyName);
        }
        if (resourcePolicy.getPolicyDocument() != null) {
            String policyDocument = resourcePolicy.getPolicyDocument();
            awsJsonWriter.name("policyDocument");
            awsJsonWriter.value(policyDocument);
        }
        if (resourcePolicy.getLastUpdatedTime() != null) {
            Long lastUpdatedTime = resourcePolicy.getLastUpdatedTime();
            awsJsonWriter.name("lastUpdatedTime");
            awsJsonWriter.value(lastUpdatedTime);
        }
        awsJsonWriter.endObject();
    }
}
