package com.amazon.alexa.seamlessswitching.capability.model.event;

import com.amazon.alexa.seamlessswitching.capability.model.AlexaDevice;
import com.amazon.alexa.seamlessswitching.capability.model.PairedDevice;
import com.amazon.alexa.seamlessswitching.capability.model.Requester;
import com.amazon.alexa.seamlessswitching.capability.model.event.AutoValue_ConnectDeviceSucceededEvent;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class ConnectDeviceSucceededEvent {
    public static ConnectDeviceSucceededEvent create(AlexaDevice alexaDevice, PairedDevice pairedDevice, Requester requester) {
        return new AutoValue_ConnectDeviceSucceededEvent(alexaDevice, pairedDevice, requester);
    }

    public static TypeAdapter<ConnectDeviceSucceededEvent> typeAdapter(Gson gson) {
        return new AutoValue_ConnectDeviceSucceededEvent.GsonTypeAdapter(gson);
    }

    public abstract AlexaDevice getAlexaDevice();

    public abstract PairedDevice getPairedDevice();

    public abstract Requester getRequester();
}
