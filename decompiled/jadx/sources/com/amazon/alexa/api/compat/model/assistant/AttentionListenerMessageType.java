package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AttentionListenerMessageType {
    ON_ATTENTION_STATE_CHANGED,
    ON_INPUT_SOUND_LEVEL_CHANGED,
    REGISTER_CALLBACK,
    DEREGISTER_CALLBACK;

    public static AttentionListenerMessageType fromOrdinal(int i) {
        AttentionListenerMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
