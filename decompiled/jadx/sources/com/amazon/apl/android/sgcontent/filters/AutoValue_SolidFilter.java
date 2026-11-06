package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.android.sgcontent.Paint;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_SolidFilter extends SolidFilter {
    private final Paint paint;

    public AutoValue_SolidFilter(Paint paint) {
        if (paint != null) {
            this.paint = paint;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null paint");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SolidFilter) {
            return this.paint.equals(((SolidFilter) obj).paint());
        }
        return false;
    }

    public int hashCode() {
        return this.paint.hashCode() ^ 1000003;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.SolidFilter
    public Paint paint() {
        return this.paint;
    }

    public String toString() {
        return "SolidFilter{paint=" + this.paint + StringSubstitutor.DEFAULT_VAR_END;
    }
}
