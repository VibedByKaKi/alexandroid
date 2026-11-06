package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class LMSHSSKeyGenParameterSpec implements AlgorithmParameterSpec {
    private final LMSKeyGenParameterSpec[] specs;

    public LMSHSSKeyGenParameterSpec(LMSKeyGenParameterSpec... lMSKeyGenParameterSpecArr) {
        if (lMSKeyGenParameterSpecArr.length != 0) {
            this.specs = (LMSKeyGenParameterSpec[]) lMSKeyGenParameterSpecArr.clone();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("at least one LMSKeyGenParameterSpec required");
            throw null;
        }
    }

    public LMSKeyGenParameterSpec[] getLMSSpecs() {
        return (LMSKeyGenParameterSpec[]) this.specs.clone();
    }
}
