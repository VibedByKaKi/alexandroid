package com.amazon.alexa.client.alexaservice.audio.core;

import android.content.Context;
import android.media.SoundPool;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SoundWrapper_Factory implements Factory<SoundWrapper> {
    private final Provider<Context> contextProvider;
    private final Provider<SoundPool> soundPoolProvider;

    public SoundWrapper_Factory(Provider<SoundPool> provider, Provider<Context> provider2) {
        this.soundPoolProvider = provider;
        this.contextProvider = provider2;
    }

    public static SoundWrapper_Factory create(Provider<SoundPool> provider, Provider<Context> provider2) {
        return new SoundWrapper_Factory(provider, provider2);
    }

    public static SoundWrapper newInstance(Lazy<SoundPool> lazy, Context context) {
        return new SoundWrapper(lazy, context);
    }

    @Override // javax.inject.Provider
    public SoundWrapper get() {
        return newInstance(DoubleCheck.lazy(this.soundPoolProvider), this.contextProvider.get());
    }
}
