package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DownchannelPingFailedEvent extends Event {
    public static DownchannelPingFailedEvent create(DownchannelIdentifier downchannelIdentifier) {
        return new AutoValue_DownchannelPingFailedEvent(downchannelIdentifier);
    }

    public abstract DownchannelIdentifier getDownchannelIdentifier();

    @Override // com.amazon.alexa.client.alexaservice.eventing.Event
    @Nullable
    public Feature getGatingFeature() {
        return Feature.ALEXA_VOICE_ANDROID_DOWNCHANNEL_PING_FAILURE_RECONNECT;
    }
}
