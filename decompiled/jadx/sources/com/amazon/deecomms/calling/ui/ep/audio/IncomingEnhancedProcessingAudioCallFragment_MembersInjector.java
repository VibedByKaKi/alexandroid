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
public final class IncomingEnhancedProcessingAudioCallFragment_MembersInjector implements MembersInjector<IncomingEnhancedProcessingAudioCallFragment> {
    private final Provider<CapabilitiesManager> capabilitiesManagerProvider;

    public IncomingEnhancedProcessingAudioCallFragment_MembersInjector(Provider<CapabilitiesManager> provider) {
        this.capabilitiesManagerProvider = provider;
    }

    public static MembersInjector<IncomingEnhancedProcessingAudioCallFragment> create(Provider<CapabilitiesManager> provider) {
        return new IncomingEnhancedProcessingAudioCallFragment_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.ui.ep.audio.IncomingEnhancedProcessingAudioCallFragment.capabilitiesManager")
    public static void injectCapabilitiesManager(IncomingEnhancedProcessingAudioCallFragment incomingEnhancedProcessingAudioCallFragment, CapabilitiesManager capabilitiesManager) {
        incomingEnhancedProcessingAudioCallFragment.capabilitiesManager = capabilitiesManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(IncomingEnhancedProcessingAudioCallFragment incomingEnhancedProcessingAudioCallFragment) {
        injectCapabilitiesManager(incomingEnhancedProcessingAudioCallFragment, this.capabilitiesManagerProvider.get());
    }
}
