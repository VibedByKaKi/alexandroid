package com.amazon.whisperbridge.ble;

import android.bluetooth.BluetoothGattDescriptor;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.EnumSet;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleGattDescriptor {
    private static final int MAX_STORED_DATA_SIZE = 512;
    private static final String TAG = "BleGattDescriptor";
    protected final BluetoothGattDescriptor mBluetoothGattDescriptor;
    protected final EnumSet<Properties> mProperties;
    protected final UUID mUuid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Properties {
        READ,
        WRITE
    }

    public BleGattDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor) {
        this.mUuid = bluetoothGattDescriptor.getUuid();
        this.mBluetoothGattDescriptor = bluetoothGattDescriptor;
        int permissions = bluetoothGattDescriptor.getPermissions();
        EnumSet<Properties> noneOf = EnumSet.noneOf(Properties.class);
        this.mProperties = noneOf;
        if ((permissions & 1) != 0) {
            noneOf.add(Properties.READ);
        }
        if ((permissions & 16) != 0) {
            noneOf.add(Properties.WRITE);
        }
    }

    public static BleGattDescriptor createDescriptor(UUID uuid, EnumSet<Properties> enumSet) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            return null;
        }
        if (enumSet == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("properties cannot be null.");
            return null;
        }
        if (!enumSet.isEmpty()) {
            return new BleGattDescriptor(uuid, enumSet);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("properties cannot be an empty set.");
        return null;
    }

    public BluetoothGattDescriptor getBluetoothGattDescriptor() {
        return this.mBluetoothGattDescriptor;
    }

    public synchronized byte[] getStoredData() {
        return this.mBluetoothGattDescriptor.getValue();
    }

    public UUID getUuid() {
        return this.mUuid;
    }

    public boolean isReadable() {
        return this.mProperties.contains(Properties.READ);
    }

    public boolean isWritable() {
        return this.mProperties.contains(Properties.WRITE);
    }

    public synchronized void setStoredData(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length > 512) {
                    throw new IllegalArgumentException("Stored data in descriptor is limited to 512 bytes.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mBluetoothGattDescriptor.setValue(bArr);
    }

    public String toString() {
        return "BluetoothGattDescriptor [uuid=" + this.mUuid + MarkdownConstants.RIGHT_BRACKET;
    }

    public static BleGattDescriptor createDescriptor(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGattDescriptor != null) {
            return new BleGattDescriptor(bluetoothGattDescriptor);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("characteristic cannot be null.");
        return null;
    }

    public BleGattDescriptor(UUID uuid, EnumSet<Properties> enumSet) {
        this.mUuid = uuid;
        this.mProperties = enumSet;
        this.mBluetoothGattDescriptor = new BluetoothGattDescriptor(uuid, (enumSet.contains(Properties.WRITE) ? 16 : 0) | (enumSet.contains(Properties.READ) ? 1 : 0));
    }
}
