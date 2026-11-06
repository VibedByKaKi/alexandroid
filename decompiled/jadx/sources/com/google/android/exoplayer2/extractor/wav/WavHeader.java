package com.google.android.exoplayer2.extractor.wav;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class WavHeader {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavHeader(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.formatType = i;
        this.numChannels = i2;
        this.frameRateHz = i3;
        this.averageBytesPerSecond = i4;
        this.blockSize = i5;
        this.bitsPerSample = i6;
        this.extraData = bArr;
    }
}
