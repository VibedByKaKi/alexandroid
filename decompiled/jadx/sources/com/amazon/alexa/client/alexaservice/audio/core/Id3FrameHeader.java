package com.amazon.alexa.client.alexaservice.audio.core;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class Id3FrameHeader {
    private final byte[] flags;
    private final byte[] frameId;
    private final int id3FrameLength;

    public Id3FrameHeader(byte[] bArr, int i, byte[] bArr2) {
        this.frameId = bArr;
        this.id3FrameLength = i;
        this.flags = bArr2;
    }

    public byte[] getFlags() {
        return this.flags;
    }

    public byte[] getFrameId() {
        return this.frameId;
    }

    public int getId3FrameLength() {
        return this.id3FrameLength;
    }
}
