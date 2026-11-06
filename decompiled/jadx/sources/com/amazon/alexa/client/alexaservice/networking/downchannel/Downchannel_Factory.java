package com.amazon.alexa.client.alexaservice.networking.downchannel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class Downchannel_Factory implements Factory<Downchannel> {
    private final Provider<DownchannelCall> downchannelCallProvider;

    public Downchannel_Factory(Provider<DownchannelCall> provider) {
        this.downchannelCallProvider = provider;
    }

    public static Downchannel_Factory create(Provider<DownchannelCall> provider) {
        return new Downchannel_Factory(provider);
    }

    public static Downchannel newInstance(DownchannelCall downchannelCall) {
        return new Downchannel(downchannelCall);
    }

    @Override // javax.inject.Provider
    public Downchannel get() {
        return newInstance(this.downchannelCallProvider.get());
    }
}
