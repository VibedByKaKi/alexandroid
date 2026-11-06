package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.OutputBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class SimpleSubtitleOutputBuffer extends SubtitleOutputBuffer {
    private final OutputBuffer.Owner<SubtitleOutputBuffer> owner;

    public SimpleSubtitleOutputBuffer(OutputBuffer.Owner<SubtitleOutputBuffer> owner) {
        this.owner = owner;
    }

    @Override // com.google.android.exoplayer2.decoder.OutputBuffer
    public final void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
