package com.amazon.comms.calling.dependency;

import android.content.Context;
import android.media.Ringtone;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.comms.calling.dependency.qualifiers.RingtoneError"})
/* loaded from: classes20.dex */
public final class RingtoneModule_ProvidesRingtoneErrorFactory implements Factory<Ringtone> {
    private final Provider<Context> contextProvider;
    private final RingtoneModule module;

    public RingtoneModule_ProvidesRingtoneErrorFactory(RingtoneModule ringtoneModule, Provider<Context> provider) {
        this.module = ringtoneModule;
        this.contextProvider = provider;
    }

    public static RingtoneModule_ProvidesRingtoneErrorFactory create(RingtoneModule ringtoneModule, Provider<Context> provider) {
        return new RingtoneModule_ProvidesRingtoneErrorFactory(ringtoneModule, provider);
    }

    public static Ringtone providesRingtoneError(RingtoneModule ringtoneModule, Context context) {
        return (Ringtone) Preconditions.checkNotNullFromProvides(ringtoneModule.providesRingtoneError(context));
    }

    @Override // javax.inject.Provider
    public Ringtone get() {
        return providesRingtoneError(this.module, this.contextProvider.get());
    }
}
