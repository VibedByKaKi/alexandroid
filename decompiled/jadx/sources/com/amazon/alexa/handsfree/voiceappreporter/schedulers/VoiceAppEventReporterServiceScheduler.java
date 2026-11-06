package com.amazon.alexa.handsfree.voiceappreporter.schedulers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.BroadcastScheduler;
import com.amazon.alexa.handsfree.voiceappreporter.receivers.VoiceAppEventReceiver;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class VoiceAppEventReporterServiceScheduler extends BroadcastScheduler {
    private static final int DELAY_MILIS = 86400000;
    private static final String LAST_SCHEDULE_CHECK_TAG = "com.amazon.alexa.handsfree.voiceappreporter.schedulers.LastScheduleCheck";

    @VisibleForTesting
    static final long LAST_SCHEDULE_CHECK_UNDEFINED = 0;
    private static final int PENDING_INTENT_REQUEST_CODE = 0;
    private static final String SHARED_PREFERENCES_FILE = "com.amazon.alexa.handsfree.voiceappreporter.schedulers.VoiceAppEventReporterServiceScheduler";

    @Inject
    public VoiceAppEventReporterServiceScheduler(@NonNull Context context) {
        super(context);
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.BroadcastScheduler
    public int getDelayMillis() {
        return 86400000;
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.BroadcastScheduler
    @NonNull
    public Intent getIntentToBroadcast() {
        return new Intent(getContext(), (Class<?>) VoiceAppEventReceiver.class);
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.BroadcastScheduler
    @NonNull
    public String getLastScheduleCheckTag() {
        return LAST_SCHEDULE_CHECK_TAG;
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.BroadcastScheduler
    @NonNull
    public PendingIntent getPendingIntentToBroadcast() {
        return PendingIntent.getBroadcast(getContext(), 0, new Intent(getContext(), (Class<?>) VoiceAppEventReceiver.class), 201326592);
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.BroadcastScheduler
    @NonNull
    public String getSharedPreferencesFile() {
        return SHARED_PREFERENCES_FILE;
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.BroadcastScheduler
    @NonNull
    public String getTag() {
        return "VoiceAppEventReporterServiceScheduler";
    }
}
