package com.amazon.alexa.api.compat.model.assistant;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AudioPlaybackControlApiSender {
    private static final String TAG = "AudioPlaybackControlApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public AudioPlaybackControlApiSender(Messenger messenger, int i) {
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

    public void next() {
        sendMessage(AudioPlaybackControlApiMessageType.NEXT.ordinal(), null);
    }

    public void pause() {
        sendMessage(AudioPlaybackControlApiMessageType.PAUSE.ordinal(), null);
    }

    public void play() {
        sendMessage(AudioPlaybackControlApiMessageType.PLAY.ordinal(), null);
    }

    public void previous() {
        sendMessage(AudioPlaybackControlApiMessageType.PREVIOUS.ordinal(), null);
    }

    public void setMediaNotificationContentIntent(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioPlaybackControlApiArgumentType.PENDING_INTENT.name(), pendingIntent);
        sendMessage(AudioPlaybackControlApiMessageType.SET_MEDIA_NOTIFICATION_CONTENT_INTENT.ordinal(), bundle);
    }

    public void stop() {
        sendMessage(AudioPlaybackControlApiMessageType.STOP.ordinal(), null);
    }
}
