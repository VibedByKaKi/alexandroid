package com.amazon.apl.android.bitmap;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpBitmapCache implements IBitmapCache {
    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public Bitmap getBitmap(BitmapKey bitmapKey) {
        return null;
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public int getSize() {
        return 0;
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public void clear() {
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public void removeBitmapFromCache(BitmapKey bitmapKey) {
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapCache
    public void putBitmap(BitmapKey bitmapKey, Bitmap bitmap) {
    }
}
