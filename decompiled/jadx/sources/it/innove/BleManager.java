package it.innove;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.companion.CompanionDeviceManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.amazon.alexa.voice.ui.onedesign.util.image.ImageType;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class BleManager extends NativeBleManagerSpec {
    private static final int ENABLE_REQUEST = 539;
    public static final String LOG_TAG = "RNBleManager";
    private static final char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static ReadableMap moduleOptions;
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothManager bluetoothManager;
    private BondRequest bondRequest;

    @Nullable
    private final CompanionScanner companionScanner;
    private Context context;
    private Callback enableBluetoothCallback;
    private boolean forceLegacy;
    private final ActivityEventListener mActivityEventListener;
    private final BroadcastReceiver mReceiver;
    private final Map<String, Peripheral> peripherals;
    private ReactApplicationContext reactContext;
    private BondRequest removeBondRequest;
    private ScanManager scanManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class MyBroadcastReceiver extends BroadcastReceiver {
        private final BleManager bleManager;

        public MyBroadcastReceiver(BleManager bleManager) {
            this.bleManager = bleManager;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                String str = "off";
                switch (intExtra) {
                    case 10:
                        BleManager.this.clearPeripherals();
                        break;
                    case 11:
                        str = "turning_on";
                        break;
                    case 12:
                        str = "on";
                        break;
                    case 13:
                        BleManager.this.disconnectPeripherals();
                        str = "turning_off";
                        break;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("state", str);
                BleManager.this.emitOnDidUpdateState(createMap);
                return;
            }
            if (!action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                if (action.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                    BluetoothDevice bluetoothDevice = Build.VERSION.SDK_INT >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (BleManager.this.bondRequest == null || !BleManager.this.bondRequest.uuid.equals(bluetoothDevice.getAddress()) || BleManager.this.bondRequest.pin == null) {
                        return;
                    }
                    bluetoothDevice.setPin(BleManager.this.bondRequest.pin.getBytes());
                    bluetoothDevice.createBond();
                    return;
                }
                return;
            }
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
            int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE);
            BluetoothDevice bluetoothDevice2 = Build.VERSION.SDK_INT >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (BleManager.this.bondRequest != null && BleManager.this.bondRequest.uuid.equals(bluetoothDevice2.getAddress())) {
                if (intExtra2 == 12) {
                    BleManager.this.bondRequest.callback.invoke(new Object[0]);
                    BleManager.this.bondRequest = null;
                } else if (intExtra2 == 10 || intExtra2 == Integer.MIN_VALUE) {
                    BleManager.this.bondRequest.callback.invoke("Bond request has been denied");
                    BleManager.this.bondRequest = null;
                }
            }
            if (intExtra2 == 12) {
                BleManager.this.emitOnPeripheralDidBond((!BleManager.this.forceLegacy ? new DefaultPeripheral(bluetoothDevice2, this.bleManager) : new Peripheral(bluetoothDevice2, this.bleManager)).asWritableMap());
            }
            if (BleManager.this.removeBondRequest != null && BleManager.this.removeBondRequest.uuid.equals(bluetoothDevice2.getAddress()) && intExtra2 == 10 && intExtra3 == 12) {
                BleManager.this.removeBondRequest.callback.invoke(new Object[0]);
                BleManager.this.removeBondRequest = null;
            }
        }
    }

    public BleManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        BaseActivityEventListener baseActivityEventListener = new BaseActivityEventListener() { // from class: it.innove.BleManager.1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                if (i != BleManager.ENABLE_REQUEST || BleManager.this.enableBluetoothCallback == null) {
                    return;
                }
                BleManager bleManager = BleManager.this;
                if (i2 == -1) {
                    bleManager.enableBluetoothCallback.invoke(new Object[0]);
                } else {
                    bleManager.enableBluetoothCallback.invoke("User refused to enable");
                }
                BleManager.this.enableBluetoothCallback = null;
            }
        };
        this.mActivityEventListener = baseActivityEventListener;
        this.peripherals = new LinkedHashMap();
        this.mReceiver = new MyBroadcastReceiver(this) { // from class: it.innove.BleManager.2
        };
        this.context = reactApplicationContext;
        this.reactContext = reactApplicationContext;
        this.companionScanner = reactApplicationContext.getPackageManager().hasSystemFeature("android.software.companion_device_setup") ? new CompanionScanner(reactApplicationContext, this) : null;
        reactApplicationContext.addActivityEventListener(baseActivityEventListener);
    }

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static WritableArray bytesToWritableArray(byte[] bArr) {
        WritableArray createArray = Arguments.createArray();
        for (byte b : bArr) {
            createArray.pushInt(b & 255);
        }
        return createArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeripherals() {
        if (this.peripherals.isEmpty()) {
            return;
        }
        synchronized (this.peripherals) {
            this.peripherals.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectPeripherals() {
        if (this.peripherals.isEmpty()) {
            return;
        }
        synchronized (this.peripherals) {
            try {
                for (Peripheral peripheral : this.peripherals.values()) {
                    if (peripheral.isConnected()) {
                        peripheral.disconnect(null, true);
                    }
                    peripheral.errorAndClearAllCallbacks("disconnected by BleManager");
                    peripheral.resetQueuesAndBuffers();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private BluetoothAdapter getBluetoothAdapter() {
        if (this.bluetoothAdapter == null) {
            this.bluetoothAdapter = ((BluetoothManager) this.context.getSystemService("bluetooth")).getAdapter();
        }
        return this.bluetoothAdapter;
    }

    private BluetoothManager getBluetoothManager() {
        if (this.bluetoothManager == null) {
            this.bluetoothManager = (BluetoothManager) this.context.getSystemService("bluetooth");
        }
        return this.bluetoothManager;
    }

    private Peripheral retrieveOrCreatePeripheral(String str) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral != null) {
            return peripheral;
        }
        synchronized (this.peripherals) {
            if (str != null) {
                try {
                    str = str.toUpperCase();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (BluetoothAdapter.checkBluetoothAddress(str)) {
                BluetoothDevice remoteDevice = this.bluetoothAdapter.getRemoteDevice(str);
                peripheral = !this.forceLegacy ? new DefaultPeripheral(remoteDevice, this) : new Peripheral(remoteDevice, this);
                this.peripherals.put(str, peripheral);
            }
        }
        return peripheral;
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void checkState(Callback callback) {
        String str;
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (this.context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            if (bluetoothAdapter != null) {
                switch (bluetoothAdapter.getState()) {
                    case 11:
                        str = "turning_on";
                        break;
                    case 12:
                        str = "on";
                        break;
                    case 13:
                        ScanManager scanManager = this.scanManager;
                        if (scanManager != null) {
                            scanManager.setScanning(false);
                        }
                        str = "turning_off";
                        break;
                    default:
                        ScanManager scanManager2 = this.scanManager;
                        if (scanManager2 != null) {
                            scanManager2.setScanning(false);
                            break;
                        }
                        break;
                }
            }
            str = "off";
        } else {
            str = ImageType.UNSUPPORTED;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("state", str);
        emitOnDidUpdateState(createMap);
        callback.invoke(str);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    @SuppressLint({"NewApi"})
    public void companionScan(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        CompanionScanner companionScanner = this.companionScanner;
        if (companionScanner == null) {
            callback.invoke("not supported");
        } else {
            companionScanner.scan(readableArray, readableMap, callback);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void connect(String str, ReadableMap readableMap, Callback callback) {
        Peripheral retrieveOrCreatePeripheral = retrieveOrCreatePeripheral(str);
        if (retrieveOrCreatePeripheral == null) {
            callback.invoke("Invalid peripheral uuid");
        } else {
            retrieveOrCreatePeripheral.connect(callback, getCurrentActivity(), readableMap);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    @SuppressLint({"MissingPermission"})
    public void createBond(String str, String str2, Callback callback) {
        Iterator<BluetoothDevice> it2 = getBluetoothAdapter().getBondedDevices().iterator();
        while (it2.hasNext()) {
            if (str.equalsIgnoreCase(it2.next().getAddress())) {
                callback.invoke(new Object[0]);
                return;
            }
        }
        Peripheral retrieveOrCreatePeripheral = retrieveOrCreatePeripheral(str);
        if (retrieveOrCreatePeripheral == null) {
            callback.invoke("Invalid peripheral uuid");
            return;
        }
        if (this.bondRequest != null) {
            callback.invoke("Only allow one bond request at a time");
        } else if (retrieveOrCreatePeripheral.getDevice().createBond()) {
            this.bondRequest = new BondRequest(str, str2, callback);
        } else {
            callback.invoke("Create bond request fail");
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void disconnect(String str, boolean z, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral != null) {
            peripheral.disconnect(callback, z);
        } else {
            callback.invoke("Peripheral not found");
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    @SuppressLint({"MissingPermission"})
    public void enableBluetooth(Callback callback) {
        if (getBluetoothAdapter() == null) {
            callback.invoke("No bluetooth support");
            return;
        }
        if (getBluetoothAdapter().isEnabled()) {
            callback.invoke(new Object[0]);
            return;
        }
        Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        if (getCurrentActivity() == null) {
            callback.invoke("Current activity not available");
            return;
        }
        this.enableBluetoothCallback = callback;
        try {
            getCurrentActivity().startActivityForResult(intent, ENABLE_REQUEST);
        } catch (Exception unused) {
            this.enableBluetoothCallback = null;
            callback.invoke("Error starting enable bluetooth activity");
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void getAssociatedPeripherals(Callback callback) {
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it2 = ((CompanionDeviceManager) getCompanionDeviceManager()).getAssociations().iterator();
        while (it2.hasNext()) {
            createArray.pushMap(retrieveOrCreatePeripheral(it2.next()).asWritableMap());
        }
        callback.invoke(null, createArray);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    @SuppressLint({"MissingPermission"})
    public void getBondedPeripherals(Callback callback) {
        WritableArray createArray = Arguments.createArray();
        for (BluetoothDevice bluetoothDevice : getBluetoothAdapter().getBondedDevices()) {
            createArray.pushMap((!this.forceLegacy ? new DefaultPeripheral(bluetoothDevice, this) : new Peripheral(bluetoothDevice, this)).asWritableMap());
        }
        callback.invoke(null, createArray);
    }

    @RequiresApi(api = 26)
    public Object getCompanionDeviceManager() {
        return this.reactContext.getCurrentActivity().getSystemService("companiondevice");
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    @SuppressLint({"MissingPermission"})
    public void getConnectedPeripherals(ReadableArray readableArray, Callback callback) {
        WritableArray createArray = Arguments.createArray();
        if (getBluetoothAdapter() == null) {
            callback.invoke("No bluetooth support");
            return;
        }
        Iterator<BluetoothDevice> it2 = getBluetoothManager().getConnectedDevices(7).iterator();
        while (it2.hasNext()) {
            createArray.pushMap(savePeripheral(it2.next()).asWritableMap());
        }
        callback.invoke(null, createArray);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void getDiscoveredPeripherals(Callback callback) {
        WritableArray createArray = Arguments.createArray();
        synchronized (this.peripherals) {
            try {
                Iterator<Map.Entry<String, Peripheral>> it2 = this.peripherals.entrySet().iterator();
                while (it2.hasNext()) {
                    createArray.pushMap(it2.next().getValue().asWritableMap());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        callback.invoke(null, createArray);
    }

    @Override // it.innove.NativeBleManagerSpec
    public void getMaximumWriteValueLengthForWithResponse(String str, Callback callback) {
        callback.invoke("Not implemented");
    }

    @Override // it.innove.NativeBleManagerSpec
    public void getMaximumWriteValueLengthForWithoutResponse(String str, Callback callback) {
        callback.invoke("Not implemented");
    }

    @Override // it.innove.NativeBleManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NativeBleManagerSpec.NAME;
    }

    public Peripheral getPeripheral(BluetoothDevice bluetoothDevice) {
        return this.peripherals.get(bluetoothDevice.getAddress());
    }

    public ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        try {
            this.context.unregisterReceiver(this.mReceiver);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Receiver not registered or already unregistered", e);
        }
        try {
            disconnectPeripherals();
        } catch (Exception unused) {
        }
        ScanManager scanManager = this.scanManager;
        if (scanManager != null) {
            scanManager.stopScan(new BleManager$$ExternalSyntheticLambda0());
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    public void isPeripheralConnected(String str, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral != null) {
            callback.invoke(null, Boolean.valueOf(peripheral.isConnected()));
        } else {
            callback.invoke("Peripheral not found");
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void isScanning(Callback callback) {
        ScanManager scanManager = this.scanManager;
        if (scanManager != null) {
            callback.invoke(null, Boolean.valueOf(scanManager.isScanning()));
        } else {
            callback.invoke(null, Boolean.FALSE);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void isStarted(Callback callback) {
        callback.invoke(null, Boolean.valueOf(this.scanManager != null));
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void read(String str, String str2, String str3, Callback callback) {
        if (str2 == null || str3 == null) {
            callback.invoke("ServiceUUID and characteristicUUID required.");
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found", null);
        } else if (peripheral.isConnected()) {
            peripheral.read(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), callback);
        } else {
            callback.invoke("Peripheral not connected", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void readDescriptor(String str, String str2, String str3, String str4, Callback callback) {
        if (str2 == null || str3 == null || str4 == null) {
            callback.invoke("ServiceUUID, CharacteristicUUID and descriptorUUID required.", null);
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found", null);
        } else if (peripheral.isConnected()) {
            peripheral.readDescriptor(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), UUIDHelper.uuidFromString(str4), callback);
        } else {
            callback.invoke("Peripheral not connected", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void readRSSI(String str, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found", null);
        } else if (peripheral.isConnected()) {
            peripheral.readRSSI(callback);
        } else {
            callback.invoke("Peripheral not connected", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void refreshCache(String str, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found");
        } else if (peripheral.isConnected()) {
            peripheral.refreshCache(callback);
        } else {
            callback.invoke("Peripheral not connected", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void removeAssociatedPeripheral(String str, Callback callback) {
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) getCompanionDeviceManager();
        Iterator<String> it2 = companionDeviceManager.getAssociations().iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(str)) {
                companionDeviceManager.disassociate(str);
                callback.invoke(new Object[0]);
                return;
            }
        }
        callback.invoke("device not found");
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void removeBond(String str, Callback callback) {
        Peripheral retrieveOrCreatePeripheral = retrieveOrCreatePeripheral(str);
        if (retrieveOrCreatePeripheral == null) {
            callback.invoke("Invalid peripheral uuid");
            return;
        }
        try {
            retrieveOrCreatePeripheral.getDevice().getClass().getMethod("removeBond", null).invoke(retrieveOrCreatePeripheral.getDevice(), null);
            this.removeBondRequest = new BondRequest(str, callback);
        } catch (Exception unused) {
            callback.invoke("Remove bond request fail");
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void removePeripheral(String str, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found");
            return;
        }
        synchronized (this.peripherals) {
            try {
                if (peripheral.isConnected()) {
                    callback.invoke("Peripheral can not be removed while connected");
                } else {
                    this.peripherals.remove(str);
                    callback.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void requestConnectionPriority(String str, double d, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral != null) {
            peripheral.requestConnectionPriority((int) d, callback);
        } else {
            callback.invoke("Peripheral not found", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void requestMTU(String str, double d, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral != null) {
            peripheral.requestMTU((int) d, callback);
        } else {
            callback.invoke("Peripheral not found", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void retrieveServices(String str, ReadableArray readableArray, Callback callback) {
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found", null);
        } else if (peripheral.isConnected()) {
            peripheral.retrieveServices(callback);
        } else {
            callback.invoke("Peripheral not connected", null);
        }
    }

    public Peripheral savePeripheral(BluetoothDevice bluetoothDevice) {
        String address = bluetoothDevice.getAddress();
        synchronized (this.peripherals) {
            try {
                if (!this.peripherals.containsKey(address)) {
                    this.peripherals.put(bluetoothDevice.getAddress(), !this.forceLegacy ? new DefaultPeripheral(bluetoothDevice, this) : new Peripheral(bluetoothDevice, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.peripherals.get(address);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void scan(ReadableMap readableMap, Callback callback) {
        if (getBluetoothAdapter() == null) {
            callback.invoke("No bluetooth support");
            return;
        }
        if (getBluetoothAdapter().isEnabled()) {
            synchronized (this.peripherals) {
                try {
                    Iterator<Map.Entry<String, Peripheral>> it2 = this.peripherals.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<String, Peripheral> next = it2.next();
                        if (!next.getValue().isConnected() && !next.getValue().isConnecting()) {
                            it2.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ScanManager scanManager = this.scanManager;
            if (scanManager != null) {
                scanManager.scan(readableMap, callback);
            }
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    @SuppressLint({"MissingPermission"})
    public void setName(String str) {
        getBluetoothAdapter().setName(str);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void start(ReadableMap readableMap, Callback callback) {
        if (getBluetoothAdapter() == null) {
            callback.invoke("No bluetooth support");
            return;
        }
        this.forceLegacy = false;
        moduleOptions = readableMap;
        if (readableMap.hasKey("forceLegacy")) {
            this.forceLegacy = readableMap.getBoolean("forceLegacy");
        }
        this.scanManager = new DefaultScanManager(this.reactContext, this);
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        IntentFilter intentFilter2 = new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST");
        intentFilter2.setPriority(1000);
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        BroadcastReceiver broadcastReceiver = this.mReceiver;
        if (i >= 34) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
            this.context.registerReceiver(this.mReceiver, intentFilter2, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
            this.context.registerReceiver(this.mReceiver, intentFilter2);
        }
        callback.invoke(new Object[0]);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void startNotification(String str, String str2, String str3, Callback callback) {
        if (str2 == null || str3 == null) {
            callback.invoke("ServiceUUID and characteristicUUID required.");
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found");
        } else if (peripheral.isConnected()) {
            peripheral.registerNotify(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), 1, callback);
        } else {
            callback.invoke("Peripheral not connected", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void startNotificationWithBuffer(String str, String str2, String str3, double d, Callback callback) {
        if (str2 == null || str3 == null) {
            callback.invoke("ServiceUUID and characteristicUUID required.");
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral != null) {
            peripheral.registerNotify(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), Integer.valueOf((int) d), callback);
        } else {
            callback.invoke("Peripheral not found");
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void stopNotification(String str, String str2, String str3, Callback callback) {
        if (str2 == null || str3 == null) {
            callback.invoke("ServiceUUID and characteristicUUID required.");
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found");
        } else if (peripheral.isConnected()) {
            peripheral.removeNotify(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), callback);
        } else {
            callback.invoke("Peripheral not connected", null);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void stopScan(Callback callback) {
        if (getBluetoothAdapter() == null) {
            callback.invoke("No bluetooth support");
            return;
        }
        if (!getBluetoothAdapter().isEnabled()) {
            callback.invoke(new Object[0]);
            return;
        }
        ScanManager scanManager = this.scanManager;
        if (scanManager != null) {
            scanManager.stopScan(callback);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("status", 0);
            emitOnStopScan(createMap);
        }
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void supportsCompanion(Callback callback) {
        callback.invoke(Boolean.valueOf(this.companionScanner != null));
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void write(String str, String str2, String str3, ReadableArray readableArray, double d, Callback callback) {
        if (str2 == null || str3 == null) {
            callback.invoke("ServiceUUID and characteristicUUID required.");
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found");
            return;
        }
        if (!peripheral.isConnected()) {
            callback.invoke("Peripheral not connected", null);
            return;
        }
        byte[] bArr = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bArr[i] = Integer.valueOf(readableArray.getInt(i)).byteValue();
        }
        bytesToHex(bArr);
        peripheral.write(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), bArr, Integer.valueOf((int) d), null, callback, 2);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void writeDescriptor(String str, String str2, String str3, String str4, ReadableArray readableArray, Callback callback) {
        if (str2 == null || str3 == null || str4 == null) {
            callback.invoke("ServiceUUID, CharacteristicUUID and descriptorUUID required.", null);
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found", null);
            return;
        }
        if (!peripheral.isConnected()) {
            callback.invoke("Peripheral not connected", null);
            return;
        }
        byte[] bArr = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bArr[i] = Integer.valueOf(readableArray.getInt(i)).byteValue();
        }
        bytesToHex(bArr);
        peripheral.writeDescriptor(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), UUIDHelper.uuidFromString(str4), bArr, callback);
    }

    @Override // it.innove.NativeBleManagerSpec
    @ReactMethod
    public void writeWithoutResponse(String str, String str2, String str3, ReadableArray readableArray, double d, double d2, Callback callback) {
        if (str2 == null || str3 == null) {
            callback.invoke("ServiceUUID and characteristicUUID required.");
            return;
        }
        Peripheral peripheral = this.peripherals.get(str);
        if (peripheral == null) {
            callback.invoke("Peripheral not found");
            return;
        }
        if (!peripheral.isConnected()) {
            callback.invoke("Peripheral not connected", null);
            return;
        }
        byte[] bArr = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bArr[i] = Integer.valueOf(readableArray.getInt(i)).byteValue();
        }
        bytesToHex(bArr);
        peripheral.write(UUIDHelper.uuidFromString(str2), UUIDHelper.uuidFromString(str3), bArr, Integer.valueOf((int) d), Integer.valueOf((int) d2), callback, 1);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BondRequest {
        private Callback callback;
        private String pin;
        private String uuid;

        public BondRequest(String str, String str2, Callback callback) {
            this.uuid = str;
            this.pin = str2;
            this.callback = callback;
        }

        public BondRequest(String str, Callback callback) {
            this.uuid = str;
            this.callback = callback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$invalidate$0(Object[] objArr) {
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(double d) {
    }

    public Peripheral savePeripheral(Peripheral peripheral) {
        synchronized (this.peripherals) {
            this.peripherals.put(peripheral.getDevice().getAddress(), peripheral);
        }
        return peripheral;
    }
}
