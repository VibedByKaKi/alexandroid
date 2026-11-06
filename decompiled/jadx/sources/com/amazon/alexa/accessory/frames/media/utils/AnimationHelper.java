package com.amazon.alexa.accessory.frames.media.utils;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.Nullable;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AnimationHelper {
    private static final int DEFAULT_ANIMATION_DURATION_MS = 200;

    private AnimationHelper() {
    }

    public static void fadeIn(@Nullable View view, int i) {
        if (view != null) {
            view.animate().alpha(1.0f).setDuration(i).start();
        }
    }

    public static void fadeOut(@Nullable View view, int i) {
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(i).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$transitionViewBackgroundColor$0(View view, ValueAnimator valueAnimator) {
        view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static void transitionViewBackgroundColor(@Nullable View view, int i, int i2) {
        if (view != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
            ofObject.setDuration(200L);
            ofObject.addUpdateListener(new CompassViewPlugin$$ExternalSyntheticLambda0(view, 1));
            ofObject.start();
        }
    }

    public static void fadeOut(@Nullable View view) {
        fadeOut(view, 200);
    }

    public static void fadeIn(@Nullable View view) {
        fadeIn(view, 200);
    }
}
