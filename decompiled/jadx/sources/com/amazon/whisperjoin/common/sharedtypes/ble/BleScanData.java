package com.amazon.whisperjoin.common.sharedtypes.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BleScanData {
    private final BluetoothDevice mBluetoothDevice;
    private final byte[] mRawScanRecord;
    private final int mRssi;
    private final long mTimestampNanos;

    public BleScanData(BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        this.mTimestampNanos = System.nanoTime();
        this.mBluetoothDevice = bluetoothDevice;
        this.mRawScanRecord = (byte[]) bArr.clone();
        this.mRssi = i;
    }

    public BluetoothDevice getDevice() {
        return this.mBluetoothDevice;
    }

    public byte[] getRawScanRecord() {
        return (byte[]) this.mRawScanRecord.clone();
    }

    public int getRssi() {
        return this.mRssi;
    }

    public long getTimestampNanos() {
        return this.mTimestampNanos;
    }

    @VisibleForTesting
    public BleScanData(long j, BluetoothDevice bluetoothDevice, byte[] bArr, int i) {
        this.mTimestampNanos = j;
        this.mBluetoothDevice = bluetoothDevice;
        this.mRawScanRecord = bArr;
        this.mRssi = i;
    }
}
