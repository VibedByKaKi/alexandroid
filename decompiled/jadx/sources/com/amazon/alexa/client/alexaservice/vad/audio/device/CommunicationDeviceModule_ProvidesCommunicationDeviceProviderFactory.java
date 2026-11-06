package com.amazon.alexa.client.alexaservice.vad.audio.device;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
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
/* loaded from: classes17.dex */
public final class CommunicationDeviceModule_ProvidesCommunicationDeviceProviderFactory implements Factory<CommunicationDeviceProvider> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<BluetoothAdapter> bluetoothAdapterProvider;
    private final Provider<Context> contextProvider;
    private final CommunicationDeviceModule module;

    public CommunicationDeviceModule_ProvidesCommunicationDeviceProviderFactory(CommunicationDeviceModule communicationDeviceModule, Provider<AudioManager> provider, Provider<BluetoothAdapter> provider2, Provider<Context> provider3) {
        this.module = communicationDeviceModule;
        this.audioManagerProvider = provider;
        this.bluetoothAdapterProvider = provider2;
        this.contextProvider = provider3;
    }

    public static CommunicationDeviceModule_ProvidesCommunicationDeviceProviderFactory create(CommunicationDeviceModule communicationDeviceModule, Provider<AudioManager> provider, Provider<BluetoothAdapter> provider2, Provider<Context> provider3) {
        return new CommunicationDeviceModule_ProvidesCommunicationDeviceProviderFactory(communicationDeviceModule, provider, provider2, provider3);
    }

    public static CommunicationDeviceProvider providesCommunicationDeviceProvider(CommunicationDeviceModule communicationDeviceModule, AudioManager audioManager, BluetoothAdapter bluetoothAdapter, Context context) {
        return (CommunicationDeviceProvider) Preconditions.checkNotNullFromProvides(communicationDeviceModule.providesCommunicationDeviceProvider(audioManager, bluetoothAdapter, context));
    }

    @Override // javax.inject.Provider
    public CommunicationDeviceProvider get() {
        return providesCommunicationDeviceProvider(this.module, this.audioManagerProvider.get(), this.bluetoothAdapterProvider.get(), this.contextProvider.get());
    }
}
