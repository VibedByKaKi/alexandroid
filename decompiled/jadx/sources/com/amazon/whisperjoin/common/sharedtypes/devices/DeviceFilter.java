package com.amazon.whisperjoin.common.sharedtypes.devices;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class DeviceFilter {
    public BeaconType mBeaconType = BeaconType.OOBE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum BeaconType {
        OOBE(AlexaMetricsConstants.MetricsComponents.OOBE),
        DISTRESS("Distress"),
        ALL("All"),
        ESIM("eSIM");

        public static final String BEACON_TYPE_KEY = "beacon_type";
        private final String name;

        BeaconType(String str) {
            this.name = str;
        }

        public static BeaconType fromInt(int i) {
            BeaconType[] values = values();
            return (i < 0 || i >= values.length) ? OOBE : values[i];
        }

        public int toInt() {
            return ordinal();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FilterResult {
        ACCEPT,
        REJECT
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FilterType {
        FILTER_ACCEPT_ALL_DEVICES("Accept all devices"),
        FILTER_REJECT_ALL_DEVICES("Reject all devices"),
        FILTER_BY_DEVICE_IDENTITY("Filter by device identity"),
        FILTER_BY_PRODUCT_INDEX("Filter by product index"),
        FILTER_BY_DISTRESS_STATE("Filter by distress state");

        public static final String FILTER_TYPE_KEY = "filter_type";
        public static final String FILTER_VALUE_KEY = "filter_value";
        private final String name;

        FilterType(String str) {
            this.name = str;
        }

        public static FilterType fromInt(int i) {
            return values()[i];
        }

        public static String[] getDeviceFilterNameArray() {
            String[] strArr = new String[values().length];
            for (int i = 0; i < values().length; i++) {
                strArr[i] = values()[i].toString();
            }
            return strArr;
        }

        public int toInt() {
            return ordinal();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    public abstract FilterResult filter(WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails);

    public BeaconType getBeaconType() {
        return this.mBeaconType;
    }

    public String toString() {
        return "BeaconType{" + this.mBeaconType.toString() + StringSubstitutor.DEFAULT_VAR_END;
    }

    public void writeToBundle(Bundle bundle) {
        bundle.putInt(BeaconType.BEACON_TYPE_KEY, this.mBeaconType.toInt());
    }

    public void writeToSharedPreferences(SharedPreferences.Editor editor) {
        editor.putInt(BeaconType.BEACON_TYPE_KEY, this.mBeaconType.toInt());
    }
}
