package com.amazon.alexa.elements.turbomodules.identity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsIdentity")
/* loaded from: classes17.dex */
public class ElementsIdentityModule extends NativeElementsIdentitySpec {
    public static final String NAME = "ElementsIdentity";
    private ElementsIdentityAPI elementsIdentityAPI;

    public ElementsIdentityModule(ReactApplicationContext reactApplicationContext, ElementsIdentityAPI elementsIdentityAPI) {
        super(reactApplicationContext);
        this.elementsIdentityAPI = elementsIdentityAPI;
        elementsIdentityAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void authorizeLinkCode(String str, Promise promise) {
        this.elementsIdentityAPI.authorizeLinkCode(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void getAccessToken(@Nullable String str, Promise promise) {
        this.elementsIdentityAPI.getAccessToken(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void getAccessTokenForPerson(@Nullable String str, Promise promise) {
        this.elementsIdentityAPI.getAccessTokenForPerson(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void getActorCookies(@Nullable String str, @Nullable String str2, @Nullable String str3, Promise promise) {
        this.elementsIdentityAPI.getActorCookies(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void getCookies(@Nullable String str, @Nullable String str2, Promise promise) {
        this.elementsIdentityAPI.getCookies(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsIdentity";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void getPreauthorizedLinkCode(Promise promise) {
        this.elementsIdentityAPI.getPreauthorizedLinkCode(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void getSessionId(Promise promise) {
        this.elementsIdentityAPI.getSessionId(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void getUser(Promise promise) {
        this.elementsIdentityAPI.getUser(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @Nullable
    @ReactMethod
    public WritableMap getUserSync() {
        return this.elementsIdentityAPI.getUserSync();
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void initiateDelegation(ReadableMap readableMap, Promise promise) {
        this.elementsIdentityAPI.initiateDelegation(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void initiateProfileToAccountTransition(String str, Promise promise) {
        this.elementsIdentityAPI.initiateProfileToAccountTransition(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void requestReAuthentication(Promise promise) {
        this.elementsIdentityAPI.requestReAuthentication(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void setUpSSOForWebRequest(@Nullable String str, Promise promise) {
        this.elementsIdentityAPI.setUpSSOForWebRequest(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void signOut(Promise promise) {
        this.elementsIdentityAPI.signOut(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void terminateDelegation(Promise promise) {
        this.elementsIdentityAPI.terminateDelegation(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsIdentitySpec
    @ReactMethod
    public void removeListeners(double d) {
    }
}
