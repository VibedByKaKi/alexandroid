package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class DHMQVPublicParameters implements CipherParameters {
    private DHPublicKeyParameters ephemeralPublicKey;
    private DHPublicKeyParameters staticPublicKey;

    public DHMQVPublicParameters(DHPublicKeyParameters dHPublicKeyParameters, DHPublicKeyParameters dHPublicKeyParameters2) {
        if (dHPublicKeyParameters == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("staticPublicKey cannot be null");
            throw null;
        }
        if (dHPublicKeyParameters2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("ephemeralPublicKey cannot be null");
            throw null;
        }
        if (!dHPublicKeyParameters.getParameters().equals(dHPublicKeyParameters2.getParameters())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Static and ephemeral public keys have different domain parameters");
            throw null;
        }
        this.staticPublicKey = dHPublicKeyParameters;
        this.ephemeralPublicKey = dHPublicKeyParameters2;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public DHPublicKeyParameters getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
