package chip.platform;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelUuid;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AndroidBleManager implements BleManager {
    private static final int BLE_TIMEOUT_MS = 10000;
    private static final int BLUETOOTH_ENABLE_TIMEOUT_MS = 1000;
    private static String CHIP_UUID = "0000FFF6-0000-1000-8000-00805F9B34FB";
    private static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static final int INITIAL_CONNECTIONS = 4;
    private static final int MSG_BLE_CONNECT = 1;
    private static final int MSG_BLE_CONNECT_RETRY = 3;
    private static final int MSG_BLE_CONNECT_SUCCESS = 2;
    private static final int MSG_BLE_FAIL = 99;
    private static final int MSG_BLE_SCAN = 0;
    private static final String MSG_BUNDLE_SERVICE_DATA = "serviceData";
    private static final String MSG_BUNDLE_SERVICE_DATA_MASK = "serviceDataMask";
    private static final String TAG = "AndroidBleManager";
    private BleCallback mBleCallback;
    private BleConnectCallback mBleConnectCallback;
    private BluetoothAdapter mBluetoothAdapter;
    private BleConnectionHandler mConnectionHandler;
    private final List<BluetoothGatt> mConnections;
    private Context mContext;
    private BluetoothGattCallback mGattCallback;
    private AndroidChipPlatform mPlatform;
    private ScanCallback mScanCallback;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class BleConnectionHandler extends Handler {
        public BleConnectionHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                AndroidBleManager.this.startBleScan(message.getData());
                return;
            }
            if (i == 1) {
                AndroidBleManager.this.stopBleScan();
                AndroidBleManager.this.connectBLE(AndroidBleManager.this.new ConnectionGattCallback((BluetoothDevice) message.obj));
            } else {
                if (i == 2) {
                    AndroidBleManager.this.bleConnectSuccess(message.obj);
                    return;
                }
                AndroidBleManager androidBleManager = AndroidBleManager.this;
                if (i == 3) {
                    androidBleManager.connectBLE((ConnectionGattCallback) message.obj);
                } else {
                    androidBleManager.stopBleScan();
                    AndroidBleManager.this.bleConnectFail();
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BleMtuDenylist {
        static final boolean BLE_MTU_DENYLISTED;
        static final int BLE_MTU_FALLBACK = 23;

        static {
            String str = Build.MANUFACTURER;
            if ("OnePlus".equals(str)) {
                BLE_MTU_DENYLISTED = "ONE A2005".equals(Build.MODEL);
                return;
            }
            if (!"motorola".equals(str)) {
                BLE_MTU_DENYLISTED = false;
            } else {
                String str2 = Build.MODEL;
                BLE_MTU_DENYLISTED = "XT1575".equals(str2) || "XT1585".equals(str2);
            }
        }

        private BleMtuDenylist() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ConnectionGattCallback extends AndroidBluetoothGattCallback {
        private static final int STATE_DISCOVER_SERVICE = 2;
        private static final int STATE_INIT = 1;
        private static final int STATE_REQUEST_MTU = 3;
        private static final int kGattRetryableErrorStatus = 133;
        private int connectRetriesLeft;
        private BluetoothDevice mDevice;
        private int mState;

        public ConnectionGattCallback(BluetoothDevice bluetoothDevice) {
            super();
            this.mState = 1;
            this.connectRetriesLeft = 3;
            this.mDevice = bluetoothDevice;
        }

        public BluetoothDevice getTargetDevice() {
            return this.mDevice;
        }

        @Override // chip.platform.AndroidBleManager.AndroidBluetoothGattCallback, android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Log.i(AndroidBleManager.TAG, "onConnectionStateChange status = " + i + ", newState= + " + i2);
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            if (i2 == 2 && i == 0) {
                Log.i(AndroidBleManager.TAG, "Discovering Services...");
                this.mState = 2;
                bluetoothGatt.discoverServices();
                return;
            }
            if (i2 == 0 && i == 133) {
                int i3 = this.connectRetriesLeft;
                this.connectRetriesLeft = i3 - 1;
                if (i3 > 0) {
                    Log.i(AndroidBleManager.TAG, "Retries left: " + this.connectRetriesLeft + ". Retrying connect...");
                    bluetoothGatt.close();
                    Message obtainMessage = AndroidBleManager.this.mConnectionHandler.obtainMessage();
                    obtainMessage.what = 3;
                    obtainMessage.obj = this;
                    AndroidBleManager.this.mConnectionHandler.sendMessage(obtainMessage);
                    return;
                }
            }
            if (i2 == 0) {
                Log.i(AndroidBleManager.TAG, "Services Disconnected");
            }
            AndroidBleManager.this.mConnectionHandler.sendEmptyMessage(99);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            if (this.mState != 3) {
                String unused = AndroidBleManager.TAG;
                return;
            }
            if (bluetoothGatt != null && bluetoothGatt.getDevice() != null) {
                bluetoothGatt.getDevice().getName();
            }
            String unused2 = AndroidBleManager.TAG;
            Message obtainMessage = AndroidBleManager.this.mConnectionHandler.obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.obj = bluetoothGatt;
            AndroidBleManager.this.mConnectionHandler.sendMessage(obtainMessage);
        }

        @Override // chip.platform.AndroidBleManager.AndroidBluetoothGattCallback, android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            String unused = AndroidBleManager.TAG;
            super.onServicesDiscovered(bluetoothGatt, i);
            if (this.mState != 2) {
                String unused2 = AndroidBleManager.TAG;
                return;
            }
            Log.i(AndroidBleManager.TAG, "Services Discovered");
            this.mState = 3;
            bluetoothGatt.requestMtu(TelnetCommand.EC);
        }
    }

    public AndroidBleManager(Context context) {
        this();
        this.mContext = context;
        this.mBluetoothAdapter = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.mConnectionHandler = new BleConnectionHandler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bleConnectFail() {
        BleConnectCallback bleConnectCallback = this.mBleConnectCallback;
        if (bleConnectCallback != null) {
            bleConnectCallback.onConnectFailed();
        }
        this.mBleConnectCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bleConnectSuccess(Object obj) {
        this.mConnectionHandler.removeMessages(99);
        BluetoothGatt bluetoothGatt = (BluetoothGatt) obj;
        int addConnection = addConnection(bluetoothGatt);
        setBleCallback(new BleCallback() { // from class: chip.platform.AndroidBleManager.2
            @Override // chip.platform.BleCallback
            public void onCloseBleComplete(int i) {
                String unused = AndroidBleManager.TAG;
            }

            @Override // chip.platform.BleCallback
            public void onNotifyChipConnectionClosed(int i) {
                String unused = AndroidBleManager.TAG;
            }
        });
        BleConnectCallback bleConnectCallback = this.mBleConnectCallback;
        if (bleConnectCallback != null) {
            bleConnectCallback.onConnectSuccess(addConnection);
        } else {
            bluetoothGatt.disconnect();
            removeConnection(addConnection);
        }
        this.mBleConnectCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectBLE(ConnectionGattCallback connectionGattCallback) {
        this.mConnectionHandler.removeMessages(99);
        this.mConnectionHandler.sendEmptyMessageDelayed(99, 10000L);
        BluetoothDevice targetDevice = connectionGattCallback.getTargetDevice();
        Log.i(TAG, "Connecting");
        targetDevice.connectGatt(this.mContext, false, connectionGattCallback, 2);
    }

    private static UUID convertBytesToUUID(byte[] bArr) {
        long j;
        long j2 = 0;
        if (bArr.length == 16) {
            long j3 = 0;
            for (int i = 0; i < 8; i++) {
                j3 = (j3 << 8) | (bArr[i] & 255);
            }
            for (int i2 = 0; i2 < 8; i2++) {
                j2 = (j2 << 8) | (bArr[i2 + 8] & 255);
            }
            j = j2;
            j2 = j3;
        } else {
            j = 0;
        }
        return new UUID(j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] convertUUIDToBytes(UUID uuid) {
        byte[] bArr = new byte[16];
        long leastSignificantBits = uuid.getLeastSignificantBits();
        for (int i = 0; i < 8; i++) {
            bArr[15 - i] = (byte) (255 & leastSignificantBits);
            leastSignificantBits >>= 8;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[7 - i2] = (byte) (mostSignificantBits & 255);
            mostSignificantBits >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int getConnId(BluetoothGatt bluetoothGatt) {
        for (int i = 0; i < this.mConnections.size(); i++) {
            if (this.mConnections.get(i) == bluetoothGatt && bluetoothGatt != null) {
                return i + 1;
            }
        }
        return 0;
    }

    private byte[] getServiceData(int i) {
        int i2 = i & 4095;
        return new byte[]{0, (byte) i2, (byte) (i2 >> 8)};
    }

    private byte[] getServiceDataMask(boolean z) {
        return new byte[]{-1, (byte) (z ? 0 : 255), -1};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startBleScan(Bundle bundle) {
        BluetoothLeScanner bluetoothLeScanner = this.mBluetoothAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            return;
        }
        this.mScanCallback = new ScanCallback() { // from class: chip.platform.AndroidBleManager.1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                ErrorUtils$$ExternalSyntheticOutline0.m(i, "Scan failed ", AndroidBleManager.TAG);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, ScanResult scanResult) {
                BluetoothDevice device = scanResult.getDevice();
                Log.i(AndroidBleManager.TAG, "Bluetooth Device Scanned Addr: " + device.getAddress() + ", " + device.getName());
                Message obtainMessage = AndroidBleManager.this.mConnectionHandler.obtainMessage();
                obtainMessage.what = 1;
                obtainMessage.obj = device;
                AndroidBleManager.this.mConnectionHandler.sendMessage(obtainMessage);
            }
        };
        ScanFilter build = new ScanFilter.Builder().setServiceData(new ParcelUuid(UUID.fromString(CHIP_UUID)), bundle.getByteArray(MSG_BUNDLE_SERVICE_DATA), bundle.getByteArray(MSG_BUNDLE_SERVICE_DATA_MASK)).build();
        ScanSettings build2 = new ScanSettings.Builder().setScanMode(2).build();
        Log.i(TAG, "Starting Bluetooth scan");
        bluetoothLeScanner.startScan(Arrays.asList(build), build2, this.mScanCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBleScan() {
        BluetoothLeScanner bluetoothLeScanner;
        if (this.mScanCallback == null || (bluetoothLeScanner = this.mBluetoothAdapter.getBluetoothLeScanner()) == null) {
            return;
        }
        bluetoothLeScanner.stopScan(this.mScanCallback);
        this.mScanCallback = null;
    }

    @Override // chip.platform.BleManager
    public synchronized int addConnection(BluetoothGatt bluetoothGatt) {
        int i = 0;
        while (true) {
            int size = this.mConnections.size();
            List<BluetoothGatt> list = this.mConnections;
            if (i >= size) {
                list.add(i, bluetoothGatt);
                return i + 1;
            }
            if (list.get(i) == null) {
                this.mConnections.set(i, bluetoothGatt);
                return i + 1;
            }
            i++;
        }
    }

    @Override // chip.platform.BleManager
    public BluetoothGattCallback getCallback() {
        return this.mGattCallback;
    }

    @Override // chip.platform.BleManager
    public synchronized BluetoothGatt getConnection(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            if (i2 < this.mConnections.size()) {
                return this.mConnections.get(i2);
            }
        }
        Log.e(TAG, "Unknown connId " + i);
        return null;
    }

    @Override // chip.platform.BleManager
    public boolean hasFlag(long j) {
        return false;
    }

    @Override // chip.platform.BleManager
    public int init() {
        return 0;
    }

    @Override // chip.platform.BleManager
    public boolean onCloseConnection(int i) {
        BluetoothGatt connection = getConnection(i);
        if (connection == null) {
            Log.i(TAG, "Tried to close BLE connection, but connection was not found.");
            return true;
        }
        connection.close();
        removeConnection(i);
        BleCallback bleCallback = this.mBleCallback;
        if (bleCallback == null) {
            return true;
        }
        bleCallback.onCloseBleComplete(i);
        return true;
    }

    @Override // chip.platform.BleManager
    public int onGetMTU(int i) {
        String str = TAG;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        if (!BleMtuDenylist.BLE_MTU_DENYLISTED) {
            return 0;
        }
        Log.e(str, "Detected Manufacturer/Model with MTU incompatibiility. Reporting MTU: 23");
        return 23;
    }

    @Override // chip.platform.BleManager
    public void onNewConnection(int i, boolean z, long j, long j2) {
        if (this.mContext == null) {
            return;
        }
        this.mBleConnectCallback = new BleConnectCallback(j, j2);
        this.mConnectionHandler.sendEmptyMessageDelayed(99, 10000L);
        Message obtainMessage = this.mConnectionHandler.obtainMessage();
        obtainMessage.what = 0;
        Bundle bundle = new Bundle();
        byte[] serviceData = getServiceData(i);
        byte[] serviceDataMask = getServiceDataMask(z);
        bundle.putByteArray(MSG_BUNDLE_SERVICE_DATA, serviceData);
        bundle.putByteArray(MSG_BUNDLE_SERVICE_DATA_MASK, serviceDataMask);
        obtainMessage.setData(bundle);
        if (this.mBluetoothAdapter.isEnabled()) {
            this.mConnectionHandler.sendMessage(obtainMessage);
        } else {
            this.mBluetoothAdapter.enable();
            this.mConnectionHandler.sendMessageDelayed(obtainMessage, 1000L);
        }
    }

    @Override // chip.platform.BleManager
    public void onNotifyChipConnectionClosed(int i) {
        if (getConnection(i) == null) {
            Log.i(TAG, "Tried to notify connection closed, but BLE connection was not found.");
            return;
        }
        removeConnection(i);
        BleCallback bleCallback = this.mBleCallback;
        if (bleCallback != null) {
            bleCallback.onNotifyChipConnectionClosed(i);
        }
    }

    @Override // chip.platform.BleManager
    public boolean onSendWriteRequest(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        BluetoothGatt connection = getConnection(i);
        if (connection == null) {
            Log.i(TAG, "Tried to send characteristic, but BLE connection was not found.");
            return false;
        }
        BluetoothGattService service = connection.getService(convertBytesToUUID(bArr));
        if (service == null) {
            Log.e(TAG, "Bad service");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(convertBytesToUUID(bArr2));
        if (!characteristic.setValue(bArr3)) {
            Log.e(TAG, "Failed to set characteristic");
            return false;
        }
        characteristic.setWriteType(2);
        if (connection.writeCharacteristic(characteristic)) {
            return true;
        }
        Log.e(TAG, "Failed writing char");
        return false;
    }

    @Override // chip.platform.BleManager
    public boolean onSubscribeCharacteristic(int i, byte[] bArr, byte[] bArr2) {
        BluetoothGatt connection = getConnection(i);
        if (connection == null) {
            Log.i(TAG, "Tried to send characteristic, but BLE connection was not found.");
            return false;
        }
        BluetoothGattService service = connection.getService(convertBytesToUUID(bArr));
        if (service == null) {
            Log.e(TAG, "Bad service");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(convertBytesToUUID(bArr2));
        if (characteristic == null) {
            Log.e(TAG, "Bad characteristic");
            return false;
        }
        if (!connection.setCharacteristicNotification(characteristic, true)) {
            Log.e(TAG, "Failed to subscribe to characteristic.");
            return false;
        }
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString(CLIENT_CHARACTERISTIC_CONFIG));
        if ((characteristic.getProperties() & 32) != 0) {
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            if (!connection.writeDescriptor(descriptor)) {
                Log.e(TAG, "writeDescriptor failed");
                return false;
            }
        } else if ((characteristic.getProperties() & 16) != 0) {
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            if (!connection.writeDescriptor(descriptor)) {
                Log.e(TAG, "writeDescriptor failed");
                return false;
            }
        }
        return true;
    }

    @Override // chip.platform.BleManager
    public boolean onUnsubscribeCharacteristic(int i, byte[] bArr, byte[] bArr2) {
        BluetoothGatt connection = getConnection(i);
        if (connection == null) {
            Log.i(TAG, "Tried to unsubscribe characteristic, but BLE connection was not found.");
            return false;
        }
        BluetoothGattService service = connection.getService(convertBytesToUUID(bArr));
        if (service == null) {
            Log.e(TAG, "Bad service");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(convertBytesToUUID(bArr2));
        if (characteristic == null) {
            Log.e(TAG, "Bad characteristic");
            return false;
        }
        if (!connection.setCharacteristicNotification(characteristic, false)) {
            Log.e(TAG, "Failed to unsubscribe to characteristic.");
            return false;
        }
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString(CLIENT_CHARACTERISTIC_CONFIG));
        descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        if (connection.writeDescriptor(descriptor)) {
            return true;
        }
        Log.e(TAG, "writeDescriptor failed");
        return false;
    }

    @Override // chip.platform.BleManager
    public synchronized BluetoothGatt removeConnection(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            if (i2 < this.mConnections.size()) {
                return this.mConnections.set(i2, null);
            }
        }
        Log.e(TAG, "Trying to remove unknown connId " + i);
        return null;
    }

    @Override // chip.platform.BleManager
    public void setAndroidChipPlatform(AndroidChipPlatform androidChipPlatform) {
        this.mPlatform = androidChipPlatform;
    }

    @Override // chip.platform.BleManager
    public void setBleCallback(BleCallback bleCallback) {
        this.mBleCallback = bleCallback;
    }

    @Override // chip.platform.BleManager
    public long setFlag(long j, boolean z) {
        return 0L;
    }

    public AndroidBleManager() {
        this.mConnections = new ArrayList(4);
        this.mGattCallback = new AndroidBluetoothGattCallback();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AndroidBluetoothGattCallback extends BluetoothGattCallback {
        public AndroidBluetoothGattCallback() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            byte[] convertUUIDToBytes = AndroidBleManager.convertUUIDToBytes(bluetoothGattCharacteristic.getService().getUuid());
            byte[] convertUUIDToBytes2 = AndroidBleManager.convertUUIDToBytes(bluetoothGattCharacteristic.getUuid());
            int connId = AndroidBleManager.this.getConnId(bluetoothGatt);
            if (connId > 0) {
                AndroidBleManager.this.mPlatform.handleIndicationReceived(connId, convertUUIDToBytes, convertUUIDToBytes2, bluetoothGattCharacteristic.getValue());
            } else {
                Log.e(AndroidBleManager.TAG, "onCharacteristicChanged no active connection");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            byte[] convertUUIDToBytes = AndroidBleManager.convertUUIDToBytes(bluetoothGattCharacteristic.getService().getUuid());
            byte[] convertUUIDToBytes2 = AndroidBleManager.convertUUIDToBytes(bluetoothGattCharacteristic.getUuid());
            if (i == 0) {
                int connId = AndroidBleManager.this.getConnId(bluetoothGatt);
                if (connId > 0) {
                    AndroidBleManager.this.mPlatform.handleWriteConfirmation(connId, convertUUIDToBytes, convertUUIDToBytes2, i == 0);
                    return;
                } else {
                    Log.e(AndroidBleManager.TAG, "onCharacteristicWrite no active connection");
                    return;
                }
            }
            Log.e(AndroidBleManager.TAG, "onCharacteristicWrite for " + bluetoothGattCharacteristic.getUuid().toString() + " failed with status: " + i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 0) {
                int connId = AndroidBleManager.this.getConnId(bluetoothGatt);
                if (connId <= 0) {
                    Log.e(AndroidBleManager.TAG, "onConnectionStateChange disconnected: no active connection");
                } else {
                    String unused = AndroidBleManager.TAG;
                    AndroidBleManager.this.mPlatform.handleConnectionError(connId);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            byte[] convertUUIDToBytes = AndroidBleManager.convertUUIDToBytes(characteristic.getService().getUuid());
            byte[] convertUUIDToBytes2 = AndroidBleManager.convertUUIDToBytes(characteristic.getUuid());
            if (i != 0) {
                Log.e(AndroidBleManager.TAG, "onDescriptorWrite for " + bluetoothGattDescriptor.getUuid().toString() + " failed with status: " + i);
            }
            int connId = AndroidBleManager.this.getConnId(bluetoothGatt);
            if (connId == 0) {
                Log.e(AndroidBleManager.TAG, "onDescriptorWrite no active connection");
                return;
            }
            if (bluetoothGattDescriptor.getValue() == BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) {
                AndroidBleManager.this.mPlatform.handleSubscribeComplete(connId, convertUUIDToBytes, convertUUIDToBytes2, i == 0);
                return;
            }
            if (bluetoothGattDescriptor.getValue() == BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) {
                AndroidBleManager.this.mPlatform.handleSubscribeComplete(connId, convertUUIDToBytes, convertUUIDToBytes2, i == 0);
            } else if (bluetoothGattDescriptor.getValue() == BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE) {
                AndroidBleManager.this.mPlatform.handleUnsubscribeComplete(connId, convertUUIDToBytes, convertUUIDToBytes2, i == 0);
            } else {
                String unused = AndroidBleManager.TAG;
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        }
    }
}
