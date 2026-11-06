package com.amazon.alexa.handsfree.voiceappreporter.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.voiceappreporter.services.VoiceAppEventReporterService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceAppEventReceiver extends BroadcastReceiver {
    private final Initializer mInitializer;

    public VoiceAppEventReceiver() {
        this.mInitializer = InitializerProvider.getInitializer();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        this.mInitializer.initialize(context);
        VoiceAppEventReporterService.enqueueWork(context, intent);
    }

    @VisibleForTesting
    public VoiceAppEventReceiver(@NonNull Initializer initializer) {
        this.mInitializer = initializer;
    }
}
