package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AudioTaskSchedulerListenerSender {
    private static final String TAG = "AudioTaskSchedulerListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public AudioTaskSchedulerListenerSender(Messenger messenger, int i) {
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

    public boolean onAudioTaskBackground(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name(), str);
        return sendMessage(AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_BACKGROUND.ordinal(), bundle);
    }

    public boolean onAudioTaskForeground(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name(), str);
        return sendMessage(AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_FOREGROUND.ordinal(), bundle);
    }

    public boolean onAudioTaskPause(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name(), str);
        return sendMessage(AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_PAUSE.ordinal(), bundle);
    }

    public boolean onAudioTaskResume(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name(), str);
        return sendMessage(AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_RESUME.ordinal(), bundle);
    }

    public boolean onAudioTaskStop(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name(), str);
        return sendMessage(AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_STOP.ordinal(), bundle);
    }
}
