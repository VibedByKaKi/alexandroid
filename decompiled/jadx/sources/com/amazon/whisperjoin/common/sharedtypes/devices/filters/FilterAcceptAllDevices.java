package com.amazon.whisperjoin.common.sharedtypes.devices.filters;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;
import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FilterAcceptAllDevices extends DeviceFilter {
    public FilterAcceptAllDevices(DeviceFilter.BeaconType beaconType) {
        this.mBeaconType = beaconType;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public DeviceFilter.FilterResult filter(WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails) {
        return DeviceFilter.FilterResult.ACCEPT;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(), super.toString(), " FilterAcceptAllDevices{}");
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public void writeToBundle(Bundle bundle) {
        super.writeToBundle(bundle);
        bundle.putInt(DeviceFilter.FilterType.FILTER_TYPE_KEY, DeviceFilter.FilterType.FILTER_ACCEPT_ALL_DEVICES.toInt());
        bundle.putString(DeviceFilter.FilterType.FILTER_VALUE_KEY, "no_filter_field");
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public void writeToSharedPreferences(SharedPreferences.Editor editor) {
        super.writeToSharedPreferences(editor);
        editor.putInt(DeviceFilter.FilterType.FILTER_TYPE_KEY, DeviceFilter.FilterType.FILTER_ACCEPT_ALL_DEVICES.toInt());
        editor.putString(DeviceFilter.FilterType.FILTER_VALUE_KEY, "no_filter_field");
    }

    public FilterAcceptAllDevices() {
    }
}
