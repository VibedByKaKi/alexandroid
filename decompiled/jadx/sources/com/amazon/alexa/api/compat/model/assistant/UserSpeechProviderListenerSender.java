package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class UserSpeechProviderListenerSender {
    private static final String TAG = "UserSpeechProviderListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public UserSpeechProviderListenerSender(Messenger messenger, int i) {
        this.messenger = messenger;
        this.specIndex = i;
    }

    private boolean sendMessage(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = this.specIndex;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        try {
            this.messenger.send(obtain);
            return true;
        } catch (RemoteException e) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Failed to send message: ", i, TAG, e);
            return false;
        }
    }

    public boolean onDialogFinished(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.DIALOG_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_FINISHED.ordinal(), bundle2);
    }

    public boolean onDialogRequestDenied(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.REASON_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_REQUEST_DENIED.ordinal(), bundle2);
    }

    public boolean onDialogRequested(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.TURN_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_REQUESTED.ordinal(), bundle2);
    }

    public boolean onDialogStarted(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.DIALOG_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_STARTED.ordinal(), bundle2);
    }

    public boolean onDialogTurnFinished(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.TURN_FINISHED_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_FINISHED.ordinal(), bundle2);
    }

    public boolean onDialogTurnRequested(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.TURN_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_REQUESTED.ordinal(), bundle2);
    }

    public boolean onDialogTurnReserveResponse(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.RESERVE_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_RESERVE_RESPONSE.ordinal(), bundle2);
    }

    public boolean onDialogTurnResponsePending(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.PENDING_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_RESPONSE_PENDING.ordinal(), bundle2);
    }

    public boolean onDialogTurnStarted(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProviderListenerArgumentType.TURN_BUNDLE.name(), bundle);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_DIALOG_TURN_STARTED.ordinal(), bundle2);
    }

    public boolean onPlaybackStarted(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name(), str);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_PLAYBACK_STARTED.ordinal(), bundle);
    }

    public boolean onPlaybackStopped(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name(), str);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_PLAYBACK_STOPPED.ordinal(), bundle);
    }

    public boolean onReservationAgreed(String str, long j) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProviderListenerArgumentType.CALLBACKS_ID.name(), str);
        bundle.putLong(UserSpeechProviderListenerArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name(), j);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_RESERVATION_AGREED.ordinal(), bundle);
    }

    public boolean onReservationDisputed(String str, long j) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProviderListenerArgumentType.CALLBACKS_ID.name(), str);
        bundle.putLong(UserSpeechProviderListenerArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name(), j);
        return sendMessage(UserSpeechProviderListenerMessageType.ON_RESERVATION_DISPUTED.ordinal(), bundle);
    }

    public boolean pauseWakeWordDetection(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name(), str);
        bundle.putString(UserSpeechProviderListenerArgumentType.WAKE_WORD.name(), str2);
        return sendMessage(UserSpeechProviderListenerMessageType.PAUSE_WAKE_WORD_DETECTION.ordinal(), bundle);
    }

    public boolean resumeWakeWordDetection(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name(), str);
        bundle.putString(UserSpeechProviderListenerArgumentType.WAKE_WORD.name(), str2);
        return sendMessage(UserSpeechProviderListenerMessageType.RESUME_WAKE_WORD_DETECTION.ordinal(), bundle);
    }

    public boolean setWakeWordDetectionEnabled(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProviderListenerArgumentType.PROVIDER_ID.name(), str);
        bundle.putBoolean(UserSpeechProviderListenerArgumentType.ENABLED.name(), z);
        return sendMessage(UserSpeechProviderListenerMessageType.SET_WAKE_WORD_DETECTION_ENABLED.ordinal(), bundle);
    }
}
