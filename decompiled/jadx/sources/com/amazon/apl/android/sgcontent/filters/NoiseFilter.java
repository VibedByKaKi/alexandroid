package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.enums.NoiseFilterKind;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class NoiseFilter extends Filter {
    public static NoiseFilter create(long j, Filter filter, NoiseFilterKind noiseFilterKind, float f, boolean z) {
        AutoValue_NoiseFilter autoValue_NoiseFilter = new AutoValue_NoiseFilter(filter, noiseFilterKind, f, z);
        autoValue_NoiseFilter.mNativeHandle = j;
        return autoValue_NoiseFilter;
    }

    public abstract Filter filter();

    public abstract NoiseFilterKind kind();

    public abstract float sigma();

    public abstract boolean useColor();
}
