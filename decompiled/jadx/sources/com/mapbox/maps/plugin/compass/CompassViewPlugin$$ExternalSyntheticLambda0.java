package com.mapbox.maps.plugin.compass;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.amazon.alexa.accessory.frames.media.utils.AnimationHelper;
import com.facebook.react.modules.statusbar.StatusBarModule$setColor$1;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class CompassViewPlugin$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CompassViewPlugin$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                CompassViewPlugin.lambda$2$lambda$1((CompassViewPlugin) obj, valueAnimator);
                break;
            case 1:
                AnimationHelper.lambda$transitionViewBackgroundColor$0((View) obj, valueAnimator);
                break;
            case 2:
                StatusBarModule$setColor$1.runGuarded$lambda$0((Activity) obj, valueAnimator);
                break;
            case 3:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$1((ClippableRoundedCornerLayout) obj, valueAnimator);
                break;
            case 4:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) obj, valueAnimator);
                break;
            case 5:
                ((DeterminateDrawable) obj).lambda$maybeInitializeAmplitudeAnimator$1(valueAnimator);
                break;
            case 6:
                CameraAnimationsPluginImpl.registerInternalUpdateListener$lambda$21((Function0) obj, valueAnimator);
                break;
            default:
                PuckAnimator._init_$lambda$0((PuckAnimator) obj, valueAnimator);
                break;
        }
    }
}
