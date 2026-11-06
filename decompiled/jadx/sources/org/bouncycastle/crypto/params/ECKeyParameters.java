package org.bouncycastle.crypto.params;

import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    private final ECDomainParameters parameters;

    public ECKeyParameters(boolean z, ECDomainParameters eCDomainParameters) {
        super(z);
        if (eCDomainParameters != null) {
            this.parameters = eCDomainParameters;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("'parameters' cannot be null");
            throw null;
        }
    }

    public ECDomainParameters getParameters() {
        return this.parameters;
    }
}
