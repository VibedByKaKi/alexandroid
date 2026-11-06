package com.amazon.alexa.elements.turbomodules.elementsutility;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsUtilityModule")
/* loaded from: classes17.dex */
public class ElementsUtilityModule extends NativeElementsUtilitySpec {
    public static final String NAME = "ElementsUtilityModule";
    private final ElementsUtilityAPI elementsUtilityAPI;

    public ElementsUtilityModule(ReactApplicationContext reactApplicationContext, ElementsUtilityAPI elementsUtilityAPI) {
        super(reactApplicationContext);
        this.elementsUtilityAPI = elementsUtilityAPI;
        elementsUtilityAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec
    @ReactMethod
    public void encryptStringAES(String str, String str2, String str3, Promise promise) {
        this.elementsUtilityAPI.encryptStringAES(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec
    @ReactMethod
    public void encryptStringPKCS7(String str, String str2, Promise promise) {
        this.elementsUtilityAPI.encryptStringPKCS7(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec
    @ReactMethod
    public void encryptStringRSA(String str, boolean z, String str2, Promise promise) {
        this.elementsUtilityAPI.encryptStringRSA(str, z, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec
    @ReactMethod
    public void generateAESKey(Promise promise) {
        this.elementsUtilityAPI.generateAESKey(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsUtilityModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec
    @ReactMethod
    public void openUniversalDeeplinkUrl(String str, Promise promise) {
        this.elementsUtilityAPI.openUniversalDeeplinkUrl(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec
    @ReactMethod
    public void verifyWithECDSA(String str, String str2, String str3, String str4, Promise promise) {
        this.elementsUtilityAPI.verifyWithECDSA(str, str2, str3, str4, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsUtilitySpec
    @ReactMethod
    public void verifyWithRSA(String str, String str2, String str3, Promise promise) {
        this.elementsUtilityAPI.verifyWithRSA(str, str2, str3, promise);
    }
}
