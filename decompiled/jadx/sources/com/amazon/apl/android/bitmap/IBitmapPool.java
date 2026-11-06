package com.amazon.apl.android.bitmap;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IBitmapPool {
    Bitmap get(int i, int i2, Bitmap.Config config);

    Bitmap getDirty(int i, int i2, Bitmap.Config config);

    void put(Bitmap bitmap);
}
