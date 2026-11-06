package com.amazon.alexa.client.alexaservice.base.metrics;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class UserPerceivedLatencyPersonalityTracker_Factory implements Factory<UserPerceivedLatencyPersonalityTracker> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<DialogRequestIdentifier> dialogRequestIdentifierProvider;

    public UserPerceivedLatencyPersonalityTracker_Factory(Provider<AlexaClientEventBus> provider, Provider<DialogRequestIdentifier> provider2) {
        this.alexaClientEventBusProvider = provider;
        this.dialogRequestIdentifierProvider = provider2;
    }

    public static UserPerceivedLatencyPersonalityTracker_Factory create(Provider<AlexaClientEventBus> provider, Provider<DialogRequestIdentifier> provider2) {
        return new UserPerceivedLatencyPersonalityTracker_Factory(provider, provider2);
    }

    public static UserPerceivedLatencyPersonalityTracker newInstance(AlexaClientEventBus alexaClientEventBus, DialogRequestIdentifier dialogRequestIdentifier) {
        return new UserPerceivedLatencyPersonalityTracker(alexaClientEventBus, dialogRequestIdentifier);
    }

    @Override // javax.inject.Provider
    public UserPerceivedLatencyPersonalityTracker get() {
        return newInstance(this.alexaClientEventBusProvider.get(), this.dialogRequestIdentifierProvider.get());
    }
}
