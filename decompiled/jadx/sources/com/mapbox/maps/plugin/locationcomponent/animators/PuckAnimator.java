package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.animation.LinearInterpolator;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b!\u0018\u0000 ;*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001;B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#J<\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000&\"\u00028\u00002\u001b\b\u0002\u0010'\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0002\b(¢\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020\u0014J\u0006\u0010+\u001a\u00020\u0002J\u0014\u0010,\u001a\u00020\u00142\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J\u000e\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\rJ#\u00100\u001a\u00020\u00142\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001020&\"\u0004\u0018\u000102¢\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u00142\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0013J\u001d\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u0002072\u0006\u0010-\u001a\u00028\u0000H&¢\u0006\u0002\u00108J\u001f\u00109\u001a\u00020\u00142\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b(R\u001a\u0010\u0006\u001a\u00020\u0007X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R2\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006<"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/animation/ValueAnimator;", "evaluator", "Landroid/animation/TypeEvaluator;", "(Landroid/animation/TypeEvaluator;)V", "enabled", "", "getEnabled$plugin_locationcomponent_release", "()Z", "setEnabled$plugin_locationcomponent_release", "(Z)V", "locationRenderer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "getLocationRenderer", "()Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "setLocationRenderer", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;)V", "updateListener", "Lkotlin/Function1;", "", "getUpdateListener$plugin_locationcomponent_release$annotations", "()V", "getUpdateListener$plugin_locationcomponent_release", "()Lkotlin/jvm/functions/Function1;", "setUpdateListener$plugin_locationcomponent_release", "(Lkotlin/jvm/functions/Function1;)V", "userConfiguredAnimator", "getUserConfiguredAnimator$plugin_locationcomponent_release$annotations", "getUserConfiguredAnimator$plugin_locationcomponent_release", "()Landroid/animation/ValueAnimator;", "setUserConfiguredAnimator$plugin_locationcomponent_release", "(Landroid/animation/ValueAnimator;)V", "addUpdateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "animate", "targets", "", "options", "Lkotlin/ExtensionFunctionType;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "cancelRunning", "clone", "setEvaluator", "value", "setLocationLayerRenderer", "renderer", "setObjectValues", "values", "", "([Ljava/lang/Object;)V", "setUpdateListener", "updateLayer", "fraction", "", "(FLjava/lang/Object;)V", "updateOptions", "block", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"Recycle"})
/* loaded from: classes9.dex */
public abstract class PuckAnimator<T> extends ValueAnimator {

    @NotNull
    private static final LinearInterpolator DEFAULT_INTERPOLATOR = new LinearInterpolator();
    private boolean enabled;

    @Nullable
    private LocationLayerRenderer locationRenderer;

    @Nullable
    private Function1<? super T, Unit> updateListener;

    @NotNull
    private ValueAnimator userConfiguredAnimator;

