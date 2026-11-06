package com.amazonaws.services.securitytoken.model.transform;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.AssumedRoleUser;
import com.amazonaws.util.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AssumedRoleUserStaxMarshaller {
    private static AssumedRoleUserStaxMarshaller instance;

    public static AssumedRoleUserStaxMarshaller getInstance() {
        if (instance == null) {
            instance = new AssumedRoleUserStaxMarshaller();
        }
        return instance;
    }

    public void marshall(AssumedRoleUser assumedRoleUser, Request<?> request, String str) {
        if (assumedRoleUser.getAssumedRoleId() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "AssumedRoleId"), StringUtils.fromString(assumedRoleUser.getAssumedRoleId()));
        }
        if (assumedRoleUser.getArn() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "Arn"), StringUtils.fromString(assumedRoleUser.getArn()));
        }
    }
}
