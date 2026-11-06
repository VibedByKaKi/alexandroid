package com.amazon.alexa.elements.turbomodules.liveviewmodule;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeLiveViewModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "LiveViewModule")
/* loaded from: classes17.dex */
public class LiveViewModule extends NativeLiveViewModuleSpec {
    public static final String NAME = "LiveViewModule";
    private final LiveViewModuleAPI liveViewModuleAPI;

    public LiveViewModule(ReactApplicationContext reactApplicationContext, LiveViewModuleAPI liveViewModuleAPI) {
        super(reactApplicationContext);
        this.liveViewModuleAPI = liveViewModuleAPI;
        liveViewModuleAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "LiveViewModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeLiveViewModuleSpec
    @ReactMethod
    public void pauseLiveView() {
        this.liveViewModuleAPI.pauseLiveView();
    }
}
