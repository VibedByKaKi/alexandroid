package com.amazon.imageutilities;

import com.google.common.base.Strings;
import java.math.BigInteger;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class StringDigestUtility {
    static final int HEX_DIGIT_COUNT = 32;
    static final String HEX_FORMAT = "%x";

    private String getDigestWithPrependedZeros(@Nonnull String str) {
        return str.length() < 32 ? Strings.padStart(str, 32, '0') : str;
    }

    public String getHexEncodedDigest(@Nonnull byte[] bArr) {
        return getDigestWithPrependedZeros(String.format(HEX_FORMAT, new BigInteger(1, bArr)));
    }
}
