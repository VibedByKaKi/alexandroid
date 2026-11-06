package com.amazon.deecomms.media;

import com.amazon.deecomms.common.sip.SipClientState;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes5.dex */
public final class VideoStateController_Factory implements Factory<VideoStateController> {
    private final Provider<SipClientState> sipClientStateProvider;

    public VideoStateController_Factory(Provider<SipClientState> provider) {
        this.sipClientStateProvider = provider;
    }

    public static VideoStateController_Factory create(Provider<SipClientState> provider) {
        return new VideoStateController_Factory(provider);
    }

    public static VideoStateController newInstance(SipClientState sipClientState) {
        return new VideoStateController(sipClientState);
    }

    @Override // javax.inject.Provider
    public VideoStateController get() {
        return newInstance(this.sipClientStateProvider.get());
    }
}
