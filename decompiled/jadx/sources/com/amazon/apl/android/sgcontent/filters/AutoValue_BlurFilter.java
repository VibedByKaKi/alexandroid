package com.amazon.apl.android.sgcontent.filters;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_BlurFilter extends BlurFilter {
    private final Filter filter;
    private final float radius;

    public AutoValue_BlurFilter(Filter filter, float f) {
        if (filter == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null filter");
            throw null;
        }
        this.filter = filter;
        this.radius = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlurFilter) {
            BlurFilter blurFilter = (BlurFilter) obj;
            if (this.filter.equals(blurFilter.filter()) && Float.floatToIntBits(this.radius) == Float.floatToIntBits(blurFilter.radius())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.BlurFilter
    public Filter filter() {
        return this.filter;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.radius) ^ ((this.filter.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.apl.android.sgcontent.filters.BlurFilter
    public float radius() {
        return this.radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlurFilter{filter=");
        sb.append(this.filter);
        sb.append(", radius=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.radius);
    }
}
