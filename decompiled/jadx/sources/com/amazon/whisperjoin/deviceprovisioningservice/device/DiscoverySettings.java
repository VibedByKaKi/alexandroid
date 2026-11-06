package com.amazon.whisperjoin.deviceprovisioningservice.device;

import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;
import com.amazon.whisperjoin.common.sharedtypes.radios.ScanningMode;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoverySettings {
    private final DeviceFilter mDeviceFilter;
    private final int mLimitForNumberOfDiscoveredDevices;
    private final ScanningMode mScanningMode;

    public DiscoverySettings(DeviceFilter deviceFilter, ScanningMode scanningMode, int i) {
        if (deviceFilter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("deviceFilter can not be null");
            throw null;
        }
        if (scanningMode == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("scanningMode can not be null");
            throw null;
        }
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("limitForNumberOfDiscoveredDevices must be greater than zero");
            throw null;
        }
        this.mDeviceFilter = deviceFilter;
        this.mScanningMode = scanningMode;
        this.mLimitForNumberOfDiscoveredDevices = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DiscoverySettings discoverySettings = (DiscoverySettings) obj;
            if (this.mLimitForNumberOfDiscoveredDevices == discoverySettings.mLimitForNumberOfDiscoveredDevices && Objects.equal(this.mDeviceFilter, discoverySettings.mDeviceFilter) && this.mScanningMode == discoverySettings.mScanningMode) {
                return true;
            }
        }
        return false;
    }

    public DeviceFilter getDeviceFilter() {
        return this.mDeviceFilter;
    }

    public int getLimitForNumberOfDiscoveredDevices() {
        return this.mLimitForNumberOfDiscoveredDevices;
    }

    public ScanningMode getScanningMode() {
        return this.mScanningMode;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDeviceFilter, this.mScanningMode, Integer.valueOf(this.mLimitForNumberOfDiscoveredDevices));
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mDeviceFilter", this.mDeviceFilter).add("mScanningMode", this.mScanningMode).add("mLimitForNumberOfDiscoveredDevices", this.mLimitForNumberOfDiscoveredDevices).toString();
    }
}
