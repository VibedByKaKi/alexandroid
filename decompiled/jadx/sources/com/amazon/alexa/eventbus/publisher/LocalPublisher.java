package com.amazon.alexa.eventbus.publisher;

import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.Publisher;
import com.amazon.alexa.eventbus.core.Dispatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LocalPublisher implements Publisher {

    @NonNull
    private final Dispatcher dispatcher;

    public LocalPublisher(@NonNull Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override // com.amazon.alexa.eventbus.api.Publisher
    public void publish(@NonNull Message message) {
        this.dispatcher.dispatch(message);
    }
}
