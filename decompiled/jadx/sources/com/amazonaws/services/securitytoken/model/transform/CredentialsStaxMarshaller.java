package com.amazonaws.services.securitytoken.model.transform;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.util.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CredentialsStaxMarshaller {
    private static CredentialsStaxMarshaller instance;

    public static CredentialsStaxMarshaller getInstance() {
        if (instance == null) {
            instance = new CredentialsStaxMarshaller();
        }
        return instance;
    }

    public void marshall(Credentials credentials, Request<?> request, String str) {
        if (credentials.getAccessKeyId() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "AccessKeyId"), StringUtils.fromString(credentials.getAccessKeyId()));
        }
        if (credentials.getSecretAccessKey() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "SecretAccessKey"), StringUtils.fromString(credentials.getSecretAccessKey()));
        }
        if (credentials.getSessionToken() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "SessionToken"), StringUtils.fromString(credentials.getSessionToken()));
        }
        if (credentials.getExpiration() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "Expiration"), StringUtils.fromDate(credentials.getExpiration()));
        }
    }
}
