package com.amazon.alexa.seamlessswitching.capability.bluetooth;

import com.amazon.alexa.seamlessswitching.capability.model.AlexaDevice;
import com.amazon.alexa.seamlessswitching.capability.model.PairedDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface IOComponentsBluetoothManager {
    void connectDevice(AlexaDevice alexaDevice, PairedDevice pairedDevice);

    void disconnectDevice(AlexaDevice alexaDevice, PairedDevice pairedDevice);

    void initialize();

    void teardown();
}
