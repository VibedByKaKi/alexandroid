package com.amazon.alexa.client.alexaservice.features.speaker;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.annotations.NonNull;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MuteStateChangedEventSender {

    @VisibleForTesting
    static final String EXTRA_IS_MUTE = "isMute";

    @VisibleForTesting
    static final String MUTE_STATE_CHANGED_ACTION = "com.amazon.alexa.intent.action.MUTE_STATE_CHANGED_ACTION";
    private final String appPackageName;
    private final Context context;

    @Inject
    public MuteStateChangedEventSender(@NonNull Context context) {
        this.context = context;
        this.appPackageName = context.getApplicationContext().getPackageName();
    }

    public void send(boolean z) {
        Intent intent = new Intent(MUTE_STATE_CHANGED_ACTION);
        intent.setPackage(this.appPackageName);
        intent.putExtra(EXTRA_IS_MUTE, z);
        this.context.sendBroadcast(intent);
    }
}
