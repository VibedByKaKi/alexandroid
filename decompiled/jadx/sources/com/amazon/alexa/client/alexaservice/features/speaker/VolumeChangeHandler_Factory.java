package com.amazon.alexa.client.alexaservice.features.speaker;

import android.content.Context;
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
public final class VolumeChangeHandler_Factory implements Factory<VolumeChangeHandler> {
    private final Provider<Context> contextProvider;
    private final Provider<VolumeUpdateScheduler> volumeUpdateSchedulerProvider;

    public VolumeChangeHandler_Factory(Provider<Context> provider, Provider<VolumeUpdateScheduler> provider2) {
        this.contextProvider = provider;
        this.volumeUpdateSchedulerProvider = provider2;
    }

    public static VolumeChangeHandler_Factory create(Provider<Context> provider, Provider<VolumeUpdateScheduler> provider2) {
        return new VolumeChangeHandler_Factory(provider, provider2);
    }

    public static VolumeChangeHandler newInstance(Context context, Object obj) {
        return new VolumeChangeHandler(context, (VolumeUpdateScheduler) obj);
    }

    @Override // javax.inject.Provider
    public VolumeChangeHandler get() {
        return newInstance(this.contextProvider.get(), this.volumeUpdateSchedulerProvider.get());
    }
}
