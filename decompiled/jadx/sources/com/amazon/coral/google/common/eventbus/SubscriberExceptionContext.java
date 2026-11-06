package com.amazon.coral.google.common.eventbus;

import com.amazon.coral.google.common.base.Preconditions;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public class SubscriberExceptionContext {
    private final Object event;
    private final EventBus eventBus;
    private final Object subscriber;
    private final Method subscriberMethod;

    public SubscriberExceptionContext(EventBus eventBus, Object obj, Object obj2, Method method) {
        this.eventBus = (EventBus) Preconditions.checkNotNull(eventBus);
        this.event = Preconditions.checkNotNull(obj);
        this.subscriber = Preconditions.checkNotNull(obj2);
        this.subscriberMethod = (Method) Preconditions.checkNotNull(method);
    }

    public Object getEvent() {
        return this.event;
    }

    public EventBus getEventBus() {
        return this.eventBus;
    }

    public Object getSubscriber() {
        return this.subscriber;
    }

    public Method getSubscriberMethod() {
        return this.subscriberMethod;
    }
}
