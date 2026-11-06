package com.amazon.leapfrogmapgl.indoor;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\nJ\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nJ\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/amazon/leapfrogmapgl/indoor/ClusterBadgeStyle;", "", "<init>", "()V", "FONT_SCALE", "", "MAX_FONT_FRAC_OF_HEIGHT", "MAX_LABEL_WIDTH_FRAC", "RING_WIDTH_FRAC", "RING_COLOR", "", "label", "", "count", "fontPx", "requestedPx", CmcdData.Factory.STREAMING_FORMAT_HLS, "fittedFontPx", "labelWidthPx", "discDiameterPx", "ringWidthPx", "size", "discRadiusPx", "baselineY", "cy", "inkTop", "inkBottom", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClusterBadgeStyle {
    public static final float FONT_SCALE = 1.3f;

    @NotNull
    public static final ClusterBadgeStyle INSTANCE = new ClusterBadgeStyle();
    public static final float MAX_FONT_FRAC_OF_HEIGHT = 0.68f;
    public static final float MAX_LABEL_WIDTH_FRAC = 0.8f;
    public static final int RING_COLOR = 1073810195;
    public static final float RING_WIDTH_FRAC = 0.041666668f;

    private ClusterBadgeStyle() {
    }

    public final float baselineY(float cy, float inkTop, float inkBottom) {
        return cy - ((inkTop + inkBottom) / 2.0f);
    }

    public final float discRadiusPx(int size) {
        return ((size / 2.0f) - (ringWidthPx(size) / 2.0f)) - 0.5f;
    }

    public final float fittedFontPx(float fontPx, float labelWidthPx, float discDiameterPx) {
        float f = discDiameterPx * 0.8f;
        return (labelWidthPx <= f || labelWidthPx <= 0.0f) ? fontPx : (f / labelWidthPx) * fontPx;
    }

    public final float fontPx(float requestedPx, int h) {
        if (Math.abs(requestedPx) > Float.MAX_VALUE || requestedPx <= 0.0f) {
            requestedPx = 0.5f * h;
        }
        return Math.min(requestedPx * 1.3f, h * 0.68f);
    }

    @NotNull
    public final String label(int count) {
        return count > 99 ? "99+" : String.valueOf(count);
    }

    public final float ringWidthPx(int size) {
        return size * 0.041666668f;
    }
}
