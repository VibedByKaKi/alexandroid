package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.EffectivePolicy;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class EffectivePolicyJsonMarshaller {
    private static EffectivePolicyJsonMarshaller instance;

    public static EffectivePolicyJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EffectivePolicyJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EffectivePolicy effectivePolicy, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (effectivePolicy.getPolicyName() != null) {
            String policyName = effectivePolicy.getPolicyName();
            awsJsonWriter.name("policyName");
            awsJsonWriter.value(policyName);
        }
        if (effectivePolicy.getPolicyArn() != null) {
            String policyArn = effectivePolicy.getPolicyArn();
            awsJsonWriter.name("policyArn");
            awsJsonWriter.value(policyArn);
        }
        if (effectivePolicy.getPolicyDocument() != null) {
            String policyDocument = effectivePolicy.getPolicyDocument();
            awsJsonWriter.name("policyDocument");
            awsJsonWriter.value(policyDocument);
        }
        awsJsonWriter.endObject();
    }
}
