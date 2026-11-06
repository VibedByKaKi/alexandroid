package com.amazon.alexa.matter.utils.logging;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.matter.commissioner.BluetoothManager;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Logging {
    private Logging() {
    }

    @Nullable
    private static String getName(@Nullable BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        try {
            String name = bluetoothDevice.getName();
            return name == null ? bluetoothDevice.getAddress() : name;
        } catch (SecurityException unused) {
            return null;
        }
    }

    @NonNull
    public static String prettyPrint(@Nullable BluetoothManager.BluetoothConnection bluetoothConnection) {
        if (bluetoothConnection == null) {
            return "Connection[NULL]";
        }
        return "Connection[id: " + bluetoothConnection.getID() + ", transport: " + prettyPrint(bluetoothConnection.getBluetoothGatt()) + MarkdownConstants.RIGHT_BRACKET;
    }

    @NonNull
    public static String prettyPrint(@Nullable BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            return "Gatt[NULL]";
        }
        return "Gatt[" + prettyPrint(bluetoothGatt.getDevice()) + MarkdownConstants.RIGHT_BRACKET;
    }

    @NonNull
    public static String prettyPrint(@Nullable BluetoothDevice bluetoothDevice) {
        String name = getName(bluetoothDevice);
        if (name == null) {
            return "Device[NULL]";
        }
        return a$$ExternalSyntheticOutline0.m("Device[", name, MarkdownConstants.RIGHT_BRACKET);
    }
}
