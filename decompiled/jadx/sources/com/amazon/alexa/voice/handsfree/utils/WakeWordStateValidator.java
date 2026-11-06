package com.amazon.alexa.voice.handsfree.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.callback.CallbackErrorMetadata;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.settings.WakeWordSettingsManager;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRConnector;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.decider.HandsFreeSetupDecider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes19.dex */
public class WakeWordStateValidator {
    private static final String GET_WAKE_WORD_STATE = "WakeWordValidatorGetWakeWordState";
    private static final String TAG = "WakeWordStateValidator";
    private final HandsFreeSetupDecider mHandsFreeSetupDecider;
    private final MetricsBuilderProvider mMetricsBuilderProvider;
    private final UVRConnector mUVRConnector;
    private final WakeWordSettingsManager mWakeWordSettingsManager;

    /* JADX WARN: Illegal instructions before constructor call */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WakeWordStateValidator(@androidx.annotation.NonNull android.content.Context r5) {
        /*
            r4 = this;
            com.amazon.alexa.voice.handsfree.decider.HandsFreeSetupDeciderProvider r0 = com.amazon.alexa.voice.handsfree.decider.HandsFreeSetupDeciderProvider.getInstance()
            com.amazon.alexa.voice.handsfree.decider.HandsFreeSetupDecider r0 = r0.getHandsFreeSetupDecider(r5)
            com.amazon.alexa.handsfree.protocols.settings.WakeWordSettingsManagerProvider r1 = com.amazon.alexa.handsfree.protocols.settings.WakeWordSettingsManagerProvider.getInstance()
            com.amazon.alexa.handsfree.protocols.settings.WakeWordSettingsManager r1 = r1.get()
            com.amazon.alexa.handsfree.protocols.uservoicerecognition.UVRModule r2 = com.amazon.alexa.handsfree.protocols.uservoicerecognition.UVRModule.INSTANCE
            boolean r3 = r2.isUVRAvailable()
            if (r3 == 0) goto L21
            com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRContract r2 = r2.getUVRContract()
            com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRConnector r2 = r2.getUVRConnector()
            goto L22
        L21:
            r2 = 0
        L22:
            com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider r5 = com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider.getInstance(r5)
            r4.<init>(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.voice.handsfree.utils.WakeWordStateValidator.<init>(android.content.Context):void");
    }

    public void validateWakeWordState(@NonNull final Context context) {
        String str = TAG;
        Log.d(str, "Validating wake word state");
        UVRConnector uVRConnector = this.mUVRConnector;
        if (uVRConnector != null) {
            uVRConnector.startConnection(context, false);
        }
        if (!this.mHandsFreeSetupDecider.canEnableWakeWord()) {
            Log.d(str, "Cannot enable wake word! Disabling.");
            this.mWakeWordSettingsManager.setHandsFreeState(false, new ResponseCallback() { // from class: com.amazon.alexa.voice.handsfree.utils.WakeWordStateValidator.1
                @Override // com.amazon.alexa.handsfree.protocols.callback.ResponseCallback
                public void onError(@NonNull CallbackErrorMetadata callbackErrorMetadata) {
                    Log.e(WakeWordStateValidator.TAG, "setHandsFreeState onError: " + callbackErrorMetadata.getErrorMessage());
                }

                @Override // com.amazon.alexa.handsfree.protocols.callback.ResponseCallback
                public void onSuccess() {
                    Log.d(WakeWordStateValidator.TAG, "Wake word detection successfully disabled.");
                    WakeWordStateValidator.this.mMetricsBuilderProvider.newBuilder().withPercentileMetricSuccess(WakeWordStateValidator.TAG, WakeWordStateValidator.GET_WAKE_WORD_STATE).emit(context);
                }
            }, str);
        }
        UVRConnector uVRConnector2 = this.mUVRConnector;
        if (uVRConnector2 != null) {
            uVRConnector2.endConnection(context);
        }
    }

    @VisibleForTesting
    public WakeWordStateValidator(@NonNull HandsFreeSetupDecider handsFreeSetupDecider, @NonNull WakeWordSettingsManager wakeWordSettingsManager, @Nullable UVRConnector uVRConnector, @NonNull MetricsBuilderProvider metricsBuilderProvider) {
        this.mHandsFreeSetupDecider = handsFreeSetupDecider;
        this.mWakeWordSettingsManager = wakeWordSettingsManager;
        this.mUVRConnector = uVRConnector;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
    }
}
