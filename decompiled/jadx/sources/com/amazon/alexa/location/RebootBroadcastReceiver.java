package com.amazon.alexa.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class RebootBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "RebootBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        GeofenceRestoreJobIntentService.schedule(context);
    }
}
