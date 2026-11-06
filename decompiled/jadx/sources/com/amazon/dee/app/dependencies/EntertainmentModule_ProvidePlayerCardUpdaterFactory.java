package com.amazon.dee.app.dependencies;

import com.amazon.alexa.voice.ui.player.PlayerCardUpdater;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class EntertainmentModule_ProvidePlayerCardUpdaterFactory implements Factory<PlayerCardUpdater> {
    private final EntertainmentModule module;

    public EntertainmentModule_ProvidePlayerCardUpdaterFactory(EntertainmentModule entertainmentModule) {
        this.module = entertainmentModule;
    }

    public static EntertainmentModule_ProvidePlayerCardUpdaterFactory create(EntertainmentModule entertainmentModule) {
        return new EntertainmentModule_ProvidePlayerCardUpdaterFactory(entertainmentModule);
    }

    public static PlayerCardUpdater providePlayerCardUpdater(EntertainmentModule entertainmentModule) {
        return (PlayerCardUpdater) Preconditions.checkNotNullFromProvides(entertainmentModule.providePlayerCardUpdater());
    }

    @Override // javax.inject.Provider
    public PlayerCardUpdater get() {
        return providePlayerCardUpdater(this.module);
    }
}
