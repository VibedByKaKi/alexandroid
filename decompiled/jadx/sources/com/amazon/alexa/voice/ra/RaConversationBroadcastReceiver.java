package com.amazon.alexa.voice.ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RaConversationBroadcastReceiver extends BroadcastReceiver {

    @VisibleForTesting
    public static final String CONVERSATION_DIRTY_MESSAGE = "Conversations:dirty";

    @VisibleForTesting
    public static final String CONVERSATION_UPDATE_EVENT = "conversation_updated";

    @VisibleForTesting
    public static final String CONVERSATION_VIEW_STATE_CLOSE = "conversation::view::close";
    public static final String TAG = "RaConversationBroadcastReceiver";

    @Inject
    EventBus eventBus;
    private volatile boolean isRegistered;

    public RaConversationBroadcastReceiver(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    private void publishEvent(String str) {
        this.eventBus.publish(new Message.Builder().setEventType(str).build());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("conversation_updated")) {
            str = CONVERSATION_DIRTY_MESSAGE;
        } else {
            str = "conversation::view::close";
            if (!action.equals("conversation::view::close")) {
                return;
            }
        }
        publishEvent(str);
    }

    public void register(Context context) {
        if (this.isRegistered) {
            return;
        }
        LocalBroadcastManager.getInstance(context).registerReceiver(this, TableInfo$$ExternalSyntheticOutline0.m("conversation_updated", "conversation::view::close"));
        this.isRegistered = true;
    }

    public void unregister(Context context) {
        if (this.isRegistered) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
