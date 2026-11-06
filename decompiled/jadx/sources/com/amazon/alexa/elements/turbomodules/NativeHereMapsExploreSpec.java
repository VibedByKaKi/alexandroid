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
public abstract class NativeHereMapsExploreSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "HereMapsExplore";

    public NativeHereMapsExploreSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void coordinateForPoint(double d, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getCamera(double d, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "HereMapsExplore";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getSafeAreaInsets(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void pointForCoordinate(double d, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setMapScheme(String str, Promise promise);
}
