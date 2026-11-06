package com.amazon.alexa.voice.handsfree.metrics.permission;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PartnerPermissionCheckReceiver extends BroadcastReceiver {
    private static final String DSP_BROADCAST_EXTRA_KEY = "EXTRA_STATE";
    private static final String DSP_BROADCAST_EXTRA_VALUE = "MICROPHONE_PERMISSION_NEEDED";
    private static final String TAG = "PartnerPermissionCheckReceiver";

    @VisibleForTesting
    public void enqueuePermissionCheck(@NonNull Context context, @NonNull Intent intent) {
        PermissionCheckJobIntentService.enqueueWork(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent.hasExtra("EXTRA_STATE") && intent.getStringExtra("EXTRA_STATE").equals(DSP_BROADCAST_EXTRA_VALUE)) {
            Log.i(TAG, "received MICROPHONE_PERMISSION_NEEDED broadcast extra value");
            enqueuePermissionCheck(context, intent);
        }
    }
}
