package com.amazon.alexa.matter.eventbus;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.Converter;
import com.amazon.alexa.matter.eventbus.schema.EventBusMessage;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public final class EventBusMessageJsonSerializer implements EventBusMessageSerializer {
    @Inject
    public EventBusMessageJsonSerializer() {
    }

    @Override // com.amazon.alexa.matter.eventbus.EventBusMessageSerializer
    @NonNull
    public String serialize(@NonNull EventBusMessage eventBusMessage) throws IOException {
        return Converter.toJsonString(eventBusMessage);
    }
}
