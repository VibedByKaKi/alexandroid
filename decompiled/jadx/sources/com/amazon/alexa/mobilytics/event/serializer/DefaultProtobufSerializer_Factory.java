package com.amazon.alexa.mobilytics.event.serializer;

import com.amazon.alexa.mobilytics.event.serializer.protobufhandlers.ProtobufHandler;
import dagger.internal.Factory;
import java.util.List;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DefaultProtobufSerializer_Factory implements Factory<DefaultProtobufSerializer> {
    private final Provider<List<ProtobufHandler>> handlersProvider;

    public DefaultProtobufSerializer_Factory(Provider<List<ProtobufHandler>> provider) {
        this.handlersProvider = provider;
    }

    public static DefaultProtobufSerializer_Factory create(Provider<List<ProtobufHandler>> provider) {
        return new DefaultProtobufSerializer_Factory(provider);
    }

    public static DefaultProtobufSerializer newInstance(List<ProtobufHandler> list) {
        return new DefaultProtobufSerializer(list);
    }

    @Override // javax.inject.Provider
    public DefaultProtobufSerializer get() {
        return newInstance(this.handlersProvider.get());
    }
}
