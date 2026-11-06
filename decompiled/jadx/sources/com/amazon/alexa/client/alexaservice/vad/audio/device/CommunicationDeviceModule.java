package com.amazon.alexa.client.alexaservice.vad.audio.device;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class CommunicationDeviceModule {
    @Nullable
    @Provides
    @Singleton
    public BluetoothAdapter providesBluetoothAdapter() {
        return BluetoothAdapter.getDefaultAdapter();
    }

    @Provides
    @Singleton
    @Named("vadCommunicationDeviceHandler")
    public Handler providesCommunicationDeviceHandler() {
        return new Handler(DoubleList$$ExternalSyntheticOutline0.m("VadCommunicationDevice").getLooper());
    }

    @Provides
    @Singleton
    public CommunicationDeviceProvider providesCommunicationDeviceProvider(AudioManager audioManager, @Nullable BluetoothAdapter bluetoothAdapter, Context context) {
        return Build.VERSION.SDK_INT >= 31 ? new AudioManagerCommunicationDeviceProvider(audioManager, bluetoothAdapter, context) : new LegacyCommunicationDeviceProvider(audioManager, bluetoothAdapter, context);
    }
}
