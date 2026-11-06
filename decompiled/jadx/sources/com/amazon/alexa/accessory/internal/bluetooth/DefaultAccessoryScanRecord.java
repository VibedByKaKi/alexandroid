package com.amazon.alexa.accessory.internal.bluetooth;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.AccessoryScanRecord;
import com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket;
import com.amazon.alexa.accessory.internal.bluetooth.ble.packet.VendorPacket;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DefaultAccessoryScanRecord implements AccessoryScanRecord {
    private static final int MAXIMUM_LENGTH = 22;
    private static final int MINIMUM_LENGTH = 12;
    private static final int RESERVED_BYTES_LENGTH = 3;
    private static final int START_OFFSET = 2;
    private final byte colorByte;
    private final boolean hasAnUpdateAvailableBoolean;
    private final boolean isDiscoverableOverBTClassicBoolean;
    private final boolean isInOOBEModeBoolean;
    private final boolean prefersRFCOMMConnectionBoolean;
    private final short productIdShort;
    private final byte[] productSpecificDataByteArray;
    private final boolean supportsBridgingBoolean;
    private final short vendorIdShort;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ColorPacket extends BasePacket {
        private static final int LENGTH = 1;
        private final byte color;

        public ColorPacket(byte[] bArr, int i) {
            super(bArr, i, 1);
            this.color = getData()[0];
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ColorPacket.class == obj.getClass() && this.color == ((ColorPacket) obj).color;
        }

        public byte getColor() {
            return this.color;
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public int hashCode() {
            return this.color;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ConnectionPreferencePacket extends BasePacket {
        private static final int LENGTH = 1;
        private static final int PREFERS_RFCOMM_CONNECTION_OFFSET = 0;
        private final boolean prefersRFCOMMConnection;

        public ConnectionPreferencePacket(byte[] bArr, int i) {
            super(bArr, i, 1);
            this.prefersRFCOMMConnection = IOUtils.isKthBitSet(0, getData()[0]);
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ConnectionPreferencePacket.class == obj.getClass() && this.prefersRFCOMMConnection == ((ConnectionPreferencePacket) obj).prefersRFCOMMConnection;
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public int hashCode() {
            return this.prefersRFCOMMConnection ? 1 : 0;
        }

        public boolean prefersRFCOMMConnection() {
            return this.prefersRFCOMMConnection;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeviceStatePacket extends BasePacket {
        static final int HAS_AN_UPDATE_AVAILABLE_OFFSET = 2;
        static final int IN_OOBE_MODE_OFFSET = 0;
        static final int IS_DISCOVERABLE_OVER_BTCLASSIC_OFFSET = 1;
        static final int LENGTH = 1;
        private final boolean hasAnUpdateAvailable;
        private final boolean isDiscoverableOverBTClassic;
        private final boolean isInOOBEMode;

        public DeviceStatePacket(byte[] bArr, int i) {
            super(bArr, i, 1);
            this.isInOOBEMode = IOUtils.isKthBitSet(0, getData()[0]);
            this.isDiscoverableOverBTClassic = IOUtils.isKthBitSet(1, getData()[0]);
            this.hasAnUpdateAvailable = IOUtils.isKthBitSet(2, getData()[0]);
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && DeviceStatePacket.class == obj.getClass()) {
                DeviceStatePacket deviceStatePacket = (DeviceStatePacket) obj;
                if (this.isInOOBEMode == deviceStatePacket.isInOOBEMode && this.isDiscoverableOverBTClassic == deviceStatePacket.isDiscoverableOverBTClassic) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasAnUpdateAvailable() {
            return this.hasAnUpdateAvailable;
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public int hashCode() {
            return ((((this.isInOOBEMode ? 1 : 0) * 31) + (this.isDiscoverableOverBTClassic ? 1 : 0)) * 31) + (this.hasAnUpdateAvailable ? 1 : 0);
        }

        public boolean isDiscoverableOverBTClassic() {
            return this.isDiscoverableOverBTClassic;
        }

        public boolean isInOOBEMode() {
            return this.isInOOBEMode;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ProductPacket extends BasePacket {
        private static final int LENGTH = 2;
        private final short productId;

        public ProductPacket(byte[] bArr, int i) {
            super(bArr, i, 2);
            this.productId = IOUtils.combineTwoBytesIntoShort(getData()[1], getData()[0]);
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ProductPacket.class == obj.getClass() && this.productId == ((ProductPacket) obj).productId;
        }

        public short getProductId() {
            return this.productId;
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public int hashCode() {
            return this.productId;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ProductSpecificDataPacket extends BasePacket {
        public ProductSpecificDataPacket(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }
    }

    private DefaultAccessoryScanRecord(byte[] bArr) {
        VendorPacket vendorPacket = new VendorPacket(bArr, 2);
        int packetLength = vendorPacket.getPacketLength();
        ProductPacket productPacket = new ProductPacket(bArr, packetLength + 2);
        ColorPacket colorPacket = new ColorPacket(bArr, packetLength + 4);
        DeviceStatePacket deviceStatePacket = new DeviceStatePacket(bArr, packetLength + 5);
        ConnectionPreferencePacket connectionPreferencePacket = new ConnectionPreferencePacket(bArr, packetLength + 6);
        int i = packetLength + 10;
        byte[] data = new ProductSpecificDataPacket(bArr, i, bArr.length - i).getData();
        this.productSpecificDataByteArray = data;
        this.vendorIdShort = vendorPacket.getVendorId();
        this.productIdShort = productPacket.getProductId();
        this.colorByte = colorPacket.getColor();
        this.isInOOBEModeBoolean = deviceStatePacket.isInOOBEMode();
        this.isDiscoverableOverBTClassicBoolean = deviceStatePacket.isDiscoverableOverBTClassic();
        this.prefersRFCOMMConnectionBoolean = connectionPreferencePacket.prefersRFCOMMConnection();
        this.hasAnUpdateAvailableBoolean = deviceStatePacket.hasAnUpdateAvailable();
        boolean z = false;
        if (data.length > 0 && IOUtils.isKthBitSet(0, data[0])) {
            z = true;
        }
        this.supportsBridgingBoolean = z;
    }

    public static AccessoryScanRecord createFrom(BleAdvertisementData bleAdvertisementData) throws IllegalArgumentException {
        byte[] dataForADType = bleAdvertisementData.getDataForADType((byte) 22);
        if (dataForADType == null) {
            Locale locale = Locale.US;
            Buffer$$ExternalSyntheticBUOutline0.m$3(bleAdvertisementData, "Invalid advertisement: ");
            return null;
        }
        if (dataForADType.length >= 12 && 22 >= dataForADType.length) {
            return new DefaultAccessoryScanRecord(dataForADType);
        }
        Locale locale2 = Locale.US;
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(dataForADType.length, "Invalid service data length. Expected to be in range: [12-22] Actual: "));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DefaultAccessoryScanRecord.class == obj.getClass()) {
            DefaultAccessoryScanRecord defaultAccessoryScanRecord = (DefaultAccessoryScanRecord) obj;
            if (this.vendorIdShort == defaultAccessoryScanRecord.vendorIdShort && this.productIdShort == defaultAccessoryScanRecord.productIdShort && this.colorByte == defaultAccessoryScanRecord.colorByte && this.isDiscoverableOverBTClassicBoolean == defaultAccessoryScanRecord.isDiscoverableOverBTClassicBoolean && this.prefersRFCOMMConnectionBoolean == defaultAccessoryScanRecord.prefersRFCOMMConnectionBoolean && this.isInOOBEModeBoolean == defaultAccessoryScanRecord.isInOOBEModeBoolean && this.hasAnUpdateAvailableBoolean == defaultAccessoryScanRecord.hasAnUpdateAvailableBoolean && this.supportsBridgingBoolean == defaultAccessoryScanRecord.supportsBridgingBoolean && Arrays.equals(this.productSpecificDataByteArray, defaultAccessoryScanRecord.productSpecificDataByteArray)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public byte getColor() {
        return this.colorByte;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public short getProductId() {
        return this.productIdShort;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public byte[] getProductSpecificData() {
        return this.productSpecificDataByteArray;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public short getVendorId() {
        return this.vendorIdShort;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public boolean hasAnUpdateAvailable() {
        return this.hasAnUpdateAvailableBoolean;
    }

    public int hashCode() {
        return Arrays.hashCode(this.productSpecificDataByteArray) + (Objects.hash(Short.valueOf(this.vendorIdShort), Short.valueOf(this.productIdShort), Byte.valueOf(this.colorByte), Boolean.valueOf(this.isDiscoverableOverBTClassicBoolean), Boolean.valueOf(this.prefersRFCOMMConnectionBoolean), Boolean.valueOf(this.isInOOBEModeBoolean), Boolean.valueOf(this.hasAnUpdateAvailableBoolean), Boolean.valueOf(this.supportsBridgingBoolean)) * 31);
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public boolean isDiscoverableOverBTClassic() {
        return this.isDiscoverableOverBTClassicBoolean;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public boolean isInOOBEMode() {
        return this.isInOOBEModeBoolean;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public boolean prefersRFCOMMConnection() {
        return this.prefersRFCOMMConnectionBoolean;
    }

    @Override // com.amazon.alexa.accessory.AccessoryScanRecord
    public boolean supportsBridging() {
        return this.supportsBridgingBoolean;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DefaultAccessoryScanRecord{productSpecificDataByteArray=");
        sb.append(Arrays.toString(this.productSpecificDataByteArray));
        sb.append(", vendorIdShort=");
        sb.append((int) this.vendorIdShort);
        sb.append(", productIdShort=");
        sb.append((int) this.productIdShort);
        sb.append(", colorByte=");
        sb.append((int) this.colorByte);
        sb.append(", isDiscoverableOverBTClassicBoolean=");
        sb.append(this.isDiscoverableOverBTClassicBoolean);
        sb.append(", prefersRFCOMMConnectionBoolean=");
        sb.append(this.prefersRFCOMMConnectionBoolean);
        sb.append(", isInOOBEModeBoolean=");
        sb.append(this.isInOOBEModeBoolean);
        sb.append(", hasAnUpdateAvailableBoolean=");
        sb.append(this.hasAnUpdateAvailableBoolean);
        sb.append(", supportsBridgingBoolean=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.supportsBridgingBoolean, AbstractJsonLexerKt.END_OBJ);
    }

    public DefaultAccessoryScanRecord(byte[] bArr, short s, short s2, byte b, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.productSpecificDataByteArray = bArr;
        this.vendorIdShort = s;
        this.productIdShort = s2;
        this.colorByte = b;
        this.isInOOBEModeBoolean = z;
        this.isDiscoverableOverBTClassicBoolean = z2;
        this.prefersRFCOMMConnectionBoolean = z3;
        this.hasAnUpdateAvailableBoolean = z4;
        this.supportsBridgingBoolean = z5;
    }

    public DefaultAccessoryScanRecord(byte[] bArr, short s, short s2, byte b, boolean z, boolean z2, boolean z3, boolean z4) {
        this(bArr, s, s2, b, z, z2, z3, z4, false);
    }
}
