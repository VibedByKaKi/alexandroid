package com.amazon.alexa.client.alexaservice.features.speaker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VolumeChangeHandler extends BroadcastReceiver {
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "VolumeChangeHandler";
    private final Context context;
    private boolean isRegistered = false;
    private final VolumeUpdateScheduler volumeUpdateScheduler;
    static final String INTENT_NAME = "android.media.VOLUME_CHANGED_ACTION";
    public static final IntentFilter VOLUME_CHANGED_INTENT_FILTER = new IntentFilter(INTENT_NAME);

    @Inject
    public VolumeChangeHandler(Context context, VolumeUpdateScheduler volumeUpdateScheduler) {
        this.context = context;
        this.volumeUpdateScheduler = volumeUpdateScheduler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(INTENT_NAME)) {
            this.volumeUpdateScheduler.scheduleUpdate();
        }
    }

    public void register() {
        if (this.isRegistered) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            context.registerReceiver(this, VOLUME_CHANGED_INTENT_FILTER, 4);
        } else {
            context.registerReceiver(this, VOLUME_CHANGED_INTENT_FILTER);
        }
        this.isRegistered = true;
    }

    public void unregister() {
        if (this.isRegistered) {
            this.context.unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
