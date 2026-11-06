package com.amazon.alexa.voice.metrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.dagger.VoiceDependencies;
import com.amazon.alexa.voice.ui.onedesign.util.Logger;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoiceMetricsBroadcastReceiver extends BroadcastReceiver {

    @VisibleForTesting
    static final String ACTION = "amazon.alexa.intent.action.REPORT_METRIC";

    @VisibleForTesting
    static final String EXTRA_NAME = "amazon.alexa.intent.extras.EVENT_NAME";

    @VisibleForTesting
    static final String EXTRA_TIMESTAMP = "amazon.alexa.intent.extras.EVENT_TIMESTAMP";

    @Inject
    VoxMetricEventProcessingService eventProcessingService;

    @VisibleForTesting
    public void injectDependencies() {
        VoiceDependencies.inject(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("amazon.alexa.intent.action.REPORT_METRIC".equals(intent.getAction())) {
            injectDependencies();
            String stringExtra = intent.getStringExtra("amazon.alexa.intent.extras.EVENT_NAME");
            long longExtra = intent.getLongExtra("amazon.alexa.intent.extras.EVENT_TIMESTAMP", 0L);
            Logger.verbose("VoiceMetricsBroadcastReceiver, event:" + stringExtra + ", timestamp:" + longExtra);
            if (stringExtra == null || stringExtra.equals("")) {
                return;
            }
            this.eventProcessingService.process(VoxMetricEvent.create(stringExtra, longExtra));
        }
    }
}
