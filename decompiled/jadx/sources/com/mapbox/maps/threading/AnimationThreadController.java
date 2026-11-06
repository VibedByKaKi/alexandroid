package com.mapbox.maps.threading;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.ui.Actual_androidKt$$ExternalSyntheticLambda0;
import com.dee.app.contacts.common.constants.Constants;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\u0014\u0010\u0014\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/threading/AnimationThreadController;", "", "()V", "BACKGROUND_ANIMATION_THREAD_NAME", "", Constants.LOG_TAG, "backgroundAnimationHandler", "Landroid/os/Handler;", "backgroundAnimationThread", "Landroid/os/HandlerThread;", "mainHandler", "<set-?>", "", "usingBackgroundThread", "getUsingBackgroundThread", "()Z", "postOnAnimatorThread", "", "function", "Lkotlin/Function0;", "postOnMainThread", "useBackgroundThread", "useMainThread", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public final class AnimationThreadController {

    @NotNull
    private static final String BACKGROUND_ANIMATION_THREAD_NAME = "MapboxAnimThread";

    @NotNull
    private static final String TAG = "AnimThreadController";

    @Nullable
    private static Handler backgroundAnimationHandler;

    @Nullable
    private static HandlerThread backgroundAnimationThread;
    private static volatile boolean usingBackgroundThread;

    @NotNull
    public static final AnimationThreadController INSTANCE = new AnimationThreadController();

    @NotNull
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private AnimationThreadController() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnAnimatorThread$lambda$3$lambda$2(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnMainThread$lambda$1(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    public final boolean getUsingBackgroundThread() {
        return usingBackgroundThread;
    }

    public final void postOnAnimatorThread(@NotNull Function0<Unit> function) {
        function.getClass();
        if (!usingBackgroundThread) {
            postOnMainThread(function);
            return;
        }
        Looper myLooper = Looper.myLooper();
        HandlerThread handlerThread = backgroundAnimationThread;
        if (Intrinsics.areEqual(myLooper, handlerThread != null ? handlerThread.getLooper() : null)) {
            function.invoke();
            return;
        }
        Handler handler = backgroundAnimationHandler;
        if (handler != null) {
            handler.post(new Actual_androidKt$$ExternalSyntheticLambda0(function, 11));
        } else {
            MapboxLogger.logW(TAG, "useBackgroundThread was called but handler is null, animator event is skipped!");
        }
    }

    public final void postOnMainThread(@NotNull Function0<Unit> function) {
        function.getClass();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            function.invoke();
        } else {
            mainHandler.post(new Actual_androidKt$$ExternalSyntheticLambda0(function, 12));
        }
    }

    public final void useBackgroundThread() {
        if (usingBackgroundThread) {
            return;
        }
        usingBackgroundThread = true;
        HandlerThread handlerThread = backgroundAnimationThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread m = DoubleList$$ExternalSyntheticOutline0.m(BACKGROUND_ANIMATION_THREAD_NAME);
        backgroundAnimationHandler = new Handler(m.getLooper());
        backgroundAnimationThread = m;
    }

    public final void useMainThread() {
        if (usingBackgroundThread) {
            Handler handler = backgroundAnimationHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = backgroundAnimationThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            usingBackgroundThread = false;
            backgroundAnimationThread = null;
            backgroundAnimationHandler = null;
        }
    }
}
