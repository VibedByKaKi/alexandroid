package com.amazon.deecomms.alexa;

import android.content.Context;
import com.amazon.deecomms.core.CapabilitiesManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class MessagingControllerCapabilityAgent_MembersInjector implements MembersInjector<MessagingControllerCapabilityAgent> {
    private final Provider<CapabilitiesManager> capabilitiesManagerProvider;
    private final Provider<Context> contextProvider;

    public MessagingControllerCapabilityAgent_MembersInjector(Provider<CapabilitiesManager> provider, Provider<Context> provider2) {
        this.capabilitiesManagerProvider = provider;
        this.contextProvider = provider2;
    }

    public static MembersInjector<MessagingControllerCapabilityAgent> create(Provider<CapabilitiesManager> provider, Provider<Context> provider2) {
        return new MessagingControllerCapabilityAgent_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.deecomms.alexa.MessagingControllerCapabilityAgent.capabilitiesManager")
    public static void injectCapabilitiesManager(MessagingControllerCapabilityAgent messagingControllerCapabilityAgent, CapabilitiesManager capabilitiesManager) {
        messagingControllerCapabilityAgent.capabilitiesManager = capabilitiesManager;
    }

    @InjectedFieldSignature("com.amazon.deecomms.alexa.MessagingControllerCapabilityAgent.context")
    public static void injectContext(MessagingControllerCapabilityAgent messagingControllerCapabilityAgent, Context context) {
        messagingControllerCapabilityAgent.context = context;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MessagingControllerCapabilityAgent messagingControllerCapabilityAgent) {
        injectCapabilitiesManager(messagingControllerCapabilityAgent, this.capabilitiesManagerProvider.get());
        injectContext(messagingControllerCapabilityAgent, this.contextProvider.get());
    }
}
