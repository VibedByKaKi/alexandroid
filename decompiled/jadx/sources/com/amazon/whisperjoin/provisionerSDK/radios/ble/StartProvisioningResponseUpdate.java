package com.amazon.whisperjoin.provisionerSDK.radios.ble;

import com.amazon.whisperbridge.ble.BleGattCharacteristic;
import com.amazon.whisperjoin.common.sharedtypes.ble.BleConstants;
import com.amazon.whisperjoin.common.sharedtypes.ble.StartProvisioningResponse;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class StartProvisioningResponseUpdate implements GattCharacteristicPendingUpdate {
    private FutureTask<StartProvisioningResponse> mStartProvisioningResponseFuture;

    public StartProvisioningResponseUpdate(FutureTask<StartProvisioningResponse> futureTask) {
        this.mStartProvisioningResponseFuture = futureTask;
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.radios.ble.GattCharacteristicPendingUpdate
    public GattCharacteristicPendingStatus notify(BleGattCharacteristic bleGattCharacteristic) {
        if (!bleGattCharacteristic.getUuid().equals(BleConstants.START_PROVISIONING_RESPONSE_CHARACTERISTIC_UUID)) {
            return new GattCharacteristicPendingStatus(false, null);
        }
        this.mStartProvisioningResponseFuture.run();
        return new GattCharacteristicPendingStatus(true, null);
    }
}
