package com.amazon.minerva.client.thirdparty.transport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SerializedBatch {
    private byte[] batchContent;
    private String fileName;

    public SerializedBatch(byte[] bArr, String str) {
        this.batchContent = bArr;
        this.fileName = str;
    }

    public byte[] getBatchContent() {
        return this.batchContent;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getRegion() {
        return this.fileName.split("_", 3)[1];
    }
}
