package com.amazon.alexa.accessory.internal.bluetooth;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.AccessoryDataBeaconRecord;
import com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket;
import com.amazon.alexa.accessory.internal.bluetooth.ble.packet.VendorPacket;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DefaultAccessoryDataBeaconRecord implements AccessoryDataBeaconRecord {
    private static final int MAXIMUM_LENGTH = 25;
    private static final int MINIMUM_LENGTH = 3;
    private static final int START_OFFSET = 0;
    private final short applicationIdShort;
    private final byte[] applicationSpecificDataByteArray;
    private final short vendorIdShort;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ApplicationPacket extends BasePacket {
        private static final int LENGTH = 1;
        private final short applicationId;

        public ApplicationPacket(byte[] bArr, int i) {
            super(bArr, i, 1);
            this.applicationId = getData()[0];
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ApplicationPacket.class == obj.getClass() && this.applicationId == ((ApplicationPacket) obj).applicationId;
        }

        public short getApplicationId() {
            return this.applicationId;
        }

        @Override // com.amazon.alexa.accessory.internal.bluetooth.ble.packet.BasePacket
        public int hashCode() {
            return this.applicationId;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ApplicationSpecificDataPacket extends BasePacket {
        public ApplicationSpecificDataPacket(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }
    }

    private DefaultAccessoryDataBeaconRecord(byte[] bArr) {
        VendorPacket vendorPacket = new VendorPacket(bArr, 0);
        int packetLength = vendorPacket.getPacketLength();
        ApplicationPacket applicationPacket = new ApplicationPacket(bArr, packetLength);
        int i = packetLength + 1;
        ApplicationSpecificDataPacket applicationSpecificDataPacket = new ApplicationSpecificDataPacket(bArr, i, bArr.length - i);
        this.vendorIdShort = vendorPacket.getVendorId();
        this.applicationIdShort = applicationPacket.getApplicationId();
        this.applicationSpecificDataByteArray = applicationSpecificDataPacket.getData();
    }

    public static AccessoryDataBeaconRecord createFrom(BleAdvertisementData bleAdvertisementData) throws IllegalArgumentException {
        byte[] dataForADType = bleAdvertisementData.getDataForADType((byte) -1);
        if (dataForADType == null) {
            Locale locale = Locale.US;
            Buffer$$ExternalSyntheticBUOutline0.m$3(bleAdvertisementData, "Invalid advertisement from beacon: ");
            return null;
        }
        if (dataForADType.length >= 3 && 25 >= dataForADType.length) {
            return new DefaultAccessoryDataBeaconRecord(dataForADType);
        }
        Locale locale2 = Locale.US;
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(dataForADType.length, "Invalid manufacturer specific data length from beacon. Expected to be in range:[3-25] Actual: "));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DefaultAccessoryDataBeaconRecord defaultAccessoryDataBeaconRecord = (DefaultAccessoryDataBeaconRecord) obj;
            if (this.vendorIdShort == defaultAccessoryDataBeaconRecord.vendorIdShort && this.applicationIdShort == defaultAccessoryDataBeaconRecord.applicationIdShort && Arrays.equals(this.applicationSpecificDataByteArray, defaultAccessoryDataBeaconRecord.applicationSpecificDataByteArray)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.AccessoryDataBeaconRecord
    public short getApplicationId() {
        return this.applicationIdShort;
    }

    @Override // com.amazon.alexa.accessory.AccessoryDataBeaconRecord
    public byte[] getApplicationSpecificData() {
        return this.applicationSpecificDataByteArray;
    }

    @Override // com.amazon.alexa.accessory.AccessoryDataBeaconRecord
    public short getVendorId() {
        return this.vendorIdShort;
    }

    public int hashCode() {
        return Arrays.hashCode(this.applicationSpecificDataByteArray) + (Objects.hash(Short.valueOf(this.vendorIdShort), Short.valueOf(this.applicationIdShort)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DefaultAccessoryDataBeaconRecord{applicationSpecificDataByteArray=");
        sb.append(Arrays.toString(this.applicationSpecificDataByteArray));
        sb.append(", vendorIdShort=");
        sb.append((int) this.vendorIdShort);
        sb.append(", applicationIdShort=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.applicationIdShort, AbstractJsonLexerKt.END_OBJ);
    }

    public DefaultAccessoryDataBeaconRecord(byte[] bArr, short s, short s2) {
        this.vendorIdShort = s;
        this.applicationIdShort = s2;
        this.applicationSpecificDataByteArray = bArr;
    }
}
