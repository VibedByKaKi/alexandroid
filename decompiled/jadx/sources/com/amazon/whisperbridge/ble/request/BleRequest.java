package com.amazon.whisperbridge.ble.request;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class BleRequest {
    protected final BluetoothDevice mBluetoothDevice;
    protected final int mOffset;
    protected final int mRequestID;

    public BleRequest(BluetoothDevice bluetoothDevice, int i, int i2) {
        if (bluetoothDevice == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("btDevice is unexpectedly null.");
            throw null;
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("offset unexpectedly negative.");
            throw null;
        }
        this.mBluetoothDevice = bluetoothDevice;
        this.mRequestID = i;
        this.mOffset = i2;
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.mBluetoothDevice;
    }

    public int getOffset() {
        return this.mOffset;
    }

    public int getRequestID() {
        return this.mRequestID;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BleRequest [device=");
        sb.append(this.mBluetoothDevice);
        sb.append(", id=");
        sb.append(this.mRequestID);
        sb.append(", offset=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mOffset, MarkdownConstants.RIGHT_BRACKET);
    }
}
