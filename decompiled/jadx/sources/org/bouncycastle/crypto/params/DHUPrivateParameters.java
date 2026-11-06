package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class DHUPrivateParameters implements CipherParameters {
    private DHPrivateKeyParameters ephemeralPrivateKey;
    private DHPublicKeyParameters ephemeralPublicKey;
    private DHPrivateKeyParameters staticPrivateKey;

    public DHUPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2, DHPublicKeyParameters dHPublicKeyParameters) {
        if (dHPrivateKeyParameters == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("staticPrivateKey cannot be null");
            throw null;
        }
        if (dHPrivateKeyParameters2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("ephemeralPrivateKey cannot be null");
            throw null;
        }
        DHParameters parameters = dHPrivateKeyParameters.getParameters();
        if (!parameters.equals(dHPrivateKeyParameters2.getParameters())) {
            Single$$ExternalSyntheticBUOutline0.m$3("static and ephemeral private keys have different domain parameters");
            throw null;
        }
        if (dHPublicKeyParameters == null) {
            dHPublicKeyParameters = new DHPublicKeyParameters(parameters.getG().modPow(dHPrivateKeyParameters2.getX(), parameters.getP()), parameters);
        } else if (!parameters.equals(dHPublicKeyParameters.getParameters())) {
            Single$$ExternalSyntheticBUOutline0.m$3("ephemeral public key has different domain parameters");
            throw null;
        }
        this.staticPrivateKey = dHPrivateKeyParameters;
        this.ephemeralPrivateKey = dHPrivateKeyParameters2;
        this.ephemeralPublicKey = dHPublicKeyParameters;
    }

    public DHPrivateKeyParameters getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public DHPrivateKeyParameters getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public DHUPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2) {
        this(dHPrivateKeyParameters, dHPrivateKeyParameters2, null);
    }
}
