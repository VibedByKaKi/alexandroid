package com.amazon.alexa.elements.turbomodules.environment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsEnvironmentService")
/* loaded from: classes17.dex */
public class ElementsEnvironmentServiceModule extends NativeElementsEnvironmentServiceSpec {
    public static final String NAME = "ElementsEnvironmentService";
    private ElementsEnvironmentServiceAPI elementsEnvironmentServiceAPI;

    public ElementsEnvironmentServiceModule(ReactApplicationContext reactApplicationContext, ElementsEnvironmentServiceAPI elementsEnvironmentServiceAPI) {
        super(reactApplicationContext);
        this.elementsEnvironmentServiceAPI = elementsEnvironmentServiceAPI;
        elementsEnvironmentServiceAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void clearBobDispatchEndpointToggleValue() {
        this.elementsEnvironmentServiceAPI.clearBobDispatchEndpointToggleValue();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public String getBobDispatchEndpointValue() {
        return this.elementsEnvironmentServiceAPI.getBobDispatchEndpointValue();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void getEndpoint(Promise promise) {
        this.elementsEnvironmentServiceAPI.getEndpoint(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @Nullable
    @ReactMethod
    public WritableMap getEndpointSync() {
        return this.elementsEnvironmentServiceAPI.getEndpointSync();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsEnvironmentService";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void getStartupStorageString(String str, Promise promise) {
        this.elementsEnvironmentServiceAPI.getStartupStorageString(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    public Map<String, Object> getTypedExportedConstants() {
        return this.elementsEnvironmentServiceAPI.getConstants();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void initializationComplete(Promise promise) {
        this.elementsEnvironmentServiceAPI.initializationComplete(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void initializationCompleteSync() {
        this.elementsEnvironmentServiceAPI.initializationCompleteSync();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void markInitializationPhase(String str, Promise promise) {
        this.elementsEnvironmentServiceAPI.markInitializationPhase(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void markInitializationPhaseSync(String str) {
        this.elementsEnvironmentServiceAPI.markInitializationPhaseSync(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public boolean setBobDispatchEndpointValue(String str) {
        return this.elementsEnvironmentServiceAPI.setBobDispatchEndpointValue(str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsEnvironmentServiceSpec
    @ReactMethod
    public void removeListeners(double d) {
    }
}
