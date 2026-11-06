package com.amazon.whisperbridge.ble.request;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperbridge.ble.BleGattCharacteristic;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleWriteCharacteristicRequest extends BleRequest {
    private final BleGattCharacteristic mBleCharacteristic;
    private final boolean mPreparedWrite;
    private final boolean mResponseNeeded;
    private final byte[] mValue;

    public BleWriteCharacteristicRequest(BluetoothDevice bluetoothDevice, int i, BleGattCharacteristic bleGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        super(bluetoothDevice, i, i2);
        if (bleGattCharacteristic == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bleCharacteristic unexpectedly null.");
            throw null;
        }
        this.mBleCharacteristic = bleGattCharacteristic;
        this.mPreparedWrite = z;
        this.mResponseNeeded = z2;
        this.mValue = (byte[]) bArr.clone();
    }

    public BleGattCharacteristic getBleCharacteristic() {
        return this.mBleCharacteristic;
    }

    public byte[] getValue() {
        byte[] bArr = this.mValue;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public boolean isPreparedWrite() {
        return this.mPreparedWrite;
    }

    public boolean isResponseNeeded() {
        return this.mResponseNeeded;
    }

    @Override // com.amazon.whisperbridge.ble.request.BleRequest
    public String toString() {
        return "BleWriteCharacteristicRequest [device=" + this.mBluetoothDevice + ", id=" + this.mRequestID + ", offset=" + this.mOffset + ", prepared=" + this.mPreparedWrite + ", characteristic=" + this.mBleCharacteristic + MarkdownConstants.RIGHT_BRACKET;
    }
}
