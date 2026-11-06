package org.bouncycastle.pqc.crypto.lms;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class HSSKeyGenerationParameters extends KeyGenerationParameters {
    private final LMSParameters[] lmsParameters;

    public HSSKeyGenerationParameters(LMSParameters[] lMSParametersArr, SecureRandom secureRandom) {
        super(secureRandom, LmsUtils.calculateStrength(lMSParametersArr[0]));
        if (lMSParametersArr.length == 0 || lMSParametersArr.length > 8) {
            Single$$ExternalSyntheticBUOutline0.m$3("lmsParameters length should be between 1 and 8 inclusive");
            throw null;
        }
        this.lmsParameters = lMSParametersArr;
    }

    public int getDepth() {
        return this.lmsParameters.length;
    }

    public LMSParameters[] getLmsParameters() {
        return this.lmsParameters;
    }
}
