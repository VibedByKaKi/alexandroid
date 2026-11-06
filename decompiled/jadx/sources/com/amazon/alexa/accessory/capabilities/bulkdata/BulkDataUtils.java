package com.amazon.alexa.accessory.capabilities.bulkdata;

import com.google.common.io.BaseEncoding;
import com.google.protobuf.ByteString;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BulkDataUtils {
    private BulkDataUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static String toHexString(byte[] bArr, int i) {
        return (bArr == null || i <= 0) ? "" : BaseEncoding.base16().upperCase().encode(bArr, 0, Math.min(bArr.length, i));
    }

    public static String toHexString(ByteString byteString, int i) {
        if (byteString == null) {
            return "";
        }
        return toHexString(byteString.toByteArray(), i);
    }
}
