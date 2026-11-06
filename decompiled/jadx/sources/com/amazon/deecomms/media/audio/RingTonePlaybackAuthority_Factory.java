package com.amazon.deecomms.media.audio;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class RingTonePlaybackAuthority_Factory implements Factory<RingTonePlaybackAuthority> {
    private final Provider<Context> applicationContextProvider;

    public RingTonePlaybackAuthority_Factory(Provider<Context> provider) {
        this.applicationContextProvider = provider;
    }

    public static RingTonePlaybackAuthority_Factory create(Provider<Context> provider) {
        return new RingTonePlaybackAuthority_Factory(provider);
    }

    public static RingTonePlaybackAuthority newInstance(Context context) {
        return new RingTonePlaybackAuthority(context);
    }

    @Override // javax.inject.Provider
    public RingTonePlaybackAuthority get() {
        return newInstance(this.applicationContextProvider.get());
    }
}
