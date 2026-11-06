package com.amazon.alexa.client.alexaservice.base.interactions.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AudioFocusRequestFailedMetricEvent extends Event.NotGated {
    public static AudioFocusRequestFailedMetricEvent create(String str, String str2, int i, int i2, String str3, String str4, String str5) {
        return new AutoValue_AudioFocusRequestFailedMetricEvent(str, str2, i, i2, str3, str4, str5);
    }

    public abstract String getAction();

    public abstract int getAudioMode();

    public abstract String getDialogRequestId();

    public abstract int getFocusResultCode();

    public abstract String getInitiator();

    public abstract String getInteractionLabel();

    public abstract String getInvocationType();
}
