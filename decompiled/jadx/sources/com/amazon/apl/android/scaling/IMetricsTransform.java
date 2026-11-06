package com.amazon.apl.android.scaling;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IMetricsTransform {
    int getScaledViewhostHeight();

    int getScaledViewhostWidth();

    ViewportMetrics getUnscaledMetrics();

    int getViewportOffsetX();

    int getViewportOffsetY();

    float toCore(float f);

    default int toCore(int i) {
        return Math.round(toCore(i));
    }

    float toViewhost(float f);

    default int toViewhost(int i) {
        return Math.round(toViewhost(i));
    }
}
