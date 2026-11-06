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
public final class AgentSpaceGreetingComposer_Factory implements Factory<AgentSpaceGreetingComposer> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AgentSpaceGreetingComposer_Factory INSTANCE = new AgentSpaceGreetingComposer_Factory();

        private InstanceHolder() {
        }
    }

    public static AgentSpaceGreetingComposer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AgentSpaceGreetingComposer newInstance() {
        return new AgentSpaceGreetingComposer();
    }

    @Override // javax.inject.Provider
    public AgentSpaceGreetingComposer get() {
        return newInstance();
    }
}
