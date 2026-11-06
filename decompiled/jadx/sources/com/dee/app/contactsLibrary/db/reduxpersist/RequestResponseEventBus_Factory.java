package com.dee.app.contactsLibrary.db.reduxpersist;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class RequestResponseEventBus_Factory implements Factory<RequestResponseEventBus> {
    private final Provider<EventBus> eventBusProvider;

    public RequestResponseEventBus_Factory(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static RequestResponseEventBus_Factory create(Provider<EventBus> provider) {
        return new RequestResponseEventBus_Factory(provider);
    }

    public static RequestResponseEventBus newInstance(EventBus eventBus) {
        return new RequestResponseEventBus(eventBus);
    }

    @Override // javax.inject.Provider
    public RequestResponseEventBus get() {
        return newInstance(this.eventBusProvider.get());
    }
}
