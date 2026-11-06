package com.amazon.whisperbridge.ble.command;

import android.bluetooth.BluetoothGatt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleReadRssiCommand extends BleCommand<Result> {
    private static final String TAG = "BleReadRssiCommand";
    private final BluetoothGatt mBluetoothGatt;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        public final int rssi;
        public final int status;

        public Result(int i, int i2) {
            this.rssi = i;
            this.status = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Result [rssi=");
            sb.append(this.rssi);
            sb.append(", status=");
            return a$$ExternalSyntheticOutline0.m(sb, this.status, MarkdownConstants.RIGHT_BRACKET);
        }
    }

    public BleReadRssiCommand(BluetoothGatt bluetoothGatt) {
        super(new Result(0, -1));
        this.mBluetoothGatt = bluetoothGatt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.amazon.whisperbridge.ble.command.BleReadRssiCommand$Result] */
    @Override // java.util.concurrent.Callable
    public Result call() throws Exception {
        if (!this.mBluetoothGatt.readRemoteRssi()) {
            return (Result) this.mResult;
        }
        if (!this.mResultLatch.await(10L, TimeUnit.SECONDS)) {
            this.mResult = new Result(0, -2);
        }
        WJLog.i(TAG, "BleReadRssiCommand executed with result=" + this.mResult);
        return (Result) this.mResult;
    }

    public String toString() {
        return TAG;
    }
}
