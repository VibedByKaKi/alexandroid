package com.amazon.alexa.elements.turbomodules.metrics;

import com.amazon.alexa.elements.turbomodules.NativeElementsMetricsTurbomoduleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsMetricsTurbomodule")
/* loaded from: classes17.dex */
public class ElementsMetricsTurbomoduleModule extends NativeElementsMetricsTurbomoduleSpec {
    public static final String NAME = "ElementsMetricsTurbomodule";
    private ElementsMetricsTurbomoduleAPI elementsMetricsAPI;

    public ElementsMetricsTurbomoduleModule(ReactApplicationContext reactApplicationContext, ElementsMetricsTurbomoduleAPI elementsMetricsTurbomoduleAPI) {
        super(reactApplicationContext);
        this.elementsMetricsAPI = elementsMetricsTurbomoduleAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsMetricsTurbomoduleSpec
    @ReactMethod
    public void manageTimeline(String str, String str2, String str3, String str4, Promise promise) {
        this.elementsMetricsAPI.manageTimeline(str, str2, str3, str4, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsMetricsTurbomoduleSpec
    @ReactMethod
    public void manageTimelineWithOwnerID(String str, String str2, String str3, String str4, String str5, Promise promise) {
        this.elementsMetricsAPI.manageTimelineWithOwnerID(str, str2, str3, str4, str5, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsMetricsTurbomoduleSpec
    @ReactMethod
    public void record(String str, String str2, String str3, ReadableMap readableMap) {
        this.elementsMetricsAPI.record(str, str2, str3, readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsMetricsTurbomoduleSpec
    @ReactMethod
    public void recordWithTimeline(String str, String str2, String str3, String str4, String str5, ReadableMap readableMap, Promise promise) {
        this.elementsMetricsAPI.recordWithTimeline(str, str2, str3, str4, str5, readableMap, promise);
    }
}
