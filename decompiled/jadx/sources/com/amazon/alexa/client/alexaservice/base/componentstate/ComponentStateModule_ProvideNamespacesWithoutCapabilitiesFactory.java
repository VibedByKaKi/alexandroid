package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.core.messages.Namespace;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class ComponentStateModule_ProvideNamespacesWithoutCapabilitiesFactory implements Factory<Set<Namespace>> {
    private final ComponentStateModule module;

    public ComponentStateModule_ProvideNamespacesWithoutCapabilitiesFactory(ComponentStateModule componentStateModule) {
        this.module = componentStateModule;
    }

    public static ComponentStateModule_ProvideNamespacesWithoutCapabilitiesFactory create(ComponentStateModule componentStateModule) {
        return new ComponentStateModule_ProvideNamespacesWithoutCapabilitiesFactory(componentStateModule);
    }

    public static Set<Namespace> provideNamespacesWithoutCapabilities(ComponentStateModule componentStateModule) {
        return (Set) Preconditions.checkNotNullFromProvides(componentStateModule.provideNamespacesWithoutCapabilities());
    }

    @Override // javax.inject.Provider
    public Set<Namespace> get() {
        return provideNamespacesWithoutCapabilities(this.module);
    }
}
