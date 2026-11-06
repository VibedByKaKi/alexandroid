package com.amazon.alexa.elements.turbomodules.liveviewcontroller;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "NativeLiveViewController")
/* loaded from: classes17.dex */
public class LiveViewControllerModule extends NativeLiveViewControllerSpec {
    public static final String NAME = "NativeLiveViewController";
    private final LiveViewControllerAPI liveViewControllerAPI;

    public LiveViewControllerModule(ReactApplicationContext reactApplicationContext, LiveViewControllerAPI liveViewControllerAPI) {
        super(reactApplicationContext);
        this.liveViewControllerAPI = liveViewControllerAPI;
        liveViewControllerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void addListener(String str) {
        this.liveViewControllerAPI.addListener(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void closeAllActiveSessions() {
        this.liveViewControllerAPI.closeAllActiveSessions();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void closeSession(String str) {
        this.liveViewControllerAPI.closeSession(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void getCameraConnectionErrors(Promise promise) {
        this.liveViewControllerAPI.getCameraConnectionErrors(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void getMicrophonePermissionStatus(Promise promise) {
        this.liveViewControllerAPI.getMicrophonePermissionStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "NativeLiveViewController";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void getSearchResultsPayload(Promise promise) {
        this.liveViewControllerAPI.getSearchResultsPayload(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void getSessions(Promise promise) {
        this.liveViewControllerAPI.getSessions(promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        try {
            this.liveViewControllerAPI.releaseReactContext(getReactApplicationContext());
        } finally {
            super.invalidate();
        }
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void removeListeners(double d) {
        this.liveViewControllerAPI.removeListeners(d);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void requestMicrophonePermission(Promise promise) {
        this.liveViewControllerAPI.requestMicrophonePermission(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewControllerSpec
    @ReactMethod
    public void sendAVSEvent(String str, String str2, String str3, Promise promise) {
        this.liveViewControllerAPI.sendAVSEvent(str, str2, str3, promise);
    }
}
