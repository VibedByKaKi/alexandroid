package com.amazon.deecomms.calling.ui.ep;

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
public final class OutgoingEnhancedProcessingVideoCallFragment_MembersInjector implements MembersInjector<OutgoingEnhancedProcessingVideoCallFragment> {
    private final Provider<CapabilitiesManager> capabilitiesManagerProvider;

    public OutgoingEnhancedProcessingVideoCallFragment_MembersInjector(Provider<CapabilitiesManager> provider) {
        this.capabilitiesManagerProvider = provider;
    }

    public static MembersInjector<OutgoingEnhancedProcessingVideoCallFragment> create(Provider<CapabilitiesManager> provider) {
        return new OutgoingEnhancedProcessingVideoCallFragment_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.ui.ep.OutgoingEnhancedProcessingVideoCallFragment.capabilitiesManager")
    public static void injectCapabilitiesManager(OutgoingEnhancedProcessingVideoCallFragment outgoingEnhancedProcessingVideoCallFragment, CapabilitiesManager capabilitiesManager) {
        outgoingEnhancedProcessingVideoCallFragment.capabilitiesManager = capabilitiesManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OutgoingEnhancedProcessingVideoCallFragment outgoingEnhancedProcessingVideoCallFragment) {
        injectCapabilitiesManager(outgoingEnhancedProcessingVideoCallFragment, this.capabilitiesManagerProvider.get());
    }
}
