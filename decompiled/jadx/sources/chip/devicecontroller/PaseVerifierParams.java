package chip.devicecontroller;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PaseVerifierParams {
    private final byte[] pakeVerifier;
    private final long setupPincode;

    public PaseVerifierParams(long j, byte[] bArr) {
        this.setupPincode = j;
        this.pakeVerifier = (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaseVerifierParams)) {
            return false;
        }
        PaseVerifierParams paseVerifierParams = (PaseVerifierParams) obj;
        return this.setupPincode == paseVerifierParams.setupPincode && Arrays.equals(this.pakeVerifier, paseVerifierParams.pakeVerifier);
    }

    public final byte[] getPakeVerifier() {
        return (byte[]) this.pakeVerifier.clone();
    }

    public final long getSetupPincode() {
        return this.setupPincode;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.pakeVerifier) + (Objects.hash(Long.valueOf(this.setupPincode)) * 31);
    }
}
