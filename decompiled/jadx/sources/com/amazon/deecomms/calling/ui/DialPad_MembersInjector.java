package com.amazon.deecomms.calling.ui;

import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.sip.SipClientState;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Named;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes5.dex */
public final class DialPad_MembersInjector implements MembersInjector<DialPad> {
    private final Provider<SipClientState> sipClientStateProvider;

    public DialPad_MembersInjector(Provider<SipClientState> provider) {
        this.sipClientStateProvider = provider;
    }

    public static MembersInjector<DialPad> create(Provider<SipClientState> provider) {
        return new DialPad_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.ui.DialPad.sipClientState")
    @Named(Constants.Dagger.CURRENT_CALL_SIPSTATE)
    public static void injectSipClientState(DialPad dialPad, SipClientState sipClientState) {
        dialPad.sipClientState = sipClientState;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DialPad dialPad) {
        injectSipClientState(dialPad, this.sipClientStateProvider.get());
    }
}
