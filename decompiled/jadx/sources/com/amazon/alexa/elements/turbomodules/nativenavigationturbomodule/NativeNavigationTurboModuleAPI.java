package com.amazon.alexa.elements.turbomodules.nativenavigationturbomodule;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface NativeNavigationTurboModuleAPI {
    void addRoutes(ReadableArray readableArray, Promise promise);

    void chromeOptions(ReadableMap readableMap);

    void navigationState(Promise promise);

    void routeBack(Promise promise);

    void routeNotify(ReadableMap readableMap);

    void routeTo(ReadableMap readableMap, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void setRouteState(String str, ReadableMap readableMap, Promise promise);

    void unregisterRoute(String str, Promise promise);
}
