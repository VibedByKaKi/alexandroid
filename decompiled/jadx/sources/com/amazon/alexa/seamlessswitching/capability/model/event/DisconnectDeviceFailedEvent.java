package com.amazon.alexa.seamlessswitching.capability.model.event;

import androidx.annotation.Nullable;
import com.amazon.alexa.seamlessswitching.capability.model.AlexaDevice;
import com.amazon.alexa.seamlessswitching.capability.model.PairedDevice;
import com.amazon.alexa.seamlessswitching.capability.model.Requester;
import com.amazon.alexa.seamlessswitching.capability.model.event.AutoValue_DisconnectDeviceFailedEvent;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class DisconnectDeviceFailedEvent {
    public static DisconnectDeviceFailedEvent create(AlexaDevice alexaDevice, PairedDevice pairedDevice, Requester requester, Integer num) {
        return new AutoValue_DisconnectDeviceFailedEvent(alexaDevice, pairedDevice, requester, num);
    }

    public static TypeAdapter<DisconnectDeviceFailedEvent> typeAdapter(Gson gson) {
        return new AutoValue_DisconnectDeviceFailedEvent.GsonTypeAdapter(gson);
    }

    public abstract AlexaDevice getAlexaDevice();

    @Nullable
    public abstract Integer getErrorCode();

    public abstract PairedDevice getPairedDevice();

    public abstract Requester getRequester();
}
