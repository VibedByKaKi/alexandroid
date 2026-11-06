package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class SimpleImageTranscoderFactory implements ImageTranscoderFactory {
    private final int mMaxBitmapSize;

    public SimpleImageTranscoderFactory(int i) {
        this.mMaxBitmapSize = i;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean z) {
        return new SimpleImageTranscoder(z, this.mMaxBitmapSize);
    }
}
