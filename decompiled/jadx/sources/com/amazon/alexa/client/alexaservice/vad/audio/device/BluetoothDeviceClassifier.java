package com.amazon.alexa.client.alexaservice.vad.audio.device;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.media.AudioDeviceInfo;
import android.os.ParcelUuid;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class BluetoothDeviceClassifier {
    private static final String TAG = "BluetoothDeviceClassifier";
    static final Set<Integer> HEADSET_DEVICE_CLASSES = Collections.unmodifiableSet(new HashSet(Arrays.asList(1032, 1028, 1048, 1056)));
    static final Set<Integer> SPEAKER_DEVICE_CLASSES = Collections.unmodifiableSet(new HashSet(Arrays.asList(1044, 1052, 1064)));

    @VisibleForTesting
    static final UUID HFP_UUID = UUID.fromString("0000111e-0000-1000-8000-00805f9b34fb");

    @VisibleForTesting
    static final UUID HSP_UUID = UUID.fromString("00001108-0000-1000-8000-00805f9b34fb");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum BtDeviceClassification {
        HEADSET,
        SPEAKER,
        UNKNOWN
    }

    private BluetoothDeviceClassifier() {
    }

    @SuppressLint({"NewApi"})
    public static BtDeviceClassification classifyBtDevice(@NonNull AudioDeviceInfo audioDeviceInfo, @Nullable BluetoothAdapter bluetoothAdapter) {
        if (audioDeviceInfo.getType() != 7) {
            return BtDeviceClassification.UNKNOWN;
        }
        try {
            if (bluetoothAdapter == null) {
                return BtDeviceClassification.HEADSET;
            }
            String address = audioDeviceInfo.getAddress();
            if (address == null) {
                return BtDeviceClassification.HEADSET;
            }
            try {
                BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(address);
                if (remoteDevice == null) {
                    return BtDeviceClassification.HEADSET;
                }
                BluetoothClass bluetoothClass = remoteDevice.getBluetoothClass();
                if (bluetoothClass == null) {
                    return BtDeviceClassification.HEADSET;
                }
                int deviceClass = bluetoothClass.getDeviceClass();
                return HEADSET_DEVICE_CLASSES.contains(Integer.valueOf(deviceClass)) ? BtDeviceClassification.HEADSET : SPEAKER_DEVICE_CLASSES.contains(Integer.valueOf(deviceClass)) ? BtDeviceClassification.SPEAKER : hasHandsFreeOrHeadsetProfile(remoteDevice) ? BtDeviceClassification.HEADSET : BtDeviceClassification.UNKNOWN;
            } catch (IllegalArgumentException unused) {
                return BtDeviceClassification.HEADSET;
            }
        } catch (SecurityException e) {
            Log.w(TAG, "SecurityException while classifying BT device; treating as HEADSET", e);
            return BtDeviceClassification.HEADSET;
        } catch (Throwable th) {
            Log.w(TAG, "Unexpected error while classifying BT device; treating as HEADSET", th);
            return BtDeviceClassification.HEADSET;
        }
    }

    @SuppressLint({"MissingPermission"})
    @VisibleForTesting
    public static boolean hasHandsFreeOrHeadsetProfile(@NonNull BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids;
        try {
            uuids = bluetoothDevice.getUuids();
        } catch (SecurityException unused) {
        }
        if (uuids == null || uuids.length == 0) {
            return false;
        }
        for (ParcelUuid parcelUuid : uuids) {
            UUID uuid = parcelUuid.getUuid();
            if (HFP_UUID.equals(uuid) || HSP_UUID.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUsableBtCommunicationDevice(@NonNull AudioDeviceInfo audioDeviceInfo, @Nullable BluetoothAdapter bluetoothAdapter) {
        return classifyBtDevice(audioDeviceInfo, bluetoothAdapter) == BtDeviceClassification.HEADSET;
    }
}
