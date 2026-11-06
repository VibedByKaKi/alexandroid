package com.mapbox.maps.plugin.animation;

import android.animation.ValueAnimator;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraAnimationsLifecycleListener;", "", "onAnimatorCancelling", "", "type", "Lcom/mapbox/maps/plugin/animation/CameraAnimatorType;", "animator", "Landroid/animation/ValueAnimator;", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "", "onAnimatorEnding", "onAnimatorInterrupting", "runningAnimator", "runningAnimatorOwner", "newAnimator", "newAnimatorOwner", "onAnimatorStarting", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface CameraAnimationsLifecycleListener {
    void onAnimatorCancelling(@NotNull CameraAnimatorType type, @NotNull ValueAnimator animator, @Nullable String owner);

    void onAnimatorEnding(@NotNull CameraAnimatorType type, @NotNull ValueAnimator animator, @Nullable String owner);

    void onAnimatorInterrupting(@NotNull CameraAnimatorType type, @NotNull ValueAnimator runningAnimator, @Nullable String runningAnimatorOwner, @NotNull ValueAnimator newAnimator, @Nullable String newAnimatorOwner);

    void onAnimatorStarting(@NotNull CameraAnimatorType type, @NotNull ValueAnimator animator, @Nullable String owner);
}
