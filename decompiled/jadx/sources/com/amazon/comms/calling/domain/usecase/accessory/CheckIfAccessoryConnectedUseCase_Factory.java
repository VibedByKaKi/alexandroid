package com.amazon.comms.calling.domain.usecase.accessory;

import com.amazon.comms.calling.infrastructure.AccessoriesProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CheckIfAccessoryConnectedUseCase_Factory implements Factory<CheckIfAccessoryConnectedUseCase> {
    private final Provider<AccessoriesProvider> accessoriesProvider;

    public CheckIfAccessoryConnectedUseCase_Factory(Provider<AccessoriesProvider> provider) {
        this.accessoriesProvider = provider;
    }

    public static CheckIfAccessoryConnectedUseCase_Factory create(Provider<AccessoriesProvider> provider) {
        return new CheckIfAccessoryConnectedUseCase_Factory(provider);
    }

    public static CheckIfAccessoryConnectedUseCase newInstance(AccessoriesProvider accessoriesProvider) {
        return new CheckIfAccessoryConnectedUseCase(accessoriesProvider);
    }

    @Override // javax.inject.Provider
    public CheckIfAccessoryConnectedUseCase get() {
        return newInstance(this.accessoriesProvider.get());
    }
}
