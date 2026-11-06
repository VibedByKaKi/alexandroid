package com.amazon.whisperjoin.provisionerSDK.devices.basic;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.amazon.whisperbridge.ble.BleException;
import com.amazon.whisperbridge.ble.BleGattCharacteristic;
import com.amazon.whisperbridge.ble.BleGattClient;
import com.amazon.whisperbridge.ble.BleGattServiceClient;
import com.amazon.whisperbridge.ble.BleManager;
import com.amazon.whisperbridge.ble.command.BleDiscoverServicesCommand;
import com.amazon.whisperbridge.ble.command.BleReadCharacteristicCommand;
import com.amazon.whisperbridge.ble.command.BleWriteCharacteristicCommand;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.BLETransportOperationError;
import com.amazon.whisperjoin.provisionerSDK.devices.basic.client.BasicBLEGattServiceClient;
import com.amazon.whisperjoin.util.rx.RxLog;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class BasicBLEDevice implements BLEDevice, BleGattClient.Callback {
    private static final String TAG = "BasicBLEDevice";
    private BleGattClient mBleGattClient;
    private final BleManager mBleManager;
    private BluetoothDevice mBluetoothDevice;
    private Context mContext;
    private PublishSubject<Integer> mNewConnectionStateSubject;
    private Scheduler mObserverOnScheduler;
    private Scheduler mSubscribeOnScheduler;

    public BasicBLEDevice(BluetoothDevice bluetoothDevice, BleManager bleManager, Context context) {
        this.mBleManager = bleManager;
        this.mNewConnectionStateSubject = PublishSubject.create();
        this.mBleGattClient = null;
        this.mBluetoothDevice = bluetoothDevice;
        this.mContext = context;
        this.mSubscribeOnScheduler = Schedulers.io();
        this.mObserverOnScheduler = AndroidSchedulers.mainThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkOperationSuccess(int i, BLETransportOperationError.Operation operation) throws BLETransportOperationError {
        if (i != 0) {
            throw new BLETransportOperationError(operation);
        }
    }

    private Observable<Integer> getConnectionUpdates() {
        return this.mNewConnectionStateSubject.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Completable waitForConnectedState() {
        return getConnectionUpdates().doOnNext(RxLog.doOnNext(TAG, "New Connection Update")).filter(new Predicate<Integer>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.4
            @Override // io.reactivex.rxjava3.functions.Predicate
            public boolean test(@NonNull Integer num) throws Exception {
                return num.equals(2);
            }
        }).take(1L).flatMapCompletable(new Function<Integer, CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.3
            @Override // io.reactivex.rxjava3.functions.Function
            public CompletableSource apply(@NonNull Integer num) throws Exception {
                return Completable.complete();
            }
        });
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.devices.basic.BLEDevice
    public Completable bindServiceClient(final BasicBLEGattServiceClient basicBLEGattServiceClient) {
        return Completable.defer(new Supplier<CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public CompletableSource get() throws Exception {
                return !BasicBLEDevice.this.mBleGattClient.bindServiceClient(basicBLEGattServiceClient) ? Completable.error(new BLETransportOperationError(BLETransportOperationError.Operation.BIND_SERVICE_CLIENT)) : Completable.complete();
            }
        }).doOnSubscribe(RxLog.doOnSubscribe(TAG, "Binding new service client"));
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.devices.basic.BLEDevice
    public Completable disconnect() {
        return Completable.defer(new Supplier<CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public CompletableSource get() throws Exception {
                BasicBLEDevice.this.mBleGattClient.close();
                return Completable.complete();
            }
        }).doOnComplete(RxLog.doOnComplete(TAG, "Successfully disconnected")).onErrorResumeNext(new Function<Throwable, CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.5
            @Override // io.reactivex.rxjava3.functions.Function
            public CompletableSource apply(@NonNull Throwable th) throws Exception {
                return Completable.error(new BleException("Error when trying to disconnect."));
            }
        });
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.devices.basic.BLEDevice
    public Completable discoverServices() {
        Single defer = Single.defer(new Supplier<SingleSource<BleDiscoverServicesCommand.Result>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public SingleSource<BleDiscoverServicesCommand.Result> get() throws Exception {
                return Single.fromFuture(BasicBLEDevice.this.mBleGattClient.enqueueDiscoverServices());
            }
        });
        String str = TAG;
        return defer.doOnSubscribe(RxLog.doOnSubscribe(str, "Enqueuing Discovery of Services")).subscribeOn(this.mSubscribeOnScheduler).observeOn(this.mObserverOnScheduler).onErrorResumeNext(new Function<Throwable, SingleSource<BleDiscoverServicesCommand.Result>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.8
            @Override // io.reactivex.rxjava3.functions.Function
            public SingleSource<BleDiscoverServicesCommand.Result> apply(@NonNull Throwable th) throws Exception {
                return Single.error(new BLETransportOperationError(BLETransportOperationError.Operation.DISCOVER_GATT_SERVICES));
            }
        }).flatMapCompletable(new Function<BleDiscoverServicesCommand.Result, CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.7
            @Override // io.reactivex.rxjava3.functions.Function
            public CompletableSource apply(@NonNull BleDiscoverServicesCommand.Result result) throws Exception {
                BasicBLEDevice.this.checkOperationSuccess(result.status, BLETransportOperationError.Operation.DISCOVER_GATT_SERVICES);
                return Completable.complete();
            }
        }).doOnComplete(RxLog.doOnComplete(str, "Discover Services Complete")).doOnError(RxLog.doOnError(str, "An error occurred while discovering services"));
    }

    @Override // com.amazon.whisperbridge.ble.BleGattClient.Callback
    public void onConnectionStateChanged(BleGattClient bleGattClient, int i, int i2) {
        if (bleGattClient != this.mBleGattClient) {
            this.mNewConnectionStateSubject.onError(new AssertionError("Client callback mismatch"));
        }
        this.mNewConnectionStateSubject.onNext(Integer.valueOf(i2));
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.devices.basic.BLEDevice
    public Single<byte[]> readCharacteristic(final UUID uuid, final UUID uuid2) {
        Single defer = Single.defer(new Supplier<SingleSource<BleReadCharacteristicCommand.Result>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public SingleSource<BleReadCharacteristicCommand.Result> get() throws Exception {
                return Single.fromFuture(BasicBLEDevice.this.mBleGattClient.getServiceClient(uuid).readCharacteristic(uuid2));
            }
        });
        String str = TAG;
        Locale locale = Locale.ENGLISH;
        return defer.doOnSubscribe(RxLog.doOnSubscribe(str, "Reading characteristic: Service: " + uuid.toString() + ", Characteristic: " + uuid2.toString())).subscribeOn(this.mSubscribeOnScheduler).observeOn(this.mObserverOnScheduler).onErrorResumeNext(new Function<Throwable, SingleSource<BleReadCharacteristicCommand.Result>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.12
            @Override // io.reactivex.rxjava3.functions.Function
            public SingleSource<BleReadCharacteristicCommand.Result> apply(@NonNull Throwable th) throws Exception {
                return Single.error(new BLETransportOperationError(th, BLETransportOperationError.Operation.INITIATE_READ_CHARACTERISTIC));
            }
        }).flatMap(new Function<BleReadCharacteristicCommand.Result, SingleSource<byte[]>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.11
            @Override // io.reactivex.rxjava3.functions.Function
            public SingleSource<byte[]> apply(@NonNull BleReadCharacteristicCommand.Result result) throws Exception {
                BleGattServiceClient serviceClient = BasicBLEDevice.this.mBleGattClient.getServiceClient(uuid);
                BasicBLEDevice.this.checkOperationSuccess(result.status, BLETransportOperationError.Operation.CONFIRM_READ_CHARACTERISTIC);
                return Single.just(serviceClient.getBleGattCharacteristic(uuid2).getStoredData());
            }
        }).doOnSuccess(RxLog.doOnSuccess(str, "Reading characteristic complete")).doOnError(RxLog.doOnError(str, "An Error Occurred while reading characteristic: Service: " + uuid.toString() + ", Characteristic: " + uuid2.toString()));
    }

    public void setBleGattClient(BleGattClient bleGattClient) {
        this.mBleGattClient = bleGattClient;
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.devices.basic.BLEDevice
    public Observable<byte[]> subscribeToNotifications(final UUID uuid, final UUID uuid2) {
        Completable defer = Completable.defer(new Supplier<CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public CompletableSource get() throws Exception {
                return ((BasicBLEGattServiceClient) BasicBLEDevice.this.mBleGattClient.getServiceClient(uuid)).enableNotifications(uuid2);
            }
        });
        String str = TAG;
        Locale locale = Locale.ENGLISH;
        return defer.doOnSubscribe(RxLog.doOnSubscribe(str, "Subscribing to characteristic notifications: Service: " + uuid.toString() + ", Characteristic: " + uuid2.toString())).onErrorResumeNext(new Function<Throwable, CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.19
            @Override // io.reactivex.rxjava3.functions.Function
            public CompletableSource apply(@NonNull Throwable th) throws Exception {
                return Completable.error(new BLETransportOperationError(th, BLETransportOperationError.Operation.ENABLE_NOTIFICATIONS));
            }
        }).andThen(Observable.defer(new Supplier<ObservableSource<BleGattCharacteristic>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public ObservableSource<BleGattCharacteristic> get() throws Exception {
                return ((BasicBLEGattServiceClient) BasicBLEDevice.this.mBleGattClient.getServiceClient(uuid)).getCharacteristicUpdates();
            }
        })).filter(new Predicate<BleGattCharacteristic>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.18
            @Override // io.reactivex.rxjava3.functions.Predicate
            public boolean test(@NonNull BleGattCharacteristic bleGattCharacteristic) throws Exception {
                return bleGattCharacteristic.getUuid().equals(uuid2);
            }
        }).flatMap(new Function<BleGattCharacteristic, ObservableSource<byte[]>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.17
            @Override // io.reactivex.rxjava3.functions.Function
            public ObservableSource<byte[]> apply(@NonNull BleGattCharacteristic bleGattCharacteristic) throws Exception {
                return Observable.just(bleGattCharacteristic.getStoredData());
            }
        }).doOnError(RxLog.doOnError(str, "An error occurred while subscribing to characteristic notifications: Service: " + uuid.toString() + ", Characteristic: " + uuid2.toString()));
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.devices.basic.BLEDevice
    public Completable waitForConnection(final boolean z) {
        Single defer = Single.defer(new Supplier<SingleSource<BleGattClient>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public SingleSource<BleGattClient> get() throws Exception {
                return Single.just(BasicBLEDevice.this.mBleManager.connectToServer(BasicBLEDevice.this.mContext, BasicBLEDevice.this.mBluetoothDevice, this, z));
            }
        });
        String str = TAG;
        return defer.doOnSubscribe(RxLog.doOnSubscribe(str, "Starting connection to device.")).flatMapCompletable(new Function<BleGattClient, CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.1
            @Override // io.reactivex.rxjava3.functions.Function
            public CompletableSource apply(@NonNull BleGattClient bleGattClient) throws Exception {
                this.mBleGattClient = bleGattClient;
                return BasicBLEDevice.this.waitForConnectedState();
            }
        }).doOnComplete(RxLog.doOnComplete(str, "Successfully connected to device")).doOnError(RxLog.doOnError(str, "An error occurred while connecting"));
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.devices.basic.BLEDevice
    public Completable writeCharacteristic(final UUID uuid, final UUID uuid2, final byte[] bArr) {
        Single defer = Single.defer(new Supplier<SingleSource<BleWriteCharacteristicCommand.Result>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.reactivex.rxjava3.functions.Supplier
            public SingleSource<BleWriteCharacteristicCommand.Result> get() throws Exception {
                BleGattServiceClient serviceClient = BasicBLEDevice.this.mBleGattClient.getServiceClient(uuid);
                serviceClient.getBleGattCharacteristic(uuid2).setStoredData(bArr);
                return Single.fromFuture(serviceClient.writeCharacteristic(uuid2));
            }
        });
        String str = TAG;
        Locale locale = Locale.ENGLISH;
        return defer.doOnSubscribe(RxLog.doOnSubscribe(str, "Writing characteristic: Service: " + uuid.toString() + ", Characteristic: " + uuid2.toString())).subscribeOn(this.mSubscribeOnScheduler).observeOn(this.mObserverOnScheduler).onErrorResumeNext(new Function<Throwable, SingleSource<BleWriteCharacteristicCommand.Result>>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.15
            @Override // io.reactivex.rxjava3.functions.Function
            public SingleSource<BleWriteCharacteristicCommand.Result> apply(@NonNull Throwable th) throws Exception {
                return Single.error(new BLETransportOperationError(th, BLETransportOperationError.Operation.INITIATE_WRITE_CHARACTERISTIC));
            }
        }).flatMapCompletable(new Function<BleWriteCharacteristicCommand.Result, CompletableSource>() { // from class: com.amazon.whisperjoin.provisionerSDK.devices.basic.BasicBLEDevice.14
            @Override // io.reactivex.rxjava3.functions.Function
            public CompletableSource apply(@NonNull BleWriteCharacteristicCommand.Result result) throws Exception {
                BasicBLEDevice.this.checkOperationSuccess(result.status, BLETransportOperationError.Operation.CONFIRM_WRITE_CHARACTERISTIC);
                return Completable.complete();
            }
        }).doOnComplete(RxLog.doOnComplete(str, "Writing characteristic complete")).doOnError(RxLog.doOnError(str, "An Error Occurred while writing characteristic: Service: " + uuid.toString() + ", Characteristic: " + uuid2.toString()));
    }

    public BasicBLEDevice(BluetoothDevice bluetoothDevice, BleManager bleManager, Context context, Scheduler scheduler, Scheduler scheduler2) {
        this.mBleManager = bleManager;
        this.mNewConnectionStateSubject = PublishSubject.create();
        this.mBleGattClient = null;
        this.mBluetoothDevice = bluetoothDevice;
        this.mContext = context;
        this.mSubscribeOnScheduler = scheduler;
        this.mObserverOnScheduler = scheduler2;
    }
}
