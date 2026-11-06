package com.amazon.alexa.redesign.domain.agentspace.greeting;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class DefaultAgentSpaceGreetingSelector_Factory implements Factory<DefaultAgentSpaceGreetingSelector> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final DefaultAgentSpaceGreetingSelector_Factory INSTANCE = new DefaultAgentSpaceGreetingSelector_Factory();

        private InstanceHolder() {
        }
    }

    public static DefaultAgentSpaceGreetingSelector_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultAgentSpaceGreetingSelector newInstance() {
        return new DefaultAgentSpaceGreetingSelector();
    }

    @Override // javax.inject.Provider
    public DefaultAgentSpaceGreetingSelector get() {
        return newInstance();
    }
}
