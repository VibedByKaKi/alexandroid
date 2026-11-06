package com.amazon.whisperjoin.common.sharedtypes.utility;

import com.amazon.whisperjoin.common.sharedtypes.configuration.RadioConfiguration;
import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;
import com.amazon.whisperjoin.common.sharedtypes.radios.DiscoveryService;
import com.amazon.whisperjoin.common.sharedtypes.radios.ScanningMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveryController {
    private static final String TAG = "com.amazon.whisperjoin.common.sharedtypes.utility.DiscoveryController";
    private final DiscoveryService.BleScanDataCoalescer mBleScanDataCoalescer;
    private final DeviceFilter mDeviceFilter;
    private final Collection<RadioConfiguration> mRadioConfigurations;
    private final ScanningMode mScanningMode;

    public DiscoveryController(DeviceFilter deviceFilter, Collection<RadioConfiguration> collection, DiscoveryService.BleScanDataCoalescer bleScanDataCoalescer, ScanningMode scanningMode) {
        if (deviceFilter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("device filter can not be null");
            throw null;
        }
        if (collection == null || collection.size() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("radioConfigurations can not be null or empty");
            throw null;
        }
        if (bleScanDataCoalescer == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bleScanDataCoalescer can not be null");
            throw null;
        }
        if (scanningMode == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("scanningMode can not be null");
            throw null;
        }
        this.mDeviceFilter = deviceFilter;
        this.mRadioConfigurations = new ArrayList(collection);
        this.mBleScanDataCoalescer = bleScanDataCoalescer;
        this.mScanningMode = scanningMode;
    }

    public void startDiscovery() {
        try {
            Iterator<RadioConfiguration> it2 = this.mRadioConfigurations.iterator();
            while (it2.hasNext()) {
                DiscoveryService discoveryService = it2.next().getDiscoveryService();
                if (discoveryService == null) {
                    throw new RuntimeException("discoveryService should never be null");
                }
                discoveryService.start(this.mDeviceFilter, this.mBleScanDataCoalescer, this.mScanningMode);
            }
        } catch (Exception e) {
            WJLog.e(TAG, "Error starting discovery", e);
        }
    }

    public void stopDiscovery() {
        try {
            Iterator<RadioConfiguration> it2 = this.mRadioConfigurations.iterator();
            while (it2.hasNext()) {
                DiscoveryService discoveryService = it2.next().getDiscoveryService();
                if (discoveryService == null) {
                    throw new RuntimeException("discoveryService should never be null");
                }
                discoveryService.stop();
            }
        } catch (Exception e) {
            WJLog.e(TAG, "Error stopping discovery", e);
        }
    }
}
