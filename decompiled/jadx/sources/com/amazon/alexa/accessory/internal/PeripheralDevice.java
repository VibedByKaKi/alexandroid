package com.amazon.alexa.accessory.internal;

import android.bluetooth.BluetoothDevice;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PeripheralDevice {
    private final String address;
    private final boolean connectable;
    private final String name;
    private final Type type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.internal.PeripheralDevice$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$AccessoryTransport$Type;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$internal$PeripheralDevice$Type;

        static {
            int[] iArr = new int[AccessoryTransport.Type.values().length];
            $SwitchMap$com$amazon$alexa$accessory$AccessoryTransport$Type = iArr;
            try {
                iArr[AccessoryTransport.Type.GATT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$AccessoryTransport$Type[AccessoryTransport.Type.RFCOMM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Type.values().length];
            $SwitchMap$com$amazon$alexa$accessory$internal$PeripheralDevice$Type = iArr2;
            try {
                iArr2[Type.BLUETOOTH_CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$internal$PeripheralDevice$Type[Type.BLUETOOTH_LE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$internal$PeripheralDevice$Type[Type.BLUETOOTH_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        BLUETOOTH_CLASSIC,
        BLUETOOTH_LE,
        BLUETOOTH_UNKNOWN
    }

    public PeripheralDevice(String str, Type type, String str2, boolean z) {
        Preconditions.notNull(str, "address");
        Preconditions.notNull(type, "type");
        this.address = str;
        this.type = type;
        this.name = str2;
        this.connectable = z;
    }

    private static Type getTypeForAccessory(Accessory accessory) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$AccessoryTransport$Type[accessory.getTransport().ordinal()];
        return i != 1 ? i != 2 ? Type.BLUETOOTH_UNKNOWN : Type.BLUETOOTH_CLASSIC : Type.BLUETOOTH_LE;
    }

    private static Type getTypeForBluetoothDevice(int i) {
        return i != 1 ? i != 2 ? i != 3 ? Type.BLUETOOTH_UNKNOWN : Type.BLUETOOTH_CLASSIC : Type.BLUETOOTH_LE : Type.BLUETOOTH_CLASSIC;
    }

    private static Type getTypeForDevice(int i) {
        return i != 0 ? i != 1 ? Type.BLUETOOTH_UNKNOWN : Type.BLUETOOTH_CLASSIC : Type.BLUETOOTH_LE;
    }

    private static Type getTypeForDeviceGroup(AccessoryTransport.Type type) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$AccessoryTransport$Type[type.ordinal()];
        return i != 1 ? i != 2 ? Type.BLUETOOTH_UNKNOWN : Type.BLUETOOTH_CLASSIC : Type.BLUETOOTH_LE;
    }

    public static String peripheralTypeToString(Type type) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$internal$PeripheralDevice$Type[type.ordinal()];
        return i != 1 ? i != 2 ? "BLUETOOTH_UNKNOWN" : "BLUETOOTH_LE" : "BLUETOOTH_CLASSIC";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PeripheralDevice.class == obj.getClass()) {
            PeripheralDevice peripheralDevice = (PeripheralDevice) obj;
            String str = this.address;
            String str2 = peripheralDevice.address;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (this.type == peripheralDevice.type) {
                return true;
            }
        }
        return false;
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.address;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Type type = this.type;
        return hashCode + (type != null ? type.hashCode() : 0);
    }

    public boolean isConnectable() {
        return this.connectable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PeripheralDevice{address='");
        sb.append(this.address);
        sb.append("', type=");
        sb.append(this.type);
        sb.append(", name='");
        return a$$ExternalSyntheticOutline0.m(sb, this.name, "'}");
    }

    public PeripheralDevice(String str, Type type, String str2) {
        this(str, type, str2, false);
    }

    public PeripheralDevice(String str, Type type) {
        this(str, type, null, false);
    }

    public PeripheralDevice(BluetoothDevice bluetoothDevice) {
        this(bluetoothDevice.getAddress(), getTypeForBluetoothDevice(bluetoothDevice.getType()), bluetoothDevice.getName());
    }

    public PeripheralDevice(DeviceGroup deviceGroup) {
        this(deviceGroup.getIdentifier(), getTypeForDeviceGroup(deviceGroup.getTransportType()));
    }

    public PeripheralDevice(Accessory accessory) {
        this(accessory.getAddress(), getTypeForAccessory(accessory), accessory.getName());
    }
}
