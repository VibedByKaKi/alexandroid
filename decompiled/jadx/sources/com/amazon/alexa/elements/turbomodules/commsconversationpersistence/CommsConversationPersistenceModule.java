package com.amazon.alexa.elements.turbomodules.commsconversationpersistence;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsConversationPersistenceSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsConversationPersistenceModule")
/* loaded from: classes17.dex */
public class CommsConversationPersistenceModule extends NativeCommsConversationPersistenceSpec {
    public static final String NAME = "CommsConversationPersistenceModule";
    private final CommsConversationPersistenceAPI commsConversationPersistenceAPI;

    public CommsConversationPersistenceModule(ReactApplicationContext reactApplicationContext, CommsConversationPersistenceAPI commsConversationPersistenceAPI) {
        super(reactApplicationContext);
        this.commsConversationPersistenceAPI = commsConversationPersistenceAPI;
        commsConversationPersistenceAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsConversationPersistenceSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsConversationPersistenceModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsConversationPersistenceSpec
    @ReactMethod
    public void getOfflinePushNotifications(Promise promise) {
        this.commsConversationPersistenceAPI.getOfflinePushNotifications(promise);
    }
}
