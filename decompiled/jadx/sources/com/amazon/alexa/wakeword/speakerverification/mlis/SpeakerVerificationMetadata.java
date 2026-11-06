package com.amazon.alexa.wakeword.speakerverification.mlis;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeakerVerificationMetadata {
    private static final String METADATA_CONTENT_TYPE = "application/octet-stream";
    private static final int METADATA_PART_ID = 1;
    private byte[] metadata;
    private int id = 1;
    private String contentType = "application/octet-stream";

    public SpeakerVerificationMetadata(byte[] bArr) {
        this.metadata = bArr;
    }

    public String getContentType() {
        return this.contentType;
    }

    public int getId() {
        return this.id;
    }

    public byte[] getMetadata() {
        return this.metadata;
    }
}
