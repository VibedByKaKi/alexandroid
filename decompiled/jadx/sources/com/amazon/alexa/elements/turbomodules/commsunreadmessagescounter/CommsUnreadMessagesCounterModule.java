package com.amazon.alexa.elements.turbomodules.commsunreadmessagescounter;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsUnreadMessagesCounterSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsUnreadMessagesCounterModule")
/* loaded from: classes17.dex */
public class CommsUnreadMessagesCounterModule extends NativeCommsUnreadMessagesCounterSpec {
    public static final String NAME = "CommsUnreadMessagesCounterModule";
    private final CommsUnreadMessagesCounterAPI commsUnreadMessagesCounterAPI;

    public CommsUnreadMessagesCounterModule(ReactApplicationContext reactApplicationContext, CommsUnreadMessagesCounterAPI commsUnreadMessagesCounterAPI) {
        super(reactApplicationContext);
        this.commsUnreadMessagesCounterAPI = commsUnreadMessagesCounterAPI;
        commsUnreadMessagesCounterAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsUnreadMessagesCounterSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsUnreadMessagesCounterModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsUnreadMessagesCounterSpec
    @ReactMethod
    public void setUnreadMessagesCount(double d, Promise promise) {
        this.commsUnreadMessagesCounterAPI.setUnreadMessagesCount(d, promise);
    }
}
