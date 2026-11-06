package com.amazon.rtcsc.capabilityagent.common.core;

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
/* loaded from: classes5.dex */
public final class RtcscCapabilityAgent_Factory implements Factory<RtcscCapabilityAgent> {
    private final Provider<Context> contextProvider;
    private final Provider<RtcscCapabilityAgentEventListener> eventListenerProvider;

    public RtcscCapabilityAgent_Factory(Provider<Context> provider, Provider<RtcscCapabilityAgentEventListener> provider2) {
        this.contextProvider = provider;
        this.eventListenerProvider = provider2;
    }

    public static RtcscCapabilityAgent_Factory create(Provider<Context> provider, Provider<RtcscCapabilityAgentEventListener> provider2) {
        return new RtcscCapabilityAgent_Factory(provider, provider2);
    }

    public static RtcscCapabilityAgent newInstance(Context context, RtcscCapabilityAgentEventListener rtcscCapabilityAgentEventListener) {
        return new RtcscCapabilityAgent(context, rtcscCapabilityAgentEventListener);
    }

    @Override // javax.inject.Provider
    public RtcscCapabilityAgent get() {
        return newInstance(this.contextProvider.get(), this.eventListenerProvider.get());
    }
}
