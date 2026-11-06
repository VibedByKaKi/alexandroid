package com.airbnb.lottie.configurations.reducemotion;

import android.content.Context;
import androidx.annotation.Nullable;
import com.airbnb.lottie.utils.Utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class SystemReducedMotionOption implements ReducedMotionOption {
    @Override // com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption
    public ReducedMotionMode getCurrentReducedMotionMode(@Nullable Context context) {
        return (context == null || Utils.getAnimationScale(context) != 0.0f) ? ReducedMotionMode.STANDARD_MOTION : ReducedMotionMode.REDUCED_MOTION;
    }
}
