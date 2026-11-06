package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AudioTaskSchedulerListenerMessageType {
    ON_AUDIO_TASK_BACKGROUND,
    ON_AUDIO_TASK_FOREGROUND,
    ON_AUDIO_TASK_PAUSE,
    ON_AUDIO_TASK_RESUME,
    ON_AUDIO_TASK_STOP,
    REGISTER_CALLBACK,
    DEREGISTER_CALLBACK;

    public static AudioTaskSchedulerListenerMessageType fromOrdinal(int i) {
        AudioTaskSchedulerListenerMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
