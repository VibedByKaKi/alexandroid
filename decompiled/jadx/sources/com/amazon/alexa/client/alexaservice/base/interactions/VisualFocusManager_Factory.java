package com.amazon.alexa.client.alexaservice.base.interactions;

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
public final class VisualFocusManager_Factory implements Factory<VisualFocusManager> {
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public VisualFocusManager_Factory(Provider<AlexaClientEventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static VisualFocusManager_Factory create(Provider<AlexaClientEventBus> provider) {
        return new VisualFocusManager_Factory(provider);
    }

    public static VisualFocusManager newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new VisualFocusManager(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public VisualFocusManager get() {
        return newInstance(this.eventBusProvider.get());
    }
}
