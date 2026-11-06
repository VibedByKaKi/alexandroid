package com.amazonaws.services.securitytoken.model.transform;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.FederatedUser;
import com.amazonaws.util.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FederatedUserStaxMarshaller {
    private static FederatedUserStaxMarshaller instance;

    public static FederatedUserStaxMarshaller getInstance() {
        if (instance == null) {
            instance = new FederatedUserStaxMarshaller();
        }
        return instance;
    }

    public void marshall(FederatedUser federatedUser, Request<?> request, String str) {
        if (federatedUser.getFederatedUserId() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "FederatedUserId"), StringUtils.fromString(federatedUser.getFederatedUserId()));
        }
        if (federatedUser.getArn() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "Arn"), StringUtils.fromString(federatedUser.getArn()));
        }
    }
}
