package com.amazonaws.services.securitytoken.model.transform;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.util.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PolicyDescriptorTypeStaxMarshaller {
    private static PolicyDescriptorTypeStaxMarshaller instance;

    public static PolicyDescriptorTypeStaxMarshaller getInstance() {
        if (instance == null) {
            instance = new PolicyDescriptorTypeStaxMarshaller();
        }
        return instance;
    }

    public void marshall(PolicyDescriptorType policyDescriptorType, Request<?> request, String str) {
        if (policyDescriptorType.getArn() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "arn"), StringUtils.fromString(policyDescriptorType.getArn()));
        }
    }
}
