package com.amazon.alexa.client.alexaservice.features.bmclentitlement;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.core.device.PersistentStorage;
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
public final class BMCLEntitlementAuthority_Factory implements Factory<BMCLEntitlementAuthority> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<PersistentStorage> storageProvider;

    public BMCLEntitlementAuthority_Factory(Provider<AlexaClientEventBus> provider, Provider<PersistentStorage> provider2) {
        this.alexaClientEventBusProvider = provider;
        this.storageProvider = provider2;
    }

    public static BMCLEntitlementAuthority_Factory create(Provider<AlexaClientEventBus> provider, Provider<PersistentStorage> provider2) {
        return new BMCLEntitlementAuthority_Factory(provider, provider2);
    }

    public static BMCLEntitlementAuthority newInstance(AlexaClientEventBus alexaClientEventBus, PersistentStorage persistentStorage) {
        return new BMCLEntitlementAuthority(alexaClientEventBus, persistentStorage);
    }

    @Override // javax.inject.Provider
    public BMCLEntitlementAuthority get() {
        return newInstance(this.alexaClientEventBusProvider.get(), this.storageProvider.get());
    }
}
