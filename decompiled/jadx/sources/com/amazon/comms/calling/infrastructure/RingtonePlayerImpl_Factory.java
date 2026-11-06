package com.amazon.comms.calling.infrastructure;

import android.media.Ringtone;
import com.amazon.comms.calling.data.util.Utils;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.amazon.comms.calling.dependency.qualifiers.RingtoneIncoming", "com.amazon.comms.calling.dependency.qualifiers.RingtoneOutgoing", "com.amazon.comms.calling.dependency.qualifiers.RingtoneConnected", "com.amazon.comms.calling.dependency.qualifiers.RingtoneError", "com.amazon.comms.calling.dependency.qualifiers.RingtoneDisconnected"})
/* loaded from: classes20.dex */
public final class RingtonePlayerImpl_Factory implements Factory<RingtonePlayerImpl> {
    private final Provider<CallAudioPlayer> callAudioPlayerProvider;
    private final Provider<Ringtone> ringtoneConnectedProvider;
    private final Provider<Ringtone> ringtoneDisconnectedProvider;
    private final Provider<Ringtone> ringtoneErrorProvider;
    private final Provider<Ringtone> ringtoneIncomingProvider;
    private final Provider<Ringtone> ringtoneOutgoingProvider;
    private final Provider<Utils> utilsProvider;

    public RingtonePlayerImpl_Factory(Provider<Ringtone> provider, Provider<Ringtone> provider2, Provider<Ringtone> provider3, Provider<Ringtone> provider4, Provider<Ringtone> provider5, Provider<CallAudioPlayer> provider6, Provider<Utils> provider7) {
        this.ringtoneIncomingProvider = provider;
        this.ringtoneOutgoingProvider = provider2;
        this.ringtoneConnectedProvider = provider3;
        this.ringtoneErrorProvider = provider4;
        this.ringtoneDisconnectedProvider = provider5;
        this.callAudioPlayerProvider = provider6;
        this.utilsProvider = provider7;
    }

    public static RingtonePlayerImpl_Factory create(Provider<Ringtone> provider, Provider<Ringtone> provider2, Provider<Ringtone> provider3, Provider<Ringtone> provider4, Provider<Ringtone> provider5, Provider<CallAudioPlayer> provider6, Provider<Utils> provider7) {
        return new RingtonePlayerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static RingtonePlayerImpl newInstance(Ringtone ringtone, Ringtone ringtone2, Ringtone ringtone3, Ringtone ringtone4, Ringtone ringtone5, CallAudioPlayer callAudioPlayer, Utils utils) {
        return new RingtonePlayerImpl(ringtone, ringtone2, ringtone3, ringtone4, ringtone5, callAudioPlayer, utils);
    }

    @Override // javax.inject.Provider
    public RingtonePlayerImpl get() {
        return newInstance(this.ringtoneIncomingProvider.get(), this.ringtoneOutgoingProvider.get(), this.ringtoneConnectedProvider.get(), this.ringtoneErrorProvider.get(), this.ringtoneDisconnectedProvider.get(), this.callAudioPlayerProvider.get(), this.utilsProvider.get());
    }
}
