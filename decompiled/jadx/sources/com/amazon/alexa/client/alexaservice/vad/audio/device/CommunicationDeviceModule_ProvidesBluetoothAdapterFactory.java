package com.amazon.alexa.client.alexaservice.vad.audio.device;

import android.bluetooth.BluetoothAdapter;
import androidx.annotation.Nullable;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class CommunicationDeviceModule_ProvidesBluetoothAdapterFactory implements Factory<BluetoothAdapter> {
    private final CommunicationDeviceModule module;

    public CommunicationDeviceModule_ProvidesBluetoothAdapterFactory(CommunicationDeviceModule communicationDeviceModule) {
        this.module = communicationDeviceModule;
    }

    public static CommunicationDeviceModule_ProvidesBluetoothAdapterFactory create(CommunicationDeviceModule communicationDeviceModule) {
        return new CommunicationDeviceModule_ProvidesBluetoothAdapterFactory(communicationDeviceModule);
    }

    @Nullable
    public static BluetoothAdapter providesBluetoothAdapter(CommunicationDeviceModule communicationDeviceModule) {
        return communicationDeviceModule.providesBluetoothAdapter();
    }

    @Override // javax.inject.Provider
    @Nullable
    public BluetoothAdapter get() {
        return providesBluetoothAdapter(this.module);
    }
}
