package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PromptPlayerEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PromptType {
        NOT_CONNECTED,
        ALEXA_DOWN,
        LOST_CONNECTION,
        NETWORK_LOW_BANDWIDTH,
        NETWORK_TRANSITION_AUTO,
        NETWORK_TRANSITION_NON_AUTO,
        CONNECTIVITY_ISSUE_AUTO,
        CONNECTIVITY_ISSUE_NON_AUTO
    }

    public static PromptPlayerEvent create(PromptType promptType) {
        return new AutoValue_PromptPlayerEvent(promptType);
    }

    public abstract PromptType getPromptType();
}
