package com.amazon.whisperbridge.ble.command;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleReadCharacteristicCommand extends BleCommand<Result> {
    private static final String TAG = "BleReadCharacteristicCommand";
    private final BluetoothGatt mBluetoothGatt;
    private final BluetoothGattCharacteristic mBluetoothGattCharacteristic;

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

    public BleReadCharacteristicCommand(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(new Result(-1));
        this.mBluetoothGatt = bluetoothGatt;
        this.mBluetoothGattCharacteristic = bluetoothGattCharacteristic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.amazon.whisperbridge.ble.command.BleReadCharacteristicCommand$Result] */
    @Override // java.util.concurrent.Callable
    public Result call() throws Exception {
        if (!this.mBluetoothGatt.readCharacteristic(this.mBluetoothGattCharacteristic)) {
            WJLog.e(TAG, "Failed to start readCharacteristic");
            return (Result) this.mResult;
        }
        CountDownLatch countDownLatch = this.mResultLatch;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        countDownLatch.await(10L, timeUnit);
        if (!this.mResultLatch.await(10L, timeUnit)) {
            WJLog.e(TAG, "Failed to complete due to a timeout");
            this.mResult = new Result(-2);
        }
        WJLog.i(TAG, "BleReadCharacteristicCommand executed with result=" + this.mResult);
        return (Result) this.mResult;
    }

    public String toString() {
        return "BleReadCharacteristicCommand [characteristic=" + this.mBluetoothGattCharacteristic.getUuid() + MarkdownConstants.RIGHT_BRACKET;
    }
}
