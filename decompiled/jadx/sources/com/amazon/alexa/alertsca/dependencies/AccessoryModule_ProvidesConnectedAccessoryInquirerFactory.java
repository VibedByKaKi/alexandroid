package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.accessories.protocols.ConnectedAccessoryInquirer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AccessoryModule_ProvidesConnectedAccessoryInquirerFactory implements Factory<ConnectedAccessoryInquirer> {
    private final AccessoryModule module;

    public AccessoryModule_ProvidesConnectedAccessoryInquirerFactory(AccessoryModule accessoryModule) {
        this.module = accessoryModule;
    }

    public static AccessoryModule_ProvidesConnectedAccessoryInquirerFactory create(AccessoryModule accessoryModule) {
        return new AccessoryModule_ProvidesConnectedAccessoryInquirerFactory(accessoryModule);
    }

    public static ConnectedAccessoryInquirer providesConnectedAccessoryInquirer(AccessoryModule accessoryModule) {
        return (ConnectedAccessoryInquirer) Preconditions.checkNotNullFromProvides(accessoryModule.providesConnectedAccessoryInquirer());
    }

    @Override // javax.inject.Provider
    public ConnectedAccessoryInquirer get() {
        return providesConnectedAccessoryInquirer(this.module);
    }
}
