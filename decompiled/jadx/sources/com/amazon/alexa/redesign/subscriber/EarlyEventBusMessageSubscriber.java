package com.amazon.alexa.redesign.subscriber;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticLambda12;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.eventbus.api.Subscriber;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.redesign.presenter.EarlyEventBusMessageHandler;
import com.amazon.alexa.redesign.repository.EarlyEventBusMessageRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\tH\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/redesign/subscriber/EarlyEventBusMessageSubscriber;", "", "eventBus", "Lcom/amazon/alexa/eventbus/api/EventBus;", "earlyEventBusMessageRepository", "Lcom/amazon/alexa/redesign/repository/EarlyEventBusMessageRepository;", "<init>", "(Lcom/amazon/alexa/eventbus/api/EventBus;Lcom/amazon/alexa/redesign/repository/EarlyEventBusMessageRepository;)V", "subscriberUuid", "Lcom/amazon/alexa/eventbus/api/Subscriber$SubscriberUuid;", "messageHandler", "Lcom/amazon/alexa/redesign/presenter/EarlyEventBusMessageHandler;", "initSubscriber", "unsubscribe", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EarlyEventBusMessageSubscriber {
    public static final int $stable = 8;

    @NotNull
    private final EventBus eventBus;

    @NotNull
    private final EarlyEventBusMessageHandler messageHandler;

    @NotNull
    private Subscriber.SubscriberUuid subscriberUuid;

    public EarlyEventBusMessageSubscriber(@NotNull EventBus eventBus, @NotNull EarlyEventBusMessageRepository earlyEventBusMessageRepository) {
        eventBus.getClass();
        earlyEventBusMessageRepository.getClass();
        this.eventBus = eventBus;
        this.subscriberUuid = initSubscriber();
        this.messageHandler = new EarlyEventBusMessageHandler(earlyEventBusMessageRepository);
    }

    private final Subscriber.SubscriberUuid initSubscriber() {
        MultiFilterSubscriber newSubscriber = this.eventBus.getNewSubscriber();
        newSubscriber.subscribeFilter(new EventTypeMessageFilter("local:card:add"), new Automotive$$ExternalSyntheticLambda12(this, 23));
        Subscriber.SubscriberUuid subscriberUuid = newSubscriber.getSubscriberUuid();
        subscriberUuid.getClass();
        return subscriberUuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSubscriber$lambda$1$lambda$0(EarlyEventBusMessageSubscriber earlyEventBusMessageSubscriber, Message message) {
        message.getClass();
        earlyEventBusMessageSubscriber.messageHandler.handleMessage(message);
    }

    public final void unsubscribe() {
        this.eventBus.unsubscribe(this.subscriberUuid);
    }
}
