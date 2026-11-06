package com.amazon.deecomms.calling.receiver;

import com.amazon.deecomms.common.audio.AlexaAudioPlayer;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class PowerButtonPressReceiver_MembersInjector implements MembersInjector<PowerButtonPressReceiver> {
    private final Provider<AlexaAudioPlayer> audioPlayerProvider;

    public PowerButtonPressReceiver_MembersInjector(Provider<AlexaAudioPlayer> provider) {
        this.audioPlayerProvider = provider;
    }

    public static MembersInjector<PowerButtonPressReceiver> create(Provider<AlexaAudioPlayer> provider) {
        return new PowerButtonPressReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.receiver.PowerButtonPressReceiver.audioPlayer")
    public static void injectAudioPlayer(PowerButtonPressReceiver powerButtonPressReceiver, AlexaAudioPlayer alexaAudioPlayer) {
        powerButtonPressReceiver.audioPlayer = alexaAudioPlayer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PowerButtonPressReceiver powerButtonPressReceiver) {
        injectAudioPlayer(powerButtonPressReceiver, this.audioPlayerProvider.get());
    }
}
