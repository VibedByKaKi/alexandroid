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
public abstract class NativeCommsNotificationFilterSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CommsNotificationFilterModule";

    public NativeCommsNotificationFilterSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "CommsNotificationFilterModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void resumeNotifications(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void suppressNotifications(ReadableMap readableMap, Promise promise);
}
