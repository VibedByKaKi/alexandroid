package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class SimpleBitmapReleaser implements ResourceReleaser<Bitmap> {
    private static SimpleBitmapReleaser sInstance;

    private SimpleBitmapReleaser() {
    }

    public static SimpleBitmapReleaser getInstance() {
        if (sInstance == null) {
            sInstance = new SimpleBitmapReleaser();
        }
        return sInstance;
    }

    @Override // com.facebook.common.references.ResourceReleaser
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
