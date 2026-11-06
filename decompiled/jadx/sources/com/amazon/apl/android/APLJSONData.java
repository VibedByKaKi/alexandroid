package com.amazon.apl.android;

import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLJSONData extends BoundObject {
    private final int mSize;

    private APLJSONData(String str) {
        bind(nCreate(str));
        this.mSize = str.length();
    }

    public static APLJSONData create(String str) {
        return new APLJSONData(str);
    }

    private static native long nCreate(String str);

    private static native long nCreateWithByteArray(byte[] bArr);

    public int getSize() {
        return this.mSize;
    }

    public static APLJSONData create(byte[] bArr) {
        return new APLJSONData(bArr);
    }

    private APLJSONData(byte[] bArr) {
        bind(nCreateWithByteArray(bArr));
        this.mSize = bArr.length;
    }
}
