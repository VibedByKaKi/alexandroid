package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeLiveViewControllerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeLiveViewController";

    public NativeLiveViewControllerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addListener(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void closeAllActiveSessions();

    @DoNotStrip
    @ReactMethod
    public abstract void closeSession(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void getCameraConnectionErrors(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getMicrophonePermissionStatus(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "NativeLiveViewController";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getSearchResultsPayload(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getSessions(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeListeners(double d);

    @DoNotStrip
    @ReactMethod
    public abstract void requestMicrophonePermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void sendAVSEvent(String str, String str2, String str3, Promise promise);
}
