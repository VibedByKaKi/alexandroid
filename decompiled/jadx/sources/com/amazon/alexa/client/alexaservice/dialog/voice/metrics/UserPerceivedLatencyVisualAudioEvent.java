package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UserPerceivedLatencyVisualAudioEvent extends Event.NotGated {
    public static UserPerceivedLatencyVisualAudioEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2, boolean z) {
        return new AutoValue_UserPerceivedLatencyVisualAudioEvent(str, dialogRequestIdentifier, j, j2, z);
    }

    public abstract long getDeviceProcessingLatencyMillis();

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract String getInvocationType();

    public abstract long getUserPerceivedLatencyMillis();

    public abstract boolean isUsingLegacyAlgorithm();

    public static UserPerceivedLatencyVisualAudioEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, long j, long j2) {
        return create(str, dialogRequestIdentifier, j, j2, false);
    }
}
