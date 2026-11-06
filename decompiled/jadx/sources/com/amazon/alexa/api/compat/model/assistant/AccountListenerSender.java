package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AccountListenerSender {
    private static final String TAG = "AccountListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public AccountListenerSender(Messenger messenger, int i) {
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

    public boolean onProfileUpdated(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(AccountListenerArgumentType.PERSON_ID.name(), str);
        bundle.putString(AccountListenerArgumentType.FIRST_NAME.name(), str2);
        bundle.putBoolean(AccountListenerArgumentType.IS_CHILD_PROFILE.name(), z);
        return sendMessage(AccountListenerMessageType.ON_PROFILE_UPDATED.ordinal(), bundle);
    }
}
