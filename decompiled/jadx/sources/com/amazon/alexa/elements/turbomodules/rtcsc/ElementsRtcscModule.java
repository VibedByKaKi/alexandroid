package com.amazon.alexa.elements.turbomodules.rtcsc;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsRtcsc")
/* loaded from: classes17.dex */
public class ElementsRtcscModule extends NativeElementsRtcscSpec {
    public static final String NAME = "ElementsRtcsc";
    private final ElementsRtcscAPI elementsRtcscAPI;

    public ElementsRtcscModule(ReactApplicationContext reactApplicationContext, ElementsRtcscAPI elementsRtcscAPI) {
        super(reactApplicationContext);
        this.elementsRtcscAPI = elementsRtcscAPI;
        elementsRtcscAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void acceptSession(String str, Promise promise) {
        this.elementsRtcscAPI.acceptSession(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void disconnectSession(String str, String str2, Promise promise) {
        this.elementsRtcscAPI.disconnectSession(str, str2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsRtcsc";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void registerAppClientListener(String str, Promise promise) {
        this.elementsRtcscAPI.registerAppClientListener(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void registerDataChannelListener(String str, Promise promise) {
        this.elementsRtcscAPI.registerDataChannelListener(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void sendData(String str, String str2, ReadableArray readableArray, boolean z, Promise promise) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bArr[i] = (byte) readableArray.getInt(i);
        }
        this.elementsRtcscAPI.sendData(str, str2, bArr, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void setLocalVideoState(String str, boolean z, Promise promise) {
        this.elementsRtcscAPI.setLocalVideoState(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void signalReadyForSession(String str, String str2, String str3, Promise promise) {
        this.elementsRtcscAPI.signalReadyForSession(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void unregisterDataChannelListener(String str, Promise promise) {
        this.elementsRtcscAPI.unregisterDataChannelListener(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsRtcscSpec
    @ReactMethod
    public void removeListeners(double d) {
    }
}
