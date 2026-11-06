package com.amazon.coral.util;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public interface IBase64Encoder {
    byte[] decode(CharSequence charSequence);

    CharSequence encode(ByteBuffer byteBuffer);

    CharSequence encode(byte[] bArr);
}
