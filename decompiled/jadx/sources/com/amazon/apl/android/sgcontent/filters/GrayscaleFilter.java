package com.amazon.apl.android.sgcontent.filters;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class GrayscaleFilter extends Filter {
    public static GrayscaleFilter create(long j, Filter filter, float f) {
        AutoValue_GrayscaleFilter autoValue_GrayscaleFilter = new AutoValue_GrayscaleFilter(filter, f);
        autoValue_GrayscaleFilter.mNativeHandle = j;
        return autoValue_GrayscaleFilter;
    }

    public abstract float amount();

    public abstract Filter filter();
}
