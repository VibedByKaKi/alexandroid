package com.amazon.whisperjoin.provisioning.bluetooth.request.serializers;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class PrimitiveTypeSerializer {
    public <T> T deserialize(byte[] bArr, Class<T> cls) {
        if (!Byte.class.equals(cls)) {
            throw new UnparsableDataException("Unsupported primitive type");
        }
        if (bArr.length == 1) {
            return (T) Byte.valueOf(bArr[0]);
        }
        Locale locale = Locale.ENGLISH;
        throw new UnparsableDataException(a$$ExternalSyntheticOutline0.m(bArr.length, "Invalid byte input. Expected single byte input. Actual number of bytes="));
    }

    public byte[] serialize(Object obj) {
        throw new UnsupportedOperationException("Not required");
    }
}
