package com.amazon.alexa.client.alexaservice.vad.dialog;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaDialogRequest;
import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.client.alexaservice.base.userspeechprovider.UserSpeechProviderRegistry;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.ExternalUserSpeechProvider;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialog;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogAuthority;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogEvent;
import com.amazon.alexa.client.alexaservice.ui.core.LaunchSource;
import com.amazon.alexa.client.alexaservice.vad.SpeechEventListener;
import com.amazon.alexa.client.alexaservice.vad.deferredbargein.DeferredBargeInAuthority;
import com.amazon.alexa.client.alexaservice.vad.detector.VoiceActivityDetectionData;
import com.amazon.alexa.client.alexaservice.vad.events.VADMetricCounterEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VADDialogInitiator implements SpeechEventListener {
    private static final String TAG = "VADDialogInitiator";

    @Nullable
    private final DeferredBargeInAuthority deferredBargeInAuthority;
    private final MultiTurnDialogAuthority dialogAuthority;
    private final ErrorCallback errorCallback;
    private final AlexaClientEventBus eventBus;
    private final VADUserSpeechProvider speechProvider;
    private final UserSpeechProviderRegistry speechProviderRegistry;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ErrorCallback {
        void onVADError(String str);
    }

    public VADDialogInitiator(@NonNull VADUserSpeechProvider vADUserSpeechProvider, @NonNull AlexaClientEventBus alexaClientEventBus, @NonNull MultiTurnDialogAuthority multiTurnDialogAuthority, @NonNull UserSpeechProviderRegistry userSpeechProviderRegistry, @NonNull ErrorCallback errorCallback, @Nullable DeferredBargeInAuthority deferredBargeInAuthority) {
        this.speechProvider = vADUserSpeechProvider;
        this.eventBus = alexaClientEventBus;
        this.dialogAuthority = multiTurnDialogAuthority;
        this.speechProviderRegistry = userSpeechProviderRegistry;
        this.errorCallback = errorCallback;
        this.deferredBargeInAuthority = deferredBargeInAuthority;
    }

    private void postNewDialogRequest() {
        ExternalUserSpeechProvider externalUserSpeechProvider = this.speechProviderRegistry.get(this.speechProvider);
        if (externalUserSpeechProvider == null) {
            Log.e(TAG, "VAD speech provider is not registered");
            this.eventBus.post(VADMetricCounterEvent.create(AlexaMetricsName.RemarkableAlexaUiEvents.VAD_SPEECH_PROVIDER_NOT_REGISTERED.getValue()));
        } else {
            this.eventBus.post(DialogEvent.NewDialogRequestedEvent.create(LaunchSource.VOICE_CHAT, externalUserSpeechProvider, AlexaDialogRequest.builder().setInvocationType(this.speechProvider.getInvocationType()).build(), ""));
        }
    }

    private boolean shouldBargeIn() {
        MultiTurnDialog currentDialog;
        return this.dialogAuthority.hasCurrentDialog() && (currentDialog = this.dialogAuthority.getCurrentDialog()) != null && currentDialog.isStarted();
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.SpeechEventListener
    public void onError(@NonNull String str) {
        Log.e(TAG, "VAD error: " + str);
        this.errorCallback.onVADError(str);
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.SpeechEventListener
    public void onSpeechDetected(@NonNull VoiceActivityDetectionData voiceActivityDetectionData) {
        boolean z;
        if (shouldBargeIn()) {
            DeferredBargeInAuthority deferredBargeInAuthority = this.deferredBargeInAuthority;
            if (deferredBargeInAuthority != null) {
                z = deferredBargeInAuthority.deferForBargeIn();
                if (z) {
                    Log.i(TAG, "Barge-in deferred");
                }
            } else {
                z = false;
            }
            if (!z) {
                Log.i(TAG, "Barge-in detected, finishing current dialog");
                this.eventBus.post(VADMetricCounterEvent.create(AlexaMetricsName.RemarkableAlexaUiEvents.VAD_BARGE_IN.getValue()));
                this.dialogAuthority.finishCurrentDialog();
            }
        }
        if (this.speechProvider.isInExpectSpeechState()) {
            Log.i(TAG, "ExpectSpeech state, continuing existing dialog");
            this.speechProvider.setVoiceActivityDetectionData(voiceActivityDetectionData);
            this.speechProvider.startNextDialogTurn();
        } else {
            Log.i(TAG, "Requesting new dialog");
            this.speechProvider.setVoiceActivityDetectionData(voiceActivityDetectionData);
            postNewDialogRequest();
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.SpeechEventListener
    public void onSpeechEnded() {
    }
}
