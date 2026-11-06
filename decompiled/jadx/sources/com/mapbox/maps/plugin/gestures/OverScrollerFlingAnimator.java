package com.mapbox.maps.plugin.gestures;

import android.content.Context;
import android.view.Choreographer;
import android.widget.OverScroller;
import androidx.annotation.VisibleForTesting;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\u001e\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0013J\u0006\u00102\u001a\u00020\"J\u0010\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0019H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/OverScrollerFlingAnimator;", "", "context", "Landroid/content/Context;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "maxFpsProvider", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;Lkotlin/jvm/functions/Function0;)V", "choreographer", "Landroid/view/Choreographer;", "frameCallback", "Landroid/view/Choreographer$FrameCallback;", "getFrameCallback$annotations", "()V", "getFrameCallback", "()Landroid/view/Choreographer$FrameCallback;", "fromPoint", "Lcom/mapbox/maps/ScreenCoordinate;", "<set-?>", "", "isRunning", "()Z", "lastProcessedFrameTimeNanos", "", "limitHorizontal", "getLimitHorizontal", "setLimitHorizontal", "(Z)V", "limitVertical", "getLimitVertical", "setLimitVertical", "onAnimationEnd", "", "getOnAnimationEnd", "()Lkotlin/jvm/functions/Function0;", "setOnAnimationEnd", "(Lkotlin/jvm/functions/Function0;)V", "onAnimationStart", "getOnAnimationStart", "setOnAnimationStart", "overScroller", "Landroid/widget/OverScroller;", "prevX", "prevY", "fling", "velocityX", "velocityY", "simulateOrigin", "forceStop", "postFrame", "delayNanos", "Companion", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class OverScrollerFlingAnimator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final Function0<Integer> NO_MAX_FPS = new Function0() { // from class: com.mapbox.maps.plugin.gestures.OverScrollerFlingAnimator$Companion$NO_MAX_FPS$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Void invoke() {
            return null;
        }
    };

    @Deprecated
    public static final long ONE_MILLISECOND_NANOS = 1000000;

    @Deprecated
    public static final long ONE_SECOND_NANOS = 1000000000;

    @NotNull
    private final Choreographer choreographer;

    @NotNull
    private final Choreographer.FrameCallback frameCallback;

    @NotNull
    private ScreenCoordinate fromPoint;
    private boolean isRunning;
    private long lastProcessedFrameTimeNanos;
    private boolean limitHorizontal;
    private boolean limitVertical;

    @NotNull
    private final MapCameraManagerDelegate mapCameraManagerDelegate;

    @NotNull
    private final Function0<Integer> maxFpsProvider;

    @Nullable
    private Function0<Unit> onAnimationEnd;

    @Nullable
    private Function0<Unit> onAnimationStart;

    @NotNull
    private final OverScroller overScroller;
    private int prevX;
    private int prevY;

    public OverScrollerFlingAnimator(@NotNull Context context, @NotNull MapCameraManagerDelegate mapCameraManagerDelegate, @NotNull Function0<Integer> function0) {
        context.getClass();
        mapCameraManagerDelegate.getClass();
        function0.getClass();
        this.mapCameraManagerDelegate = mapCameraManagerDelegate;
        this.maxFpsProvider = function0;
        this.overScroller = new OverScroller(context);
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.getClass();
        this.choreographer = choreographer;
        this.fromPoint = new ScreenCoordinate(0.0d, 0.0d);
        this.lastProcessedFrameTimeNanos = -1L;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: com.mapbox.maps.plugin.gestures.OverScrollerFlingAnimator$frameCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long frameTimeNanos) {
                Function0 function02;
                OverScroller overScroller;
                OverScroller overScroller2;
                OverScroller overScroller3;
                int i;
                int i2;
                ScreenCoordinate screenCoordinate;
                ScreenCoordinate screenCoordinate2;
                MapCameraManagerDelegate mapCameraManagerDelegate2;
                ScreenCoordinate screenCoordinate3;
                MapCameraManagerDelegate mapCameraManagerDelegate3;
                int i3;
                Choreographer choreographer2;
                long j;
                long j2;
                function02 = OverScrollerFlingAnimator.this.maxFpsProvider;
                Integer num = (Integer) function02.invoke();
                Long valueOf = (num == null || num.intValue() <= 0) ? null : Long.valueOf(1000000000 / num.intValue());
                if (valueOf != null) {
                    j = OverScrollerFlingAnimator.this.lastProcessedFrameTimeNanos;
                    if (j >= 0) {
                        j2 = OverScrollerFlingAnimator.this.lastProcessedFrameTimeNanos;
                        long j3 = frameTimeNanos - j2;
                        if (j3 < valueOf.longValue()) {
                            OverScrollerFlingAnimator.this.postFrame(valueOf.longValue() - j3);
                            return;
                        }
                    }
                }
                OverScrollerFlingAnimator.this.lastProcessedFrameTimeNanos = frameTimeNanos;
                overScroller = OverScrollerFlingAnimator.this.overScroller;
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                OverScrollerFlingAnimator overScrollerFlingAnimator = OverScrollerFlingAnimator.this;
                int i4 = 0;
                if (!computeScrollOffset) {
                    if (overScrollerFlingAnimator.getIsRunning()) {
                        choreographer2 = OverScrollerFlingAnimator.this.choreographer;
                        choreographer2.removeFrameCallback(this);
                        OverScrollerFlingAnimator.this.isRunning = false;
                        Function0<Unit> onAnimationEnd = OverScrollerFlingAnimator.this.getOnAnimationEnd();
                        if (onAnimationEnd != null) {
                            onAnimationEnd.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
                overScroller2 = overScrollerFlingAnimator.overScroller;
                int currX = overScroller2.getCurrX();
                overScroller3 = OverScrollerFlingAnimator.this.overScroller;
                int currY = overScroller3.getCurrY();
                if (OverScrollerFlingAnimator.this.getLimitHorizontal()) {
                    i2 = 0;
                } else {
                    i = OverScrollerFlingAnimator.this.prevX;
                    i2 = currX - i;
                }
                if (!OverScrollerFlingAnimator.this.getLimitVertical()) {
                    i3 = OverScrollerFlingAnimator.this.prevY;
                    i4 = currY - i3;
                }
                OverScrollerFlingAnimator.this.prevX = currX;
                OverScrollerFlingAnimator.this.prevY = currY;
                if (i2 != 0 || i4 != 0) {
                    screenCoordinate = OverScrollerFlingAnimator.this.fromPoint;
                    double x = screenCoordinate.getX() + i2;
                    screenCoordinate2 = OverScrollerFlingAnimator.this.fromPoint;
                    ScreenCoordinate screenCoordinate4 = new ScreenCoordinate(x, screenCoordinate2.getY() + i4);
                    mapCameraManagerDelegate2 = OverScrollerFlingAnimator.this.mapCameraManagerDelegate;
                    screenCoordinate3 = OverScrollerFlingAnimator.this.fromPoint;
                    CameraOptions cameraForDrag = mapCameraManagerDelegate2.cameraForDrag(screenCoordinate3, screenCoordinate4);
                    mapCameraManagerDelegate3 = OverScrollerFlingAnimator.this.mapCameraManagerDelegate;
                    mapCameraManagerDelegate3.setCamera(cameraForDrag);
                }
                OverScrollerFlingAnimator.this.postFrame(valueOf != null ? valueOf.longValue() : 0L);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postFrame(long delayNanos) {
        Choreographer choreographer = this.choreographer;
        if (delayNanos <= 0) {
            choreographer.postFrameCallback(this.frameCallback);
        } else {
            choreographer.postFrameCallbackDelayed(this.frameCallback, delayNanos / 1000000);
        }
    }

    public final void fling(int velocityX, int velocityY, @NotNull ScreenCoordinate simulateOrigin) {
        simulateOrigin.getClass();
        forceStop();
        this.fromPoint = simulateOrigin;
        this.prevX = 0;
        this.prevY = 0;
        this.lastProcessedFrameTimeNanos = -1L;
        this.isRunning = true;
        this.overScroller.fling(0, 0, velocityX, velocityY, -1073741824, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, -1073741824, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        Function0<Unit> function0 = this.onAnimationStart;
        if (function0 != null) {
            function0.invoke();
        }
        this.choreographer.postFrameCallback(this.frameCallback);
    }

    public final void forceStop() {
        if (this.isRunning) {
            this.overScroller.forceFinished(true);
            this.choreographer.removeFrameCallback(this.frameCallback);
            this.isRunning = false;
            Function0<Unit> function0 = this.onAnimationEnd;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @NotNull
    public final Choreographer.FrameCallback getFrameCallback() {
        return this.frameCallback;
    }

    public final boolean getLimitHorizontal() {
        return this.limitHorizontal;
    }

    public final boolean getLimitVertical() {
        return this.limitVertical;
    }

    @Nullable
    public final Function0<Unit> getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    @Nullable
    public final Function0<Unit> getOnAnimationStart() {
        return this.onAnimationStart;
    }

    /* renamed from: isRunning, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void setLimitHorizontal(boolean z) {
        this.limitHorizontal = z;
    }

    public final void setLimitVertical(boolean z) {
        this.limitVertical = z;
    }

    public final void setOnAnimationEnd(@Nullable Function0<Unit> function0) {
        this.onAnimationEnd = function0;
    }

    public final void setOnAnimationStart(@Nullable Function0<Unit> function0) {
        this.onAnimationStart = function0;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/OverScrollerFlingAnimator$Companion;", "", "()V", "NO_MAX_FPS", "Lkotlin/Function0;", "", "getNO_MAX_FPS", "()Lkotlin/jvm/functions/Function0;", "ONE_MILLISECOND_NANOS", "", "ONE_SECOND_NANOS", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<Integer> getNO_MAX_FPS() {
            return OverScrollerFlingAnimator.NO_MAX_FPS;
        }

        private Companion() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getFrameCallback$annotations() {
    }

    public /* synthetic */ OverScrollerFlingAnimator(Context context, MapCameraManagerDelegate mapCameraManagerDelegate, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mapCameraManagerDelegate, (i & 4) != 0 ? NO_MAX_FPS : function0);
    }
}
