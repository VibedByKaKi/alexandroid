package com.amazon.devicesetup.serializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface TypeSerializer<T> {
    T deserialize(byte[] bArr);

    byte[] serialize(T t);
}
