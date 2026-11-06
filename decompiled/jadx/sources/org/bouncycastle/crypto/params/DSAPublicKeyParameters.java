package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private BigInteger y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.y = validate(bigInteger, dSAParameters);
    }

    private BigInteger validate(BigInteger bigInteger, DSAParameters dSAParameters) {
        if (dSAParameters == null) {
            return bigInteger;
        }
        BigInteger bigInteger2 = TWO;
        if (bigInteger2.compareTo(bigInteger) <= 0 && dSAParameters.getP().subtract(bigInteger2).compareTo(bigInteger) >= 0 && ONE.equals(bigInteger.modPow(dSAParameters.getQ(), dSAParameters.getP()))) {
            return bigInteger;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("y value does not appear to be in correct group");
        return null;
    }

    public BigInteger getY() {
        return this.y;
    }
}
