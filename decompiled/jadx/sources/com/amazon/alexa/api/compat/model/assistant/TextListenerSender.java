package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class TextListenerSender {
    private static final String TAG = "TextListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public TextListenerSender(Messenger messenger, int i) {
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

    public boolean onExpectTextReceived() {
        return sendMessage(TextListenerMessageType.ON_EXPECT_TEXT_RECEIVED.ordinal(), null);
    }

    public boolean onReceivedCaption(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(TextListenerArgumentType.CAPTION_BUNDLE.name(), bundle);
        return sendMessage(TextListenerMessageType.ON_RECEIVED_CAPTION.ordinal(), bundle2);
    }

    public boolean onReceivedPlaybackSyncedCaption(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(TextListenerArgumentType.CAPTION_BUNDLE.name(), bundle);
        return sendMessage(TextListenerMessageType.ON_RECEIVED_PLAYBACK_SYNCED_CAPTION.ordinal(), bundle2);
    }

    public boolean onTextReceived(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(TextListenerArgumentType.TEXT_RESPONSE_BUNDLE.name(), bundle);
        return sendMessage(TextListenerMessageType.ON_TEXT_RECEIVED.ordinal(), bundle2);
    }
}
