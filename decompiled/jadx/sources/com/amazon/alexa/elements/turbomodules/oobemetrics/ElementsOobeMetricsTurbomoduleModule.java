package com.amazon.alexa.elements.turbomodules.oobemetrics;

import com.amazon.alexa.elements.turbomodules.NativeElementsOobeMetricsTurbomoduleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsOobeMetricsTurbomodule")
/* loaded from: classes17.dex */
public class ElementsOobeMetricsTurbomoduleModule extends NativeElementsOobeMetricsTurbomoduleSpec {
    public static final String NAME = "ElementsOobeMetricsTurbomodule";
    private ElementsOobeMetricsTurbomoduleAPI elementsOobeMetricsAPI;

    public ElementsOobeMetricsTurbomoduleModule(ReactApplicationContext reactApplicationContext, ElementsOobeMetricsTurbomoduleAPI elementsOobeMetricsTurbomoduleAPI) {
        super(reactApplicationContext);
        this.elementsOobeMetricsAPI = elementsOobeMetricsTurbomoduleAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsOobeMetricsTurbomoduleSpec
    @ReactMethod
    public void record(String str, ReadableMap readableMap, Promise promise) {
        this.elementsOobeMetricsAPI.record(str, readableMap, promise);
    }
}
