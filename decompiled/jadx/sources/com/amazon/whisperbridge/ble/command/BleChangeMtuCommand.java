package com.amazon.whisperbridge.ble.command;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(21)
/* loaded from: classes19.dex */
public class BleChangeMtuCommand extends BleCommand<Result> {
    private static final String TAG = "BleChangeMtuCommand";
    private final BluetoothGatt mBluetoothGatt;
    private final int mMtu;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        public final int mtu;
        public final int status;

        public Result(int i, int i2) {
            this.mtu = i;
            this.status = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Result [mtu=");
            sb.append(this.mtu);
            sb.append(", status=");
            return a$$ExternalSyntheticOutline0.m(sb, this.status, MarkdownConstants.RIGHT_BRACKET);
        }
    }

    public BleChangeMtuCommand(BluetoothGatt bluetoothGatt, int i) {
        super(new Result(0, -1));
        this.mBluetoothGatt = bluetoothGatt;
        this.mMtu = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.amazon.whisperbridge.ble.command.BleChangeMtuCommand$Result] */
    @Override // java.util.concurrent.Callable
    public Result call() throws Exception {
        if (!this.mBluetoothGatt.requestMtu(this.mMtu)) {
            return (Result) this.mResult;
        }
        if (!this.mResultLatch.await(10L, TimeUnit.SECONDS)) {
            this.mResult = new Result(0, -2);
        }
        WJLog.i(TAG, "BleChangeMtuCommand executed with result=" + this.mResult);
        return (Result) this.mResult;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("BleChangeMtuCommand [mtu="), this.mMtu, MarkdownConstants.RIGHT_BRACKET);
    }
}
