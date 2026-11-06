package com.amazon.alexa.voice.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Publisher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VoiceEventBusRebroadcastReceiver {
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private BroadcastReceiver broadcastReceiver = null;
    private final Context context;
    private final Publisher localPublisher;

    public VoiceEventBusRebroadcastReceiver(@NonNull Context context, @NonNull Publisher publisher) {
        this.context = context;
        this.localPublisher = publisher;
    }

    public void start() {
        if (this.broadcastReceiver == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.amazon.alexa.voice.ui.VoiceEventBusRebroadcastReceiver.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    VoiceEventBusRebroadcastReceiver.this.localPublisher.publish((Message) intent.getParcelableExtra("com.amazon.alexa.voice.ui.intent.extras.REBROADCAST_EVENT_MESSAGE"));
                }
            };
            this.broadcastReceiver = broadcastReceiver;
            int i = Build.VERSION.SDK_INT;
            Context context = this.context;
            if (i >= 34) {
                context.registerReceiver(broadcastReceiver, new IntentFilter("com.amazon.alexa.voice.ui.intent.REBROADCAST_EVENT"), 4);
            } else {
                context.registerReceiver(broadcastReceiver, new IntentFilter("com.amazon.alexa.voice.ui.intent.REBROADCAST_EVENT"));
            }
        }
    }

    public void stop() {
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
        }
    }
}
