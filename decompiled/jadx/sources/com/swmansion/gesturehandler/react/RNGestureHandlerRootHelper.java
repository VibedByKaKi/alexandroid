package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.room.Room$$ExternalSyntheticBUOutline0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.GestureHandlerOrchestrator;
import expo.modules.kotlin.views.ExpoView$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0016\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "", "context", "Lcom/facebook/react/bridge/ReactContext;", "wrappedView", "Landroid/view/ViewGroup;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Landroid/view/ViewGroup;)V", "orchestrator", "Lcom/swmansion/gesturehandler/core/GestureHandlerOrchestrator;", "jsGestureHandler", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "rootView", "getRootView", "()Landroid/view/ViewGroup;", "shouldIntercept", "", "passingTouch", "tearDown", "", "requestDisallowInterceptTouchEvent", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "tryCancelAllHandlers", "handleSetJSResponder", "viewTag", "", "blockNativeResponder", "activateNativeHandlers", "view", "Landroid/view/View;", "RootViewGestureHandler", "Companion", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNGestureHandlerRootHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNGestureHandlerRootHelper.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
/* loaded from: classes9.dex */
public final class RNGestureHandlerRootHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float MIN_ALPHA_FOR_TOUCH = 0.1f;

    @NotNull
    private final ReactContext context;

    @Nullable
    private final GestureHandler jsGestureHandler;

    @Nullable
    private final GestureHandlerOrchestrator orchestrator;
    private boolean passingTouch;

    @NotNull
    private final ViewGroup rootView;
    private boolean shouldIntercept;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014J\b\u0010\r\u001a\u00020\u0007H\u0014¨\u0006\u000e"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$RootViewGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handlerTag", "", "<init>", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;I)V", "handleEvent", "", "event", "Landroid/view/MotionEvent;", "onHandle", "sourceEvent", "onHandleHover", "onCancel", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RootViewGestureHandler extends GestureHandler {
        public RootViewGestureHandler(int i) {
            setTag(i);
        }

        private final void handleEvent(MotionEvent event) {
            GestureHandlerOrchestrator orchestrator;
            if (getState() == 0 && (!RNGestureHandlerRootHelper.this.shouldIntercept || (orchestrator = getOrchestrator()) == null || !orchestrator.isAnyHandlerActive())) {
                begin();
                RNGestureHandlerRootHelper.this.shouldIntercept = false;
            }
            if (event.getActionMasked() == 1 || event.getActionMasked() == 10) {
                end();
            }
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        public void onCancel() {
            RNGestureHandlerRootHelper.this.shouldIntercept = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (RNGestureHandlerRootHelper.this.getRootView() instanceof RootView) {
                ((RootView) RNGestureHandlerRootHelper.this.getRootView()).onChildStartedNativeGesture(RNGestureHandlerRootHelper.this.getRootView(), obtain);
            }
            obtain.recycle();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        public void onHandle(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
            event.getClass();
            sourceEvent.getClass();
            handleEvent(event);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        public void onHandleHover(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
            event.getClass();
            sourceEvent.getClass();
            handleEvent(event);
        }
    }

    public RNGestureHandlerRootHelper(@NotNull ReactContext reactContext, @NotNull ViewGroup viewGroup) {
        reactContext.getClass();
        viewGroup.getClass();
        this.context = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        nativeModule.getClass();
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        RNGestureHandlerRegistry registry = rNGestureHandlerModule.getRegistry();
        ViewGroup findRootViewTag = INSTANCE.findRootViewTag(viewGroup);
        this.rootView = findRootViewTag;
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Initialize gesture handler for root view " + findRootViewTag);
        GestureHandlerOrchestrator gestureHandlerOrchestrator = new GestureHandlerOrchestrator(viewGroup, registry, new RNViewConfigurationHelper(), findRootViewTag);
        gestureHandlerOrchestrator.setMinimumAlphaForTraversal(0.1f);
        this.orchestrator = gestureHandlerOrchestrator;
        RootViewGestureHandler rootViewGestureHandler = new RootViewGestureHandler(-id);
        this.jsGestureHandler = rootViewGestureHandler;
        registry.registerHandler(rootViewGestureHandler);
        registry.attachHandlerToView(rootViewGestureHandler.getTag(), id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryCancelAllHandlers() {
        GestureHandler gestureHandler = this.jsGestureHandler;
        if (gestureHandler == null || gestureHandler.getState() != 2) {
            return;
        }
        gestureHandler.activate();
        gestureHandler.end();
    }

    public final void activateNativeHandlers(@NotNull View view) {
        view.getClass();
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        if (gestureHandlerOrchestrator != null) {
            gestureHandlerOrchestrator.activateNativeHandlersForView(view);
        }
    }

    public final boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        this.passingTouch = true;
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        gestureHandlerOrchestrator.getClass();
        gestureHandlerOrchestrator.onTouchEvent(event);
        this.passingTouch = false;
        return this.shouldIntercept;
    }

    @NotNull
    public final ViewGroup getRootView() {
        return this.rootView;
    }

    public final void handleSetJSResponder(int viewTag, boolean blockNativeResponder) {
        if (blockNativeResponder) {
            UiThreadUtil.runOnUiThread(new ExpoView$$ExternalSyntheticLambda0(this, 5));
        }
    }

    public final void requestDisallowInterceptTouchEvent() {
        if (this.orchestrator == null || this.passingTouch) {
            return;
        }
        tryCancelAllHandlers();
    }

    public final void tearDown() {
        Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.rootView);
        ReactContext reactContext = this.context;
        reactContext.getClass();
        NativeModule nativeModule = ((ThemedReactContext) reactContext).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        nativeModule.getClass();
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        RNGestureHandlerRegistry registry = rNGestureHandlerModule.getRegistry();
        GestureHandler gestureHandler = this.jsGestureHandler;
        gestureHandler.getClass();
        registry.dropHandler(gestureHandler.getTag());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper$Companion;", "", "<init>", "()V", "MIN_ALPHA_FOR_TOUCH", "", "findRootViewTag", "Landroid/view/ViewGroup;", "viewGroup", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup findRootViewTag(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof RootView)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            Room$$ExternalSyntheticBUOutline0.m$1("View ", viewGroup, " has not been mounted under ReactRootView");
            return null;
        }

        private Companion() {
        }
    }
}