    public PuckAnimator(@NotNull TypeEvaluator<T> typeEvaluator) {
        typeEvaluator.getClass();
        setObjectValues(new Object[0]);
        setEvaluator(typeEvaluator);
        addUpdateListener(new CompassViewPlugin$$ExternalSyntheticLambda0(this, 7));
        setDuration(1000L);
        setInterpolator(DEFAULT_INTERPOLATOR);
        ValueAnimator clone = clone();
        this.userConfiguredAnimator = clone;
        clone.setDuration(getDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(final PuckAnimator puckAnimator, final ValueAnimator valueAnimator) {
        puckAnimator.getClass();
        valueAnimator.getClass();
        AnimationThreadController.INSTANCE.postOnMainThread(new Function0<Unit>() { // from class: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object animatedValue = valueAnimator.getAnimatedValue();
                puckAnimator.updateLayer(valueAnimator.getAnimatedFraction(), animatedValue);
                Function1 updateListener$plugin_locationcomponent_release = puckAnimator.getUpdateListener$plugin_locationcomponent_release();
                if (updateListener$plugin_locationcomponent_release != null) {
                    updateListener$plugin_locationcomponent_release.invoke(animatedValue);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animate$default(PuckAnimator puckAnimator, Object[] objArr, Function1 function1, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: animate");
            return;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        puckAnimator.animate(objArr, function1);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(@Nullable ValueAnimator.AnimatorUpdateListener listener) {
        super.addUpdateListener(listener);
    }

    public final void animate(@NotNull final T[] targets, @Nullable final Function1<? super ValueAnimator, Unit> options) {
        targets.getClass();
        cancelRunning();
        if (options == null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new Function0<Unit>(this) { // from class: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$animate$1
                final /* synthetic */ PuckAnimator<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ValueAnimator valueAnimator = this.this$0;
                    T[] tArr = targets;
                    valueAnimator.setObjectValues(Arrays.copyOf(tArr, tArr.length));
                    this.this$0.start();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
        } else {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new Function0<Unit>() { // from class: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$animate$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    options.invoke(this.getUserConfiguredAnimator());
                    ValueAnimator userConfiguredAnimator = this.getUserConfiguredAnimator();
                    T[] tArr = targets;
                    userConfiguredAnimator.setObjectValues(Arrays.copyOf(tArr, tArr.length));
                    this.getUserConfiguredAnimator().start();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final void cancelRunning() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new Function0<Unit>(this) { // from class: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$cancelRunning$1
            final /* synthetic */ PuckAnimator<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.isRunning()) {
                    this.this$0.cancel();
                }
                if (this.this$0.getUserConfiguredAnimator().isRunning()) {
                    this.this$0.getUserConfiguredAnimator().cancel();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @NotNull
    public final ValueAnimator clone() {
        ValueAnimator clone = super.clone();
        clone.getClass();
        return clone;
    }

    /* renamed from: getEnabled$plugin_locationcomponent_release, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final LocationLayerRenderer getLocationRenderer() {
        return this.locationRenderer;
    }

    @Nullable
    public final Function1<T, Unit> getUpdateListener$plugin_locationcomponent_release() {
        return this.updateListener;
    }

    @NotNull
    /* renamed from: getUserConfiguredAnimator$plugin_locationcomponent_release, reason: from getter */
    public final ValueAnimator getUserConfiguredAnimator() {
        return this.userConfiguredAnimator;
    }

    public void setEnabled$plugin_locationcomponent_release(boolean z) {
        this.enabled = z;
    }

    @Override // android.animation.ValueAnimator
    public final void setEvaluator(@Nullable TypeEvaluator<?> value) {
        super.setEvaluator(value);
    }

    public final void setLocationLayerRenderer(@NotNull LocationLayerRenderer renderer) {
        renderer.getClass();
        this.locationRenderer = renderer;
    }

    public final void setLocationRenderer(@Nullable LocationLayerRenderer locationLayerRenderer) {
        this.locationRenderer = locationLayerRenderer;
    }

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(@NotNull Object... values) {
        values.getClass();
        super.setObjectValues(Arrays.copyOf(values, values.length));
    }

    public final void setUpdateListener(@NotNull Function1<? super T, Unit> updateListener) {
        updateListener.getClass();
        if (Intrinsics.areEqual(this.updateListener, updateListener)) {
            return;
        }
        this.updateListener = updateListener;
    }

    public final void setUpdateListener$plugin_locationcomponent_release(@Nullable Function1<? super T, Unit> function1) {
        this.updateListener = function1;
    }

    public final void setUserConfiguredAnimator$plugin_locationcomponent_release(@NotNull ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        this.userConfiguredAnimator = valueAnimator;
    }

    public abstract void updateLayer(float fraction, T value);

    public final void updateOptions(@NotNull final Function1<? super ValueAnimator, Unit> block) {
        block.getClass();
        if (isRunning()) {
            addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$updateOptions$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animation, boolean isReverse) {
                    animation.getClass();
                    super.onAnimationEnd(animation, isReverse);
                    block.invoke(this);
                    this.removeListener(this);
                }
            });
        } else {
            block.invoke(this);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getUpdateListener$plugin_locationcomponent_release$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getUserConfiguredAnimator$plugin_locationcomponent_release$annotations() {
    }
}
