package com.amazon.alexa.wakeword.speakerverification.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeakerVerificationModelDownloadReceiver extends BroadcastReceiver {
    private static final String TAG = "SpeakerVerificationModelDownloadReceiver";
    private final Initializer mInitializer;

    public SpeakerVerificationModelDownloadReceiver() {
        this(InitializerProvider.getInitializer());
    }

    @VisibleForTesting
    public void enqueueWork(@NonNull Context context) {
        SpeakerVerificationModelDownloadJobIntentService.enqueueWork(context);
    }

    @VisibleForTesting
    public AMPDInformationProvider getAMPDInformationProvider(@NonNull Context context) {
        return AMPDInformationProvider.getInstance(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (!getAMPDInformationProvider(context).isEdgeSV()) {
            Log.i(TAG, "onReceive: not an edgeSV device, skipping model download!");
        } else {
            this.mInitializer.initialize(context);
            enqueueWork(context);
        }
    }

    @VisibleForTesting
    public SpeakerVerificationModelDownloadReceiver(@NonNull Initializer initializer) {
        this.mInitializer = initializer;
    }
}
