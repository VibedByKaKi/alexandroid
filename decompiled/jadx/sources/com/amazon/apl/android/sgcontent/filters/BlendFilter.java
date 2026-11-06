package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.enums.BlendMode;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class BlendFilter extends Filter {
    public static BlendFilter create(long j, BlendMode blendMode, Filter filter, Filter filter2) {
        AutoValue_BlendFilter autoValue_BlendFilter = new AutoValue_BlendFilter(blendMode, filter, filter2);
        autoValue_BlendFilter.mNativeHandle = j;
        return autoValue_BlendFilter;
    }

    public abstract Filter backFilter();

    public abstract BlendMode blendMode();

    public abstract Filter frontFilter();
}
