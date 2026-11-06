package com.amazon.alexa.voice.hva;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class HighValueActionEventForwardReceiver extends BroadcastReceiver {

    @VisibleForTesting
    static final String ACTION_FORWARD_HIGH_VALUE_EVENT = "com.amazon.alexa.voice.intent.action.FORWARD_HIGH_VALUE_EVENT";

    @VisibleForTesting
    static final String EXTRA_PAYLOAD = "com.amazon.alexa.voice.intent.extra.HIGH_VALUE_EVENT_PAYLOAD";

    public static void forward(Context context, String str) {
        Intent intent = new Intent(ACTION_FORWARD_HIGH_VALUE_EVENT);
        intent.setClass(context, HighValueActionEventForwardReceiver.class);
        intent.putExtra(EXTRA_PAYLOAD, str);
        context.sendBroadcast(intent);
    }

    @VisibleForTesting
    public static void publishToEventBus(EventBus eventBus, String str) {
        eventBus.publish(new Message.Builder().setEventType("HighValueEvent").setPayload(str).setSource(Message.Source.Local).build());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !ACTION_FORWARD_HIGH_VALUE_EVENT.equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra(EXTRA_PAYLOAD);
        if (stringExtra == null || stringExtra.isEmpty()) {
            Log.w("VoiceHighValueAction", "Ignoring forwarded high-value event without a payload.");
            return;
        }
        EventBus eventBus = (EventBus) Automotive$$ExternalSyntheticOutline0.m(EventBus.class);
        if (eventBus == null) {
            Log.e("VoiceHighValueAction", "Unable to republish high-value event because EventBus is unavailable.");
        } else {
            publishToEventBus(eventBus, stringExtra);
        }
    }
}
