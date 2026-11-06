package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.EventBusRepository;
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
public final class StartEventBusUseCase_Factory implements Factory<StartEventBusUseCase> {
    private final Provider<EventBusRepository> eventBusRepositoryProvider;

    public StartEventBusUseCase_Factory(Provider<EventBusRepository> provider) {
        this.eventBusRepositoryProvider = provider;
    }

    public static StartEventBusUseCase_Factory create(Provider<EventBusRepository> provider) {
        return new StartEventBusUseCase_Factory(provider);
    }

    public static StartEventBusUseCase newInstance(EventBusRepository eventBusRepository) {
        return new StartEventBusUseCase(eventBusRepository);
    }

    @Override // javax.inject.Provider
    public StartEventBusUseCase get() {
        return newInstance(this.eventBusRepositoryProvider.get());
    }
}
