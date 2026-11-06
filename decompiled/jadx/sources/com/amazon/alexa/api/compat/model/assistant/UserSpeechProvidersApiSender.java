package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class UserSpeechProvidersApiSender {
    private static final String TAG = "UserSpeechProvidersApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public UserSpeechProvidersApiSender(Messenger messenger, int i) {
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

    public void deregister(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProvidersApiArgumentType.PROVIDER_ID.name(), str);
        sendMessage(UserSpeechProvidersApiMessageType.DEREGISTER.ordinal(), bundle);
    }

    public void register(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProvidersApiArgumentType.PROVIDER_BUNDLE.name(), bundle);
        sendMessage(UserSpeechProvidersApiMessageType.REGISTER.ordinal(), bundle2);
    }

    public void requestDialog(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProvidersApiArgumentType.REQUEST_BUNDLE.name(), bundle);
        sendMessage(UserSpeechProvidersApiMessageType.REQUEST_DIALOG.ordinal(), bundle2);
    }

    public void reservationAgreed(String str, long j) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProvidersApiArgumentType.RESERVATION_ID.name(), str);
        bundle.putLong(UserSpeechProvidersApiArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name(), j);
        sendMessage(UserSpeechProvidersApiMessageType.RESERVATION_AGREED.ordinal(), bundle);
    }

    public void reservationDisputed(String str, long j) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProvidersApiArgumentType.RESERVATION_ID.name(), str);
        bundle.putLong(UserSpeechProvidersApiArgumentType.DECISION_TIMESTAMP_EPOCH_MS.name(), j);
        sendMessage(UserSpeechProvidersApiMessageType.RESERVATION_DISPUTED.ordinal(), bundle);
    }

    public void reserveResponse(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProvidersApiArgumentType.RESERVE_REQUEST_BUNDLE.name(), bundle);
        sendMessage(UserSpeechProvidersApiMessageType.RESERVE_RESPONSE.ordinal(), bundle2);
    }

    public void reservedResponseStarted(String str, long j) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProvidersApiArgumentType.COORDINATOR_ID.name(), str);
        bundle.putLong(UserSpeechProvidersApiArgumentType.START_TIMESTAMP_EPOCH_MS.name(), j);
        sendMessage(UserSpeechProvidersApiMessageType.RESERVED_RESPONSE_STARTED.ordinal(), bundle);
    }

    public void turnAbandoned(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(UserSpeechProvidersApiArgumentType.TURN_ID.name(), str);
        sendMessage(UserSpeechProvidersApiMessageType.TURN_ABANDONED.ordinal(), bundle);
    }

    public void turnStarted(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(UserSpeechProvidersApiArgumentType.STARTED_BUNDLE.name(), bundle);
        sendMessage(UserSpeechProvidersApiMessageType.TURN_STARTED.ordinal(), bundle2);
    }
}
