package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.enums.NoiseFilterKind;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_NoiseFilter extends NoiseFilter {
    private final Filter filter;
    private final NoiseFilterKind kind;
    private final float sigma;
    private final boolean useColor;

    public AutoValue_NoiseFilter(Filter filter, NoiseFilterKind noiseFilterKind, float f, boolean z) {
        if (filter == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null filter");
            throw null;
        }
        this.filter = filter;
        if (noiseFilterKind == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null kind");
            throw null;
        }
        this.kind = noiseFilterKind;
        this.sigma = f;
        this.useColor = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NoiseFilter) {
            NoiseFilter noiseFilter = (NoiseFilter) obj;
            if (this.filter.equals(noiseFilter.filter()) && this.kind.equals(noiseFilter.kind()) && Float.floatToIntBits(this.sigma) == Float.floatToIntBits(noiseFilter.sigma()) && this.useColor == noiseFilter.useColor()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.NoiseFilter
    public Filter filter() {
        return this.filter;
    }

    public int hashCode() {
        return (this.useColor ? 1231 : 1237) ^ ((((((this.filter.hashCode() ^ 1000003) * 1000003) ^ this.kind.hashCode()) * 1000003) ^ Float.floatToIntBits(this.sigma)) * 1000003);
    }

    @Override // com.amazon.apl.android.sgcontent.filters.NoiseFilter
    public NoiseFilterKind kind() {
        return this.kind;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.NoiseFilter
    public float sigma() {
        return this.sigma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NoiseFilter{filter=");
        sb.append(this.filter);
        sb.append(", kind=");
        sb.append(this.kind);
        sb.append(", sigma=");
        sb.append(this.sigma);
        sb.append(", useColor=");
        return a$$ExternalSyntheticOutline0.m(sb, this.useColor, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.apl.android.sgcontent.filters.NoiseFilter
    public boolean useColor() {
        return this.useColor;
    }
}
