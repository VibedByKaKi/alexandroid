package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class XDHUPublicParameters implements CipherParameters {
    private AsymmetricKeyParameter ephemeralPublicKey;
    private AsymmetricKeyParameter staticPublicKey;

    public XDHUPublicParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        if (asymmetricKeyParameter == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("staticPublicKey cannot be null");
            throw null;
        }
        if (!(asymmetricKeyParameter instanceof X448PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PublicKeyParameters)) {
            Single$$ExternalSyntheticBUOutline0.m$3("only X25519 and X448 paramaters can be used");
            throw null;
        }
        if (asymmetricKeyParameter2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("ephemeralPublicKey cannot be null");
            throw null;
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            Single$$ExternalSyntheticBUOutline0.m$3("static and ephemeral public keys have different domain parameters");
            throw null;
        }
        this.staticPublicKey = asymmetricKeyParameter;
        this.ephemeralPublicKey = asymmetricKeyParameter2;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public AsymmetricKeyParameter getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
