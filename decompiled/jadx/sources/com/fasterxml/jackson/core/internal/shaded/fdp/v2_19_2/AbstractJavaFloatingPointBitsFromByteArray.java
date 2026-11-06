package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class AbstractJavaFloatingPointBitsFromByteArray extends AbstractFloatValueParser {
    private long parseDecFloatLiteral(byte[] bArr, int i, int i2, int i3, boolean z, boolean z2) {
        byte b;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        boolean z3;
        int i8;
        AbstractJavaFloatingPointBitsFromByteArray abstractJavaFloatingPointBitsFromByteArray;
        int i9;
        boolean z4;
        int i10;
        long j3;
        byte charAt;
        int tryToParseFourDigits;
        int i11 = -1;
        int i12 = i;
        long j4 = 0;
        byte b2 = 0;
        boolean z5 = false;
        while (true) {
            b = 46;
            j = 10;
            if (i12 >= i3) {
                break;
            }
            b2 = bArr[i12];
            char c = (char) (b2 - 48);
            if (c >= '\n') {
                if (b2 != 46) {
                    break;
                }
                z5 |= i11 >= 0;
                int i13 = i12;
                while (i13 < i3 - 4 && (tryToParseFourDigits = FastDoubleSwar.tryToParseFourDigits(bArr, i13 + 1)) >= 0) {
                    j4 = (j4 * 10000) + tryToParseFourDigits;
                    i13 += 4;
                }
                int i14 = i12;
                i12 = i13;
                i11 = i14;
            } else {
                j4 = (j4 * 10) + c;
            }
            i12++;
        }
        if (i11 < 0) {
            i4 = i12 - i;
            i11 = i12;
            i5 = 0;
        } else {
            i4 = (i12 - i) - 1;
            i5 = (i11 - i12) + 1;
        }
        if ((b2 | 32) == 101) {
            i6 = i12 + 1;
            byte charAt2 = AbstractNumberParser.charAt(bArr, i6, i3);
            boolean z6 = charAt2 == 45;
            if (z6 || charAt2 == 43) {
                i6 = i12 + 2;
                charAt2 = AbstractNumberParser.charAt(bArr, i6, i3);
            }
            char c2 = (char) (charAt2 - 48);
            boolean z7 = z5 | (c2 >= '\n');
            int i15 = 0;
            while (true) {
                if (i15 < 1024) {
                    i15 = (i15 * 10) + c2;
                }
                i6++;
                charAt = AbstractNumberParser.charAt(bArr, i6, i3);
                char c3 = (char) (charAt - 48);
                if (c3 >= '\n') {
                    break;
                }
                c2 = c3;
            }
            if (z6) {
                i15 = -i15;
            }
            i5 += i15;
            int i16 = i15;
            b2 = charAt;
            i7 = i16;
            z5 = z7;
        } else {
            i6 = i12;
            i7 = 0;
        }
        if ((b2 | 34) == 102) {
            i6++;
        }
        int skipWhitespace = skipWhitespace(bArr, i6, i3);
        if (z5 || skipWhitespace < i3 || (!z2 && i4 == 0)) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        if (i4 > 19) {
            int i17 = i;
            int i18 = 0;
            long j5 = 0;
            while (i17 < i12) {
                byte b3 = bArr[i17];
                if (b3 != b) {
                    j3 = j;
                    if (Long.compareUnsigned(j5, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j5 = ((j5 * j3) + b3) - 48;
                } else {
                    i18++;
                    j3 = j;
                }
                i17++;
                j = j3;
                b = 46;
            }
            i8 = (i11 - i17) + i18 + i7;
            j2 = j5;
            z3 = i17 < i12;
            abstractJavaFloatingPointBitsFromByteArray = this;
            z4 = z;
            i10 = i5;
            i9 = i2;
        } else {
            j2 = j4;
            z3 = false;
            i8 = 0;
            abstractJavaFloatingPointBitsFromByteArray = this;
            i9 = i2;
            z4 = z;
            i10 = i5;
        }
        return abstractJavaFloatingPointBitsFromByteArray.valueOfFloatLiteral(bArr, i9, i3, z4, j2, i10, z3, i8);
    }

    private long parseHexFloatingPointLiteral(byte[] bArr, int i, int i2, int i3, boolean z) {
        char c;
        int i4;
        int min;
        char c2;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        boolean z2;
        byte charAt;
        int i9 = -1;
        int i10 = i;
        long j2 = 0;
        byte b = 0;
        boolean z3 = false;
        while (true) {
            c = 4;
            if (i10 >= i3) {
                break;
            }
            b = bArr[i10];
            int lookupHex = AbstractNumberParser.lookupHex(b);
            if (lookupHex < 0) {
                if (lookupHex != -4) {
                    break;
                }
                z3 |= i9 >= 0;
                i9 = i10;
            } else {
                j2 = (j2 << 4) | lookupHex;
            }
            i10++;
        }
        if (i9 < 0) {
            i4 = i10 - i;
            i9 = i10;
            min = 0;
        } else {
            i4 = (i10 - i) - 1;
            min = Math.min((i9 - i10) + 1, 1024) * 4;
        }
        boolean z4 = (b | 32) == 112;
        if (z4) {
            i5 = i10 + 1;
            byte charAt2 = AbstractNumberParser.charAt(bArr, i5, i3);
            boolean z5 = charAt2 == 45;
            if (z5 || charAt2 == 43) {
                i5 = i10 + 2;
                charAt2 = AbstractNumberParser.charAt(bArr, i5, i3);
            }
            char c3 = (char) (charAt2 - 48);
            boolean z6 = z3 | (c3 >= '\n');
            int i11 = 0;
            while (true) {
                if (i11 < 1024) {
                    i11 = (i11 * 10) + c3;
                }
                i5++;
                charAt = AbstractNumberParser.charAt(bArr, i5, i3);
                c2 = c;
                char c4 = (char) (charAt - 48);
                if (c4 >= '\n') {
                    break;
                }
                c3 = c4;
                c = c2;
            }
            if (z5) {
                i11 = -i11;
            }
            min += i11;
            b = charAt;
            i6 = i11;
            z3 = z6;
        } else {
            c2 = 4;
            i5 = i10;
            i6 = 0;
        }
        if ((b | 34) == 102) {
            i5++;
        }
        int skipWhitespace = skipWhitespace(bArr, i5, i3);
        if (z3 || skipWhitespace < i3 || i4 == 0 || !z4) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        if (i4 > 16) {
            int i12 = i;
            int i13 = 0;
            long j3 = 0;
            while (i12 < i10) {
                int lookupHex2 = AbstractNumberParser.lookupHex(bArr[i12]);
                if (lookupHex2 < 0) {
                    i13++;
                } else {
                    if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j3 = (j3 << c2) | lookupHex2;
                }
                i12++;
            }
            boolean z7 = i12 < i10;
            int i14 = i13;
            skipWhitespace = i12;
            i8 = i14;
            i7 = i6;
            j = j3;
            z2 = z7;
        } else {
            i7 = i6;
            j = j2;
            i8 = 0;
            z2 = false;
        }
        return valueOfHexLiteral(bArr, i2, i3, z, j, min, z2, (((i9 - skipWhitespace) + i8) * 4) + i7);
    }

    private long parseNaNOrInfinity(byte[] bArr, int i, int i2, boolean z) {
        if (bArr[i] == 78) {
            int i3 = i + 2;
            if (i3 < i2 && bArr[i + 1] == 97 && bArr[i3] == 78 && skipWhitespace(bArr, i + 3, i2) == i2) {
                return nan();
            }
        } else if (i + 7 < i2 && FastDoubleSwar.readLongLE(bArr, i) == 8751735898823355977L && skipWhitespace(bArr, i + 8, i2) == i2) {
            return z ? negativeInfinity() : positiveInfinity();
        }
        XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
        return 0L;
    }

    private static int skipWhitespace(byte[] bArr, int i, int i2) {
        while (i < i2 && (bArr[i] & 255) <= 32) {
            i++;
        }
        return i;
    }

    public abstract long nan();

    public abstract long negativeInfinity();

    public long parseFloatingPointLiteral(byte[] bArr, int i, int i2) {
        int i3;
        int checkBounds = AbstractNumberParser.checkBounds(bArr.length, i, i2);
        int skipWhitespace = skipWhitespace(bArr, i, checkBounds);
        if (skipWhitespace == checkBounds) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        byte b = bArr[skipWhitespace];
        boolean z = b == 45;
        if ((z || b == 43) && (b = AbstractNumberParser.charAt(bArr, (skipWhitespace = skipWhitespace + 1), checkBounds)) == 0) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        if (b >= 73) {
            return parseNaNOrInfinity(bArr, skipWhitespace, checkBounds, z);
        }
        boolean z2 = b == 48;
        if (z2) {
            int i4 = skipWhitespace + 1;
            if ((AbstractNumberParser.charAt(bArr, i4, checkBounds) | 32) == 120) {
                return parseHexFloatingPointLiteral(bArr, skipWhitespace + 2, i, checkBounds, z);
            }
            i3 = i4;
        } else {
            i3 = skipWhitespace;
        }
        return parseDecFloatLiteral(bArr, i3, i, checkBounds, z, z2);
    }

    public abstract long positiveInfinity();

    public abstract long valueOfFloatLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public abstract long valueOfHexLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);
}
