package com.amazon.deecomms.calling.ui;

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
public final class DialPadButton_MembersInjector implements MembersInjector<DialPadButton> {
    private final Provider<CapabilitiesManager> mCapabilitiesManagerProvider;

    public DialPadButton_MembersInjector(Provider<CapabilitiesManager> provider) {
        this.mCapabilitiesManagerProvider = provider;
    }

    public static MembersInjector<DialPadButton> create(Provider<CapabilitiesManager> provider) {
        return new DialPadButton_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.ui.DialPadButton.mCapabilitiesManager")
    public static void injectMCapabilitiesManager(DialPadButton dialPadButton, CapabilitiesManager capabilitiesManager) {
        dialPadButton.mCapabilitiesManager = capabilitiesManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DialPadButton dialPadButton) {
        injectMCapabilitiesManager(dialPadButton, this.mCapabilitiesManagerProvider.get());
    }
}
