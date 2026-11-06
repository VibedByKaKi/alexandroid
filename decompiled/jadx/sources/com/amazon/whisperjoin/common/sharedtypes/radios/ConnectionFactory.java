package com.amazon.whisperjoin.common.sharedtypes.radios;

import com.amazon.whisperjoin.common.sharedtypes.devices.DiscoveredRadio;
import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;
import com.amazon.whisperjoin.common.sharedtypes.devices.interfaces.PeripheralDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ConnectionFactory {
    PeripheralDevice create(WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails, DiscoveredRadio discoveredRadio);
}
