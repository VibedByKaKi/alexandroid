package com.amazon.alexa.elements.turbomodules.systrace;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsSystraceSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsSystrace")
/* loaded from: classes17.dex */
public class ElementsSystraceNativeModule extends NativeElementsSystraceSpec {
    public static final String NAME = "ElementsSystrace";
    private ElementsSystraceAPI elementsSystraceAPI;

    public ElementsSystraceNativeModule(ReactApplicationContext reactApplicationContext, ElementsSystraceAPI elementsSystraceAPI) {
        super(reactApplicationContext);
        this.elementsSystraceAPI = elementsSystraceAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsSystraceSpec
    @ReactMethod
    public void beginSection(@NonNull String str, @NonNull ReadableMap readableMap) {
        this.elementsSystraceAPI.beginSection(str, readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsSystraceSpec
    @ReactMethod
    public void endSection(@NonNull String str, @NonNull ReadableMap readableMap) {
        this.elementsSystraceAPI.endSection(str, readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsSystraceSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsSystrace";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsSystraceSpec
    @ReactMethod
    public boolean isEnabled() {
        return this.elementsSystraceAPI.isEnabled();
    }
}
