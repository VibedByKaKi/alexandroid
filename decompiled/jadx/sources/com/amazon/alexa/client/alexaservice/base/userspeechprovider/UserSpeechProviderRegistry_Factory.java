package com.amazon.alexa.client.alexaservice.base.userspeechprovider;

import com.amazon.alexa.client.alexaservice.core.userspeechprovider.InternalUserSpeechProvider;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class UserSpeechProviderRegistry_Factory implements Factory<UserSpeechProviderRegistry> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<InternalUserSpeechProvider> internalUserSpeechProvider;

    public UserSpeechProviderRegistry_Factory(Provider<AlexaClientEventBus> provider, Provider<InternalUserSpeechProvider> provider2) {
        this.alexaClientEventBusProvider = provider;
        this.internalUserSpeechProvider = provider2;
    }

    public static UserSpeechProviderRegistry_Factory create(Provider<AlexaClientEventBus> provider, Provider<InternalUserSpeechProvider> provider2) {
        return new UserSpeechProviderRegistry_Factory(provider, provider2);
    }

    public static UserSpeechProviderRegistry newInstance(AlexaClientEventBus alexaClientEventBus, InternalUserSpeechProvider internalUserSpeechProvider) {
        return new UserSpeechProviderRegistry(alexaClientEventBus, internalUserSpeechProvider);
    }

    @Override // javax.inject.Provider
    public UserSpeechProviderRegistry get() {
        return newInstance(this.alexaClientEventBusProvider.get(), this.internalUserSpeechProvider.get());
    }
}
