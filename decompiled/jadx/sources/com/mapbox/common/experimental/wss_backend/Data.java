package com.mapbox.common.experimental.wss_backend;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class Data {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        BYTE_ARRAY,
        STRING
    }

    public Data(@NonNull byte[] bArr) {
        this.type = Type.BYTE_ARRAY;
        this.value = bArr;
    }

    public static Data valueOf(@NonNull byte[] bArr) {
        return new Data(bArr);
    }

    @NonNull
    public byte[] getByteArray() {
        if (isByteArray()) {
            return (byte[]) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (byte[])");
        return null;
    }

    @NonNull
    public String getString() {
        if (isString()) {
            return (String) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (String)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isByteArray() {
        return this.type == Type.BYTE_ARRAY;
    }

    public boolean isString() {
        return this.type == Type.STRING;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static Data valueOf(@NonNull String str) {
        return new Data(str);
    }

    public Data(@NonNull String str) {
        this.type = Type.STRING;
        this.value = str;
    }
}
