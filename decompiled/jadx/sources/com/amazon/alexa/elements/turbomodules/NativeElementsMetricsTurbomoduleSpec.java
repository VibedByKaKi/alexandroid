package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeElementsMetricsTurbomoduleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ElementsMetricsTurbomodule";

    public NativeElementsMetricsTurbomoduleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ElementsMetricsTurbomodule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void manageTimeline(String str, String str2, String str3, String str4, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void manageTimelineWithOwnerID(String str, String str2, String str3, String str4, String str5, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void record(String str, String str2, String str3, ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void recordWithTimeline(String str, String str2, String str3, String str4, String str5, ReadableMap readableMap, Promise promise);
}
