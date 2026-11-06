package com.amazon.alexa.biloba.view.dashboard;

import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CommsHandler {
    public static final String INITIATE_CALL = "biloba::call::initiate";
    public static final String INITITATE_DROP_IN = "biloba::drop-in::initiate";
    private final Lazy<EventBus> eventBus;
    private String message;
    private String payload;

    @Inject
    public CommsHandler(Lazy<EventBus> lazy) {
        this.eventBus = lazy;
    }

    public void publish() {
        this.eventBus.get().publish(new Message.Builder().setEventType(this.message).setPayload(this.payload).build());
    }

    public CommsHandler withMessage(String str) {
        this.message = str;
        return this;
    }

    public CommsHandler withPayload(String str) {
        this.payload = str;
        return this;
    }
}
