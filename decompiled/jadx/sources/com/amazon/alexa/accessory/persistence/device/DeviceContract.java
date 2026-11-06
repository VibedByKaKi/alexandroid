package com.amazon.alexa.accessory.persistence.device;

import android.content.ContentValues;
import android.database.Cursor;
import android.provider.BaseColumns;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.persistence.DatabaseContract;
import com.amazon.alexa.accessory.persistence.device.v2.DeviceGroupContract;
import com.amazon.alexa.accessory.repositories.device.v2.Device;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface DeviceContract extends DatabaseContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Device implements BaseColumns {
        public static final String COLUMN_CONDITION = "condition";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_IDENTIFIER = "identifier";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SERIAL_NUMBER = "serial_number";
        public static final String COLUMN_TRANSPORT = "transport";
        public static final String COLUMN_TYPE = "type";
        public static final int CONDITION_ACTIVE = 0;
        public static final int CONDITION_DISABLED = 1;
        public static final int PREV_COLUMN_INDEX_CONDITION = 6;
        public static final int PREV_COLUMN_INDEX_ID = 0;
        public static final int PREV_COLUMN_INDEX_IDENTIFIER = 4;
        public static final int PREV_COLUMN_INDEX_NAME = 1;
        public static final int PREV_COLUMN_INDEX_SERIAL_NUMBER = 2;
        public static final int PREV_COLUMN_INDEX_TRANSPORT = 5;
        public static final int PREV_COLUMN_INDEX_TYPE = 3;
        public static final String TABLE_NAME = "devices";
        public static final int TRANSPORT_GATT = 0;
        public static final int TRANSPORT_RFCOMM = 1;
        private final int condition;
        private final long id;
        private final String identifier;
        private final String name;
        private final String serialNumber;
        private final int transport;
        private final String type;
        public static final String[] COLUMNS = {"_id", "name", "serial_number", "type", "identifier", "transport", "condition"};
        public static final int COLUMN_INDEX_ID = DeviceGroupContract.DeviceGroupV3Columns.COLUMN_INDEX_ID;
        public static final int COLUMN_INDEX_NAME = DeviceGroupContract.DeviceGroupV3Columns.COLUMN_INDEX_NAME;
        public static final int COLUMN_INDEX_SERIAL_NUMBER = DeviceGroupContract.DeviceGroupV3Columns.COLUMN_INDEX_SERIAL_NUMBER;
        public static final int COLUMN_INDEX_TYPE = DeviceGroupContract.DeviceGroupV3Columns.COLUMN_INDEX_TYPE;
        public static final int COLUMN_INDEX_IDENTIFIER = DeviceGroupContract.DeviceGroupV3Columns.COLUMN_INDEX_IDENTIFIER;
        public static final int COLUMN_INDEX_TRANSPORT = DeviceGroupContract.DeviceGroupV3Columns.COLUMN_INDEX_TRANSPORT;
        public static final int COLUMN_INDEX_STANDBY_TIMEOUT = DeviceGroupContract.DeviceGroupV3Columns.COLUMN_INDEX_STANDBY_TIMEOUT;

        public Device(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.serialNumber = builder.serialNumber;
            this.type = builder.type;
            this.identifier = builder.identifier;
            this.transport = builder.transport;
            this.condition = builder.condition;
        }

        public static Device convertDeviceGroupToDevice(DeviceGroup deviceGroup) {
            Preconditions.notNull(deviceGroup, "deviceGroup");
            Builder transport = new Builder().id(deviceGroup.getId()).identifier(deviceGroup.getIdentifier()).condition(deviceGroup.getCondition(System.currentTimeMillis()).ordinal()).transport(deviceGroup.getTransportType().ordinal());
            com.amazon.alexa.accessory.repositories.device.v2.Device device = deviceGroup.getDevice();
            if (device != null) {
                transport.name(device.getName()).serialNumber(device.getSerialNumber()).type(device.getType());
            }
            return transport.build();
        }

        public static List<Device> convertDeviceGroupsToDevices(List<DeviceGroup> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<DeviceGroup> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(convertDeviceGroupToDevice(it2.next()));
            }
            return arrayList;
        }

        public static DeviceGroup convertDeviceToDeviceGroup(Device device) {
            DeviceGroup.Builder conditionActive = new DeviceGroup.Builder().id(device.id).identifier(device.identifier).transport(AccessoryTransport.Type.values()[device.transport]).setConditionActive();
            if (device.getName() != null && device.getType() != null && device.getSerialNumber() != null) {
                conditionActive.devices(Collections.singletonList(new Device.Builder().name(device.name).serialNumber(device.serialNumber).type(device.type).deviceId(0).color(0).build()));
            }
            return conditionActive.build();
        }

        public static Device map(Cursor cursor) {
            Preconditions.notNull(cursor, "cursor");
            Preconditions.notNegative(cursor.getPosition(), "position");
            Preconditions.precondition(cursor.getPosition() < cursor.getCount(), "position");
            return new Builder().id(cursor.getLong(COLUMN_INDEX_ID)).name(cursor.getString(COLUMN_INDEX_NAME)).serialNumber(cursor.getString(COLUMN_INDEX_SERIAL_NUMBER)).type(cursor.getString(COLUMN_INDEX_TYPE)).identifier(cursor.getString(COLUMN_INDEX_IDENTIFIER)).transport(cursor.getString(COLUMN_INDEX_TRANSPORT)).condition(0).build();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Device.class == obj.getClass()) {
                Device device = (Device) obj;
                if (this.id != device.id || this.transport != device.transport || this.condition != device.condition) {
                    return false;
                }
                String str = this.name;
                String str2 = device.name;
                if (str == null ? str2 != null : !str.equals(str2)) {
                    return false;
                }
                String str3 = this.serialNumber;
                String str4 = device.serialNumber;
                if (str3 == null ? str4 != null : !str3.equals(str4)) {
                    return false;
                }
                String str5 = this.type;
                String str6 = device.type;
                if (str5 == null ? str6 != null : !str5.equals(str6)) {
                    return false;
                }
                String str7 = this.identifier;
                String str8 = device.identifier;
                if (str7 != null) {
                    return str7.equals(str8);
                }
                if (str8 == null) {
                    return true;
                }
            }
            return false;
        }

        public int getCondition() {
            return this.condition;
        }

        public long getId() {
            return this.id;
        }

        public String getIdentifier() {
            return this.identifier;
        }

        public String getName() {
            return this.name;
        }

        public String getSerialNumber() {
            return this.serialNumber;
        }

        public int getTransport() {
            return this.transport;
        }

        public String getType() {
            return this.type;
        }

        public int hashCode() {
            long j = this.id;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.name;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.serialNumber;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.type;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.identifier;
            return ((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.transport) * 31) + this.condition;
        }

        public ContentValues toContentValues() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", this.name);
            contentValues.put("serial_number", this.serialNumber);
            contentValues.put("type", this.type);
            contentValues.put("identifier", this.identifier);
            contentValues.put("transport", Integer.valueOf(this.transport));
            contentValues.put("condition", Integer.valueOf(this.condition));
            return contentValues;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Device{id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", sn=");
            sb.append(this.serialNumber);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", identifier='");
            sb.append(this.identifier);
            sb.append("', transport=");
            sb.append(this.transport);
            sb.append(", condition=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.condition, AbstractJsonLexerKt.END_OBJ);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            int condition;
            long id;
            String identifier;
            boolean isTransportSet;
            String name;
            String serialNumber;
            int transport;
            String type;

            public Builder(Device device) {
                Preconditions.notNull(device, "device");
                this.id = device.getId();
                this.name = device.getName();
                this.serialNumber = device.getSerialNumber();
                this.type = device.getType();
                this.identifier = device.getIdentifier();
                this.transport = device.getTransport();
                this.condition = device.getCondition();
                this.isTransportSet = true;
            }

            public Device build() {
                Preconditions.notNull(this.identifier, "identifier");
                Preconditions.precondition(this.isTransportSet, "Transport wasn't set!");
                Preconditions.in(this.transport, "transport", 0, 1);
                Preconditions.in(this.condition, "condition", 0, 1);
                return new Device(this);
            }

            public Builder condition(String str) {
                return condition(DeviceGroup.Condition.valueOf(str).ordinal());
            }

            public Builder id(long j) {
                this.id = j;
                return this;
            }

            public Builder identifier(String str) {
                this.identifier = str;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder serialNumber(String str) {
                this.serialNumber = str;
                return this;
            }

            public Builder transport(String str) {
                return transport(AccessoryTransport.Type.valueOf(str).ordinal());
            }

            public Builder type(String str) {
                this.type = str;
                return this;
            }

            public Builder condition(int i) {
                this.condition = i;
                return this;
            }

            public Builder transport(int i) {
                this.transport = i;
                this.isTransportSet = true;
                return this;
            }

            public Builder() {
                this.id = -1L;
                this.condition = 0;
            }
        }
    }
}
