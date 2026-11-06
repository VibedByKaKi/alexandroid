package com.amazon.deecomms.calling.ui.ep.audio;

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
public final class OutgoingEnhancedProcessingAudioCallFragment_MembersInjector implements MembersInjector<OutgoingEnhancedProcessingAudioCallFragment> {
    private final Provider<CapabilitiesManager> capabilitiesManagerProvider;

    public OutgoingEnhancedProcessingAudioCallFragment_MembersInjector(Provider<CapabilitiesManager> provider) {
        this.capabilitiesManagerProvider = provider;
    }

    public static MembersInjector<OutgoingEnhancedProcessingAudioCallFragment> create(Provider<CapabilitiesManager> provider) {
        return new OutgoingEnhancedProcessingAudioCallFragment_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.ui.ep.audio.OutgoingEnhancedProcessingAudioCallFragment.capabilitiesManager")
    public static void injectCapabilitiesManager(OutgoingEnhancedProcessingAudioCallFragment outgoingEnhancedProcessingAudioCallFragment, CapabilitiesManager capabilitiesManager) {
        outgoingEnhancedProcessingAudioCallFragment.capabilitiesManager = capabilitiesManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OutgoingEnhancedProcessingAudioCallFragment outgoingEnhancedProcessingAudioCallFragment) {
        injectCapabilitiesManager(outgoingEnhancedProcessingAudioCallFragment, this.capabilitiesManagerProvider.get());
    }
}
