package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import java.util.Arrays;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class AbstractNumberParser {
    static final byte[] CHAR_TO_HEX_MAP;
    static final byte DECIMAL_POINT_CLASS = -4;
    public static final String ILLEGAL_OFFSET_OR_ILLEGAL_LENGTH = "offset < 0 or length > str.length";
    static final byte OTHER_CLASS = -1;
    public static final String SYNTAX_ERROR = "illegal syntax";
    public static final String VALUE_EXCEEDS_LIMITS = "value exceeds limits";

    static {
        byte[] bArr = new byte[256];
        CHAR_TO_HEX_MAP = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            CHAR_TO_HEX_MAP[c] = (byte) (c - '0');
        }
        for (char c2 = 'A'; c2 <= 'F'; c2 = (char) (c2 + 1)) {
            CHAR_TO_HEX_MAP[c2] = (byte) (c2 - '7');
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            CHAR_TO_HEX_MAP[c3] = (byte) (c3 - 'W');
        }
        CHAR_TO_HEX_MAP[46] = DECIMAL_POINT_CLASS;
    }

    public static char charAt(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            return charSequence.charAt(i);
        }
        return (char) 0;
    }

    public static int checkBounds(int i, int i2, int i3) {
        if ((((i - i3) - i2) | i2 | i3) >= 0) {
            return i3 + i2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ILLEGAL_OFFSET_OR_ILLEGAL_LENGTH);
        return 0;
    }

    public static int lookupHex(char c) {
        if (c < 128) {
            return CHAR_TO_HEX_MAP[c];
        }
        return -1;
    }

    public static char charAt(char[] cArr, int i, int i2) {
        if (i < i2) {
            return cArr[i];
        }
        return (char) 0;
    }

    public static byte charAt(byte[] bArr, int i, int i2) {
        if (i < i2) {
            return bArr[i];
        }
        return (byte) 0;
    }

    public static int lookupHex(byte b) {
        return CHAR_TO_HEX_MAP[b & 255];
    }

    public static int checkBounds(int i, int i2, int i3, int i4) {
        if (i3 <= i4) {
            return checkBounds(i, i2, i3);
        }
        XML$$ExternalSyntheticBUOutline0.m$2(VALUE_EXCEEDS_LIMITS);
        return 0;
    }
}
