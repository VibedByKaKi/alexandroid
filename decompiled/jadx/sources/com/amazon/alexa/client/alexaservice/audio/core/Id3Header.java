package com.amazon.alexa.client.alexaservice.audio.core;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class Id3Header {
    private final byte[] flags;
    private final byte[] id;
    private final int id3Length;
    private final byte[] version;

    public Id3Header(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.id = bArr;
        this.version = bArr2;
        this.flags = bArr3;
        this.id3Length = i;
    }

    public byte[] getFlags() {
        return this.flags;
    }

    public byte[] getId() {
        return this.id;
    }

    public int getId3Length() {
        return this.id3Length;
    }

    public byte[] getVersion() {
        return this.version;
    }
}
