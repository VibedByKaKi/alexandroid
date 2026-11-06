package com.amazon.alexa.matter.commissioner;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.matter.utils.logging.Logging;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.alexa.matter.utils.logging.PrefixLogger;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class DelegatingBluetoothGattCallback extends BluetoothGattCallback {

    @NonNull
    private final BluetoothGattCallback mDelegate;

    @NonNull
    private final MatterLogger mLogger;

    public DelegatingBluetoothGattCallback(@NonNull BluetoothGattCallback bluetoothGattCallback, @NonNull MatterLogger matterLogger) {
        this.mDelegate = bluetoothGattCallback;
        this.mLogger = PrefixLogger.scopedTo(BluetoothGattCallback.class, matterLogger);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onCharacteristicChanged(@Nullable BluetoothGatt bluetoothGatt, @Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.mLogger.debug("onCharacteristicChanged('" + Logging.prettyPrint(bluetoothGatt) + "', '" + bluetoothGattCharacteristic + "')");
        this.mDelegate.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onCharacteristicRead(@Nullable BluetoothGatt bluetoothGatt, @Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.mLogger.debug("onCharacteristicRead('" + Logging.prettyPrint(bluetoothGatt) + "', '" + bluetoothGattCharacteristic + "', status: " + i + MarkdownConstants.RIGHT_PARENTHESIS);
        this.mDelegate.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onCharacteristicWrite(@Nullable BluetoothGatt bluetoothGatt, @Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.mLogger.debug("onCharacteristicWrite('" + Logging.prettyPrint(bluetoothGatt) + "', '" + bluetoothGattCharacteristic + "', status: " + i + MarkdownConstants.RIGHT_PARENTHESIS);
        this.mDelegate.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onConnectionStateChange(@Nullable BluetoothGatt bluetoothGatt, int i, int i2) {
        this.mLogger.info("onConnectionStateChange(gatt: " + Logging.prettyPrint(bluetoothGatt) + ", status: " + i + ", newState: " + i2 + MarkdownConstants.RIGHT_PARENTHESIS);
        super.onConnectionStateChange(bluetoothGatt, i, i2);
        this.mDelegate.onConnectionStateChange(bluetoothGatt, i, i2);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onDescriptorRead(@Nullable BluetoothGatt bluetoothGatt, @Nullable BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.mLogger.debug("onDescriptorRead('" + Logging.prettyPrint(bluetoothGatt) + "', '" + bluetoothGattDescriptor + "', status: " + i + MarkdownConstants.RIGHT_PARENTHESIS);
        this.mDelegate.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onDescriptorWrite(@Nullable BluetoothGatt bluetoothGatt, @Nullable BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.mLogger.debug("onDescriptorWrite('" + Logging.prettyPrint(bluetoothGatt) + "', '" + bluetoothGattDescriptor + "', status: " + i + MarkdownConstants.RIGHT_PARENTHESIS);
        this.mDelegate.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onMtuChanged(@Nullable BluetoothGatt bluetoothGatt, int i, int i2) {
        this.mLogger.info("onMtuChanged(gatt: " + Logging.prettyPrint(bluetoothGatt) + ", mtu: " + i + ", status: " + i2 + MarkdownConstants.RIGHT_PARENTHESIS);
        super.onMtuChanged(bluetoothGatt, i, i2);
        this.mDelegate.onMtuChanged(bluetoothGatt, i, i2);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onReadRemoteRssi(@Nullable BluetoothGatt bluetoothGatt, int i, int i2) {
        this.mLogger.debug("onReadRemoteRssi('" + Logging.prettyPrint(bluetoothGatt) + "', rssi: " + i + ", status: " + i2 + MarkdownConstants.RIGHT_PARENTHESIS);
        this.mDelegate.onReadRemoteRssi(bluetoothGatt, i, i2);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onReliableWriteCompleted(@Nullable BluetoothGatt bluetoothGatt, int i) {
        this.mLogger.debug("onReliableWriteCompleted('" + Logging.prettyPrint(bluetoothGatt) + "', status: " + i + MarkdownConstants.RIGHT_PARENTHESIS);
        this.mDelegate.onReliableWriteCompleted(bluetoothGatt, i);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @CallSuper
    public void onServicesDiscovered(@Nullable BluetoothGatt bluetoothGatt, int i) {
        this.mLogger.info("onServicesDiscovered(gatt: " + Logging.prettyPrint(bluetoothGatt) + ", status: " + i + MarkdownConstants.RIGHT_PARENTHESIS);
        this.mDelegate.onServicesDiscovered(bluetoothGatt, i);
    }
}
