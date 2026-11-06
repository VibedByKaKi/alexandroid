package com.amazon.comms.calling.service;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DataChannelDTO {
    private final boolean binary;
    private final byte[] data;
    private final String label;

    public DataChannelDTO(String str, byte[] bArr, boolean z) {
        this.label = str;
        this.data = (byte[]) bArr.clone();
        this.binary = z;
    }

    public byte[] getData() {
        return (byte[]) this.data.clone();
    }

    public String getLabel() {
        return this.label;
    }

    public boolean isBinary() {
        return this.binary;
    }
}
