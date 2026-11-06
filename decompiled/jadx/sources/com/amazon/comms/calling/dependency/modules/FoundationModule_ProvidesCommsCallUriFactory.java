package com.amazon.comms.calling.dependency.modules;

import com.amazon.comms.calling.foundation.CommsCallUri;
import com.amazon.comms.calling.foundation.CommsCallUriImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class FoundationModule_ProvidesCommsCallUriFactory implements Factory<CommsCallUri> {
    private final Provider<CommsCallUriImpl> commsCallUriImplProvider;
    private final FoundationModule module;

    public FoundationModule_ProvidesCommsCallUriFactory(FoundationModule foundationModule, Provider<CommsCallUriImpl> provider) {
        this.module = foundationModule;
        this.commsCallUriImplProvider = provider;
    }

    public static FoundationModule_ProvidesCommsCallUriFactory create(FoundationModule foundationModule, Provider<CommsCallUriImpl> provider) {
        return new FoundationModule_ProvidesCommsCallUriFactory(foundationModule, provider);
    }

    public static CommsCallUri providesCommsCallUri(FoundationModule foundationModule, CommsCallUriImpl commsCallUriImpl) {
        return (CommsCallUri) Preconditions.checkNotNullFromProvides(foundationModule.providesCommsCallUri(commsCallUriImpl));
    }

    @Override // javax.inject.Provider
    public CommsCallUri get() {
        return providesCommsCallUri(this.module, this.commsCallUriImplProvider.get());
    }
}
