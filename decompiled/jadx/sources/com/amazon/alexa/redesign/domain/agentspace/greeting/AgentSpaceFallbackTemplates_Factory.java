package com.amazon.alexa.redesign.domain.agentspace.greeting;

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
/* loaded from: classes19.dex */
public final class AgentSpaceFallbackTemplates_Factory implements Factory<AgentSpaceFallbackTemplates> {
    private final Provider<Context> contextProvider;

    public AgentSpaceFallbackTemplates_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static AgentSpaceFallbackTemplates_Factory create(Provider<Context> provider) {
        return new AgentSpaceFallbackTemplates_Factory(provider);
    }

    public static AgentSpaceFallbackTemplates newInstance(Context context) {
        return new AgentSpaceFallbackTemplates(context);
    }

    @Override // javax.inject.Provider
    public AgentSpaceFallbackTemplates get() {
        return newInstance(this.contextProvider.get());
    }
}
