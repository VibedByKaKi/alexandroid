package com.amazon.apl.android.image.filters.bitmap;

import android.graphics.Bitmap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface FilterResult {
    default Bitmap getBitmap() {
        if (isBitmap()) {
            return getBitmap(getSize());
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Trying to get bitmap of a zero-size bitmap.");
        return null;
    }

    Bitmap getBitmap(Size size);

    Size getSize();

    default boolean isBitmap() {
        return !Size.ZERO.equals(getSize());
    }
}
