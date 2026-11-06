package com.amazon.whisperbridge.ble.request;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperbridge.ble.BleGattDescriptor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleWriteDescriptorRequest extends BleRequest {
    private final BleGattDescriptor mBleDescriptor;
    private final boolean mPreparedWrite;
    private final boolean mResponseNeeded;
    private final byte[] mValue;

    public BleWriteDescriptorRequest(BluetoothDevice bluetoothDevice, int i, BleGattDescriptor bleGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        super(bluetoothDevice, i, i2);
        if (bleGattDescriptor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("descriptor unexpectedly null.");
            throw null;
        }
        this.mBleDescriptor = bleGattDescriptor;
        this.mPreparedWrite = z;
        this.mResponseNeeded = z2;
        this.mValue = (byte[]) bArr.clone();
    }

    public BleGattDescriptor getBleDescriptor() {
        return this.mBleDescriptor;
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
        return "BleWriteDescriptorRequest [device=" + this.mBluetoothDevice + ", id=" + this.mRequestID + ", offset=" + this.mOffset + ", prepared=" + this.mPreparedWrite + ", descriptor=" + this.mBleDescriptor + MarkdownConstants.RIGHT_BRACKET;
    }
}
