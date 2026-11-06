package com.amazon.apl.android.scaling;

import com.amazon.apl.android.scaling.AutoValue_Scaling_ViewportSpecification;
import com.amazon.apl.enums.ViewportMode;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Scaling extends BoundObject {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ViewportSpecification {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ViewportSpecification build();

            public abstract Builder maxHeight(int i);

            public abstract Builder maxWidth(int i);

            public abstract Builder minHeight(int i);

            public abstract Builder minWidth(int i);

            public abstract Builder mode(ViewportMode viewportMode);

            public abstract Builder round(boolean z);
        }

        public static Builder builder() {
            return new AutoValue_Scaling_ViewportSpecification.Builder();
        }

        public abstract int getMaxHeight();

        public abstract int getMaxWidth();

        public abstract int getMinHeight();

        public abstract int getMinWidth();

        public abstract ViewportMode getMode();

        public abstract boolean isRound();
    }

    public Scaling(double d, Collection<ViewportSpecification> collection, Collection<ViewportMode> collection2) {
        long nScalingCreate = nScalingCreate(d);
        for (ViewportSpecification viewportSpecification : collection) {
            nAddViewportSpecification(nScalingCreate, viewportSpecification.getMinWidth(), viewportSpecification.getMaxWidth(), viewportSpecification.getMinHeight(), viewportSpecification.getMaxHeight(), viewportSpecification.isRound(), viewportSpecification.getMode().getIndex());
        }
        Iterator<ViewportMode> it2 = collection2.iterator();
        while (it2.hasNext()) {
            nAddAllowMode(nScalingCreate, it2.next().getIndex());
        }
        bind(nScalingCreate);
    }

    private static native void nAddAllowMode(long j, int i);

    private static native void nAddViewportSpecification(long j, int i, int i2, int i3, int i4, boolean z, int i5);

    private static native boolean nRemoveChosenViewportSpecification(long j, long j2);

    private static native long nScalingCreate(double d);

    public boolean isScalingRequested() {
        return isBound();
    }

    public boolean removeChosenViewportSpecification(MetricsTransform metricsTransform) {
        if (isBound()) {
            return nRemoveChosenViewportSpecification(getNativeHandle(), metricsTransform.getNativeHandle());
        }
        return false;
    }

    public Scaling(double d, Collection<ViewportSpecification> collection) {
        this(d, collection, Collections.EMPTY_LIST);
    }

    public Scaling() {
    }
}
