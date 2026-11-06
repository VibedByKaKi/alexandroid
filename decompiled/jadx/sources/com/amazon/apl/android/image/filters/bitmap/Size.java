package com.amazon.apl.android.image.filters.bitmap;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class Size {
    public static final Size ZERO = create(0, 0);

    public static Size create(Size size) {
        return create(size.width(), size.height());
    }

    public abstract int height();

    public abstract int width();

    public static Size create(int i, int i2) {
        return new AutoValue_Size(i, i2);
    }
}
