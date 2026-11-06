package org.bouncycastle.math.field;

import java.math.BigInteger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class FiniteFields {
    static final FiniteField GF_2 = new PrimeField(BigInteger.valueOf(2));
    static final FiniteField GF_3 = new PrimeField(BigInteger.valueOf(3));

    public static PolynomialExtensionField getBinaryExtensionField(int[] iArr) {
        String str;
        if (iArr[0] == 0) {
            for (int i = 1; i < iArr.length; i++) {
                if (iArr[i] <= iArr[i - 1]) {
                    str = "Polynomial exponents must be monotonically increasing";
                }
            }
            return new GenericPolynomialExtensionField(GF_2, new GF2Polynomial(iArr));
        }
        str = "Irreducible polynomials in GF(2) must have constant term";
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public static FiniteField getPrimeField(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            Single$$ExternalSyntheticBUOutline0.m$3("'characteristic' must be >= 2");
            return null;
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return GF_2;
            }
            if (intValue == 3) {
                return GF_3;
            }
        }
        return new PrimeField(bigInteger);
    }
}
