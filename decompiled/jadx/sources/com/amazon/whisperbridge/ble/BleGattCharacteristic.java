package com.amazon.whisperbridge.ble;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperbridge.ble.BleGattDescriptor;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleGattCharacteristic {
    protected static final int MAX_STORED_DATA_SIZE = 512;
    protected static final String TAG = "BleGattCharacteristic";
    protected final Map<UUID, BleGattDescriptor> mBleDescriptors = new HashMap();
    protected final BluetoothGattCharacteristic mBluetoothGattCharacteristic;
    protected final EnumSet<Properties> mProperties;
    protected final UUID mUuid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Properties {
        READ,
        WRITE,
        NOTIFY,
        INDICATE
    }

    public BleGattCharacteristic(UUID uuid, EnumSet<Properties> enumSet) {
        this.mUuid = uuid;
        this.mProperties = enumSet;
        Properties properties = Properties.READ;
        int i = enumSet.contains(properties) ? 2 : 0;
        Properties properties2 = Properties.WRITE;
        int i2 = i | (enumSet.contains(properties2) ? 8 : 0);
        Properties properties3 = Properties.NOTIFY;
        int i3 = i2 | (enumSet.contains(properties3) ? 16 : 0);
        Properties properties4 = Properties.INDICATE;
        this.mBluetoothGattCharacteristic = new BluetoothGattCharacteristic(uuid, i3 | (enumSet.contains(properties4) ? 32 : 0), (enumSet.contains(properties) ? 1 : 0) | (enumSet.contains(properties2) ? 16 : 0));
        if (enumSet.contains(properties3) || enumSet.contains(properties4)) {
            byte[] bArr = {0, 0};
            if (enumSet.contains(properties3)) {
                byte b = bArr[0];
                byte[] bArr2 = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                bArr[0] = (byte) (b | bArr2[0]);
                bArr[1] = (byte) (bArr[1] | bArr2[1]);
            }
            if (enumSet.contains(properties4)) {
                byte b2 = bArr[0];
                byte[] bArr3 = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                bArr[0] = (byte) (b2 | bArr3[0]);
                bArr[1] = (byte) (bArr[1] | bArr3[1]);
            }
            BleGattDescriptor createDescriptor = BleGattDescriptor.createDescriptor(BleConstants.CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR_UUID, EnumSet.of(BleGattDescriptor.Properties.READ, BleGattDescriptor.Properties.WRITE));
            createDescriptor.setStoredData(bArr);
            addBleDescriptor(createDescriptor);
        }
    }

    public static BleGattCharacteristic createCharacteristic(UUID uuid, EnumSet<Properties> enumSet) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            return null;
        }
        if (enumSet == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("properties cannot be null.");
            return null;
        }
        if (!enumSet.isEmpty()) {
            return new BleGattCharacteristic(uuid, enumSet);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("properties cannot be an empty set.");
        return null;
    }

    public boolean addBleDescriptor(BleGattDescriptor bleGattDescriptor) {
        if (bleGattDescriptor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("descriptor cannot be null.");
            return false;
        }
        if (this.mBleDescriptors.containsKey(bleGattDescriptor.getUuid())) {
            Single$$ExternalSyntheticBUOutline0.m$3("descriptor already associated with characteristic.");
            return false;
        }
        boolean addDescriptor = this.mBluetoothGattCharacteristic.addDescriptor(bleGattDescriptor.getBluetoothGattDescriptor());
        if (addDescriptor) {
            this.mBleDescriptors.put(bleGattDescriptor.getUuid(), bleGattDescriptor);
        }
        return addDescriptor;
    }

    public boolean containsBleDescriptor(UUID uuid) {
        if (uuid != null) {
            return this.mBleDescriptors.containsKey(uuid);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
        return false;
    }

    public BleGattDescriptor getBleDescriptor(UUID uuid) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            return null;
        }
        if (this.mBleDescriptors.containsKey(uuid)) {
            return this.mBleDescriptors.get(uuid);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("No descriptor with uuid=", uuid));
        return null;
    }

    public BluetoothGattCharacteristic getBluetoothGattCharacteristic() {
        return this.mBluetoothGattCharacteristic;
    }

    public synchronized byte[] getStoredData() {
        return this.mBluetoothGattCharacteristic.getValue();
    }

    public UUID getUuid() {
        return this.mUuid;
    }

    public boolean isIndicatable() {
        return this.mProperties.contains(Properties.INDICATE);
    }

    public boolean isNotifiable() {
        return this.mProperties.contains(Properties.NOTIFY);
    }

    public boolean isReadable() {
        return this.mProperties.contains(Properties.READ);
    }

    public boolean isValidReadDescriptor(UUID uuid) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            return false;
        }
        if (this.mBleDescriptors.containsKey(uuid)) {
            return this.mBleDescriptors.get(uuid).isReadable();
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("No descriptor with uuid=", uuid));
        return false;
    }

    public boolean isValidWriteDescriptor(UUID uuid) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            return false;
        }
        if (this.mBleDescriptors.containsKey(uuid)) {
            return this.mBleDescriptors.get(uuid).isWritable();
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("No descriptor with uuid=", uuid));
        return false;
    }

    public boolean isWritable() {
        return this.mProperties.contains(Properties.WRITE);
    }

    public void setDescriptorData(UUID uuid, byte[] bArr) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
        } else if (this.mBleDescriptors.containsKey(uuid)) {
            this.mBleDescriptors.get(uuid).setStoredData(bArr);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m("No descriptor with uuid=", uuid));
        }
    }

    public synchronized void setStoredData(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length > 512) {
                    throw new IllegalArgumentException("Stored data in characteristic is limited to 512 bytes.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mBluetoothGattCharacteristic.setValue(bArr);
    }

    public String toString() {
        return "BleGattCharacteristic [uuid=" + this.mUuid + MarkdownConstants.RIGHT_BRACKET;
    }

    public static BleGattCharacteristic createCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            return new BleGattCharacteristic(bluetoothGattCharacteristic);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("characteristic cannot be null.");
        return null;
    }

    public BleGattCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.mUuid = bluetoothGattCharacteristic.getUuid();
        this.mBluetoothGattCharacteristic = bluetoothGattCharacteristic;
        int properties = bluetoothGattCharacteristic.getProperties();
        EnumSet<Properties> noneOf = EnumSet.noneOf(Properties.class);
        this.mProperties = noneOf;
        if ((properties & 2) != 0) {
            noneOf.add(Properties.READ);
        }
        if ((properties & 8) != 0) {
            noneOf.add(Properties.WRITE);
        }
        if ((properties & 16) != 0) {
            noneOf.add(Properties.NOTIFY);
        }
        if ((properties & 32) != 0) {
            noneOf.add(Properties.INDICATE);
        }
        Iterator<BluetoothGattDescriptor> it2 = bluetoothGattCharacteristic.getDescriptors().iterator();
        while (it2.hasNext()) {
            BleGattDescriptor createDescriptor = BleGattDescriptor.createDescriptor(it2.next());
            this.mBleDescriptors.put(createDescriptor.getUuid(), createDescriptor);
        }
    }
}
