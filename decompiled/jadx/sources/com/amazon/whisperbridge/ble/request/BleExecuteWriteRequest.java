package com.amazon.whisperbridge.ble.request;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleExecuteWriteRequest extends BleRequest {
    private final boolean mExecute;

    public BleExecuteWriteRequest(BluetoothDevice bluetoothDevice, int i, boolean z) {
        super(bluetoothDevice, i, 0);
        this.mExecute = z;
    }

    public boolean execute() {
        return this.mExecute;
    }

    @Override // com.amazon.whisperbridge.ble.request.BleRequest
    public String toString() {
        StringBuilder sb = new StringBuilder("BleExecuteWriteRequest [device=");
        sb.append(this.mBluetoothDevice);
        sb.append(", id=");
        sb.append(this.mRequestID);
        sb.append(", offset=");
        sb.append(this.mOffset);
        sb.append(", execute=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mExecute, MarkdownConstants.RIGHT_BRACKET);
    }
}
