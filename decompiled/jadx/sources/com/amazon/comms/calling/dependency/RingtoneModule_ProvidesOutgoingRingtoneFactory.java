package com.amazon.comms.calling.dependency;

import android.content.Context;
import android.media.Ringtone;
import com.amazon.comms.calling.data.util.Utils;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.comms.calling.dependency.qualifiers.RingtoneOutgoing"})
/* loaded from: classes20.dex */
public final class RingtoneModule_ProvidesOutgoingRingtoneFactory implements Factory<Ringtone> {
    private final Provider<Context> contextProvider;
    private final RingtoneModule module;
    private final Provider<Utils> utilsProvider;

    public RingtoneModule_ProvidesOutgoingRingtoneFactory(RingtoneModule ringtoneModule, Provider<Context> provider, Provider<Utils> provider2) {
        this.module = ringtoneModule;
        this.contextProvider = provider;
        this.utilsProvider = provider2;
    }

    public static RingtoneModule_ProvidesOutgoingRingtoneFactory create(RingtoneModule ringtoneModule, Provider<Context> provider, Provider<Utils> provider2) {
        return new RingtoneModule_ProvidesOutgoingRingtoneFactory(ringtoneModule, provider, provider2);
    }

    public static Ringtone providesOutgoingRingtone(RingtoneModule ringtoneModule, Context context, Utils utils) {
        return (Ringtone) Preconditions.checkNotNullFromProvides(ringtoneModule.providesOutgoingRingtone(context, utils));
    }

    @Override // javax.inject.Provider
    public Ringtone get() {
        return providesOutgoingRingtone(this.module, this.contextProvider.get(), this.utilsProvider.get());
    }
}
