package com.amazon.deecomms.core;

import com.amazon.deecomms.calling.telecom.audiomanagement.TelecomCallAudioRouteObservable;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomModule_ProvidesTelecomCallAudioRouteObservableFactory implements Factory<TelecomCallAudioRouteObservable> {
    private final TelecomModule module;

    public TelecomModule_ProvidesTelecomCallAudioRouteObservableFactory(TelecomModule telecomModule) {
        this.module = telecomModule;
    }

    public static TelecomModule_ProvidesTelecomCallAudioRouteObservableFactory create(TelecomModule telecomModule) {
        return new TelecomModule_ProvidesTelecomCallAudioRouteObservableFactory(telecomModule);
    }

    public static TelecomCallAudioRouteObservable providesTelecomCallAudioRouteObservable(TelecomModule telecomModule) {
        return (TelecomCallAudioRouteObservable) Preconditions.checkNotNullFromProvides(telecomModule.providesTelecomCallAudioRouteObservable());
    }

    @Override // javax.inject.Provider
    public TelecomCallAudioRouteObservable get() {
        return providesTelecomCallAudioRouteObservable(this.module);
    }
}
