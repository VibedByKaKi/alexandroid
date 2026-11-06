package com.amazon.alexa.seamlessswitching.capability.model.event;

import androidx.annotation.Nullable;
import com.amazon.alexa.seamlessswitching.capability.model.AlexaDevice;
import com.amazon.alexa.seamlessswitching.capability.model.PairedDevice;
import com.amazon.alexa.seamlessswitching.capability.model.Requester;
import com.amazon.alexa.seamlessswitching.capability.model.event.AutoValue_ConnectDeviceFailedEvent;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class ConnectDeviceFailedEvent {
    public static ConnectDeviceFailedEvent create(AlexaDevice alexaDevice, PairedDevice pairedDevice, Requester requester, Integer num) {
        return new AutoValue_ConnectDeviceFailedEvent(alexaDevice, pairedDevice, requester, num);
    }

    public static TypeAdapter<ConnectDeviceFailedEvent> typeAdapter(Gson gson) {
        return new AutoValue_ConnectDeviceFailedEvent.GsonTypeAdapter(gson);
    }

    public abstract AlexaDevice getAlexaDevice();

    @Nullable
    public abstract Integer getErrorCode();

    public abstract PairedDevice getPairedDevice();

    public abstract Requester getRequester();
}
