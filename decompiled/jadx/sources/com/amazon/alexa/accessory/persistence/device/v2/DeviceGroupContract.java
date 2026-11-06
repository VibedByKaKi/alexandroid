package com.amazon.alexa.accessory.persistence.device.v2;

import android.provider.BaseColumns;
import com.amazon.alexa.accessory.persistence.DatabaseContract;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface DeviceGroupContract extends DatabaseContract {
    public static final int VERSION = 3;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public interface DeviceGroupColumns extends BaseColumns {
        public static final List<String> COLUMNS;
        public static final String COLUMN_COLOR = "color";
        public static final String COLUMN_CONDITION = "condition";
        public static final String COLUMN_DEVICE_ID = "device_id";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_IDENTIFIER = "identifier";
        public static final int COLUMN_INDEX_COLOR;
        public static final int COLUMN_INDEX_CONDITION;
        public static final int COLUMN_INDEX_DEVICE_ID;
        public static final int COLUMN_INDEX_ID;
        public static final int COLUMN_INDEX_IDENTIFIER;
        public static final int COLUMN_INDEX_NAME;
        public static final int COLUMN_INDEX_SERIAL_NUMBER;
        public static final int COLUMN_INDEX_TRANSPORT;
        public static final int COLUMN_INDEX_TYPE;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SERIAL_NUMBER = "serial_number";
        public static final String COLUMN_TRANSPORT = "transport";
        public static final String COLUMN_TYPE = "type";

        static {
            List<String> unmodifiableList = Collections.unmodifiableList(Arrays.asList("_id", "identifier", "transport", "condition", "device_id", "name", "serial_number", "type", "color"));
            COLUMNS = unmodifiableList;
            COLUMN_INDEX_ID = unmodifiableList.indexOf("_id");
            COLUMN_INDEX_IDENTIFIER = unmodifiableList.indexOf("identifier");
            COLUMN_INDEX_TRANSPORT = unmodifiableList.indexOf("transport");
            COLUMN_INDEX_CONDITION = unmodifiableList.indexOf("condition");
            COLUMN_INDEX_DEVICE_ID = unmodifiableList.indexOf("device_id");
            COLUMN_INDEX_NAME = unmodifiableList.indexOf("name");
            COLUMN_INDEX_SERIAL_NUMBER = unmodifiableList.indexOf("serial_number");
            COLUMN_INDEX_TYPE = unmodifiableList.indexOf("type");
            COLUMN_INDEX_COLOR = unmodifiableList.indexOf("color");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DeviceGroupV3Columns extends BaseColumns {
        public static final List<String> COLUMNS;
        public static final String COLUMN_COLOR = "color";
        public static final String COLUMN_DEVICE_ID = "device_id";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_IDENTIFIER = "identifier";
        public static final int COLUMN_INDEX_COLOR;
        public static final int COLUMN_INDEX_DEVICE_ID;
        public static final int COLUMN_INDEX_ID;
        public static final int COLUMN_INDEX_IDENTIFIER;
        public static final int COLUMN_INDEX_NAME;
        public static final int COLUMN_INDEX_SERIAL_NUMBER;
        public static final int COLUMN_INDEX_STANDBY_REASON;
        public static final int COLUMN_INDEX_STANDBY_TIMEOUT;
        public static final int COLUMN_INDEX_TRANSPORT;
        public static final int COLUMN_INDEX_TYPE;
        public static final String COLUMN_LAST_KNOWN_STANDBY_REASON = "last_known_standby_reason";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SERIAL_NUMBER = "serial_number";
        public static final String COLUMN_STANDBY_TIMEOUT = "standby_timeout";
        public static final String COLUMN_TRANSPORT = "transport";
        public static final String COLUMN_TYPE = "type";

        static {
            List<String> unmodifiableList = Collections.unmodifiableList(Arrays.asList("_id", "identifier", "transport", "device_id", "name", "serial_number", "type", "color", COLUMN_STANDBY_TIMEOUT, COLUMN_LAST_KNOWN_STANDBY_REASON));
            COLUMNS = unmodifiableList;
            COLUMN_INDEX_ID = unmodifiableList.indexOf("_id");
            COLUMN_INDEX_IDENTIFIER = unmodifiableList.indexOf("identifier");
            COLUMN_INDEX_TRANSPORT = unmodifiableList.indexOf("transport");
            COLUMN_INDEX_DEVICE_ID = unmodifiableList.indexOf("device_id");
            COLUMN_INDEX_NAME = unmodifiableList.indexOf("name");
            COLUMN_INDEX_SERIAL_NUMBER = unmodifiableList.indexOf("serial_number");
            COLUMN_INDEX_TYPE = unmodifiableList.indexOf("type");
            COLUMN_INDEX_COLOR = unmodifiableList.indexOf("color");
            COLUMN_INDEX_STANDBY_TIMEOUT = unmodifiableList.indexOf(COLUMN_STANDBY_TIMEOUT);
            COLUMN_INDEX_STANDBY_REASON = unmodifiableList.indexOf(COLUMN_LAST_KNOWN_STANDBY_REASON);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Tables {

        @Deprecated
        public static final String DEVICE_GROUPS = "device_groups";
        public static final String DEVICE_GROUPS_V3 = "device_groups_v3";
    }
}
