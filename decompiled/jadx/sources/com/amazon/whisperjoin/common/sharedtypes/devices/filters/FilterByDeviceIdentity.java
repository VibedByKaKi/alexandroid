package com.amazon.whisperjoin.common.sharedtypes.devices.filters;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;
import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FilterByDeviceIdentity extends DeviceFilter {
    private final String mDeviceIdentity;

    public FilterByDeviceIdentity(String str, DeviceFilter.BeaconType beaconType) {
        this.mDeviceIdentity = str;
        this.mBeaconType = beaconType;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public DeviceFilter.FilterResult filter(WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails) {
        return whisperJoinPeripheralDeviceDetails.getDeviceIdentity().equals(this.mDeviceIdentity) ? DeviceFilter.FilterResult.ACCEPT : DeviceFilter.FilterResult.REJECT;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" FilterByDeviceIdentity{mDeviceIdentity='");
        return a$$ExternalSyntheticOutline0.m(sb, this.mDeviceIdentity, "'}");
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public void writeToBundle(Bundle bundle) {
        super.writeToBundle(bundle);
        bundle.putInt(DeviceFilter.FilterType.FILTER_TYPE_KEY, DeviceFilter.FilterType.FILTER_BY_DEVICE_IDENTITY.toInt());
        bundle.putString(DeviceFilter.FilterType.FILTER_VALUE_KEY, this.mDeviceIdentity);
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter
    public void writeToSharedPreferences(SharedPreferences.Editor editor) {
        super.writeToSharedPreferences(editor);
        editor.putInt(DeviceFilter.FilterType.FILTER_TYPE_KEY, DeviceFilter.FilterType.FILTER_BY_DEVICE_IDENTITY.toInt());
        editor.putString(DeviceFilter.FilterType.FILTER_VALUE_KEY, this.mDeviceIdentity);
    }

    public FilterByDeviceIdentity(String str) {
        this.mDeviceIdentity = str;
    }
}
