package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeElementsRtcscSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ElementsRtcsc";

    public NativeElementsRtcscSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void acceptSession(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void addListener(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void disconnectSession(String str, String str2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ElementsRtcsc";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void registerAppClientListener(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void registerDataChannelListener(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeListeners(double d);

    @DoNotStrip
    @ReactMethod
    public abstract void sendData(String str, String str2, ReadableArray readableArray, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setLocalVideoState(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void signalReadyForSession(String str, String str2, String str3, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void unregisterDataChannelListener(String str, Promise promise);
}
