package com.amazon.deecomms.nativemodules;

import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.commsconversationpersistence.CommsConversationPersistenceAPI;
import com.amazon.deecomms.notifications.util.OfflinePushNotificationRepository;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsConversationPersistenceDelegate implements CommsConversationPersistenceAPI {
    public static final String MODULE_NAME = "CommsConversationPersistence";
    private final OfflinePushNotificationRepository mOfflinePushNotificationRespository;

    @Nullable
    private ReactApplicationContext reactContext;

    public CommsConversationPersistenceDelegate(OfflinePushNotificationRepository offlinePushNotificationRepository) {
        this.mOfflinePushNotificationRespository = offlinePushNotificationRepository;
    }

    @Override // com.amazon.alexa.elements.turbomodules.commsconversationpersistence.CommsConversationPersistenceAPI
    public void getOfflinePushNotifications(Promise promise) {
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it2 = this.mOfflinePushNotificationRespository.getAndDeleteNotifications(this.reactContext).iterator();
        while (it2.hasNext()) {
            createArray.pushString(it2.next());
        }
        promise.resolve(createArray);
    }

    @Override // com.amazon.alexa.elements.turbomodules.commsconversationpersistence.CommsConversationPersistenceAPI
    public void setReactContext(@Nullable ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
    }
}
