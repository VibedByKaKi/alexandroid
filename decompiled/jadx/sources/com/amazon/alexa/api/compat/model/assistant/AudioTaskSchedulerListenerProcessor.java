package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.media3.common.util.ListenerSet$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class AudioTaskSchedulerListenerProcessor {
    private static final String TAG = "AudioTaskSchedulerListenerProcessor";
    private final Messenger messenger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.compat.model.assistant.AudioTaskSchedulerListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioTaskSchedulerListenerMessageType;

        static {
            int[] iArr = new int[AudioTaskSchedulerListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioTaskSchedulerListenerMessageType = iArr;
            try {
                iArr[AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioTaskSchedulerListenerMessageType[AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioTaskSchedulerListenerMessageType[AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioTaskSchedulerListenerMessageType[AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioTaskSchedulerListenerMessageType[AudioTaskSchedulerListenerMessageType.ON_AUDIO_TASK_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AudioTaskSchedulerListenerProcessor(Looper looper) {
        this.messenger = new Messenger(new Handler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 9)));
    }

    public Messenger getMessenger() {
        return this.messenger;
    }

    public boolean handleMessage(Message message) {
        AudioTaskSchedulerListenerMessageType fromOrdinal = AudioTaskSchedulerListenerMessageType.fromOrdinal(message.what);
        if (fromOrdinal == null) {
            ParcelCompat$$ExternalSyntheticOutline0.m7656m(TAG, message.what, new StringBuilder("Unknown message type: "));
            return false;
        }
        Bundle data = message.getData();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$assistant$AudioTaskSchedulerListenerMessageType[fromOrdinal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            Log.w(TAG, "Unhandled message type in dispatch: " + fromOrdinal);
                            return false;
                        }
                        if (data == null) {
                            Log.w(TAG, "AudioTaskSchedulerListener message has no data for onAudioTaskStop");
                            return false;
                        }
                        onAudioTaskStop(data.getString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name()));
                    } else {
                        if (data == null) {
                            Log.w(TAG, "AudioTaskSchedulerListener message has no data for onAudioTaskResume");
                            return false;
                        }
                        onAudioTaskResume(data.getString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name()));
                    }
                } else {
                    if (data == null) {
                        Log.w(TAG, "AudioTaskSchedulerListener message has no data for onAudioTaskPause");
                        return false;
                    }
                    onAudioTaskPause(data.getString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name()));
                }
            } else {
                if (data == null) {
                    Log.w(TAG, "AudioTaskSchedulerListener message has no data for onAudioTaskForeground");
                    return false;
                }
                onAudioTaskForeground(data.getString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name()));
            }
        } else {
            if (data == null) {
                Log.w(TAG, "AudioTaskSchedulerListener message has no data for onAudioTaskBackground");
                return false;
            }
            onAudioTaskBackground(data.getString(AudioTaskSchedulerListenerArgumentType.TASK_ID.name()));
        }
        return true;
    }

    public abstract void onAudioTaskBackground(String str);

    public abstract void onAudioTaskForeground(String str);

    public abstract void onAudioTaskPause(String str);

    public abstract void onAudioTaskResume(String str);

    public abstract void onAudioTaskStop(String str);
}
