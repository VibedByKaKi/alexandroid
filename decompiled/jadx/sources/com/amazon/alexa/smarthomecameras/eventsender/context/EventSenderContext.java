package com.amazon.alexa.smarthomecameras.eventsender.context;

import androidx.annotation.NonNull;
import com.amazon.alexa.api.compat.model.AlexaEvent;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import com.amazon.alexa.smarthomecameras.util.GsonHelper;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class EventSenderContext {
    public AlexaEvent buildAlexaEvent() {
        return new AlexaEvent(getAlexaHeader(), new AlexaPayload(GsonHelper.toJson(constructEventPayload())));
    }

    @NonNull
    public abstract Serializable constructEventPayload();

    @NonNull
    public abstract AlexaHeader getAlexaHeader();

    @NonNull
    public abstract String getCountMetricName();

    @NonNull
    public abstract String getEventName();
}
