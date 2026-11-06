package com.amazon.alexa.capabilities;

import android.content.Context;
import com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent;
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
public final class FireOsCapabilityAgentsModule_ProvidesFireOsCapabilityAgentsFactory implements Factory<Set<CapabilityAgent>> {
    private final Provider<Context> contextProvider;
    private final Provider<FireOSCapabilitiesMetricsListener> metricListenerProvider;

    public FireOsCapabilityAgentsModule_ProvidesFireOsCapabilityAgentsFactory(Provider<Context> provider, Provider<FireOSCapabilitiesMetricsListener> provider2) {
        this.contextProvider = provider;
        this.metricListenerProvider = provider2;
    }

    public static FireOsCapabilityAgentsModule_ProvidesFireOsCapabilityAgentsFactory create(Provider<Context> provider, Provider<FireOSCapabilitiesMetricsListener> provider2) {
        return new FireOsCapabilityAgentsModule_ProvidesFireOsCapabilityAgentsFactory(provider, provider2);
    }

    public static Set<CapabilityAgent> providesFireOsCapabilityAgents(Context context, FireOSCapabilitiesMetricsListener fireOSCapabilitiesMetricsListener) {
        return (Set) Preconditions.checkNotNullFromProvides(FireOsCapabilityAgentsModule.providesFireOsCapabilityAgents(context, fireOSCapabilitiesMetricsListener));
    }

    @Override // javax.inject.Provider
    public Set<CapabilityAgent> get() {
        return providesFireOsCapabilityAgents(this.contextProvider.get(), this.metricListenerProvider.get());
    }
}
