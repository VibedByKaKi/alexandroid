package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class AbstractJavaFloatingPointBitsFromCharSequence extends AbstractFloatValueParser {
    private long parseDecFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        char c;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        boolean z3;
        int i8;
        AbstractJavaFloatingPointBitsFromCharSequence abstractJavaFloatingPointBitsFromCharSequence;
        int i9;
        boolean z4;
        int i10;
        long j3;
        char charAt;
        int i11 = -1;
        int i12 = i;
        long j4 = 0;
        char c2 = 0;
        boolean z5 = false;
        while (true) {
            c = '.';
            j = 10;
            if (i12 >= i3) {
                break;
            }
            c2 = charSequence.charAt(i12);
            char c3 = (char) (c2 - '0');
            if (c3 >= '\n') {
                if (c2 != '.') {
                    break;
                }
                z5 |= i11 >= 0;
                i11 = i12;
            } else {
                j4 = (j4 * 10) + c3;
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
        if ((c2 | ' ') == 101) {
            i6 = i12 + 1;
            char charAt2 = AbstractNumberParser.charAt(charSequence, i6, i3);
            boolean z6 = charAt2 == '-';
            if (z6 || charAt2 == '+') {
                i6 = i12 + 2;
                charAt2 = AbstractNumberParser.charAt(charSequence, i6, i3);
            }
            char c4 = (char) (charAt2 - '0');
            boolean z7 = z5 | (c4 >= '\n');
            int i13 = 0;
            while (true) {
                if (i13 < 1024) {
                    i13 = (i13 * 10) + c4;
                }
                i6++;
                charAt = AbstractNumberParser.charAt(charSequence, i6, i3);
                char c5 = (char) (charAt - '0');
                if (c5 >= '\n') {
                    break;
                }
                c4 = c5;
            }
            if (z6) {
                i13 = -i13;
            }
            i5 += i13;
            int i14 = i13;
            c2 = charAt;
            i7 = i14;
            z5 = z7;
        } else {
            i6 = i12;
            i7 = 0;
        }
        if ((c2 | '\"') == 102) {
            i6++;
        }
        int skipWhitespace = skipWhitespace(charSequence, i6, i3);
        if (z5 || skipWhitespace < i3 || (!z2 && i4 == 0)) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        if (i4 > 19) {
            int i15 = i;
            int i16 = 0;
            long j5 = 0;
            while (i15 < i12) {
                char charAt3 = charSequence.charAt(i15);
                if (charAt3 != c) {
                    j3 = j;
                    if (Long.compareUnsigned(j5, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j5 = ((j5 * j3) + charAt3) - 48;
                } else {
                    i16++;
                    j3 = j;
                }
                i15++;
                j = j3;
                c = '.';
            }
            i8 = (i11 - i15) + i16 + i7;
            j2 = j5;
            z3 = i15 < i12;
            abstractJavaFloatingPointBitsFromCharSequence = this;
            z4 = z;
            i10 = i5;
            i9 = i2;
        } else {
            j2 = j4;
            z3 = false;
            i8 = 0;
            abstractJavaFloatingPointBitsFromCharSequence = this;
            i9 = i2;
            z4 = z;
            i10 = i5;
        }
        return abstractJavaFloatingPointBitsFromCharSequence.valueOfFloatLiteral(charSequence, i9, i3, z4, j2, i10, z3, i8);
    }

    private long parseHexFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z) {
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
        char charAt;
        int i9 = -1;
        int i10 = i;
        long j2 = 0;
        char c3 = 0;
        boolean z3 = false;
        while (true) {
            c = 4;
            if (i10 >= i3) {
                break;
            }
            c3 = charSequence.charAt(i10);
            int lookupHex = AbstractNumberParser.lookupHex(c3);
            if (lookupHex < 0) {
                if (lookupHex != -4) {
                    break;
                }
                z3 |= i9 >= 0;
                int i11 = i10;
                while (i11 < i3 - 8) {
                    long tryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(charSequence, i11 + 1);
                    if (tryToParseEightHexDigits < 0) {
                        break;
                    }
                    j2 = (j2 << 32) + tryToParseEightHexDigits;
                    i11 += 8;
                }
                int i12 = i10;
                i10 = i11;
                i9 = i12;
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
        boolean z4 = (c3 | ' ') == 112;
        if (z4) {
            i5 = i10 + 1;
            char charAt2 = AbstractNumberParser.charAt(charSequence, i5, i3);
            boolean z5 = charAt2 == '-';
            if (z5 || charAt2 == '+') {
                i5 = i10 + 2;
                charAt2 = AbstractNumberParser.charAt(charSequence, i5, i3);
            }
            char c4 = (char) (charAt2 - '0');
            boolean z6 = z3 | (c4 >= '\n');
            int i13 = 0;
            while (true) {
                if (i13 < 1024) {
                    i13 = (i13 * 10) + c4;
                }
                i5++;
                charAt = AbstractNumberParser.charAt(charSequence, i5, i3);
                c2 = c;
                char c5 = (char) (charAt - '0');
                if (c5 >= '\n') {
                    break;
                }
                c4 = c5;
                c = c2;
            }
            if (z5) {
                i13 = -i13;
            }
            min += i13;
            c3 = charAt;
            i6 = i13;
            z3 = z6;
        } else {
            c2 = 4;
            i5 = i10;
            i6 = 0;
        }
        if ((c3 | '\"') == 102) {
            i5++;
        }
        int skipWhitespace = skipWhitespace(charSequence, i5, i3);
        if (z3 || skipWhitespace < i3 || i4 == 0 || !z4) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        if (i4 > 16) {
            int i14 = i;
            int i15 = 0;
            long j3 = 0;
            while (i14 < i10) {
                int lookupHex2 = AbstractNumberParser.lookupHex(charSequence.charAt(i14));
                if (lookupHex2 < 0) {
                    i15++;
                } else {
                    if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j3 = (j3 << c2) | lookupHex2;
                }
                i14++;
            }
            boolean z7 = i14 < i10;
            int i16 = i15;
            skipWhitespace = i14;
            i8 = i16;
            i7 = i6;
            j = j3;
            z2 = z7;
        } else {
            i7 = i6;
            j = j2;
            i8 = 0;
            z2 = false;
        }
        return valueOfHexLiteral(charSequence, i2, i3, z, j, min, z2, (((i9 - skipWhitespace) + i8) * 4) + i7);
    }

    private long parseNaNOrInfinity(CharSequence charSequence, int i, int i2, boolean z) {
        if (charSequence.charAt(i) == 'N') {
            int i3 = i + 2;
            if (i3 < i2 && charSequence.charAt(i + 1) == 'a' && charSequence.charAt(i3) == 'N' && skipWhitespace(charSequence, i + 3, i2) == i2) {
                return nan();
            }
        } else {
            int i4 = i + 7;
            if (i4 < i2 && charSequence.charAt(i) == 'I' && charSequence.charAt(i + 1) == 'n' && charSequence.charAt(i + 2) == 'f' && charSequence.charAt(i + 3) == 'i' && charSequence.charAt(i + 4) == 'n' && charSequence.charAt(i + 5) == 'i' && charSequence.charAt(i + 6) == 't' && charSequence.charAt(i4) == 'y' && skipWhitespace(charSequence, i + 8, i2) == i2) {
                return z ? negativeInfinity() : positiveInfinity();
            }
        }
        XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
        return 0L;
    }

    private static int skipWhitespace(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    public abstract long nan();

    public abstract long negativeInfinity();

    public final long parseFloatingPointLiteral(CharSequence charSequence, int i, int i2) {
        int i3;
        int checkBounds = AbstractNumberParser.checkBounds(charSequence.length(), i, i2);
        int skipWhitespace = skipWhitespace(charSequence, i, checkBounds);
        if (skipWhitespace == checkBounds) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        char charAt = charSequence.charAt(skipWhitespace);
        boolean z = charAt == '-';
        if ((z || charAt == '+') && (charAt = AbstractNumberParser.charAt(charSequence, (skipWhitespace = skipWhitespace + 1), checkBounds)) == 0) {
            XML$$ExternalSyntheticBUOutline0.m$2(AbstractNumberParser.SYNTAX_ERROR);
            return 0L;
        }
        if (charAt >= 'I') {
            return parseNaNOrInfinity(charSequence, skipWhitespace, checkBounds, z);
        }
        boolean z2 = charAt == '0';
        if (z2) {
            int i4 = skipWhitespace + 1;
            if ((AbstractNumberParser.charAt(charSequence, i4, checkBounds) | ' ') == 120) {
                return parseHexFloatLiteral(charSequence, skipWhitespace + 2, i, checkBounds, z);
            }
            i3 = i4;
        } else {
            i3 = skipWhitespace;
        }
        return parseDecFloatLiteral(charSequence, i3, i, checkBounds, z, z2);
    }

    public abstract long positiveInfinity();

    public abstract long valueOfFloatLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public abstract long valueOfHexLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);
}
