package com.amazon.alexa.mosaic.apl.dependencies.glide;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class NoUpscalingDownsampleStrategy extends DownsampleStrategy {
    private static final NoUpscalingDownsampleStrategy INSTANCE = new NoUpscalingDownsampleStrategy();

    private NoUpscalingDownsampleStrategy() {
    }

    public static NoUpscalingDownsampleStrategy get() {
        return INSTANCE;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int i, int i2, int i3, int i4) {
        return DownsampleStrategy.SampleSizeRounding.QUALITY;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public float getScaleFactor(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, Math.max(i3 / i, i4 / i2));
    }
}
