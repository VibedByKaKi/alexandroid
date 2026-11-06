package com.mapbox.maps;

import com.facebook.react.bridge.Callback;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.runtime.ReactSurfaceImpl;
import com.facebook.react.uimanager.ViewManagerRegistry$$ExternalSyntheticLambda0;
import com.facebook.react.uimanager.ViewManagerRegistry$$ExternalSyntheticLambda4;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.firebase.installations.FirebaseInstallations;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import com.mapbox.maps.renderer.FpsManager;
import com.mrousavy.camera.frameprocessors.VisionCameraScheduler;
import com.reactnativecommunity.netinfo.NetworkCallbackConnectivityReceiver;
import com.reactnativecommunity.picker.ReactPicker;
import com.reactnativepagerview.NestedScrollableHost;
import com.swmansion.gesturehandler.core.FlingGestureHandler;
import com.swmansion.gesturehandler.core.HoverGestureHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class NativeMapImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ NativeMapImpl$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                NativeMapImpl._set_sizeSet_$lambda$1((NativeMapImpl) obj);
                break;
            case 1:
                ((SurfaceMountingManager) obj).lambda$stopSurface$0();
                break;
            case 2:
                DeviceEventManagerModule.invokeDefaultBackPressRunnable$lambda$0((DefaultHardwareBackBtnHandler) obj);
                break;
            case 3:
                ReactChoreographer.postFrameCallbackOnChoreographer$lambda$6((ReactChoreographer) obj);
                break;
            case 4:
                DevMenuModule.reload$lambda$0((DevMenuModule) obj);
                break;
            case 5:
                DevSettingsModule.reload$lambda$0((DevSettingsModule) obj);
                break;
            case 6:
                DevLoadingModule.hide$lambda$1((DevLoadingModule) obj);
                break;
            case 7:
                ((ReconnectingWebSocket) obj).delayedReconnect();
                break;
            case 8:
                ReactInstance.initializeEagerTurboModules$lambda$3((ReactInstance) obj);
                break;
            case 9:
                ReactSurfaceImpl.clear$lambda$4((ReactSurfaceImpl) obj);
                break;
            case 10:
                ((ViewManagerRegistry$$ExternalSyntheticLambda0) obj).invoke();
                break;
            case 11:
                ((ViewManagerRegistry$$ExternalSyntheticLambda0) obj).invoke();
                break;
            case 12:
                ((ViewManagerRegistry$$ExternalSyntheticLambda4) obj).invoke();
                break;
            case 13:
                LayoutAnimationController.initializeFromConfig$lambda$0((Callback) obj);
                break;
            case 14:
                ((MaintainVisibleScrollPositionHelper) obj).computeTargetView();
                break;
            case 15:
                ((WorkInitializer) obj).lambda$ensureContextsScheduled$1();
                break;
            case 16:
                ((SsMediaSource) obj).startLoadingManifest();
                break;
            case 17:
                ((MaterialButton) obj).lambda$setOpticalCenterEnabled$1();
                break;
            case 18:
                ((CarouselLayoutManager) obj).refreshKeylineState();
                break;
            case 19:
                ((MaterialBackOrchestrator) obj).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            case 20:
                ((FirebaseInstallations) obj).lambda$getId$1();
                break;
            case 21:
                GesturesPluginImpl.scheduleAnimators$lambda$3((GesturesPluginImpl) obj);
                break;
            case 22:
                ((ScaleBarImpl) obj).requestLayout();
                break;
            case 23:
                FpsManager.onRenderingPausedRunnable$lambda$1((FpsManager) obj);
                break;
            case 24:
                ((VisionCameraScheduler) obj).trigger();
                break;
            case 25:
                ((NetworkCallbackConnectivityReceiver) obj).lambda$asyncUpdateAndSend$0();
                break;
            case 26:
                ((ReactPicker) obj).lambda$new$0();
                break;
            case 27:
                ((NestedScrollableHost) obj).setDidSetInitialIndex(true);
                break;
            case 28:
                ((FlingGestureHandler) obj).fail();
                break;
            default:
                ((HoverGestureHandler) obj).finish();
                break;
        }
    }
}
