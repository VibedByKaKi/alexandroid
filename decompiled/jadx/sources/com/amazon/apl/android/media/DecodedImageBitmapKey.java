package com.amazon.apl.android.media;

import android.graphics.Rect;
import com.amazon.apl.android.bitmap.BitmapKey;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class DecodedImageBitmapKey implements BitmapKey {
    public static DecodedImageBitmapKey create(String str, Rect rect, int i) {
        return new AutoValue_DecodedImageBitmapKey(str, rect, i);
    }

    public abstract Rect decodeRegion();

    public abstract int sampleSize();

    public abstract String sourceUrl();
}
