package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.enums.BlendMode;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_BlendFilter extends BlendFilter {
    private final Filter backFilter;
    private final BlendMode blendMode;
    private final Filter frontFilter;

    public AutoValue_BlendFilter(BlendMode blendMode, Filter filter, Filter filter2) {
        if (blendMode == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null blendMode");
            throw null;
        }
        this.blendMode = blendMode;
        if (filter == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null frontFilter");
            throw null;
        }
        this.frontFilter = filter;
        if (filter2 != null) {
            this.backFilter = filter2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null backFilter");
            throw null;
        }
    }

    @Override // com.amazon.apl.android.sgcontent.filters.BlendFilter
    public Filter backFilter() {
        return this.backFilter;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.BlendFilter
    public BlendMode blendMode() {
        return this.blendMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlendFilter) {
            BlendFilter blendFilter = (BlendFilter) obj;
            if (this.blendMode.equals(blendFilter.blendMode()) && this.frontFilter.equals(blendFilter.frontFilter()) && this.backFilter.equals(blendFilter.backFilter())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.BlendFilter
    public Filter frontFilter() {
        return this.frontFilter;
    }

    public int hashCode() {
        return this.backFilter.hashCode() ^ ((((this.blendMode.hashCode() ^ 1000003) * 1000003) ^ this.frontFilter.hashCode()) * 1000003);
    }

    public String toString() {
        return "BlendFilter{blendMode=" + this.blendMode + ", frontFilter=" + this.frontFilter + ", backFilter=" + this.backFilter + StringSubstitutor.DEFAULT_VAR_END;
    }
}
