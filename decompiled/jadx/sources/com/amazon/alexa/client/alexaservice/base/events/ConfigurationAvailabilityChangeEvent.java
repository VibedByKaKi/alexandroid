package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.api.AlexaConfigurationName;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ConfigurationAvailabilityChangeEvent extends Event.NotGated {
    public static ConfigurationAvailabilityChangeEvent create(AlexaConfigurationName alexaConfigurationName, boolean z) {
        return new AutoValue_ConfigurationAvailabilityChangeEvent(alexaConfigurationName, z);
    }

    public abstract AlexaConfigurationName getAlexaConfigurationName();

    public abstract boolean isAvailable();
}
