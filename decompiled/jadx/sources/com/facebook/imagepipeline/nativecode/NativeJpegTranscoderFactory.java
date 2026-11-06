package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class NativeJpegTranscoderFactory implements ImageTranscoderFactory {
    private final boolean mEnsureTranscoderLibraryLoaded;
    private final int mMaxBitmapSize;
    private final boolean mUseDownSamplingRatio;

    @DoNotStrip
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.mMaxBitmapSize = i;
        this.mUseDownSamplingRatio = z;
        this.mEnsureTranscoderLibraryLoaded = z2;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    @DoNotStrip
    @Nullable
    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean z) {
        if (imageFormat != DefaultImageFormats.JPEG) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.mMaxBitmapSize, this.mUseDownSamplingRatio, this.mEnsureTranscoderLibraryLoaded);
    }
}
