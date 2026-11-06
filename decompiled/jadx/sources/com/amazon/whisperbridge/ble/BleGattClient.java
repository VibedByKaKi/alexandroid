package com.amazon.whisperbridge.ble;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.whisperbridge.ble.command.BleChangeConnectionPriorityCommand;
import com.amazon.whisperbridge.ble.command.BleChangeMtuCommand;
import com.amazon.whisperbridge.ble.command.BleCommand;
import com.amazon.whisperbridge.ble.command.BleCommandExecutor;
import com.amazon.whisperbridge.ble.command.BleDiscoverServicesCommand;
import com.amazon.whisperbridge.ble.command.BleReadCharacteristicCommand;
import com.amazon.whisperbridge.ble.command.BleReadDescriptorCommand;
import com.amazon.whisperbridge.ble.command.BleReadRssiCommand;
import com.amazon.whisperbridge.ble.command.BleUpdateNotificationsCommand;
import com.amazon.whisperbridge.ble.command.BleWriteCharacteristicCommand;
import com.amazon.whisperbridge.ble.command.BleWriteDescriptorCommand;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.inject.Inject;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleGattClient {
    private static final String CONNECT_GATT_METHOD_NAME = "connectGatt";
    private static final String TAG = "com.amazon.whisperbridge.ble.BleGattClient";
    private final BluetoothDevice mBluetoothDevice;
    private BluetoothGatt mBluetoothGatt;
    private final Callback mCallback;

    @Inject
    BleCommandExecutor mClientCommandExecutor;
    private final Queue<BleCommand> mCommandQueue;
    private final ScapCallback mScapCallback;
    private final Lock mCommandLock = new ReentrantLock(true);
    private final BleGattCallback mGattCallback = new BleGattCallback();
    private int mMtu = 23;
    private final Map<UUID, BleGattServiceClient> mServiceClients = new HashMap();
    private final ReadWriteLock mServiceClientsLock = new ReentrantReadWriteLock(true);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class BleGattCallback extends BluetoothGattCallback {
        public BleGattCallback() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BleGattClient.this.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            BleGattClient.this.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            BleGattClient.this.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        public final void onConnectionPriorityChange(BluetoothGatt bluetoothGatt, boolean z) {
            BleGattClient.this.onConnectionPriorityChange(bluetoothGatt, z);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            BleGattClient.this.onConnectionStateChange(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            BleGattClient.this.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            BleGattClient.this.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            BleGattClient.this.onMtuChanged(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            BleGattClient.this.onReadRemoteRssi(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            BleGattClient.this.onReliableWriteCompleted(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BleGattClient.this.onServicesDiscovered(bluetoothGatt, i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onConnectionStateChanged(BleGattClient bleGattClient, int i, int i2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ScapCallback {
        void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic);

        void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

        void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

        void onConnectionStateChanged(BleGattClient bleGattClient, int i, int i2);

        void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i);

        void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i);
    }

    public BleGattClient(BluetoothDevice bluetoothDevice, Callback callback, Queue<BleCommand> queue) {
        DaggerBleGattClientComponent.create().inject(this);
        this.mBluetoothDevice = bluetoothDevice;
        this.mCallback = callback;
        this.mScapCallback = null;
        this.mCommandQueue = queue;
    }

    private void performSanityCheck(BluetoothGatt bluetoothGatt) throws AssertionError {
        if (this.mBluetoothGatt != bluetoothGatt) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "Callback GATT does not match client GATT.");
        } else if (this.mCommandQueue.isEmpty()) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "mCommandQueue unexpectedly empty.");
        }
    }

    public final void bindAllServiceClients(Set<BleGattServiceClient> set) throws BleException {
        WJLog.d(TAG, "bindAllServiceClients");
        if (set == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("serviceClients cannot be null.");
            return;
        }
        for (BleGattServiceClient bleGattServiceClient : set) {
            if (!bindServiceClient(bleGattServiceClient)) {
                throw new BleException("Failed to bind service client with UUID=" + bleGattServiceClient.getServiceUuid());
            }
        }
    }

    public final boolean bindAnyServiceClients(Set<BleGattServiceClient> set) {
        WJLog.d(TAG, "bindAnyServiceClients");
        if (set == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("serviceClients cannot be null.");
            return false;
        }
        Iterator<BleGattServiceClient> it2 = set.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            z |= bindServiceClient(it2.next());
        }
        return z;
    }

    public boolean bindServiceClient(BleGattServiceClient bleGattServiceClient) {
        WJLog.d(TAG, "bindServiceClient");
        if (bleGattServiceClient == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("serviceClient cannot be null.");
            return false;
        }
        BluetoothGattService service = this.mBluetoothGatt.getService(bleGattServiceClient.getServiceUuid());
        if (service == null) {
            return false;
        }
        this.mServiceClientsLock.writeLock().lock();
        try {
            if (this.mServiceClients.containsKey(bleGattServiceClient.getServiceUuid())) {
                this.mServiceClients.get(bleGattServiceClient.getServiceUuid()).unbindClient();
            }
            bleGattServiceClient.bindClient(this, service);
            this.mServiceClients.put(bleGattServiceClient.getServiceUuid(), bleGattServiceClient);
            this.mServiceClientsLock.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            this.mServiceClientsLock.writeLock().unlock();
            throw th;
        }
    }

    public void close() {
        WJLog.d(TAG, "close");
        this.mCommandLock.lock();
        try {
            this.mCommandQueue.clear();
            this.mCommandLock.unlock();
            this.mBluetoothGatt.disconnect();
            this.mBluetoothGatt.close();
            this.mServiceClientsLock.writeLock().lock();
            try {
                Iterator<BleGattServiceClient> it2 = this.mServiceClients.values().iterator();
                while (it2.hasNext()) {
                    it2.next().unbindClient();
                }
                this.mServiceClients.clear();
                this.mServiceClientsLock.writeLock().unlock();
            } catch (Throwable th) {
                this.mServiceClientsLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.mCommandLock.unlock();
            throw th2;
        }
    }

    public final boolean containsServiceClient(UUID uuid) {
        WJLog.d(TAG, "containsServiceClient");
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            return false;
        }
        this.mServiceClientsLock.readLock().lock();
        try {
            return this.mServiceClients.containsKey(uuid);
        } finally {
            this.mServiceClientsLock.readLock().unlock();
        }
    }

    public final void disconnect() {
        WJLog.d(TAG, "disconnect");
        this.mBluetoothGatt.disconnect();
    }

    public Future<BleDiscoverServicesCommand.Result> enqueueDiscoverServices() {
        WJLog.d(TAG, "enqueueDiscoverServices");
        this.mCommandLock.lock();
        try {
            BleDiscoverServicesCommand bleDiscoverServicesCommand = new BleDiscoverServicesCommand(this.mBluetoothGatt);
            this.mCommandQueue.add(bleDiscoverServicesCommand);
            return this.mClientCommandExecutor.executeCommand(bleDiscoverServicesCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public Future<BleReadCharacteristicCommand.Result> enqueueReadCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str = TAG;
        WJLog.d(str, "enqueueReadCharacteristic");
        if (bluetoothGattCharacteristic == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("characteristic unexpectedly null.");
            return null;
        }
        this.mCommandLock.lock();
        try {
            BleReadCharacteristicCommand bleReadCharacteristicCommand = new BleReadCharacteristicCommand(this.mBluetoothGatt, bluetoothGattCharacteristic);
            this.mCommandQueue.add(bleReadCharacteristicCommand);
            WJLog.d(str, "Added command to queue. Attempting to execute command: " + bleReadCharacteristicCommand.toString());
            return this.mClientCommandExecutor.executeCommand(bleReadCharacteristicCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public Future<BleReadDescriptorCommand.Result> enqueueReadDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor) {
        WJLog.d(TAG, "enqueueReadDescriptor");
        if (bluetoothGattDescriptor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("descriptor unexpectedly null.");
            return null;
        }
        this.mCommandLock.lock();
        try {
            BleReadDescriptorCommand bleReadDescriptorCommand = new BleReadDescriptorCommand(this.mBluetoothGatt, bluetoothGattDescriptor);
            this.mCommandQueue.add(bleReadDescriptorCommand);
            return this.mClientCommandExecutor.executeCommand(bleReadDescriptorCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public Future<BleReadRssiCommand.Result> enqueueReadRemoteRssi() {
        WJLog.d(TAG, "enqueueReadRemoteRssi");
        this.mCommandLock.lock();
        try {
            BleReadRssiCommand bleReadRssiCommand = new BleReadRssiCommand(this.mBluetoothGatt);
            this.mCommandQueue.add(bleReadRssiCommand);
            return this.mClientCommandExecutor.executeCommand(bleReadRssiCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    @TargetApi(21)
    public Future<Boolean> enqueueRequestConnectionPriorityChange(int i) {
        WJLog.d(TAG, "enqueueRequestConnectionPriorityChange");
        if (i != 0 && i != 1 && i != 2) {
            Single$$ExternalSyntheticBUOutline0.m$3("Unsupported connection priority specified.");
            return null;
        }
        this.mCommandLock.lock();
        try {
            BleChangeConnectionPriorityCommand bleChangeConnectionPriorityCommand = new BleChangeConnectionPriorityCommand(this.mGattCallback, this.mBluetoothGatt, i);
            this.mCommandQueue.add(bleChangeConnectionPriorityCommand);
            return this.mClientCommandExecutor.executeCommand(bleChangeConnectionPriorityCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    @TargetApi(21)
    public Future<BleChangeMtuCommand.Result> enqueueRequestMtuChange(int i) {
        WJLog.d(TAG, "enqueueRequestMtuChange");
        if (i < 23) {
            Single$$ExternalSyntheticBUOutline0.m$3("mtu cannot be smaller than the minimum Bluetooth LE MTU of 23 bytes.");
            return null;
        }
        if (i > 512) {
            Single$$ExternalSyntheticBUOutline0.m$3("mtu cannot be larger than the maximum Bluetooth LE MTU of 512 bytes.");
            return null;
        }
        this.mCommandLock.lock();
        try {
            BleChangeMtuCommand bleChangeMtuCommand = new BleChangeMtuCommand(this.mBluetoothGatt, i);
            this.mCommandQueue.add(bleChangeMtuCommand);
            return this.mClientCommandExecutor.executeCommand(bleChangeMtuCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public Future<BleUpdateNotificationsCommand.Result> enqueueUpdateNotifications(BluetoothGattDescriptor bluetoothGattDescriptor, boolean z) {
        WJLog.d(TAG, "enqueueUpdateNotifications");
        if (bluetoothGattDescriptor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("descriptor unexpectedly null.");
            return null;
        }
        this.mCommandLock.lock();
        try {
            BleUpdateNotificationsCommand bleUpdateNotificationsCommand = new BleUpdateNotificationsCommand(this.mBluetoothGatt, bluetoothGattDescriptor, z);
            this.mCommandQueue.add(bleUpdateNotificationsCommand);
            return this.mClientCommandExecutor.executeCommand(bleUpdateNotificationsCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public Future<BleWriteCharacteristicCommand.Result> enqueueWriteCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        WJLog.d(TAG, "enqueueWriteCharacteristic");
        if (bluetoothGattCharacteristic == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("characteristic unexpectedly null.");
            return null;
        }
        this.mCommandLock.lock();
        try {
            BleWriteCharacteristicCommand bleWriteCharacteristicCommand = new BleWriteCharacteristicCommand(this.mBluetoothGatt, bluetoothGattCharacteristic);
            this.mCommandQueue.add(bleWriteCharacteristicCommand);
            return this.mClientCommandExecutor.executeCommand(bleWriteCharacteristicCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public Future<BleWriteDescriptorCommand.Result> enqueueWriteDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor) {
        WJLog.d(TAG, "enqueueWriteDescriptor");
        if (bluetoothGattDescriptor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("descriptor unexpectedly null.");
            return null;
        }
        this.mCommandLock.lock();
        try {
            BleWriteDescriptorCommand bleWriteDescriptorCommand = new BleWriteDescriptorCommand(this.mBluetoothGatt, bluetoothGattDescriptor);
            this.mCommandQueue.add(bleWriteDescriptorCommand);
            return this.mClientCommandExecutor.executeCommand(bleWriteDescriptorCommand);
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public final BluetoothGatt getBluetoothGatt() {
        return this.mBluetoothGatt;
    }

    public final BleGattCallback getGattCallback() {
        return this.mGattCallback;
    }

    public int getMtu() {
        return this.mMtu;
    }

    public final BleGattServiceClient getServiceClient(UUID uuid) {
        WJLog.d(TAG, "getServiceClient");
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            return null;
        }
        if (!this.mServiceClients.containsKey(uuid)) {
            Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("No service client with uuid=", uuid));
            return null;
        }
        this.mServiceClientsLock.readLock().lock();
        try {
            return this.mServiceClients.get(uuid);
        } finally {
            this.mServiceClientsLock.readLock().unlock();
        }
    }

    public final Collection<BleGattServiceClient> getServiceClients() {
        WJLog.d(TAG, "getServiceClients");
        this.mServiceClientsLock.readLock().lock();
        try {
            return Collections.unmodifiableCollection(this.mServiceClients.values());
        } finally {
            this.mServiceClientsLock.readLock().unlock();
        }
    }

    public final boolean isConnected(Context context) {
        WJLog.d(TAG, "isConnected");
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context cannot be null.");
            return false;
        }
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager != null) {
            return bluetoothManager.getConnectionState(this.mBluetoothDevice, 7) == 2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Could not retrieve BluetoothManager from Context. Ensure you are passing the correct context.");
        return false;
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BleGattServiceClient serviceClient;
        WJLog.d(TAG, "onCharacteristicChanged");
        ScapCallback scapCallback = this.mScapCallback;
        if (scapCallback != null) {
            scapCallback.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        }
        this.mServiceClientsLock.readLock().lock();
        try {
            try {
                serviceClient = getServiceClient(bluetoothGattCharacteristic.getService().getUuid());
            } catch (IllegalArgumentException e) {
                WJLog.e(TAG, "IllegalArgumentException: ", e);
            }
            if (serviceClient == null) {
                throw new IllegalArgumentException("Client does not contain service-client=" + bluetoothGattCharacteristic.getService().getUuid());
            }
            BleGattCharacteristic bleGattCharacteristic = serviceClient.getBleGattCharacteristic(bluetoothGattCharacteristic.getUuid());
            bleGattCharacteristic.setStoredData(bluetoothGattCharacteristic.getValue());
            if (this.mScapCallback == null) {
                serviceClient.onCharacteristicChanged(bleGattCharacteristic);
            } else {
                serviceClient.onCharacteristicUpdated(bleGattCharacteristic);
            }
            this.mServiceClientsLock.readLock().unlock();
        } catch (Throwable th) {
            this.mServiceClientsLock.readLock().unlock();
            throw th;
        }
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        WJLog.d(TAG, "onCharacteristicRead");
        ScapCallback scapCallback = this.mScapCallback;
        if (scapCallback != null) {
            scapCallback.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            if (!(this.mCommandQueue.peek() instanceof BleReadCharacteristicCommand)) {
                throw new AssertionError("Next command in queue is unexpectedly of wrong type.");
            }
            ((BleReadCharacteristicCommand) this.mCommandQueue.remove()).update(new BleReadCharacteristicCommand.Result(i));
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        WJLog.d(TAG, "onCharacteristicWrite");
        ScapCallback scapCallback = this.mScapCallback;
        if (scapCallback != null) {
            scapCallback.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            if (!(this.mCommandQueue.peek() instanceof BleWriteCharacteristicCommand)) {
                throw new AssertionError("Next command in queue is unexpectedly of wrong type.");
            }
            ((BleWriteCharacteristicCommand) this.mCommandQueue.remove()).update(new BleWriteCharacteristicCommand.Result(i));
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public final void onConnectionPriorityChange(BluetoothGatt bluetoothGatt, boolean z) {
        WJLog.d(TAG, "onConnectionPriorityChange");
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            if (!(this.mCommandQueue.peek() instanceof BleChangeConnectionPriorityCommand)) {
                throw new AssertionError("Next command in queue is unexpectedly of wrong type.");
            }
            this.mCommandQueue.remove();
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        String str = TAG;
        WJLog.d(str, "onConnectionStateChange");
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onConnectionStateChanged(this, i, i2);
        }
        ScapCallback scapCallback = this.mScapCallback;
        if (scapCallback != null) {
            scapCallback.onConnectionStateChanged(this, i, i2);
        }
        if (this.mBluetoothGatt == null || i2 != 0 || i == 0) {
            return;
        }
        WJLog.i(str, "Closing BLE gatt connection for unexpected disconnection with status:" + i);
        this.mBluetoothGatt.close();
    }

    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        WJLog.d(TAG, "onDescriptorRead");
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            if (!(this.mCommandQueue.peek() instanceof BleReadDescriptorCommand)) {
                throw new AssertionError("Next command in queue is unexpectedly of wrong type.");
            }
            ((BleReadDescriptorCommand) this.mCommandQueue.remove()).update(new BleReadDescriptorCommand.Result(i));
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        WJLog.d(TAG, "onDescriptorWrite");
        ScapCallback scapCallback = this.mScapCallback;
        if (scapCallback != null) {
            scapCallback.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
                boolean z = this.mCommandQueue.peek() instanceof BleWriteDescriptorCommand;
                Queue<BleCommand> queue = this.mCommandQueue;
                if (z) {
                    ((BleWriteDescriptorCommand) queue.remove()).update(new BleWriteDescriptorCommand.Result(i));
                } else {
                    if (!(queue.peek() instanceof BleUpdateNotificationsCommand)) {
                        throw new AssertionError("Next command in queue is unexpectedly of wrong type.");
                    }
                    ((BleUpdateNotificationsCommand) this.mCommandQueue.remove()).update(new BleUpdateNotificationsCommand.Result(i));
                }
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            this.mCommandLock.unlock();
        } catch (Throwable th) {
            this.mCommandLock.unlock();
            throw th;
        }
    }

    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        WJLog.d(TAG, "onMtuChanged");
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            if (!(this.mCommandQueue.peek() instanceof BleChangeMtuCommand)) {
                throw new AssertionError("Next command in queue is unexpectedly of wrong type.");
            }
            ((BleChangeMtuCommand) this.mCommandQueue.remove()).update(new BleChangeMtuCommand.Result(i, i2));
            if (i2 == 0) {
                this.mMtu = i;
            }
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        WJLog.d(TAG, "onReadRemoteRssi");
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            if (!(this.mCommandQueue.peek() instanceof BleReadRssiCommand)) {
                throw new AssertionError("Next command in queue is unexpectedly of wrong type.");
            }
            ((BleReadRssiCommand) this.mCommandQueue.remove()).update(new BleReadRssiCommand.Result(i, i2));
        } finally {
            this.mCommandLock.unlock();
        }
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        WJLog.d(TAG, "onServicesDiscovered");
        ScapCallback scapCallback = this.mScapCallback;
        if (scapCallback != null) {
            scapCallback.onServicesDiscovered(bluetoothGatt, i);
        }
        this.mCommandLock.lock();
        try {
            try {
                performSanityCheck(bluetoothGatt);
            } catch (AssertionError e) {
                WJLog.e(TAG, "AssertionError: ", e);
            }
            if (!(this.mCommandQueue.peek() instanceof BleDiscoverServicesCommand)) {
                throw new AssertionError("Next command in queue is unexpectedly of wrong type.: " + this.mCommandQueue.peek());
            }
            Iterator<BluetoothGattService> it2 = bluetoothGatt.getServices().iterator();
            while (it2.hasNext()) {
                if (!bindServiceClient(new BleGattServiceClient(it2.next().getUuid()))) {
                    throw new IllegalArgumentException("Service client unexpectedly failed to bind.");
                }
            }
            ((BleDiscoverServicesCommand) this.mCommandQueue.remove()).update(new BleDiscoverServicesCommand.Result(i));
            this.mCommandLock.unlock();
        } catch (Throwable th) {
            this.mCommandLock.unlock();
            throw th;
        }
    }

    public final boolean reconnect() {
        WJLog.d(TAG, "reconnect");
        return this.mBluetoothGatt.connect();
    }

    public final void setBluetoothGatt(BluetoothGatt bluetoothGatt) {
        this.mBluetoothGatt = bluetoothGatt;
    }

    public boolean setCharacteristicNotification(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return this.mBluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
    }

    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
    }

    public BleGattClient(BluetoothDevice bluetoothDevice, ScapCallback scapCallback, Queue<BleCommand> queue) {
        DaggerBleGattClientComponent.create().inject(this);
        this.mBluetoothDevice = bluetoothDevice;
        this.mCallback = null;
        this.mScapCallback = scapCallback;
        this.mCommandQueue = queue;
    }
}
