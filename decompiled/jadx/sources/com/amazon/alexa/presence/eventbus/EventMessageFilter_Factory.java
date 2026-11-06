package com.amazon.alexa.presence.eventbus;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class EventMessageFilter_Factory implements Factory<EventMessageFilter> {
    private final Provider<String> matchStringProvider;

    public EventMessageFilter_Factory(Provider<String> provider) {
        this.matchStringProvider = provider;
    }

    public static EventMessageFilter_Factory create(Provider<String> provider) {
        return new EventMessageFilter_Factory(provider);
    }

    public static EventMessageFilter newInstance(String str) {
        return new EventMessageFilter(str);
    }

    @Override // javax.inject.Provider
    public EventMessageFilter get() {
        return newInstance(this.matchStringProvider.get());
    }
}
