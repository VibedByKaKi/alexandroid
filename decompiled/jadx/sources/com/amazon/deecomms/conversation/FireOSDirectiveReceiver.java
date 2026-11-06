package com.amazon.deecomms.conversation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.amazon.alexa.protocols.jobs.JobIDProvider;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.CommsCapabilityAgent$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FireOSDirectiveReceiver extends BroadcastReceiver {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, FireOSDirectiveReceiver.class);

    private void schedule(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) FireOSDirectiveHandlerService.class, ((JobIDProvider) CommsCapabilityAgent$$ExternalSyntheticOutline0.m(JobIDProvider.class)).getJobId(FireOSDirectiveHandlerService.class), intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LOG.d("Received FireOS Directive broadcast");
        schedule(context, intent);
    }
}
