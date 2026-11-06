package com.amazon.alexa.ra.apl.fragments.constants;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/constants/APLAnimationConstants;", "", "<init>", "()V", "PULSATION_MIN_ALPHA", "", "PULSATION_MAX_ALPHA", "PULSATION_ITERATIONS", "", "PULSATION_DURATION_MS", "APL_FRAGMENT_PRESSED_SCALE", "APL_FRAGMENT_DEFAULT_SCALE", "APL_FRAGMENT_PRESSED_OPACITY", "APL_FRAGMENT_DEFAULT_OPACITY", "APL_FRAGMENT_PRESSED_ANIMATION_DURATION", "APL_FRAGMENT_RELEASE_ANIMATION_DURATION", "APL_FRAGMENT_PRESSED_ANIMATION_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "getAPL_FRAGMENT_PRESSED_ANIMATION_EASING$AVSMobileFramework_ra_apl_fragment_runtime_release", "()Landroidx/compose/animation/core/CubicBezierEasing;", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class APLAnimationConstants {
    public static final int $stable = 0;
    public static final float APL_FRAGMENT_DEFAULT_OPACITY = 1.0f;
    public static final float APL_FRAGMENT_DEFAULT_SCALE = 1.0f;
    public static final int APL_FRAGMENT_PRESSED_ANIMATION_DURATION = 50;
    public static final float APL_FRAGMENT_PRESSED_OPACITY = 0.5f;
    public static final float APL_FRAGMENT_PRESSED_SCALE = 0.96f;
    public static final int APL_FRAGMENT_RELEASE_ANIMATION_DURATION = 150;
    public static final int PULSATION_DURATION_MS = 400;
    public static final int PULSATION_ITERATIONS = 6;
    public static final float PULSATION_MAX_ALPHA = 1.0f;
    public static final float PULSATION_MIN_ALPHA = 0.5f;

    @NotNull
    public static final APLAnimationConstants INSTANCE = new APLAnimationConstants();

    @NotNull
    private static final CubicBezierEasing APL_FRAGMENT_PRESSED_ANIMATION_EASING = new CubicBezierEasing(0.0f, 0.6f, 0.4f, 1.0f);

    private APLAnimationConstants() {
    }

    @NotNull
    public final CubicBezierEasing getAPL_FRAGMENT_PRESSED_ANIMATION_EASING$AVSMobileFramework_ra_apl_fragment_runtime_release() {
        return APL_FRAGMENT_PRESSED_ANIMATION_EASING;
    }
}
