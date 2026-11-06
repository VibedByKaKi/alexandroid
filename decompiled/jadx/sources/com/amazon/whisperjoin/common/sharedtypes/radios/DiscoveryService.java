package com.amazon.whisperjoin.common.sharedtypes.radios;

import com.amazon.whisperjoin.common.sharedtypes.ble.BleScanData;
import com.amazon.whisperjoin.common.sharedtypes.devices.AbstractPeripheralDeviceDetails;
import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.RadioNotEnabledException;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.ScanException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DiscoveryService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface BleScanDataCoalescer {
        DiscoveryResult coalesce(BleScanData bleScanData);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DiscoveryResult {
        private AbstractPeripheralDeviceDetails mDeviceDetails;
        private Event mResult;

        public DiscoveryResult(Event event, AbstractPeripheralDeviceDetails abstractPeripheralDeviceDetails) {
            if (abstractPeripheralDeviceDetails == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("device must not be null");
                throw null;
            }
            this.mResult = event;
            this.mDeviceDetails = abstractPeripheralDeviceDetails;
        }

        public AbstractPeripheralDeviceDetails getDevice() {
            return this.mDeviceDetails;
        }

        public Event getEvent() {
            return this.mResult;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Event {
        WJ_DEVICE_ADDED,
        WJ_DEVICE_UPDATED,
        THIRD_PARTY_ADDED,
        THIRD_PARTY_UPDATED,
        ERROR
    }

    void start(DeviceFilter deviceFilter, BleScanDataCoalescer bleScanDataCoalescer, ScanningMode scanningMode) throws RadioNotEnabledException, ScanException;

    void stop();
}
