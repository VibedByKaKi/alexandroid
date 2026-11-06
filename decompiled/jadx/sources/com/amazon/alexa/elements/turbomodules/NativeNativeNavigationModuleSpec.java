package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeNativeNavigationModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeNavigationTurboModule";

    public NativeNativeNavigationModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addRoutes(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void chromeOptions(ReadableMap readableMap);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "NativeNavigationTurboModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void navigationState(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void routeBack(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void routeNotify(ReadableMap readableMap);

    @DoNotStrip
    @ReactMethod
    public abstract void routeTo(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setRouteState(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void unregisterRoute(String str, Promise promise);
}
