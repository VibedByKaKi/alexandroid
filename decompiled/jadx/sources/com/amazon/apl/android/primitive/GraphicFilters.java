package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.AutoValue_GraphicFilters_GraphicFilter;
import com.amazon.apl.android.utils.ColorUtils;
import com.amazon.apl.enums.APLEnum;
import com.amazon.apl.enums.GraphicFilterProperty;
import com.amazon.apl.enums.GraphicFilterType;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class GraphicFilters implements IterableProperty<GraphicFilter> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class GraphicFilter {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract GraphicFilter build();

            public abstract Builder color(int i);

            public abstract Builder filterType(GraphicFilterType graphicFilterType);

            public abstract Builder horizontalOffset(float f);

            public abstract Builder radius(float f);

            public abstract Builder verticalOffset(float f);
        }

        public static Builder builder() {
            return new AutoValue_GraphicFilters_GraphicFilter.Builder();
        }

        public abstract int color();

        public abstract GraphicFilterType filterType();

        public abstract float horizontalOffset();

        public abstract float radius();

        public abstract float verticalOffset();
    }

    public static GraphicFilters create(BoundObject boundObject, APLEnum aPLEnum) {
        return (GraphicFilters) IterableProperty.create(new GraphicFilterGetter(boundObject, aPLEnum));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nGetColorAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGetFloatAt(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetGraphicFilterTypeAt(long j, int i, int i2);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GraphicFilterGetter extends ArrayGetter<GraphicFilters, GraphicFilter> {
        private float getFloatAt(GraphicFilterProperty graphicFilterProperty, int i) {
            return GraphicFilters.nGetFloatAt(getNativeHandle(), getIndex(), graphicFilterProperty.getIndex(), i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public GraphicFilters builder() {
            return new AutoValue_GraphicFilters(new ArrayList(size()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public GraphicFilter get(int i) {
            return GraphicFilter.builder().filterType(GraphicFilterType.valueOf(GraphicFilters.nGetGraphicFilterTypeAt(getNativeHandle(), getIndex(), i))).color(ColorUtils.toARGB(GraphicFilters.nGetColorAt(getNativeHandle(), getIndex(), i))).radius(getFloatAt(GraphicFilterProperty.kGraphicPropertyFilterRadius, i)).horizontalOffset(getFloatAt(GraphicFilterProperty.kGraphicPropertyFilterHorizontalOffset, i)).verticalOffset(getFloatAt(GraphicFilterProperty.kGraphicPropertyFilterVerticalOffset, i)).build();
        }

        private GraphicFilterGetter(BoundObject boundObject, APLEnum aPLEnum) {
            super(boundObject, aPLEnum);
        }
    }
}
