package com.amazon.alexa.devicesetup.utils;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.EventBusException;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EventBusUtil {
    private static final String TAG = "EventBusUtil";
    private static EventBusUtil instance;

    @VisibleForTesting
    public EventBusUtil() {
    }

    public static EventBusUtil instance() {
        if (instance == null) {
            instance = new EventBusUtil();
        }
        return instance;
    }

    public void sendMessageToEventBus(String str, String str2) {
        if (str != null) {
            sendToEventBus(new Message.Builder().setDate(System.currentTimeMillis()).setEventType(str2).setSource(Message.Source.Local).setPayload(str).build());
        }
    }

    public void sendToEventBus(@NonNull Message message) {
        try {
            ((EventBus) ComponentRegistry.getInstance().get(EventBus.class).get()).lambda$getPublisher$0(message);
        } catch (EventBusException e) {
            Log.e(TAG, "Publish failed", e);
        } catch (Exception e2) {
            Log.e(TAG, "Catch of all Exceptions", e2);
        }
    }

    public void sendMessageToEventBus(String str) {
        sendToEventBus(new Message.Builder().setDate(System.currentTimeMillis()).setEventType(str).setSource(Message.Source.Local).build());
    }
}
