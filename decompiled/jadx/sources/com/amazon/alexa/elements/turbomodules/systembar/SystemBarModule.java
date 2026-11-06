package com.amazon.alexa.elements.turbomodules.systembar;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeSystemBarSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "SystemBarModule")
/* loaded from: classes17.dex */
public class SystemBarModule extends NativeSystemBarSpec {
    public static final String NAME = "SystemBarModule";
    private final SystemBarAPI systemBarAPI;

    public SystemBarModule(ReactApplicationContext reactApplicationContext, SystemBarAPI systemBarAPI) {
        super(reactApplicationContext);
        this.systemBarAPI = systemBarAPI;
        systemBarAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemBarSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SystemBarModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeSystemBarSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public void setSystemBarBackgroundColor(String str) {
        this.systemBarAPI.setSystemBarBackgroundColor(str);
    }
}
