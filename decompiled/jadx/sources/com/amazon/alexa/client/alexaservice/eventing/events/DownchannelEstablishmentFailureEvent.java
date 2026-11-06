package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DownchannelEstablishmentFailureEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DownchannelEstablishmentFailureType {
        IO_EXCEPTION,
        AVS_FAILURE,
        NO_NETWORK,
        AUTHORIZATION
    }

    public static DownchannelEstablishmentFailureEvent create(DownchannelEstablishmentFailureType downchannelEstablishmentFailureType) {
        return new AutoValue_DownchannelEstablishmentFailureEvent(downchannelEstablishmentFailureType, null, null);
    }

    public abstract DownchannelEstablishmentFailureType getDownchannelEstablishmentFailureType();

    @Nullable
    public abstract Exception getReason();

    @Nullable
    public abstract Integer getResponseCode();

    public static DownchannelEstablishmentFailureEvent create(DownchannelEstablishmentFailureType downchannelEstablishmentFailureType, Exception exc) {
        return new AutoValue_DownchannelEstablishmentFailureEvent(downchannelEstablishmentFailureType, exc, null);
    }

    public static DownchannelEstablishmentFailureEvent create(DownchannelEstablishmentFailureType downchannelEstablishmentFailureType, Integer num) {
        return new AutoValue_DownchannelEstablishmentFailureEvent(downchannelEstablishmentFailureType, null, num);
    }
}
