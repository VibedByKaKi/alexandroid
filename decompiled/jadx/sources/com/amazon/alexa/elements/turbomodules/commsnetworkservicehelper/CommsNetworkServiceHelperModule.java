package com.amazon.alexa.elements.turbomodules.commsnetworkservicehelper;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsNetworkServiceHelperSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsNetworkServiceHelperModule")
/* loaded from: classes17.dex */
public class CommsNetworkServiceHelperModule extends NativeCommsNetworkServiceHelperSpec {
    public static final String NAME = "CommsNetworkServiceHelperModule";
    private final CommsNetworkServiceHelperAPI commsNetworkServiceHelperAPI;

    public CommsNetworkServiceHelperModule(ReactApplicationContext reactApplicationContext, CommsNetworkServiceHelperAPI commsNetworkServiceHelperAPI) {
        super(reactApplicationContext);
        this.commsNetworkServiceHelperAPI = commsNetworkServiceHelperAPI;
        commsNetworkServiceHelperAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsNetworkServiceHelperSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsNetworkServiceHelperModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsNetworkServiceHelperSpec
    @ReactMethod
    public void retrieveRequestInfo(Promise promise) {
        this.commsNetworkServiceHelperAPI.retrieveRequestInfo(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsNetworkServiceHelperSpec
    @ReactMethod
    public void setupCookiesForCVF(Promise promise) {
        this.commsNetworkServiceHelperAPI.setupCookiesForCVF(promise);
    }
}
