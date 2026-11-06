package com.amazon.whisperbridge.ble.request;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperbridge.ble.BleGattCharacteristic;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleReadCharacteristicRequest extends BleRequest {
    private final BleGattCharacteristic mBleCharacteristic;

    public BleReadCharacteristicRequest(BluetoothDevice bluetoothDevice, int i, int i2, BleGattCharacteristic bleGattCharacteristic) {
        super(bluetoothDevice, i, i2);
        if (bleGattCharacteristic != null) {
            this.mBleCharacteristic = bleGattCharacteristic;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("characteristic unexpectedly null.");
            throw null;
        }
    }

    public BleGattCharacteristic getBleCharacteristic() {
        return this.mBleCharacteristic;
    }

    @Override // com.amazon.whisperbridge.ble.request.BleRequest
    public String toString() {
        return "BleReadCharacteristicRequest [device=" + this.mBluetoothDevice + ", id=" + this.mRequestID + ", offset=" + this.mOffset + ", characteristic=" + this.mBleCharacteristic + MarkdownConstants.RIGHT_BRACKET;
    }
}
