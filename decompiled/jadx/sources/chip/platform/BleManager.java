package chip.platform;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface BleManager {
    int addConnection(BluetoothGatt bluetoothGatt);

    BluetoothGattCallback getCallback();

    BluetoothGatt getConnection(int i);

    boolean hasFlag(long j);

    int init();

    boolean onCloseConnection(int i);

    int onGetMTU(int i);

    void onNewConnection(int i, boolean z, long j, long j2);

    void onNotifyChipConnectionClosed(int i);

    boolean onSendWriteRequest(int i, byte[] bArr, byte[] bArr2, byte[] bArr3);

    boolean onSubscribeCharacteristic(int i, byte[] bArr, byte[] bArr2);

    boolean onUnsubscribeCharacteristic(int i, byte[] bArr, byte[] bArr2);

    BluetoothGatt removeConnection(int i);

    void setAndroidChipPlatform(AndroidChipPlatform androidChipPlatform);

    void setBleCallback(BleCallback bleCallback);

    long setFlag(long j, boolean z);
}
