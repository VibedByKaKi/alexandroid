package com.amazon.dee.app.dependencies;

import com.amazon.alexa.voice.ui.player.PlayerCardUpdater;
import com.amazon.alexa.voice.ui.superbowl.AudioPlayerCardUpdater;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public final class EntertainmentModule {
    @Provides
    @ApplicationScope
    public PlayerCardUpdater providePlayerCardUpdater() {
        return new AudioPlayerCardUpdater();
    }
}
