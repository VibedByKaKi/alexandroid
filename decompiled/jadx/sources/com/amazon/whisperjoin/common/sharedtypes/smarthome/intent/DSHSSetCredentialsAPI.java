package com.amazon.whisperjoin.common.sharedtypes.smarthome.intent;

import com.amazon.whisperjoin.common.sharedtypes.smarthome.data.BluetoothFFSEntry;
import com.amazon.whisperjoin.common.sharedtypes.smarthome.data.ZigbeeFFSEntry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DSHSSetCredentialsAPI {
    void setCredentials(ZigbeeFFSEntry zigbeeFFSEntry);

    void setCredentials(ZigbeeFFSEntry zigbeeFFSEntry, BluetoothFFSEntry bluetoothFFSEntry);

    void setCredentialsV2(String str);
}
