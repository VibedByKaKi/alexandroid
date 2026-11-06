package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class MediaPlaybackListenerSender {
    private static final String TAG = "MediaPlaybackListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public MediaPlaybackListenerSender(Messenger messenger, int i) {
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

    public boolean onMediaMetadata(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(MediaPlaybackListenerArgumentType.METADATA_BUNDLE.name(), bundle);
        return sendMessage(MediaPlaybackListenerMessageType.ON_MEDIA_METADATA.ordinal(), bundle2);
    }

    public boolean onStarted() {
        return sendMessage(MediaPlaybackListenerMessageType.ON_STARTED.ordinal(), null);
    }

    public boolean onStopped() {
        return sendMessage(MediaPlaybackListenerMessageType.ON_STOPPED.ordinal(), null);
    }
}
