package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AudioTaskSchedulerApiMessageType {
    SCHEDULE_AUDIO_TASK,
    UNSCHEDULE_AUDIO_TASK;

    public static AudioTaskSchedulerApiMessageType fromOrdinal(int i) {
        AudioTaskSchedulerApiMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
