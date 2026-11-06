package com.amazon.alexa.ra.cards.utils;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/cards/utils/CardAnimationConstants;", "", "<init>", "()V", "PRESS_SCALE_PRESSED", "", "PRESS_SCALE_NORMAL", "PRESS_OPACITY_PRESSED", "PRESS_OPACITY_NORMAL", "PRESS_DURATION_DOWN_MS", "", "PRESS_DURATION_UP_MS", "PRESS_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "getPRESS_EASING", "()Landroidx/compose/animation/core/CubicBezierEasing;", "PULSE_TARGET_ALPHA", "PULSE_NORMAL_ALPHA", "CARD_BACKGROUND_COLOR_ALPHA", "PULSE_ITERATIONS", "PULSE_DURATION_MS", "PULSE_DELAY_MS", "PULSE_EASING", "getPULSE_EASING", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CardAnimationConstants {
    public static final int $stable = 0;
    public static final float CARD_BACKGROUND_COLOR_ALPHA = 0.1f;
    public static final int PRESS_DURATION_DOWN_MS = 100;
    public static final int PRESS_DURATION_UP_MS = 200;
    public static final float PRESS_OPACITY_NORMAL = 1.0f;
    public static final float PRESS_OPACITY_PRESSED = 0.9f;
    public static final float PRESS_SCALE_NORMAL = 1.0f;
    public static final float PRESS_SCALE_PRESSED = 0.97f;
    public static final int PULSE_DELAY_MS = 75;
    public static final int PULSE_DURATION_MS = 200;
    public static final int PULSE_ITERATIONS = 3;
    public static final float PULSE_NORMAL_ALPHA = 1.0f;
    public static final float PULSE_TARGET_ALPHA = 0.7f;

    @NotNull
    public static final CardAnimationConstants INSTANCE = new CardAnimationConstants();

    @NotNull
    private static final CubicBezierEasing PRESS_EASING = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    @NotNull
    private static final CubicBezierEasing PULSE_EASING = new CubicBezierEasing(0.4f, 0.0f, 0.85f, 1.0f);

    private CardAnimationConstants() {
    }

    @NotNull
    public final CubicBezierEasing getPRESS_EASING() {
        return PRESS_EASING;
    }

    @NotNull
    public final CubicBezierEasing getPULSE_EASING() {
        return PULSE_EASING;
    }
}
