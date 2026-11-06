package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.content.Context;
import com.amazon.alexa.client.core.device.PersistentStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class ExternalMediaPlayerModule_ProvidesPlayerInFocusStoreFactory implements Factory<PersistentStorage> {
    private final Provider<Context> contextProvider;
    private final ExternalMediaPlayerModule module;

    public ExternalMediaPlayerModule_ProvidesPlayerInFocusStoreFactory(ExternalMediaPlayerModule externalMediaPlayerModule, Provider<Context> provider) {
        this.module = externalMediaPlayerModule;
        this.contextProvider = provider;
    }

    public static ExternalMediaPlayerModule_ProvidesPlayerInFocusStoreFactory create(ExternalMediaPlayerModule externalMediaPlayerModule, Provider<Context> provider) {
        return new ExternalMediaPlayerModule_ProvidesPlayerInFocusStoreFactory(externalMediaPlayerModule, provider);
    }

    public static PersistentStorage providesPlayerInFocusStore(ExternalMediaPlayerModule externalMediaPlayerModule, Context context) {
        return (PersistentStorage) Preconditions.checkNotNullFromProvides(externalMediaPlayerModule.providesPlayerInFocusStore(context));
    }

    @Override // javax.inject.Provider
    public PersistentStorage get() {
        return providesPlayerInFocusStore(this.module, this.contextProvider.get());
    }
}
