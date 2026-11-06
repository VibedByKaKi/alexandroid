package com.amazon.whisperbridge.ble.request;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperbridge.ble.BleGattDescriptor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleReadDescriptorRequest extends BleRequest {
    private final BleGattDescriptor mBleDescriptor;

    public BleReadDescriptorRequest(BluetoothDevice bluetoothDevice, int i, int i2, BleGattDescriptor bleGattDescriptor) {
        super(bluetoothDevice, i, i2);
        if (bleGattDescriptor != null) {
            this.mBleDescriptor = bleGattDescriptor;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("bleDescriptor unexpectedly null.");
            throw null;
        }
    }

    public BleGattDescriptor getBleDescriptor() {
        return this.mBleDescriptor;
    }

    @Override // com.amazon.whisperbridge.ble.request.BleRequest
    public String toString() {
        return "BleReadDescriptorRequest [device=" + this.mBluetoothDevice + ", id=" + this.mRequestID + ", offset=" + this.mOffset + ", descriptor=" + this.mBleDescriptor + MarkdownConstants.RIGHT_BRACKET;
    }
}
