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
public final class SharedPreferencesAgentSpaceGreetingRotationManager_Factory implements Factory<SharedPreferencesAgentSpaceGreetingRotationManager> {
    private final Provider<Context> contextProvider;

    public SharedPreferencesAgentSpaceGreetingRotationManager_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static SharedPreferencesAgentSpaceGreetingRotationManager_Factory create(Provider<Context> provider) {
        return new SharedPreferencesAgentSpaceGreetingRotationManager_Factory(provider);
    }

    public static SharedPreferencesAgentSpaceGreetingRotationManager newInstance(Context context) {
        return new SharedPreferencesAgentSpaceGreetingRotationManager(context);
    }

    @Override // javax.inject.Provider
    public SharedPreferencesAgentSpaceGreetingRotationManager get() {
        return newInstance(this.contextProvider.get());
    }
}
