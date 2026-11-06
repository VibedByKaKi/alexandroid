package com.amazon.whisperjoin.common.sharedtypes.devices.filters;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceFilterBuilder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.common.sharedtypes.devices.filters.DeviceFilterBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$devices$DeviceFilter$FilterType;

        static {
            int[] iArr = new int[DeviceFilter.FilterType.values().length];
            $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$devices$DeviceFilter$FilterType = iArr;
            try {
                iArr[DeviceFilter.FilterType.FILTER_ACCEPT_ALL_DEVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$devices$DeviceFilter$FilterType[DeviceFilter.FilterType.FILTER_REJECT_ALL_DEVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$devices$DeviceFilter$FilterType[DeviceFilter.FilterType.FILTER_BY_DEVICE_IDENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$devices$DeviceFilter$FilterType[DeviceFilter.FilterType.FILTER_BY_PRODUCT_INDEX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$devices$DeviceFilter$FilterType[DeviceFilter.FilterType.FILTER_BY_DISTRESS_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private DeviceFilterBuilder() {
    }

    public static DeviceFilter build(int i, String str, int i2) {
        DeviceFilter.BeaconType fromInt = DeviceFilter.BeaconType.fromInt(i2);
        int i3 = AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$common$sharedtypes$devices$DeviceFilter$FilterType[DeviceFilter.FilterType.fromInt(i).ordinal()];
        if (i3 == 1) {
            return new FilterAcceptAllDevices(fromInt);
        }
        if (i3 == 2) {
            return new FilterRejectAllDevices();
        }
        if (i3 == 3) {
            return new FilterByDeviceIdentity(str, fromInt);
        }
        if (i3 == 4) {
            return new FilterByProductIndex(str, fromInt);
        }
        if (i3 == 5) {
            return new FilterByDistressState(str, fromInt);
        }
        throw new UnsupportedOperationException(String.format("Unknown beacon or filter type. DeviceBeaconType{%d} DeviceFilterType{%s}", Integer.valueOf(i2), Integer.valueOf(i)));
    }

    public static DeviceFilter fromBundle(Bundle bundle) {
        return build(bundle.getInt(DeviceFilter.FilterType.FILTER_TYPE_KEY), bundle.getString(DeviceFilter.FilterType.FILTER_VALUE_KEY), bundle.containsKey(DeviceFilter.BeaconType.BEACON_TYPE_KEY) ? bundle.getInt(DeviceFilter.BeaconType.BEACON_TYPE_KEY) : DeviceFilter.BeaconType.OOBE.toInt());
    }

    public static DeviceFilter fromSharedPreferences(SharedPreferences sharedPreferences) {
        return build(sharedPreferences.getInt(DeviceFilter.FilterType.FILTER_TYPE_KEY, DeviceFilter.FilterType.FILTER_ACCEPT_ALL_DEVICES.toInt()), sharedPreferences.getString(DeviceFilter.FilterType.FILTER_VALUE_KEY, "no_filter_field"), sharedPreferences.getInt(DeviceFilter.BeaconType.BEACON_TYPE_KEY, DeviceFilter.BeaconType.OOBE.toInt()));
    }

    public static DeviceFilter build(int i, String str) {
        return build(i, str, DeviceFilter.BeaconType.OOBE.toInt());
    }
}
