package com.dee.app.contactsLibrary.db.reduxpersist.contacts;

import com.dee.app.contactsLibrary.db.reduxpersist.RequestResponseEventBus;
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
public final class QueryContactAttributesDBHandler_Factory implements Factory<QueryContactAttributesDBHandler> {
    private final Provider<RequestResponseEventBus> eventBusProvider;

    public QueryContactAttributesDBHandler_Factory(Provider<RequestResponseEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static QueryContactAttributesDBHandler_Factory create(Provider<RequestResponseEventBus> provider) {
        return new QueryContactAttributesDBHandler_Factory(provider);
    }

    public static QueryContactAttributesDBHandler newInstance(RequestResponseEventBus requestResponseEventBus) {
        return new QueryContactAttributesDBHandler(requestResponseEventBus);
    }

    @Override // javax.inject.Provider
    public QueryContactAttributesDBHandler get() {
        return newInstance(this.eventBusProvider.get());
    }
}
