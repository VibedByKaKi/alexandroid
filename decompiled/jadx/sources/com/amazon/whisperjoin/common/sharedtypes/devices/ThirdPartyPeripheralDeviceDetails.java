package com.amazon.whisperjoin.common.sharedtypes.devices;

import android.bluetooth.BluetoothDevice;
import com.amazon.whisperjoin.common.sharedtypes.ble.BleScanData;
import com.google.common.base.Objects;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ThirdPartyPeripheralDeviceDetails extends AbstractPeripheralDeviceDetails {
    BleScanData mBleScanData;

    public ThirdPartyPeripheralDeviceDetails(BleScanData bleScanData) {
        if (bleScanData != null) {
            this.mBleScanData = bleScanData;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("bleScanData can not be null");
            throw null;
        }
    }

    private static boolean matchingDeviceDetails(ThirdPartyPeripheralDeviceDetails thirdPartyPeripheralDeviceDetails, ThirdPartyPeripheralDeviceDetails thirdPartyPeripheralDeviceDetails2) {
        return Arrays.equals(thirdPartyPeripheralDeviceDetails.getScanRecord(), thirdPartyPeripheralDeviceDetails2.getScanRecord()) && thirdPartyPeripheralDeviceDetails.getMacAddress().equals(thirdPartyPeripheralDeviceDetails2.getMacAddress());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThirdPartyPeripheralDeviceDetails) {
            return Objects.equal(this.mBleScanData, ((ThirdPartyPeripheralDeviceDetails) obj).mBleScanData);
        }
        return false;
    }

    public BleScanData getBleScanData() {
        return this.mBleScanData;
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.mBleScanData.getDevice();
    }

    public String getMacAddress() {
        return this.mBleScanData.getDevice().getAddress();
    }

    public int getRSSI() {
        return this.mBleScanData.getRssi();
    }

    public byte[] getScanRecord() {
        return this.mBleScanData.getRawScanRecord();
    }

    public int hashCode() {
        return Objects.hashCode(this.mBleScanData);
    }

    public void updateScanDataRadioData(ThirdPartyPeripheralDeviceDetails thirdPartyPeripheralDeviceDetails) {
        if (matchingDeviceDetails(this, thirdPartyPeripheralDeviceDetails)) {
            this.mBleScanData = new BleScanData(this.mBleScanData.getDevice(), this.mBleScanData.getRawScanRecord(), thirdPartyPeripheralDeviceDetails.getBleScanData().getRssi());
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Attempting to update scan data for non matching scan records");
        }
    }
}
