package com.amazon.apl.android.scaling;

import com.amazon.apl.enums.ViewportMode;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricsTransform extends BoundObject implements IMetricsTransform {
    private final ViewportMetrics mMetrics;

    private MetricsTransform(ViewportMetrics viewportMetrics) {
        this.mMetrics = viewportMetrics;
        bind(nCreate(viewportMetrics.width(), viewportMetrics.minWidth(), viewportMetrics.maxWidth(), viewportMetrics.height(), viewportMetrics.minHeight(), viewportMetrics.maxHeight(), viewportMetrics.dpi(), viewportMetrics.shape().getIndex(), viewportMetrics.theme(), viewportMetrics.mode().getIndex(), viewportMetrics.scaling().getNativeHandle()));
    }

    public static MetricsTransform create(ViewportMetrics viewportMetrics) {
        return new MetricsTransform(viewportMetrics);
    }

    private static native long nCreate(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, long j);

    private static native float nPixelHeight(long j);

    private static native float nPixelWidth(long j);

    private static native float nToCore(long j, float f);

    private static native float nToViewhost(long j, float f);

    private static native float nViewhostHeight(long j);

    private static native float nViewhostWidth(long j);

    private static native int nViewportMode(long j);

    public ViewportMetrics getScaledMetrics() {
        return ViewportMetrics.builder().width(Math.round(nPixelWidth(getNativeHandle()))).minWidth(this.mMetrics.minWidth()).maxWidth(this.mMetrics.maxWidth()).height(Math.round(nPixelHeight(getNativeHandle()))).minHeight(this.mMetrics.minHeight()).maxHeight(this.mMetrics.maxHeight()).dpi(this.mMetrics.dpi()).shape(this.mMetrics.shape()).theme(this.mMetrics.theme()).mode(ViewportMode.valueOf(nViewportMode(getNativeHandle()))).scaling(this.mMetrics.scaling()).build();
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getScaledViewhostHeight() {
        return Math.round(nViewhostHeight(getNativeHandle()));
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getScaledViewhostWidth() {
        return Math.round(nViewhostWidth(getNativeHandle()));
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public ViewportMetrics getUnscaledMetrics() {
        return this.mMetrics;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getViewportOffsetX() {
        return (this.mMetrics.width() - getScaledViewhostWidth()) / 2;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getViewportOffsetY() {
        return (this.mMetrics.height() - getScaledViewhostHeight()) / 2;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public float toCore(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return nToCore(getNativeHandle(), f);
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public float toViewhost(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return nToViewhost(getNativeHandle(), f);
    }
}
