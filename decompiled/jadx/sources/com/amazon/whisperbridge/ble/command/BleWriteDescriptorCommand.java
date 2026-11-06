package com.amazon.whisperbridge.ble.command;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleWriteDescriptorCommand extends BleCommand<Result> {
    private static final String TAG = "BleWriteDescriptorCommand";
    private final BluetoothGatt mBluetoothGatt;
    private final BluetoothGattDescriptor mBluetoothGattDescriptor;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        public final int status;

        public Result(int i) {
            this.status = i;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("Result [status="), this.status, MarkdownConstants.RIGHT_BRACKET);
        }
    }

    public BleWriteDescriptorCommand(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        super(new Result(-1));
        this.mBluetoothGatt = bluetoothGatt;
        this.mBluetoothGattDescriptor = bluetoothGattDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.amazon.whisperbridge.ble.command.BleWriteDescriptorCommand$Result] */
    @Override // java.util.concurrent.Callable
    public Result call() throws Exception {
        if (!this.mBluetoothGatt.writeDescriptor(this.mBluetoothGattDescriptor)) {
            return (Result) this.mResult;
        }
        if (!this.mResultLatch.await(10L, TimeUnit.SECONDS)) {
            this.mResult = new Result(-2);
        }
        WJLog.i(TAG, "BleWriteDescriptorCommand executed with result=" + this.mResult);
        return (Result) this.mResult;
    }

    public String toString() {
        return "BleWriteDescriptorCommand [descriptor=" + this.mBluetoothGattDescriptor.getUuid() + MarkdownConstants.RIGHT_BRACKET;
    }
}
