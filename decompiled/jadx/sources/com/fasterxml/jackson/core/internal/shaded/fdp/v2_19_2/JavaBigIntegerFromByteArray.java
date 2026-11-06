package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import java.math.BigInteger;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
class JavaBigIntegerFromByteArray extends AbstractBigIntegerParser {
    private BigInteger parseDecDigits(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (AbstractBigIntegerParser.hasManyDigits(i3)) {
            return parseManyDecDigits(bArr, i, i2, z);
        }
        int i4 = (i3 & 7) + i;
        long tryToParseUpTo7Digits = FastDoubleSwar.tryToParseUpTo7Digits(bArr, i, i4);
        boolean z2 = tryToParseUpTo7Digits >= 0;
        while (i4 < i2) {
            int tryToParseEightDigitsUtf8 = FastDoubleSwar.tryToParseEightDigitsUtf8(bArr, i4);
            z2 &= tryToParseEightDigitsUtf8 >= 0;
            tryToParseUpTo7Digits = (tryToParseUpTo7Digits * 100000000) + tryToParseEightDigitsUtf8;
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

    private BigInteger parseHexDigits(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int skipZeroes = skipZeroes(bArr, i, i2);
        int i4 = i2 - skipZeroes;
        if (i4 <= 0) {
            return BigInteger.ZERO;
        }
        AbstractBigIntegerParser.checkHexBigIntegerBounds(i4);
        byte[] bArr2 = new byte[((i4 + 1) >> 1) + 1];
        if ((i4 & 1) != 0) {
            int i5 = skipZeroes + 1;
            int lookupHex = AbstractNumberParser.lookupHex(bArr[skipZeroes]);
            bArr2[1] = (byte) lookupHex;
            i3 = 2;
            z2 = lookupHex < 0;
            skipZeroes = i5;
        } else {
            i3 = 1;
            z2 = false;
        }
        int i6 = ((i2 - skipZeroes) & 7) + skipZeroes;
        while (skipZeroes < i6) {
            byte b = bArr[skipZeroes];
            byte b2 = bArr[skipZeroes + 1];
            int lookupHex2 = AbstractNumberParser.lookupHex(b);
            int lookupHex3 = AbstractNumberParser.lookupHex(b2);
            int i7 = i3 + 1;
            bArr2[i3] = (byte) ((lookupHex2 << 4) | lookupHex3);
            z2 |= lookupHex2 < 0 || lookupHex3 < 0;
            skipZeroes += 2;
            i3 = i7;
        }
        while (skipZeroes < i2) {
            long tryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(bArr, skipZeroes);
            FastDoubleSwar.writeIntBE(bArr2, i3, (int) tryToParseEightHexDigits);
            z2 |= tryToParseEightHexDigits < 0;
            skipZeroes += 8;
            i3 += 4;
        }
        if (z2) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return null;
        }
        BigInteger bigInteger = new BigInteger(bArr2);
        return z ? bigInteger.negate() : bigInteger;
    }

    private BigInteger parseManyDecDigits(byte[] bArr, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(bArr, i, i2);
        AbstractBigIntegerParser.checkDecBigIntegerBounds(i2 - skipZeroes);
        BigInteger parseDigitsRecursive = ParseDigitsTaskByteArray.parseDigitsRecursive(bArr, skipZeroes, i2, FastIntegerMath.fillPowersOf10Floor16(skipZeroes, i2), 400);
        return z ? parseDigitsRecursive.negate() : parseDigitsRecursive;
    }

    private int skipZeroes(byte[] bArr, int i, int i2) {
        while (i < i2 - 8 && FastDoubleSwar.isEightZeroes(bArr, i)) {
            i += 8;
        }
        while (i < i2 && bArr[i] == 48) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: ArithmeticException -> 0x0046, TryCatch #0 {ArithmeticException -> 0x0046, blocks: (B:2:0x0000, B:14:0x0027, B:17:0x0034, B:19:0x0039, B:21:0x0017, B:23:0x003e, B:24:0x0045), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.math.BigInteger parseBigIntegerString(byte[] r5, int r6, int r7, int r8) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            int r0 = r5.length     // Catch: java.lang.ArithmeticException -> L46
            int r0 = com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractNumberParser.checkBounds(r0, r6, r7)     // Catch: java.lang.ArithmeticException -> L46
            r1 = r5[r6]     // Catch: java.lang.ArithmeticException -> L46
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
            byte r3 = com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractNumberParser.charAt(r5, r1, r0)     // Catch: java.lang.ArithmeticException -> L46
            if (r3 == 0) goto L3e
        L1f:
            r3 = 10
            if (r8 == r3) goto L39
            r3 = 16
            if (r8 == r3) goto L34
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch: java.lang.ArithmeticException -> L46
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.ArithmeticException -> L46
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.lang.ArithmeticException -> L46
            r0.<init>(r5, r6, r7, r1)     // Catch: java.lang.ArithmeticException -> L46
            r4.<init>(r0, r8)     // Catch: java.lang.ArithmeticException -> L46
            return r4
        L34:
            java.math.BigInteger r4 = r4.parseHexDigits(r5, r1, r0, r2)     // Catch: java.lang.ArithmeticException -> L46
            return r4
        L39:
            java.math.BigInteger r4 = r4.parseDecDigits(r5, r1, r0, r2)     // Catch: java.lang.ArithmeticException -> L46
            return r4
        L3e:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException     // Catch: java.lang.ArithmeticException -> L46
            java.lang.String r5 = "illegal syntax"
            r4.<init>(r5)     // Catch: java.lang.ArithmeticException -> L46
            throw r4     // Catch: java.lang.ArithmeticException -> L46
        L46:
            r4 = move-exception
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r6 = "value exceeds limits"
            r5.<init>(r6)
            r5.initCause(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.JavaBigIntegerFromByteArray.parseBigIntegerString(byte[], int, int, int):java.math.BigInteger");
    }
}
