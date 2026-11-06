package com.amazon.alexa.voice.nowplaying;

import com.amazon.alexa.voice.ui.player.PlayerCardUpdater;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class NowPlayingModule_ProvidePlayerCardUpdaterFactory implements Factory<PlayerCardUpdater> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final NowPlayingModule_ProvidePlayerCardUpdaterFactory INSTANCE = new NowPlayingModule_ProvidePlayerCardUpdaterFactory();

        private InstanceHolder() {
        }
    }

    public static NowPlayingModule_ProvidePlayerCardUpdaterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PlayerCardUpdater providePlayerCardUpdater() {
        return (PlayerCardUpdater) Preconditions.checkNotNullFromProvides(NowPlayingModule.providePlayerCardUpdater());
    }

    @Override // javax.inject.Provider
    public PlayerCardUpdater get() {
        return providePlayerCardUpdater();
    }
}
