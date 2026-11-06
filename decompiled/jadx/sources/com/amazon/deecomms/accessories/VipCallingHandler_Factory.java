package com.amazon.deecomms.accessories;

import com.amazon.deecomms.alexa.AlexaInterface;
import com.amazon.deecomms.common.sip.SipClientState;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes5.dex */
public final class VipCallingHandler_Factory implements Factory<VipCallingHandler> {
    private final Provider<AlexaInterface> alexaInterfaceProvider;
    private final Provider<SipClientState> sipClientStateProvider;

    public VipCallingHandler_Factory(Provider<AlexaInterface> provider, Provider<SipClientState> provider2) {
        this.alexaInterfaceProvider = provider;
        this.sipClientStateProvider = provider2;
    }

    public static VipCallingHandler_Factory create(Provider<AlexaInterface> provider, Provider<SipClientState> provider2) {
        return new VipCallingHandler_Factory(provider, provider2);
    }

    public static VipCallingHandler newInstance(AlexaInterface alexaInterface, SipClientState sipClientState) {
        return new VipCallingHandler(alexaInterface, sipClientState);
    }

    @Override // javax.inject.Provider
    public VipCallingHandler get() {
        return newInstance(this.alexaInterfaceProvider.get(), this.sipClientStateProvider.get());
    }
}
