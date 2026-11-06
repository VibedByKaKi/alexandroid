package com.amazonaws.mobileconnectors.iot;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class PEMObject {
    private final String beginMarker;
    private final byte[] derBytes;

    public PEMObject(String str, byte[] bArr) {
        this.beginMarker = str;
        this.derBytes = (byte[]) bArr.clone();
    }

    public String getBeginMarker() {
        return this.beginMarker;
    }

    public byte[] getDerBytes() {
        return (byte[]) this.derBytes.clone();
    }

    public PEMObjectType getPEMObjectType() {
        return PEMObjectType.fromBeginMarker(this.beginMarker);
    }
}
