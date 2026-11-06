package com.amazon.comms.calling.infrastructure.audio;

import android.media.AudioManager;
import com.amazon.comms.calling.data.util.Utils;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class BluetoothHeadsetHelper_MembersInjector implements MembersInjector<BluetoothHeadsetHelper> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<Utils> utilsProvider;

    public BluetoothHeadsetHelper_MembersInjector(Provider<AudioManager> provider, Provider<Utils> provider2) {
        this.audioManagerProvider = provider;
        this.utilsProvider = provider2;
    }

    public static MembersInjector<BluetoothHeadsetHelper> create(Provider<AudioManager> provider, Provider<Utils> provider2) {
        return new BluetoothHeadsetHelper_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.comms.calling.infrastructure.audio.BluetoothHeadsetHelper.audioManager")
    public static void injectAudioManager(BluetoothHeadsetHelper bluetoothHeadsetHelper, AudioManager audioManager) {
        bluetoothHeadsetHelper.audioManager = audioManager;
    }

    @InjectedFieldSignature("com.amazon.comms.calling.infrastructure.audio.BluetoothHeadsetHelper.utils")
    public static void injectUtils(BluetoothHeadsetHelper bluetoothHeadsetHelper, Utils utils) {
        bluetoothHeadsetHelper.utils = utils;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BluetoothHeadsetHelper bluetoothHeadsetHelper) {
        injectAudioManager(bluetoothHeadsetHelper, this.audioManagerProvider.get());
        injectUtils(bluetoothHeadsetHelper, this.utilsProvider.get());
    }
}
