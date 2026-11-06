package com.amazon.comms.calling.domain.usecase.ringtone;

import android.content.Context;
import com.amazon.comms.calling.domain.repo.RingtoneRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.comms.calling.dependency.DefaultDispatcher"})
/* loaded from: classes20.dex */
public final class PlayRingToneUseCase_Factory implements Factory<PlayRingToneUseCase> {
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<RingtoneRepository> ringtoneRepositoryProvider;

    public PlayRingToneUseCase_Factory(Provider<Context> provider, Provider<RingtoneRepository> provider2, Provider<CoroutineDispatcher> provider3) {
        this.contextProvider = provider;
        this.ringtoneRepositoryProvider = provider2;
        this.dispatcherProvider = provider3;
    }

    public static PlayRingToneUseCase_Factory create(Provider<Context> provider, Provider<RingtoneRepository> provider2, Provider<CoroutineDispatcher> provider3) {
        return new PlayRingToneUseCase_Factory(provider, provider2, provider3);
    }

    public static PlayRingToneUseCase newInstance(Context context, RingtoneRepository ringtoneRepository, CoroutineDispatcher coroutineDispatcher) {
        return new PlayRingToneUseCase(context, ringtoneRepository, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    public PlayRingToneUseCase get() {
        return newInstance(this.contextProvider.get(), this.ringtoneRepositoryProvider.get(), this.dispatcherProvider.get());
    }
}
