package com.amazon.apl.android.sgcontent.filters;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_GrayscaleFilter extends GrayscaleFilter {
    private final float amount;
    private final Filter filter;

    public AutoValue_GrayscaleFilter(Filter filter, float f) {
        if (filter == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null filter");
            throw null;
        }
        this.filter = filter;
        this.amount = f;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.GrayscaleFilter
    public float amount() {
        return this.amount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GrayscaleFilter) {
            GrayscaleFilter grayscaleFilter = (GrayscaleFilter) obj;
            if (this.filter.equals(grayscaleFilter.filter()) && Float.floatToIntBits(this.amount) == Float.floatToIntBits(grayscaleFilter.amount())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.GrayscaleFilter
    public Filter filter() {
        return this.filter;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.amount) ^ ((this.filter.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GrayscaleFilter{filter=");
        sb.append(this.filter);
        sb.append(", amount=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.amount);
    }
}
