package com.amazon.alexa.seamlessswitching.capability.state;

import com.amazon.alexa.api.AlexaContextsProvider;
import com.amazon.alexa.seamlessswitching.capability.model.AccessoryBluetoothState;
import com.amazon.alexa.seamlessswitching.capability.model.AlexaDevice;
import com.amazon.alexa.seamlessswitching.capability.model.BluetoothState;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface IOComponentsBluetoothStateProvider extends AlexaContextsProvider {
    BluetoothState getBluetoothState();

    void initialize();

    void putAccessoryBluetoothState(AlexaDevice alexaDevice, AccessoryBluetoothState accessoryBluetoothState);

    void removeAccessoryBluetoothState(AlexaDevice alexaDevice);

    void teardown();
}
