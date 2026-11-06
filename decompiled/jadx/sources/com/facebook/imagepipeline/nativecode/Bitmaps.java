package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class Bitmaps {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        ImagePipelineNativeLoader.load();
    }

    @DoNotStrip
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        Preconditions.checkArgument(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        Preconditions.checkArgument(Boolean.valueOf(bitmap.isMutable()));
        Preconditions.checkArgument(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        Preconditions.checkArgument(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @DoNotStrip
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
