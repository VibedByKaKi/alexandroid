package com.amazon.apl.android.graphic;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.amazon.apl.android.bitmap.BitmapKey;
import com.amazon.apl.android.image.filters.bitmap.Size;
import com.amazon.apl.android.sgcontent.filters.Filter;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class ImageNodeBitmapKey implements BitmapKey {
    public static ImageNodeBitmapKey create(Filter filter, Rect rect, Size size) {
        return new AutoValue_ImageNodeBitmapKey(filter, rect, size);
    }

    public abstract Filter filter();

    @Nullable
    public abstract Rect sourceRegion();

    @Nullable
    public abstract Size targetSize();
}
