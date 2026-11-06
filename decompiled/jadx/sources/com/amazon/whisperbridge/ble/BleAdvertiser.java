package com.amazon.whisperbridge.ble;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(21)
/* loaded from: classes19.dex */
public class BleAdvertiser extends AdvertiseCallback {
    private static final String TAG = "BleAdvertiser";
    BluetoothLeAdvertiser mBluetoothLeAdvertiser;
    private final Callback mCallback;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onAdvertisingStateChanged(State state);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State implements Parcelable {
        SUCCESS(0, "Success"),
        ADVERTISE_FAILED_ALREADY_STARTED(3, "Advertise failed, already started"),
        ADVERTISE_FAILED_DATA_TOO_LARGE(1, "Advertise failed, data too large"),
        ADVERTISE_FAILED_FEATURE_UNSUPPORTED(5, "Advertise failed, feature unsupported"),
        ADVERTISE_FAILED_INTERNAL_ERROR(4, "Advertise failed, internal error"),
        ADVERTISE_FAILED_TOO_MANY_ADVERTISERS(2, "Advertise failed, too many advertisers");

        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.amazon.whisperbridge.ble.BleAdvertiser.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                return State.fromInt(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i) {
                return new State[i];
            }
        };
        private String mString;
        private int mValue;

        State(int i, String str) {
            this.mValue = i;
            this.mString = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static State fromInt(int i) {
            if (i == 0) {
                return SUCCESS;
            }
            if (i == 1) {
                return ADVERTISE_FAILED_DATA_TOO_LARGE;
            }
            if (i == 2) {
                return ADVERTISE_FAILED_TOO_MANY_ADVERTISERS;
            }
            if (i == 3) {
                return ADVERTISE_FAILED_ALREADY_STARTED;
            }
            if (i == 4) {
                return ADVERTISE_FAILED_INTERNAL_ERROR;
            }
            if (i == 5) {
                return ADVERTISE_FAILED_FEATURE_UNSUPPORTED;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Unknown BleAdvertiser.State encountered.");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getString() {
            return this.mString;
        }

        public int getValue() {
            return this.mValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mString;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    private BleAdvertiser(Callback callback) {
        this.mCallback = callback;
    }

    @TargetApi(21)
    public static BleAdvertiser startAdvertising(BluetoothAdapter bluetoothAdapter, Callback callback, AdvertiseSettings advertiseSettings, AdvertiseData advertiseData, AdvertiseData advertiseData2) throws BleException {
        if (bluetoothAdapter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("btAdapter unexpectedly null.");
            return null;
        }
        if (callback == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("callback unexpectedly null.");
            return null;
        }
        if (advertiseSettings == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("settings unexpectedly null.");
            return null;
        }
        if (advertiseData == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("advertisingData unexpectedly null.");
            return null;
        }
        BleAdvertiser bleAdvertiser = new BleAdvertiser(callback);
        BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothAdapter.getBluetoothLeAdvertiser();
        bleAdvertiser.mBluetoothLeAdvertiser = bluetoothLeAdvertiser;
        if (bluetoothLeAdvertiser == null) {
            throw new BleException("Failed to get Bluetooth LE Advertiser. Bluetooth may be disabled or Bluetooth LE advertising is not supported.");
        }
        WJLog.i(TAG, "Starting Bluetooth LE advertisement.");
        BluetoothLeAdvertiser bluetoothLeAdvertiser2 = bleAdvertiser.mBluetoothLeAdvertiser;
        if (advertiseData2 == null) {
            bluetoothLeAdvertiser2.startAdvertising(advertiseSettings, advertiseData, bleAdvertiser);
            return bleAdvertiser;
        }
        bluetoothLeAdvertiser2.startAdvertising(advertiseSettings, advertiseData, advertiseData2, bleAdvertiser);
        return bleAdvertiser;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public synchronized void onStartFailure(int i) {
        WJLog.e(TAG, "onStartFailure: errorCode=" + i);
        this.mCallback.onAdvertisingStateChanged(State.fromInt(i));
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public synchronized void onStartSuccess(AdvertiseSettings advertiseSettings) {
        WJLog.d(TAG, "onStartSuccess: settings=" + advertiseSettings);
        this.mCallback.onAdvertisingStateChanged(State.SUCCESS);
    }

    public synchronized void stopAdvertising() {
        if (this.mBluetoothLeAdvertiser == null) {
            throw new IllegalStateException("Attempting to stop advertising while not advertising.");
        }
        WJLog.i(TAG, "Stopping Bluetooth LE advertisement.");
        this.mBluetoothLeAdvertiser.stopAdvertising(this);
        this.mBluetoothLeAdvertiser = null;
    }
}
