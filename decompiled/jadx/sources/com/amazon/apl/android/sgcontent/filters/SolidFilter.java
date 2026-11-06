package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.android.sgcontent.Paint;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class SolidFilter extends Filter {
    public static SolidFilter create(long j, Paint paint) {
        AutoValue_SolidFilter autoValue_SolidFilter = new AutoValue_SolidFilter(paint);
        autoValue_SolidFilter.mNativeHandle = j;
        return autoValue_SolidFilter;
    }

    public abstract Paint paint();
}
