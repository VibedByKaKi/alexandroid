package com.amazon.leapfrogmapgl.indoor;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"OUTDOOR_ZOOM_OUT_LEVELS", "", "DEFAULT_MINIMUM_ZOOM", "zoomOutFloor", "far", "LeapfrogMapGLAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeZoomBoundsKt {
    public static final double DEFAULT_MINIMUM_ZOOM = 16.0d;
    public static final double OUTDOOR_ZOOM_OUT_LEVELS = 2.0d;

    public static final double zoomOutFloor(double d) {
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return d - 2.0d;
        }
        return 16.0d;
    }
}
