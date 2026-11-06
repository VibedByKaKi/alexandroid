package com.amazon.alexa.elements.turbomodules.logging;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsLoggingSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsLogging")
/* loaded from: classes17.dex */
public class ElementsLoggingModule extends NativeElementsLoggingSpec {
    public static final String NAME = "ElementsLogging";
    private ElementsLoggingAPI elementsLoggingAPI;

    public ElementsLoggingModule(ReactApplicationContext reactApplicationContext, ElementsLoggingAPI elementsLoggingAPI) {
        super(reactApplicationContext);
        this.elementsLoggingAPI = elementsLoggingAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLoggingSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsLogging";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLoggingSpec
    public Map<String, Object> getTypedExportedConstants() {
        return this.elementsLoggingAPI.getConstants();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLoggingSpec
    @ReactMethod
    public void log(String str, String str2) {
        this.elementsLoggingAPI.log(str, str2);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsLoggingSpec
    @ReactMethod
    public void processLatencyEvent(ReadableMap readableMap, Promise promise) {
        this.elementsLoggingAPI.processLatencyEvent(readableMap, promise);
    }
}
