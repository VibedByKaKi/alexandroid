package com.amazon.dee.app.ui.main.appcomponent;

import android.util.Log;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GlobalHeaderEventPublisher {
    private static final String TAG = "GlobalHeaderEventPublisher";
    private final Lazy<EventBus> eventBus;

    public GlobalHeaderEventPublisher(Lazy<EventBus> lazy) {
        this.eventBus = lazy;
    }

    private void publishMessage(String str) {
        this.eventBus.get().lambda$getPublisher$0(new Message.Builder().setEventType(GlobalHeaderEvent.GLOBAL_HEADER_CLICK_EVENT).setPayload(str).build());
    }

    public void notificationCenterClicked() {
        Log.i(TAG, "Notification center clicked");
        publishMessage(GlobalHeaderEvent.NOTIFICATION_CLICKED);
    }

    public void persistentAlexaPlusUpsellClicked() {
        publishMessage(GlobalHeaderEvent.PERSISTENT_ALEXA_PLUS_UPSELL_CLICKED);
    }

    public void profileIngressClicked() {
        Log.i(TAG, "Profile ingress clicked");
        publishMessage(GlobalHeaderEvent.PROFILE_CLICKED);
    }

    public void quickAddClicked() {
        Log.i(TAG, "Quick add clicked");
        publishMessage(GlobalHeaderEvent.QUICK_ADD_CLICKED);
    }

    public void rightButtonClicked(int i) {
        Log.i(TAG, "Right action button clicked: " + i);
        publishMessage(i == 0 ? GlobalHeaderEvent.MORE_MENU_CLICKED : GlobalHeaderEvent.BACK_BUTTON_CLICKED);
    }

    public void titleClicked() {
        Log.i(TAG, "Title clicked");
        publishMessage(GlobalHeaderEvent.TITLE_CLICKED);
    }
}
