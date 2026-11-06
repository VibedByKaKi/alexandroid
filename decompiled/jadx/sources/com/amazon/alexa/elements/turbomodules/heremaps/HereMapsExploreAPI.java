package com.amazon.alexa.elements.turbomodules.heremaps;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface HereMapsExploreAPI {
    void coordinateForPoint(double d, ReadableMap readableMap, Promise promise);

    void getCamera(double d, Promise promise);

    void getSafeAreaInsets(Promise promise);

    void pointForCoordinate(double d, ReadableMap readableMap, Promise promise);

    void setMapScheme(String str, Promise promise);

    void setReactContext(ReactApplicationContext reactApplicationContext);
}
