package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface BluetoothSupportProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultBluetoothSupportProvider implements BluetoothSupportProvider {
        private final Context mContext;

        public DefaultBluetoothSupportProvider(Context context) {
            this.mContext = context;
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.BluetoothSupportProvider
        public boolean isBluetoothEnabled() {
            return BluetoothAdapter.getDefaultAdapter().isEnabled();
        }

        @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.BluetoothSupportProvider
        public boolean isBluetoothLowEnergySupported() {
            return this.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        }
    }

    boolean isBluetoothEnabled();

    boolean isBluetoothLowEnergySupported();
}
