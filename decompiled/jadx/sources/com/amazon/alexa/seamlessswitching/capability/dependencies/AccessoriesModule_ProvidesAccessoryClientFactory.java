package com.amazon.alexa.seamlessswitching.capability.dependencies;

import android.content.Context;
import com.amazon.alexa.accessoryclient.client.AlexaAccessoryClient;
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
/* loaded from: classes19.dex */
public final class AccessoriesModule_ProvidesAccessoryClientFactory implements Factory<AlexaAccessoryClient> {
    private final Provider<Context> contextProvider;
    private final AccessoriesModule module;

    public AccessoriesModule_ProvidesAccessoryClientFactory(AccessoriesModule accessoriesModule, Provider<Context> provider) {
        this.module = accessoriesModule;
        this.contextProvider = provider;
    }

    public static AccessoriesModule_ProvidesAccessoryClientFactory create(AccessoriesModule accessoriesModule, Provider<Context> provider) {
        return new AccessoriesModule_ProvidesAccessoryClientFactory(accessoriesModule, provider);
    }

    public static AlexaAccessoryClient providesAccessoryClient(AccessoriesModule accessoriesModule, Context context) {
        return (AlexaAccessoryClient) Preconditions.checkNotNullFromProvides(accessoriesModule.providesAccessoryClient(context));
    }

    @Override // javax.inject.Provider
    public AlexaAccessoryClient get() {
        return providesAccessoryClient(this.module, this.contextProvider.get());
    }
}
