package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.PolicyVersionIdentifier;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PolicyVersionIdentifierJsonMarshaller {
    private static PolicyVersionIdentifierJsonMarshaller instance;

    public static PolicyVersionIdentifierJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PolicyVersionIdentifierJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PolicyVersionIdentifier policyVersionIdentifier, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (policyVersionIdentifier.getPolicyName() != null) {
            String policyName = policyVersionIdentifier.getPolicyName();
            awsJsonWriter.name("policyName");
            awsJsonWriter.value(policyName);
        }
        if (policyVersionIdentifier.getPolicyVersionId() != null) {
            String policyVersionId = policyVersionIdentifier.getPolicyVersionId();
            awsJsonWriter.name("policyVersionId");
            awsJsonWriter.value(policyVersionId);
        }
        awsJsonWriter.endObject();
    }
}
