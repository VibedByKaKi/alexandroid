package com.amazon.alexa.accessory.capabilities.bulkdata.manifest;

import com.google.protobuf.ByteString;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class CategorySpecificData {
    private final ByteString categorySpecificData;

    public CategorySpecificData(byte[] bArr) {
        this.categorySpecificData = ByteString.copyFrom(bArr);
    }

    public ByteString getByteString() {
        return this.categorySpecificData;
    }

    public byte[] getBytes() {
        return this.categorySpecificData.toByteArray();
    }
}
