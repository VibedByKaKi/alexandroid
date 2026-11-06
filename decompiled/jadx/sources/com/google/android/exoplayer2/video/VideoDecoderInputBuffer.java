package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class VideoDecoderInputBuffer extends DecoderInputBuffer {

    @Nullable
    public Format format;

    public VideoDecoderInputBuffer(int i) {
        super(i);
    }

    public VideoDecoderInputBuffer(int i, int i2) {
        super(i, i2);
    }
}
