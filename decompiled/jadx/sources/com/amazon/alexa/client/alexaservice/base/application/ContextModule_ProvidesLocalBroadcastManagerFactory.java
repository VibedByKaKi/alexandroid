package com.amazon.alexa.client.alexaservice.base.application;

import android.content.Context;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
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
/* loaded from: classes17.dex */
public final class ContextModule_ProvidesLocalBroadcastManagerFactory implements Factory<LocalBroadcastManager> {
    private final Provider<Context> applicationContextProvider;
    private final ContextModule module;

    public ContextModule_ProvidesLocalBroadcastManagerFactory(ContextModule contextModule, Provider<Context> provider) {
        this.module = contextModule;
        this.applicationContextProvider = provider;
    }

    public static ContextModule_ProvidesLocalBroadcastManagerFactory create(ContextModule contextModule, Provider<Context> provider) {
        return new ContextModule_ProvidesLocalBroadcastManagerFactory(contextModule, provider);
    }

    public static LocalBroadcastManager providesLocalBroadcastManager(ContextModule contextModule, Context context) {
        return (LocalBroadcastManager) Preconditions.checkNotNullFromProvides(contextModule.providesLocalBroadcastManager(context));
    }

    @Override // javax.inject.Provider
    public LocalBroadcastManager get() {
        return providesLocalBroadcastManager(this.module, this.applicationContextProvider.get());
    }
}
