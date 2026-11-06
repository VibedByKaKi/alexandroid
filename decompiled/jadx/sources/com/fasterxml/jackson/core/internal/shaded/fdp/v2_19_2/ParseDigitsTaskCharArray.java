package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import java.math.BigInteger;
import java.util.Map;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
class ParseDigitsTaskCharArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private ParseDigitsTaskCharArray() {
    }

    public static BigInteger parseDigitsIterative(char[] cArr, int i, int i2) {
        int i3 = i2 - i;
        BigSignificand bigSignificand = new BigSignificand(FastIntegerMath.estimateNumBits(i3));
        int i4 = (i3 & 7) + i;
        int tryToParseUpTo7Digits = FastDoubleSwar.tryToParseUpTo7Digits(cArr, i, i4);
        boolean z = tryToParseUpTo7Digits >= 0;
        bigSignificand.add(tryToParseUpTo7Digits);
        while (i4 < i2) {
            int tryToParseEightDigits = FastDoubleSwar.tryToParseEightDigits(cArr, i4);
            z &= tryToParseEightDigits >= 0;
            bigSignificand.fma(100000000, tryToParseEightDigits);
            i4 += 8;
        }
        if (z) {
            return bigSignificand.toBigInteger();
        }
        XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
        return null;
    }

    public static BigInteger parseDigitsRecursive(char[] cArr, int i, int i2, Map<Integer, BigInteger> map, int i3) {
        if (i2 - i <= i3) {
            return parseDigitsIterative(cArr, i, i2);
        }
        int splitFloor16 = FastIntegerMath.splitFloor16(i, i2);
        return parseDigitsRecursive(cArr, splitFloor16, i2, map, i3).add(FftMultiplier.multiply(parseDigitsRecursive(cArr, i, splitFloor16, map, i3), map.get(Integer.valueOf(i2 - splitFloor16))));
    }
}
