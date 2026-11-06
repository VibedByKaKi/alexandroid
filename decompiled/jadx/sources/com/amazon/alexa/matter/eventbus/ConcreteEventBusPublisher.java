package com.amazon.alexa.matter.eventbus;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.matter.eventbus.schema.EventBusMessage;
import com.amazon.alexa.matter.eventbus.schema.EventType;
import com.amazon.alexa.matter.eventbus.schema.Payload;
import com.amazon.alexa.matter.eventbus.schema.Request;
import com.amazon.alexa.matter.eventbus.schema.Response;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.alexa.matter.utils.logging.PrefixLogger;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public class ConcreteEventBusPublisher implements EventBusPublisher {

    @NonNull
    private final EventBus mEventBus;

    @NonNull
    private final EventBusMessageSerializer mEventBusMessageSerializer;

    @NonNull
    private final MatterLogger mLogger;

    @Inject
    public ConcreteEventBusPublisher(@NonNull EventBus eventBus, @NonNull EventBusMessageSerializer eventBusMessageSerializer, @NonNull MatterLogger matterLogger) {
        this.mEventBus = eventBus;
        this.mEventBusMessageSerializer = eventBusMessageSerializer;
        this.mLogger = PrefixLogger.scopedTo(ConcreteEventBusPublisher.class, matterLogger);
    }

    private boolean publish(@NonNull EventBusMessage eventBusMessage) {
        try {
            this.mEventBus.lambda$getPublisher$0(new Message.Builder().setSource(Message.Source.Local).setEventType(eventBusMessage.getEventType().toValue()).setPayload(this.mEventBusMessageSerializer.serialize(eventBusMessage)).build());
            return true;
        } catch (IOException e) {
            this.mLogger.error("Failed to serialize the EventBusMessage", e);
            return false;
        }
    }

    @Override // com.amazon.alexa.matter.eventbus.EventBusPublisher
    public boolean publish(@NonNull Response response) {
        Payload payload = new Payload();
        payload.setResponse(response);
        return publish(payload);
    }

    private boolean publish(@NonNull Payload payload) {
        EventBusMessage eventBusMessage = new EventBusMessage();
        eventBusMessage.setEventType(EventType.MATTER_V1_CLIENT);
        eventBusMessage.setPayload(payload);
        return publish(eventBusMessage);
    }

    @Override // com.amazon.alexa.matter.eventbus.EventBusPublisher
    public boolean publish(@NonNull Request request) {
        Payload payload = new Payload();
        payload.setRequest(request);
        return publish(payload);
    }
}
