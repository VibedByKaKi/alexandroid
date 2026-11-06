package com.amazon.alexa.client.alexaservice.audio.core.opus;

import androidx.annotation.NonNull;
import com.amazon.opus.OpusDecoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class SenzOpusFrameDecoder implements OpusFrameDecoder {
    private final OpusDecoder decoder;

    public SenzOpusFrameDecoder(int i, int i2) {
        OpusDecoder opusDecoder = new OpusDecoder();
        this.decoder = opusDecoder;
        opusDecoder.init(i, i2);
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.opus.OpusFrameDecoder
    public void close() {
        this.decoder.close();
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.opus.OpusFrameDecoder
    public int decode(@NonNull byte[] bArr, @NonNull short[] sArr, int i) {
        return this.decoder.decode(bArr, sArr, i);
    }
}
