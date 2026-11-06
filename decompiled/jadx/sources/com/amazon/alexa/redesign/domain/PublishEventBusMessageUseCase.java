package com.amazon.alexa.redesign.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/domain/PublishEventBusMessageUseCase;", "", "eventBus", "Lcom/amazon/alexa/eventbus/api/EventBus;", "<init>", "(Lcom/amazon/alexa/eventbus/api/EventBus;)V", "newSubscriber", "Lcom/amazon/alexa/eventbus/api/MultiFilterSubscriber;", "getNewSubscriber", "()Lcom/amazon/alexa/eventbus/api/MultiFilterSubscriber;", "publishToEventBus", "", "message", "Lcom/amazon/alexa/eventbus/api/Message;", "publishEventBusMessage", "eventType", "", "payload", "Lorg/json/JSONObject;", "unsubscribe", "it", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class PublishEventBusMessageUseCase {
    public static final int $stable = 8;

    @NotNull
    private final EventBus eventBus;

    public PublishEventBusMessageUseCase(@NotNull EventBus eventBus) {
        eventBus.getClass();
        this.eventBus = eventBus;
    }

    private final void publishToEventBus(Message message) {
        this.eventBus.publish(message);
    }

    @NotNull
    public final MultiFilterSubscriber getNewSubscriber() {
        MultiFilterSubscriber newSubscriber = this.eventBus.getNewSubscriber();
        newSubscriber.getClass();
        return newSubscriber;
    }

    public final void publishEventBusMessage(@NotNull String eventType, @NotNull JSONObject payload) {
        eventType.getClass();
        payload.getClass();
        Message build = new Message.Builder().setEventType(eventType).setPayload(payload.toString()).build();
        build.getClass();
        publishToEventBus(build);
    }

    public final void unsubscribe(@NotNull MultiFilterSubscriber it2) {
        it2.getClass();
        this.eventBus.unsubscribe(it2);
    }

    public final void publishEventBusMessage(@NotNull String eventType) {
        eventType.getClass();
        Message build = new Message.Builder().setEventType(eventType).build();
        build.getClass();
        publishToEventBus(build);
    }
}
