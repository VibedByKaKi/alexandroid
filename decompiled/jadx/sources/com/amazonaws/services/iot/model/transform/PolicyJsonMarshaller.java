package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Policy;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PolicyJsonMarshaller {
    private static PolicyJsonMarshaller instance;

    public static PolicyJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PolicyJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Policy policy, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (policy.getPolicyName() != null) {
            String policyName = policy.getPolicyName();
            awsJsonWriter.name("policyName");
            awsJsonWriter.value(policyName);
        }
        if (policy.getPolicyArn() != null) {
            String policyArn = policy.getPolicyArn();
            awsJsonWriter.name("policyArn");
            awsJsonWriter.value(policyArn);
        }
        awsJsonWriter.endObject();
    }
}
