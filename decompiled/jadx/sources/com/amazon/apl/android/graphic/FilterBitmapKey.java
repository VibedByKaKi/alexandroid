package com.amazon.apl.android.graphic;

import com.amazon.apl.android.bitmap.BitmapKey;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class FilterBitmapKey implements BitmapKey {
    public static FilterBitmapKey create(int i, int i2, int i3) {
        return new AutoValue_FilterBitmapKey(i, i2, i3);
    }

    public abstract int groupId();

    public abstract int height();

    public abstract int width();
}
