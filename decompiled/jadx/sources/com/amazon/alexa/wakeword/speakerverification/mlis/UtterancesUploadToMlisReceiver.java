package com.amazon.alexa.wakeword.speakerverification.mlis;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UtterancesUploadToMlisReceiver extends BroadcastReceiver {
    @VisibleForTesting
    public void enqueuePermissionCheck(@NonNull Context context, @NonNull Intent intent) {
        UtterancesUploadToMlisJobIntentService.enqueueWork(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        enqueuePermissionCheck(context, intent);
    }
}
