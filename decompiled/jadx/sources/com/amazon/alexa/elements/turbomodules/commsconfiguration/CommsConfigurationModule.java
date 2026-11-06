package com.amazon.alexa.elements.turbomodules.commsconfiguration;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsConfigurationSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsConfigurationModule")
/* loaded from: classes17.dex */
public class CommsConfigurationModule extends NativeCommsConfigurationSpec {
    public static final String NAME = "CommsConfigurationModule";
    private final CommsConfigurationAPI commsConfigurationAPI;

    public CommsConfigurationModule(ReactApplicationContext reactApplicationContext, CommsConfigurationAPI commsConfigurationAPI) {
        super(reactApplicationContext);
        this.commsConfigurationAPI = commsConfigurationAPI;
        commsConfigurationAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsConfigurationSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsConfigurationModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsConfigurationSpec
    @ReactMethod
    public void getValueForPath(String str, Promise promise) {
        this.commsConfigurationAPI.getValueForPath(str, promise);
    }
}
