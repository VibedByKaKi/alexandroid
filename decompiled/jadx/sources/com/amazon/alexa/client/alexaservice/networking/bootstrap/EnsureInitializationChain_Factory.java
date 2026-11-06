package com.amazon.alexa.client.alexaservice.networking.bootstrap;

import com.amazon.alexa.client.alexaservice.networking.downchannel.DownchannelStatusTracker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class EnsureInitializationChain_Factory implements Factory<EnsureInitializationChain> {
    private final Provider<DownchannelStatusTracker> downchannelStatusTrackerProvider;
    private final Provider<AVSConnectionChain> nextChainProvider;

    public EnsureInitializationChain_Factory(Provider<AVSConnectionChain> provider, Provider<DownchannelStatusTracker> provider2) {
        this.nextChainProvider = provider;
        this.downchannelStatusTrackerProvider = provider2;
    }

    public static EnsureInitializationChain_Factory create(Provider<AVSConnectionChain> provider, Provider<DownchannelStatusTracker> provider2) {
        return new EnsureInitializationChain_Factory(provider, provider2);
    }

    public static EnsureInitializationChain newInstance(AVSConnectionChain aVSConnectionChain, DownchannelStatusTracker downchannelStatusTracker) {
        return new EnsureInitializationChain(aVSConnectionChain, downchannelStatusTracker);
    }

    @Override // javax.inject.Provider
    public EnsureInitializationChain get() {
        return newInstance(this.nextChainProvider.get(), this.downchannelStatusTrackerProvider.get());
    }
}
