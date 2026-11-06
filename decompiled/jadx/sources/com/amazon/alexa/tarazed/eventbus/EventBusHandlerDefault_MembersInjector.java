package com.amazon.alexa.tarazed.eventbus;

import dagger.MembersInjector;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class EventBusHandlerDefault_MembersInjector implements MembersInjector<EventBusHandlerDefault> {
    private final Provider<CoroutineScope> tarazedScopeProvider;

    public EventBusHandlerDefault_MembersInjector(Provider<CoroutineScope> provider) {
        this.tarazedScopeProvider = provider;
    }

    public static MembersInjector<EventBusHandlerDefault> create(Provider<CoroutineScope> provider) {
        return new EventBusHandlerDefault_MembersInjector(provider);
    }

    public static void injectTarazedScope(EventBusHandlerDefault eventBusHandlerDefault, CoroutineScope coroutineScope) {
        eventBusHandlerDefault.tarazedScope = coroutineScope;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EventBusHandlerDefault eventBusHandlerDefault) {
        injectTarazedScope(eventBusHandlerDefault, this.tarazedScopeProvider.get());
    }
}
