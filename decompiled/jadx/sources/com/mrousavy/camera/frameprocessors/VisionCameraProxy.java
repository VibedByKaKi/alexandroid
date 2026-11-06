package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerHelper;
import com.mrousavy.camera.core.ViewNotFoundError;
import com.mrousavy.camera.react.CameraView;
import it.innove.Peripheral$$ExternalSyntheticLambda19;
import it.innove.Peripheral$$ExternalSyntheticLambda3;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001dH\u0007J!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000bH\u0082 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/mrousavy/camera/frameprocessors/VisionCameraProxy;", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "mContext", "Ljava/lang/ref/WeakReference;", "mScheduler", "Lcom/mrousavy/camera/frameprocessors/VisionCameraScheduler;", "context", "getContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "findCameraViewById", "Lcom/mrousavy/camera/react/CameraView;", "viewId", "", "setFrameProcessor", "", "frameProcessor", "Lcom/mrousavy/camera/frameprocessors/FrameProcessor;", "removeFrameProcessor", "initFrameProcessorPlugin", "Lcom/mrousavy/camera/frameprocessors/FrameProcessorPlugin;", "name", "", "options", "", "initHybrid", "jsContext", "", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "scheduler", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VisionCameraProxy {

    @NotNull
    public static final String TAG = "VisionCameraProxy";

    @NotNull
    private WeakReference<ReactApplicationContext> mContext;

    @DoNotStrip
    @Keep
    @NotNull
    private HybridData mHybridData;

    @NotNull
    private VisionCameraScheduler mScheduler;

    @NotNull
    private final ReactApplicationContext reactContext;

    public VisionCameraProxy(@NotNull ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
        CallInvokerHolder jSCallInvokerHolder = getReactContext().getCatalystInstance().getJSCallInvokerHolder();
        jSCallInvokerHolder.getClass();
        CallInvokerHolderImpl callInvokerHolderImpl = (CallInvokerHolderImpl) jSCallInvokerHolder;
        JavaScriptContextHolder javaScriptContextHolder = getReactContext().getJavaScriptContextHolder();
        if (javaScriptContextHolder == null) {
            throw new Error("JSI Runtime is null! VisionCamera does not yet support bridgeless mode..");
        }
        long context = javaScriptContextHolder.getContext();
        this.mScheduler = new VisionCameraScheduler();
        this.mContext = new WeakReference<>(getReactContext());
        this.mHybridData = initHybrid(context, callInvokerHolderImpl, this.mScheduler);
    }

    @UiThread
    private final CameraView findCameraViewById(int viewId) {
        ReactApplicationContext reactApplicationContext = this.mContext.get();
        CameraView cameraView = null;
        if (reactApplicationContext != null) {
            UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, viewId);
            cameraView = (CameraView) (uIManager != null ? uIManager.resolveView(viewId) : null);
        }
        if (cameraView != null) {
            return cameraView;
        }
        throw new ViewNotFoundError(viewId);
    }

    private final native HybridData initHybrid(long jsContext, CallInvokerHolderImpl jsCallInvokerHolder, VisionCameraScheduler scheduler);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeFrameProcessor$lambda$1(VisionCameraProxy visionCameraProxy, int i) {
        visionCameraProxy.findCameraViewById(i).setFrameProcessor$react_native_vision_camera_release(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFrameProcessor$lambda$0(VisionCameraProxy visionCameraProxy, int i, FrameProcessor frameProcessor) {
        visionCameraProxy.findCameraViewById(i).setFrameProcessor$react_native_vision_camera_release(frameProcessor);
    }

    @NotNull
    /* renamed from: getContext, reason: from getter */
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @DoNotStrip
    @Keep
    @Nullable
    public final FrameProcessorPlugin initFrameProcessorPlugin(@NotNull String name, @NotNull Map<String, ? extends Object> options) {
        name.getClass();
        options.getClass();
        return FrameProcessorPluginRegistry.getPlugin(name, this, options);
    }

    @DoNotStrip
    @Keep
    public final void removeFrameProcessor(int viewId) {
        UiThreadUtil.runOnUiThread(new Peripheral$$ExternalSyntheticLambda19(this, viewId, 12));
    }

    @DoNotStrip
    @Keep
    public final void setFrameProcessor(int viewId, @NotNull FrameProcessor frameProcessor) {
        frameProcessor.getClass();
        UiThreadUtil.runOnUiThread(new Peripheral$$ExternalSyntheticLambda3(this, viewId, frameProcessor, 19));
    }
}
