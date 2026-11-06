package com.amazon.comms.calling.dependency;

import com.amazon.comms.calling.infrastructure.RingtonePlayer;
import com.amazon.comms.calling.infrastructure.RingtonePlayerImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class RingtoneModule_ProvidesRingtonePlayerFactory implements Factory<RingtonePlayer> {
    private final RingtoneModule module;
    private final Provider<RingtonePlayerImpl> ringtonePlayerImplProvider;

    public RingtoneModule_ProvidesRingtonePlayerFactory(RingtoneModule ringtoneModule, Provider<RingtonePlayerImpl> provider) {
        this.module = ringtoneModule;
        this.ringtonePlayerImplProvider = provider;
    }

    public static RingtoneModule_ProvidesRingtonePlayerFactory create(RingtoneModule ringtoneModule, Provider<RingtonePlayerImpl> provider) {
        return new RingtoneModule_ProvidesRingtonePlayerFactory(ringtoneModule, provider);
    }

    public static RingtonePlayer providesRingtonePlayer(RingtoneModule ringtoneModule, RingtonePlayerImpl ringtonePlayerImpl) {
        return (RingtonePlayer) Preconditions.checkNotNullFromProvides(ringtoneModule.providesRingtonePlayer(ringtonePlayerImpl));
    }

    @Override // javax.inject.Provider
    public RingtonePlayer get() {
        return providesRingtonePlayer(this.module, this.ringtonePlayerImplProvider.get());
    }
}
