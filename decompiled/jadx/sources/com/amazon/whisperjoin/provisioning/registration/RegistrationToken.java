package com.amazon.whisperjoin.provisioning.registration;

import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import com.amazon.whisperjoin.utils.InputValidator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class RegistrationToken implements Validatable {
    private final long expiry;
    private final String token;

    public RegistrationToken(String str, long j) {
        this.token = str;
        this.expiry = j;
        validate();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RegistrationToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegistrationToken)) {
            return false;
        }
        RegistrationToken registrationToken = (RegistrationToken) obj;
        if (!registrationToken.canEqual(this) || getExpiry() != registrationToken.getExpiry()) {
            return false;
        }
        String token = getToken();
        String token2 = registrationToken.getToken();
        return token != null ? token.equals(token2) : token2 == null;
    }

    public long getExpiry() {
        return this.expiry;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        long expiry = getExpiry();
        String token = getToken();
        return ((((int) (expiry ^ (expiry >>> 32))) + 59) * 59) + (token == null ? 43 : token.hashCode());
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        if (InputValidator.isValidRegistrationToken(this.token)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Registration token cannot be empty. Please use InputValidator methods to validate parameters.");
    }
}
