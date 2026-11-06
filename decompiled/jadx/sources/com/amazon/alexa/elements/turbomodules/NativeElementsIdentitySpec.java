package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeElementsIdentitySpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ElementsIdentity";

    public NativeElementsIdentitySpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addListener(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void authorizeLinkCode(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAccessToken(@Nullable String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAccessTokenForPerson(@Nullable String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getActorCookies(@Nullable String str, @Nullable String str2, @Nullable String str3, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getCookies(@Nullable String str, @Nullable String str2, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ElementsIdentity";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getPreauthorizedLinkCode(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getSessionId(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getUser(Promise promise);

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getUserSync();

    @DoNotStrip
    @ReactMethod
    public abstract void initiateDelegation(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void initiateProfileToAccountTransition(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeListeners(double d);

    @DoNotStrip
    @ReactMethod
    public abstract void requestReAuthentication(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setUpSSOForWebRequest(@Nullable String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void signOut(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void terminateDelegation(Promise promise);
}
