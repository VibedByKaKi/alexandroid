package com.amazon.apl.android.sgcontent.filters;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class SaturateFilter extends Filter {
    public static SaturateFilter create(long j, Filter filter, float f) {
        AutoValue_SaturateFilter autoValue_SaturateFilter = new AutoValue_SaturateFilter(filter, f);
        autoValue_SaturateFilter.mNativeHandle = j;
        return autoValue_SaturateFilter;
    }

    public abstract float amount();

    public abstract Filter filter();
}
