package com.amazon.alexa.capabilities;

import android.content.Context;
import com.amazon.alexa.client.core.componentstate.ComponentStateProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class FireOsCapabilityAgentsModule_ProvidesFireOsComponentStateProvidersFactory implements Factory<Set<ComponentStateProvider>> {
    private final Provider<Context> contextProvider;

    public FireOsCapabilityAgentsModule_ProvidesFireOsComponentStateProvidersFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static FireOsCapabilityAgentsModule_ProvidesFireOsComponentStateProvidersFactory create(Provider<Context> provider) {
        return new FireOsCapabilityAgentsModule_ProvidesFireOsComponentStateProvidersFactory(provider);
    }

    public static Set<ComponentStateProvider> providesFireOsComponentStateProviders(Context context) {
        return (Set) Preconditions.checkNotNullFromProvides(FireOsCapabilityAgentsModule.providesFireOsComponentStateProviders(context));
    }

    @Override // javax.inject.Provider
    public Set<ComponentStateProvider> get() {
        return providesFireOsComponentStateProviders(this.contextProvider.get());
    }
}
