package com.amazon.apl.android.scaling;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpMetricsTransform implements IMetricsTransform {
    private static NoOpMetricsTransform INSTANCE;

    private NoOpMetricsTransform() {
    }

    public static NoOpMetricsTransform getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NoOpMetricsTransform();
        }
        return INSTANCE;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getScaledViewhostHeight() {
        return 0;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getScaledViewhostWidth() {
        return 0;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public ViewportMetrics getUnscaledMetrics() {
        return null;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getViewportOffsetX() {
        return 0;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public int getViewportOffsetY() {
        return 0;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public float toCore(float f) {
        return f;
    }

    @Override // com.amazon.apl.android.scaling.IMetricsTransform
    public float toViewhost(float f) {
        return f;
    }
}
