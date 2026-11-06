package com.amazon.alexa.voice.events;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.model.AlexaMetadataBundleKey;
import com.amazon.alexa.voice.dagger.VoiceDependencies;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoiceUiEventBroadcastReceiver extends BroadcastReceiver {

    @VisibleForTesting
    public static final String ACTION_PUBLISH_UI_EVENT = "com.amazon.alexa.intent.action.PUBLISH_UI_EVENT";

    @VisibleForTesting
    public static final String EXTRA_EVENT_DATA = "com.amazon.alexa.intent.extra.EVENT_DATA";

    @VisibleForTesting
    public static final String EXTRA_EVENT_NAME = "com.amazon.alexa.intent.extra.EVENT_NAME";
    private static final int RECEIVER_NOT_EXPORTED = 4;

    @Inject
    VoxUiEventProcessingService eventProcessingService;
    private volatile boolean isRegistered;

    @VisibleForTesting
    public void injectDependencies() {
        VoiceDependencies.inject(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT".equals(intent.getAction())) {
            injectDependencies();
            String stringExtra = intent.getStringExtra("com.amazon.alexa.intent.extra.EVENT_NAME");
            Bundle bundleExtra = intent.getBundleExtra("com.amazon.alexa.intent.extra.EVENT_DATA");
            long j = bundleExtra != null ? bundleExtra.getLong(AlexaMetadataBundleKey.EVENT_REALTIME_MS.name()) : 0L;
            Logger.verbose("VoiceUiEventBroadcastReceiver, event: " + stringExtra + ", timestamp: " + j);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            this.eventProcessingService.process(VoxUiEvent.create(stringExtra, j));
        }
    }

    public void register(Context context) {
        if (this.isRegistered) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            context.registerReceiver(this, new IntentFilter("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT"), 4);
        } else {
            context.registerReceiver(this, new IntentFilter("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT"));
        }
        this.isRegistered = true;
    }

    public void unregister(Context context) {
        if (this.isRegistered) {
            context.unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
