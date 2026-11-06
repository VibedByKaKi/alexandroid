package com.amazon.ptz.digital;

import android.view.View;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.Nonnull;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DigitalZoomState {
    private static final float EPSILON = 0.05f;

    @Nonnull
    private final View view;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DigitalZoomState(@Nonnull View view) {
        if (view != null) {
            this.view = view;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("view is marked non-null but is null");
            throw null;
        }
    }

    private static boolean areAlmostEqual(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    private float getCurrentZoomScale() {
        return this.view.getScaleX();
    }

    public boolean isZoomedOut() {
        return areAlmostEqual(getCurrentZoomScale(), DigitalMagnitudes.FULL_ZOOM_OUT.getMagnitude());
    }
}
