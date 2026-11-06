package com.amazon.alexa.client.alexaservice.ui.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.UiEventReceivedEvent;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UiEventBroadcastReceiver extends BroadcastReceiver {

    @VisibleForTesting
    static final String ACTION_PUBLISH_UI_EVENT = "com.amazon.alexa.intent.action.PUBLISH_UI_EVENT";

    @VisibleForTesting
    static final String EXTRA_EVENT_DATA = "com.amazon.alexa.intent.extra.EVENT_DATA";

    @VisibleForTesting
    static final String EXTRA_EVENT_NAME = "com.amazon.alexa.intent.extra.EVENT_NAME";
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "UiEventBroadcastReceiver";
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isRegistered = false;

    @Inject
    public UiEventBroadcastReceiver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        UiEventName uiEventName;
        if ("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("com.amazon.alexa.intent.extra.EVENT_NAME");
            if (stringExtra == null) {
                Log.e(TAG, "UI Event lacked an event name");
                return;
            }
            try {
                uiEventName = UiEventName.valueOf(stringExtra);
            } catch (IllegalArgumentException unused) {
                uiEventName = null;
            }
            if (uiEventName == null) {
                Log.e(TAG, "Unknown metric name: ".concat(stringExtra));
                return;
            }
            Bundle bundleExtra = intent.getBundleExtra("com.amazon.alexa.intent.extra.EVENT_DATA");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            this.eventBus.post(UiEventReceivedEvent.create(uiEventName, bundleExtra));
        }
    }

    public void register() {
        if (this.isRegistered) {
            return;
        }
        LocalBroadcastManager.getInstance(this.context).registerReceiver(this, new IntentFilter("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT"));
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            context.registerReceiver(this, new IntentFilter("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT"), 4);
        } else {
            context.registerReceiver(this, new IntentFilter("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT"));
        }
        this.isRegistered = true;
    }

    public void unregister() {
        if (this.isRegistered) {
            LocalBroadcastManager.getInstance(this.context).unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
