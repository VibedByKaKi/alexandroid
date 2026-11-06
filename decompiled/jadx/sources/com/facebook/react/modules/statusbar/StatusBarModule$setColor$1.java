package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$$ExternalSyntheticLambda0;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/facebook/react/modules/statusbar/StatusBarModule$setColor$1", "Lcom/facebook/react/bridge/GuardedRunnable;", "runGuarded", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StatusBarModule$setColor$1 extends GuardedRunnable {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ boolean $animated;
    final /* synthetic */ int $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarModule$setColor$1(Activity activity, boolean z, int i, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.$activity = activity;
        this.$animated = z;
        this.$color = i;
        reactApplicationContext.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runGuarded$lambda$0(Activity activity, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Window window = activity.getWindow();
        if (window != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public void runGuarded() {
        Window window = this.$activity.getWindow();
        if (window == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (!this.$animated) {
            window.setStatusBarColor(this.$color);
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.$color));
        ofObject.addUpdateListener(new CompassViewPlugin$$ExternalSyntheticLambda0(this.$activity, 2));
        ofObject.setDuration(300L).setStartDelay(0L);
        ofObject.start();
    }
}
