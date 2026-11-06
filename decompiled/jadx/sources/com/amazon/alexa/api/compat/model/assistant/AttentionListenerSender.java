package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AttentionListenerSender {
    private static final String TAG = "AttentionListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public AttentionListenerSender(Messenger messenger, int i) {
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

    public boolean onAttentionStateChanged(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(AttentionListenerArgumentType.STATE.name(), str);
        bundle.putString(AttentionListenerArgumentType.WAKEWORD.name(), str2);
        return sendMessage(AttentionListenerMessageType.ON_ATTENTION_STATE_CHANGED.ordinal(), bundle);
    }

    public boolean onInputSoundLevelChanged(double d) {
        Bundle bundle = new Bundle();
        bundle.putDouble(AttentionListenerArgumentType.LEVEL.name(), d);
        return sendMessage(AttentionListenerMessageType.ON_INPUT_SOUND_LEVEL_CHANGED.ordinal(), bundle);
    }
}
