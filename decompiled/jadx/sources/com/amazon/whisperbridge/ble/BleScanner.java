package com.amazon.whisperbridge.ble;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.HandlerThread;
import com.amazon.whisperjoin.common.sharedtypes.ble.BleScanData;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleScanner {
    private static final String PROCESSING_THREAD_NAME = "WhisperBridge-BleScanner";
    private static final String TAG = "BleScanner";
    ScanCallback mBluetootLeScanCallback;
    BluetoothLeScanner mBluetoothLeScanner;
    final BluetoothAdapter mBtAdapter;
    final Callback mCallback;
    BluetoothAdapter.LeScanCallback mLegacyScanCallback;
    private volatile Handler mProcessingHandler;
    final HandlerThread mProcessingThread = new HandlerThread(PROCESSING_THREAD_NAME);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BLEScanCallback extends ScanCallback {
        private final WeakReference<BleScanner> mBleScannerWeakReference;
        private final WeakReference<Callback> mCallbackWeakReference;

        public BLEScanCallback(BleScanner bleScanner, Callback callback) {
            this.mBleScannerWeakReference = new WeakReference<>(bleScanner);
            this.mCallbackWeakReference = new WeakReference<>(callback);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            BleScanner bleScanner = this.mBleScannerWeakReference.get();
            if (bleScanner != null) {
                Iterator<ScanResult> it2 = list.iterator();
                while (it2.hasNext()) {
                    bleScanner.enqueueScanResult(it2.next());
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            if (this.mCallbackWeakReference.get() != null) {
                this.mCallbackWeakReference.get().onScanError(ScanError.fromInt(i));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            if (i != 1 && i != 2) {
                Single$$ExternalSyntheticBUOutline0.m$3("Unknown callback-type encountered in onScanResult");
                return;
            }
            BleScanner bleScanner = this.mBleScannerWeakReference.get();
            if (bleScanner != null) {
                bleScanner.enqueueScanResult(scanResult);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onScanData(BleScanData bleScanData);

        void onScanError(ScanError scanError);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ScanError {
        SCAN_FAILED_ALREADY_STARTED(1, "Scan failed, already started"),
        SCAN_FAILED_APPLICATION_REGISTRATION_FAILED(2, "Scan failed, application registration failed"),
        SCAN_FAILED_INTERNAL_ERROR(3, "Scan failed, internal error"),
        SCAN_FAILED_FEATURE_UNSUPPORTED(4, "Scan failed, feature unsupported"),
        SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES(5, "Scan failed, out of hardware resources"),
        SCAN_FAILED_SCANNING_TOO_FREQUENTLY(6, "Scan failed, scanning too frequently");

        private String mString;
        private int mValue;

        ScanError(int i, String str) {
            this.mValue = i;
            this.mString = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ScanError fromInt(int i) {
            switch (i) {
                case 1:
                    return SCAN_FAILED_ALREADY_STARTED;
                case 2:
                    return SCAN_FAILED_APPLICATION_REGISTRATION_FAILED;
                case 3:
                    return SCAN_FAILED_INTERNAL_ERROR;
                case 4:
                    return SCAN_FAILED_FEATURE_UNSUPPORTED;
                case 5:
                    return SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES;
                case 6:
                    return SCAN_FAILED_SCANNING_TOO_FREQUENTLY;
                default:
                    WJLog.w(BleScanner.TAG, "Unknown Scan ScanError encountered: " + i);
                    return SCAN_FAILED_INTERNAL_ERROR;
            }
        }

        public int getValue() {
            return this.mValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mString;
        }
    }

    private BleScanner(BluetoothAdapter bluetoothAdapter, Callback callback) {
        this.mBtAdapter = bluetoothAdapter;
        this.mCallback = callback;
    }

    @TargetApi(18)
    private static BleScanner createLegacyScanner(BluetoothAdapter bluetoothAdapter, Callback callback) {
        BleScanner bleScanner = new BleScanner(bluetoothAdapter, callback);
        bleScanner.mLegacyScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: com.amazon.whisperbridge.ble.BleScanner.1
            @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
            public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                BleScanner.this.enqueueScanData(new BleScanData(bluetoothDevice, bArr, i));
            }
        };
        bleScanner.startProcessingThread();
        try {
            boolean startLeScan = bluetoothAdapter.startLeScan(bleScanner.mLegacyScanCallback);
            if (!startLeScan) {
            }
            if (!startLeScan) {
                callback.onScanError(ScanError.SCAN_FAILED_INTERNAL_ERROR);
            }
            return bleScanner;
        } finally {
            bleScanner.mProcessingThread.quitSafely();
        }
    }

    @TargetApi(21)
    private static BleScanner createScanner(BluetoothAdapter bluetoothAdapter, Callback callback, List<ScanFilter> list, ScanSettings scanSettings) throws BleException {
        String str = TAG;
        WJLog.d(str, "Create Scanner");
        BleScanner bleScanner = new BleScanner(bluetoothAdapter, callback);
        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
        bleScanner.mBluetoothLeScanner = bluetoothLeScanner;
        if (bluetoothLeScanner == null) {
            throw new BleException("Failed to get Bluetooth LE scannder. Bluetooth may be disabled or Bluetooth LE advertising is not supported.");
        }
        bleScanner.mBluetootLeScanCallback = new BLEScanCallback(bleScanner, callback);
        WJLog.d(str, "Set Scanner Callback " + bleScanner.mBluetoothLeScanner);
        bleScanner.startProcessingThread();
        BluetoothLeScanner bluetoothLeScanner2 = bleScanner.mBluetoothLeScanner;
        try {
            try {
                if (list == null) {
                    bluetoothLeScanner2.startScan(bleScanner.mBluetootLeScanCallback);
                } else {
                    bluetoothLeScanner2.startScan(list, scanSettings, bleScanner.mBluetootLeScanCallback);
                }
                return bleScanner;
            } catch (SecurityException e) {
                throw new BleException("Catching Android 12 SecurityException crash issue", e);
            }
        } catch (Throwable th) {
            bleScanner.mProcessingThread.quitSafely();
            throw th;
        }
    }

    private void startProcessingThread() {
        this.mProcessingThread.start();
        this.mProcessingHandler = new Handler(this.mProcessingThread.getLooper());
    }

    public static BleScanner startScanning(BluetoothAdapter bluetoothAdapter, Callback callback, List<ScanFilter> list, ScanSettings scanSettings) throws BleException {
        if (bluetoothAdapter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("btAdapter unexpectedly null.");
            return null;
        }
        if (callback == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("callback unexpectedly null.");
            return null;
        }
        if ((list == null) == (scanSettings == null)) {
            WJLog.i(TAG, "Starting Bluetooth LE scanning.");
            return createScanner(bluetoothAdapter, callback, list, scanSettings);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("settings unexpectedly null.");
        return null;
    }

    @TargetApi(21)
    public void addScanResult(ScanResult scanResult) {
        ScanRecord scanRecord = scanResult.getScanRecord();
        notifyScanData(new BleScanData(scanResult.getDevice(), scanRecord == null ? new byte[0] : scanRecord.getBytes(), scanResult.getRssi()));
    }

    public void enqueueScanData(final BleScanData bleScanData) {
        Handler handler = this.mProcessingHandler;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.amazon.whisperbridge.ble.BleScanner.3
            @Override // java.lang.Runnable
            public void run() {
                BleScanner.this.notifyScanData(bleScanData);
            }
        });
    }

    @TargetApi(21)
    public void enqueueScanResult(final ScanResult scanResult) {
        Handler handler = this.mProcessingHandler;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.amazon.whisperbridge.ble.BleScanner.2
            @Override // java.lang.Runnable
            public void run() {
                BleScanner.this.addScanResult(scanResult);
            }
        });
    }

    public void notifyScanData(BleScanData bleScanData) {
        this.mCallback.onScanData(bleScanData);
    }

    public synchronized void stopScanning() {
        this.mBluetoothLeScanner.stopScan(this.mBluetootLeScanCallback);
        this.mProcessingThread.quitSafely();
    }
}
