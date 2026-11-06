package com.amazon.alexa.elements.turbomodules.commsnotificationfilter;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsNotificationFilterSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsNotificationFilterModule")
/* loaded from: classes17.dex */
public class CommsNotificationFilterModule extends NativeCommsNotificationFilterSpec {
    public static final String NAME = "CommsNotificationFilterModule";
    private final CommsNotificationFilterAPI commsNotificationFilterAPI;

    public CommsNotificationFilterModule(ReactApplicationContext reactApplicationContext, CommsNotificationFilterAPI commsNotificationFilterAPI) {
        super(reactApplicationContext);
        this.commsNotificationFilterAPI = commsNotificationFilterAPI;
        commsNotificationFilterAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsNotificationFilterSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsNotificationFilterModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsNotificationFilterSpec
    @ReactMethod
    public void resumeNotifications(ReadableMap readableMap, Promise promise) {
        this.commsNotificationFilterAPI.resumeNotifications(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsNotificationFilterSpec
    @ReactMethod
    public void suppressNotifications(ReadableMap readableMap, Promise promise) {
        this.commsNotificationFilterAPI.suppressNotifications(readableMap, promise);
    }
}
