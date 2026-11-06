package com.amazon.apl.android.sgcontent.filters;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class BlurFilter extends Filter {
    public static BlurFilter create(long j, Filter filter, float f) {
        AutoValue_BlurFilter autoValue_BlurFilter = new AutoValue_BlurFilter(filter, f);
        autoValue_BlurFilter.mNativeHandle = j;
        return autoValue_BlurFilter;
    }

    public abstract Filter filter();

    public abstract float radius();
}
