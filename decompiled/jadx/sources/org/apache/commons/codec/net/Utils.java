package org.apache.commons.codec.net;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.codec.DecoderException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
class Utils {
    private static final int RADIX = 16;

    public static int digit16(byte b) throws DecoderException {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException(a$$ExternalSyntheticOutline0.m(b, "Invalid URL encoding: not a valid digit (radix 16): "));
    }

    public static char hexDigit(int i) {
        return Character.toUpperCase(Character.forDigit(i & 15, 16));
    }
}
