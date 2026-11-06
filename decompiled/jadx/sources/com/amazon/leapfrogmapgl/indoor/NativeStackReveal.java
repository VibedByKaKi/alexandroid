package com.amazon.leapfrogmapgl.indoor;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J=\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/NativeStackReveal;", "", "<init>", "()V", "REVEAL_START_LEAD", "", "REVEAL_SPAN_FRACTION", "EDGE_MARGIN", "revealStart", "fit", "near", "revealEnd", "OUTDOOR_ZOOM_EPSILON", "INDOOR_ENTRY_MARGIN", "outdoorBandCeiling", "far", "lodZoomOffset", "shouldRevertToOutdoor", "", "zoom", "startZoom", "indoorEntryZoom", "snapTarget", "previousZoom", "(DDDDDD)Ljava/lang/Double;", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeStackReveal {
    private static final double EDGE_MARGIN = 0.02d;
    private static final double INDOOR_ENTRY_MARGIN = 0.1d;

    @NotNull
    public static final NativeStackReveal INSTANCE = new NativeStackReveal();
    private static final double OUTDOOR_ZOOM_EPSILON = 0.15d;
    private static final double REVEAL_SPAN_FRACTION = 0.5d;
    private static final double REVEAL_START_LEAD = 0.1d;

    private NativeStackReveal() {
    }

    public final double indoorEntryZoom(double far, double fit, double near, double lodZoomOffset) {
        return Math.max(revealEnd(fit, near), Math.max(fit, outdoorBandCeiling(far, lodZoomOffset) + 0.1d));
    }

    public final double outdoorBandCeiling(double far, double lodZoomOffset) {
        return far + lodZoomOffset + OUTDOOR_ZOOM_EPSILON;
    }

    public final double revealEnd(double fit, double near) {
        double revealStart = revealStart(fit, near);
        if (Math.abs(revealStart) <= Double.MAX_VALUE) {
            return AppLaunchChecker$$ExternalSyntheticOutline0.m$2(near, fit, 0.5d, revealStart);
        }
        return Double.NaN;
    }

    public final double revealStart(double fit, double near) {
        if (Math.abs(fit) > Double.MAX_VALUE || Math.abs(near) > Double.MAX_VALUE || near <= fit) {
            return Double.NaN;
        }
        return fit - ((near - fit) * 0.1d);
    }

    public final boolean shouldRevertToOutdoor(double zoom, double startZoom, double far, double lodZoomOffset) {
        double outdoorBandCeiling = outdoorBandCeiling(far, lodZoomOffset);
        return Math.abs(zoom) <= Double.MAX_VALUE && Math.abs(outdoorBandCeiling) <= Double.MAX_VALUE && zoom < startZoom && zoom <= outdoorBandCeiling;
    }

    @Nullable
    public final Double snapTarget(double zoom, double previousZoom, double far, double fit, double near, double lodZoomOffset) {
        double d = far + lodZoomOffset;
        double max = Math.max(revealEnd(fit, near), fit);
        if (Math.abs(d) > Double.MAX_VALUE || Math.abs(max) > Double.MAX_VALUE || Math.abs(zoom) > Double.MAX_VALUE || max <= d || zoom <= d || zoom >= max) {
            return null;
        }
        return (Math.abs(previousZoom) > Double.MAX_VALUE || zoom >= previousZoom) ? Double.valueOf(max + 0.02d) : Double.valueOf(d - 0.02d);
    }
}
