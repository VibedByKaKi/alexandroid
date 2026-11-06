package com.amazon.whisperbridge.ble.command;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleUpdateNotificationsCommand extends BleCommand<Result> {
    public static final int FAILED_TO_UPDATE_NOTIFICATION_LOCALLY = -3;
    private static final String TAG = "BleUpdateNotificationsCommand";
    private final BluetoothGatt mBluetoothGatt;
    private final BluetoothGattDescriptor mBluetoothGattDescriptor;
    private final boolean mEnable;

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

    public BleUpdateNotificationsCommand(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z) {
        super(new Result(-1));
        this.mBluetoothGatt = bluetoothGatt;
        this.mBluetoothGattDescriptor = bluetoothGattDescriptor;
        this.mEnable = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.amazon.whisperbridge.ble.command.BleUpdateNotificationsCommand$Result] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.amazon.whisperbridge.ble.command.BleUpdateNotificationsCommand$Result] */
    @Override // java.util.concurrent.Callable
    public Result call() throws Exception {
        if (!this.mBluetoothGatt.setCharacteristicNotification(this.mBluetoothGattDescriptor.getCharacteristic(), this.mEnable)) {
            ?? result = new Result(-3);
            this.mResult = result;
            return result;
        }
        if (!this.mBluetoothGatt.writeDescriptor(this.mBluetoothGattDescriptor)) {
            return (Result) this.mResult;
        }
        if (!this.mResultLatch.await(10L, TimeUnit.SECONDS)) {
            this.mResult = new Result(-2);
        }
        WJLog.i(TAG, "BleUpdateNotificationsCommand executed with result=" + this.mResult);
        return (Result) this.mResult;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BleUpdateNotificationsCommand [descriptor");
        sb.append(this.mBluetoothGattDescriptor.getUuid());
        sb.append(", enable=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mEnable, MarkdownConstants.RIGHT_BRACKET);
    }
}
