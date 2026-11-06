package com.amazon.dee.app.ui.main;

import androidx.annotation.VisibleForTesting;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.facebook.react.animated.InterpolationAnimatedNode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J \u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J(\u0010#\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0007J \u0010&\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J\b\u0010'\u001a\u00020\u0005H\u0002R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/amazon/dee/app/ui/main/MoreMenuTransitionMotion;", "", "<init>", "()V", "SPRING_STIFFNESS", "", "getSPRING_STIFFNESS$annotations", "SPRING_MASS", "getSPRING_MASS$annotations", "RELEASE_PROJECTION_SECONDS", "getRELEASE_PROJECTION_SECONDS$annotations", "REST_EPSILON", "getREST_EPSILON$annotations", "PARALLAX_FRACTION", "HOME_MIN_SCALE", "DIM_MAX_ALPHA", "SHADOW_MAX_ALPHA", "SHADOW_FULL_AT", "SETTLE_STEP_SECONDS", "SETTLE_CAP_SECONDS", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_CLAMP, "progress", "tracking", "startProgress", "translationPx", "widthPx", "velocity", "velocityPxPerSecond", "projectsPastMidpoint", "", "sheetTranslation", "homeTranslation", "homeScale", "dimAlpha", "shadowAlpha", "springProgress", "target", "timeSeconds", "settleDurationSeconds", "angularFrequency", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MoreMenuTransitionMotion {
    public static final float DIM_MAX_ALPHA = 0.28f;
    public static final float HOME_MIN_SCALE = 0.92f;

    @NotNull
    public static final MoreMenuTransitionMotion INSTANCE = new MoreMenuTransitionMotion();
    public static final float PARALLAX_FRACTION = 0.5f;
    public static final float RELEASE_PROJECTION_SECONDS = 0.12f;
    public static final float REST_EPSILON = 0.002f;
    private static final float SETTLE_CAP_SECONDS = 3.0f;
    private static final float SETTLE_STEP_SECONDS = 0.004166667f;
    public static final float SHADOW_FULL_AT = 0.5f;
    public static final float SHADOW_MAX_ALPHA = 0.18f;
    public static final float SPRING_MASS = 1.0f;
    public static final float SPRING_STIFFNESS = 300.0f;

    private MoreMenuTransitionMotion() {
    }

    private final float angularFrequency() {
        return (float) Math.sqrt(300.0f);
    }

    @JvmStatic
    public static final float clamp(float progress) {
        return RangesKt.coerceIn(progress, 0.0f, 1.0f);
    }

    @JvmStatic
    public static final float dimAlpha(float progress) {
        return clamp(progress) * 0.28f;
    }

    @JvmStatic
    public static final float homeScale(float progress) {
        return 1.0f - (progress * 0.07999998f);
    }

    @JvmStatic
    public static final float homeTranslation(float progress, float widthPx) {
        return progress * widthPx * 0.5f;
    }

    @JvmStatic
    public static final boolean projectsPastMidpoint(float progress, float velocity) {
        return (velocity * 0.12f) + progress >= 0.5f;
    }

    @JvmStatic
    public static final float settleDurationSeconds(float startProgress, float target, float velocity) {
        float angularFrequency = INSTANCE.angularFrequency();
        float f = startProgress - target;
        float f2 = (angularFrequency * f) + velocity;
        float f3 = 0.0f;
        while (f3 < 3.0f) {
            float exp = (float) Math.exp((-angularFrequency) * f3);
            float f4 = (velocity - ((angularFrequency * f2) * f3)) * exp;
            if (Math.abs(DoubleList$$ExternalSyntheticOutline0.m(f2, f3, f, exp)) < 0.002f && Math.abs(f4) < 0.002f) {
                break;
            }
            f3 += SETTLE_STEP_SECONDS;
        }
        return f3;
    }

    @JvmStatic
    public static final float shadowAlpha(float progress) {
        return clamp(progress / 0.5f) * 0.18f;
    }

    @JvmStatic
    public static final float sheetTranslation(float progress, float widthPx) {
        return (progress - 1.0f) * widthPx;
    }

    @JvmStatic
    public static final float springProgress(float startProgress, float target, float velocity, float timeSeconds) {
        float f = startProgress - target;
        return (((((INSTANCE.angularFrequency() * f) + velocity) * timeSeconds) + f) * ((float) Math.exp((-r0) * timeSeconds))) + target;
    }

    @JvmStatic
    public static final float tracking(float startProgress, float translationPx, float widthPx) {
        return widthPx <= 0.0f ? startProgress : clamp((translationPx / widthPx) + startProgress);
    }

    @JvmStatic
    public static final float velocity(float velocityPxPerSecond, float widthPx) {
        if (widthPx <= 0.0f) {
            return 0.0f;
        }
        return velocityPxPerSecond / widthPx;
    }

    @VisibleForTesting
    public static /* synthetic */ void getRELEASE_PROJECTION_SECONDS$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getREST_EPSILON$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSPRING_MASS$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSPRING_STIFFNESS$annotations() {
    }
}
