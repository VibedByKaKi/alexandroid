package com.amazon.comms.calling.dependency.modules;

import com.amazon.comms.calling.infrastructure.StringHelper;
import com.amazon.comms.calling.infrastructure.StringHelperImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class InfrastructureModule_ProvidesStringHelperFactory implements Factory<StringHelper> {
    private final InfrastructureModule module;
    private final Provider<StringHelperImpl> stringHelperImplProvider;

    public InfrastructureModule_ProvidesStringHelperFactory(InfrastructureModule infrastructureModule, Provider<StringHelperImpl> provider) {
        this.module = infrastructureModule;
        this.stringHelperImplProvider = provider;
    }

    public static InfrastructureModule_ProvidesStringHelperFactory create(InfrastructureModule infrastructureModule, Provider<StringHelperImpl> provider) {
        return new InfrastructureModule_ProvidesStringHelperFactory(infrastructureModule, provider);
    }

    public static StringHelper providesStringHelper(InfrastructureModule infrastructureModule, StringHelperImpl stringHelperImpl) {
        return (StringHelper) Preconditions.checkNotNullFromProvides(infrastructureModule.providesStringHelper(stringHelperImpl));
    }

    @Override // javax.inject.Provider
    public StringHelper get() {
        return providesStringHelper(this.module, this.stringHelperImplProvider.get());
    }
}
