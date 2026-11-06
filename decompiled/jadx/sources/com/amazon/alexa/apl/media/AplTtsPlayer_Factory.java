package com.amazon.alexa.apl.media;

import android.content.Context;
import com.amazon.alexa.api.AudioTaskSchedulerApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AplTtsPlayer_Factory implements Factory<AplTtsPlayer> {
    private final Provider<AudioTaskSchedulerApi> mAudioTaskSchedulerApiProvider;
    private final Provider<Context> mContextProvider;

    public AplTtsPlayer_Factory(Provider<Context> provider, Provider<AudioTaskSchedulerApi> provider2) {
        this.mContextProvider = provider;
        this.mAudioTaskSchedulerApiProvider = provider2;
    }

    public static AplTtsPlayer_Factory create(Provider<Context> provider, Provider<AudioTaskSchedulerApi> provider2) {
        return new AplTtsPlayer_Factory(provider, provider2);
    }

    public static AplTtsPlayer newInstance(Context context, AudioTaskSchedulerApi audioTaskSchedulerApi) {
        return new AplTtsPlayer(context, audioTaskSchedulerApi);
    }

    @Override // javax.inject.Provider
    public AplTtsPlayer get() {
        return newInstance(this.mContextProvider.get(), this.mAudioTaskSchedulerApiProvider.get());
    }
}
