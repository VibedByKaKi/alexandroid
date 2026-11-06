package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import java.math.BigInteger;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
class JavaBigIntegerFromCharArray extends AbstractBigIntegerParser {
    private BigInteger parseDecDigits(char[] cArr, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (AbstractBigIntegerParser.hasManyDigits(i3)) {
            return parseManyDecDigits(cArr, i, i2, z);
        }
        int i4 = (i3 & 7) + i;
        long tryToParseUpTo7Digits = FastDoubleSwar.tryToParseUpTo7Digits(cArr, i, i4);
        boolean z2 = tryToParseUpTo7Digits >= 0;
        while (i4 < i2) {
            int tryToParseEightDigits = FastDoubleSwar.tryToParseEightDigits(cArr, i4);
            z2 &= tryToParseEightDigits >= 0;
            tryToParseUpTo7Digits = (tryToParseUpTo7Digits * 100000000) + tryToParseEightDigits;
            i4 += 8;
        }
        if (!z2) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return null;
        }
        if (z) {
            tryToParseUpTo7Digits = -tryToParseUpTo7Digits;
        }
        return BigInteger.valueOf(tryToParseUpTo7Digits);
    }

    private BigInteger parseHexDigits(char[] cArr, int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int skipZeroes = skipZeroes(cArr, i, i2);
        int i4 = i2 - skipZeroes;
        if (i4 <= 0) {
            return BigInteger.ZERO;
        }
        AbstractBigIntegerParser.checkHexBigIntegerBounds(i4);
        byte[] bArr = new byte[((i4 + 1) >> 1) + 1];
        if ((i4 & 1) != 0) {
            int i5 = skipZeroes + 1;
            int lookupHex = AbstractNumberParser.lookupHex(cArr[skipZeroes]);
            bArr[1] = (byte) lookupHex;
            i3 = 2;
            z2 = lookupHex < 0;
            skipZeroes = i5;
        } else {
            i3 = 1;
            z2 = false;
        }
        int i6 = ((i2 - skipZeroes) & 7) + skipZeroes;
        while (skipZeroes < i6) {
            char c = cArr[skipZeroes];
            char c2 = cArr[skipZeroes + 1];
            int lookupHex2 = AbstractNumberParser.lookupHex(c);
            int lookupHex3 = AbstractNumberParser.lookupHex(c2);
            int i7 = i3 + 1;
            bArr[i3] = (byte) ((lookupHex2 << 4) | lookupHex3);
            z2 |= lookupHex2 < 0 || lookupHex3 < 0;
            skipZeroes += 2;
            i3 = i7;
        }
        while (skipZeroes < i2) {
            long tryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(cArr, skipZeroes);
            FastDoubleSwar.writeIntBE(bArr, i3, (int) tryToParseEightHexDigits);
            z2 |= tryToParseEightHexDigits < 0;
            skipZeroes += 8;
            i3 += 4;
        }
        if (z2) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return null;
        }
        BigInteger bigInteger = new BigInteger(bArr);
        return z ? bigInteger.negate() : bigInteger;
    }

    private BigInteger parseManyDecDigits(char[] cArr, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(cArr, i, i2);
        AbstractBigIntegerParser.checkDecBigIntegerBounds(i2 - skipZeroes);
        BigInteger parseDigitsRecursive = ParseDigitsTaskCharArray.parseDigitsRecursive(cArr, skipZeroes, i2, FastIntegerMath.fillPowersOf10Floor16(skipZeroes, i2), 400);
        return z ? parseDigitsRecursive.negate() : parseDigitsRecursive;
    }

    private int skipZeroes(char[] cArr, int i, int i2) {
        while (i < i2 - 8 && FastDoubleSwar.isEightZeroes(cArr, i)) {
            i += 8;
        }
        while (i < i2 && cArr[i] == '0') {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[Catch: ArithmeticException -> 0x0044, TryCatch #0 {ArithmeticException -> 0x0044, blocks: (B:2:0x0000, B:14:0x0027, B:17:0x0032, B:19:0x0037, B:21:0x0017, B:23:0x003c, B:24:0x0043), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.math.BigInteger parseBigIntegerString(char[] r5, int r6, int r7, int r8) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            int r0 = r5.length     // Catch: java.lang.ArithmeticException -> L44
            int r0 = com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractNumberParser.checkBounds(r0, r6, r7)     // Catch: java.lang.ArithmeticException -> L44
            char r1 = r5[r6]     // Catch: java.lang.ArithmeticException -> L44
            r2 = 45
            if (r1 != r2) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 != 0) goto L17
            r3 = 43
            if (r1 != r3) goto L15
            goto L17
        L15:
            r1 = r6
            goto L1f
        L17:
            int r1 = r6 + 1
            char r3 = com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractNumberParser.charAt(r5, r1, r0)     // Catch: java.lang.ArithmeticException -> L44
            if (r3 == 0) goto L3c
        L1f:
            r3 = 10
            if (r8 == r3) goto L37
            r3 = 16
            if (r8 == r3) goto L32
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch: java.lang.ArithmeticException -> L44
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.ArithmeticException -> L44
            r0.<init>(r5, r6, r7)     // Catch: java.lang.ArithmeticException -> L44
            r4.<init>(r0, r8)     // Catch: java.lang.ArithmeticException -> L44
            return r4
        L32:
            java.math.BigInteger r4 = r4.parseHexDigits(r5, r1, r0, r2)     // Catch: java.lang.ArithmeticException -> L44
            return r4
        L37:
            java.math.BigInteger r4 = r4.parseDecDigits(r5, r1, r0, r2)     // Catch: java.lang.ArithmeticException -> L44
            return r4
        L3c:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException     // Catch: java.lang.ArithmeticException -> L44
            java.lang.String r5 = "illegal syntax"
            r4.<init>(r5)     // Catch: java.lang.ArithmeticException -> L44
            throw r4     // Catch: java.lang.ArithmeticException -> L44
        L44:
            r4 = move-exception
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r6 = "value exceeds limits"
            r5.<init>(r6)
            r5.initCause(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.JavaBigIntegerFromCharArray.parseBigIntegerString(char[], int, int, int):java.math.BigInteger");
    }
}
