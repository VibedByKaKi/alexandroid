package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.primitive.GraphicFilters;
import com.amazon.apl.enums.GraphicFilterType;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_GraphicFilters_GraphicFilter extends GraphicFilters.GraphicFilter {
    private final int color;
    private final GraphicFilterType filterType;
    private final float horizontalOffset;
    private final float radius;
    private final float verticalOffset;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends GraphicFilters.GraphicFilter.Builder {
        private Integer color;
        private GraphicFilterType filterType;
        private Float horizontalOffset;
        private Float radius;
        private Float verticalOffset;

        @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter.Builder
        public GraphicFilters.GraphicFilter build() {
            String str = this.filterType == null ? " filterType" : "";
            if (this.color == null) {
                str = str.concat(" color");
            }
            if (this.radius == null) {
                str = str.concat(" radius");
            }
            if (this.horizontalOffset == null) {
                str = str.concat(" horizontalOffset");
            }
            if (this.verticalOffset == null) {
                str = str.concat(" verticalOffset");
            }
            if (str.isEmpty()) {
                return new AutoValue_GraphicFilters_GraphicFilter(this.filterType, this.color.intValue(), this.radius.floatValue(), this.horizontalOffset.floatValue(), this.verticalOffset.floatValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter.Builder
        public GraphicFilters.GraphicFilter.Builder color(int i) {
            this.color = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter.Builder
        public GraphicFilters.GraphicFilter.Builder filterType(GraphicFilterType graphicFilterType) {
            if (graphicFilterType != null) {
                this.filterType = graphicFilterType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null filterType");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter.Builder
        public GraphicFilters.GraphicFilter.Builder horizontalOffset(float f) {
            this.horizontalOffset = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter.Builder
        public GraphicFilters.GraphicFilter.Builder radius(float f) {
            this.radius = Float.valueOf(f);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter.Builder
        public GraphicFilters.GraphicFilter.Builder verticalOffset(float f) {
            this.verticalOffset = Float.valueOf(f);
            return this;
        }
    }

    private AutoValue_GraphicFilters_GraphicFilter(GraphicFilterType graphicFilterType, int i, float f, float f2, float f3) {
        this.filterType = graphicFilterType;
        this.color = i;
        this.radius = f;
        this.horizontalOffset = f2;
        this.verticalOffset = f3;
    }

    @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter
    public int color() {
        return this.color;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GraphicFilters.GraphicFilter) {
            GraphicFilters.GraphicFilter graphicFilter = (GraphicFilters.GraphicFilter) obj;
            if (this.filterType.equals(graphicFilter.filterType()) && this.color == graphicFilter.color() && Float.floatToIntBits(this.radius) == Float.floatToIntBits(graphicFilter.radius()) && Float.floatToIntBits(this.horizontalOffset) == Float.floatToIntBits(graphicFilter.horizontalOffset()) && Float.floatToIntBits(this.verticalOffset) == Float.floatToIntBits(graphicFilter.verticalOffset())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter
    public GraphicFilterType filterType() {
        return this.filterType;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.verticalOffset) ^ ((((((((this.filterType.hashCode() ^ 1000003) * 1000003) ^ this.color) * 1000003) ^ Float.floatToIntBits(this.radius)) * 1000003) ^ Float.floatToIntBits(this.horizontalOffset)) * 1000003);
    }

    @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter
    public float horizontalOffset() {
        return this.horizontalOffset;
    }

    @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter
    public float radius() {
        return this.radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicFilter{filterType=");
        sb.append(this.filterType);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", horizontalOffset=");
        sb.append(this.horizontalOffset);
        sb.append(", verticalOffset=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.verticalOffset);
    }

    @Override // com.amazon.apl.android.primitive.GraphicFilters.GraphicFilter
    public float verticalOffset() {
        return this.verticalOffset;
    }
}
