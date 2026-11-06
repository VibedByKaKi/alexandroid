package com.amazon.whisperjoin.common.sharedtypes.ble.events;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiScanResultCollection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VisibleNetworksUpdatedEvent extends ProvisionableEvent<WifiScanResultCollection> {
    public VisibleNetworksUpdatedEvent(WifiScanResultCollection wifiScanResultCollection) {
        super(ProvisionableEvents.WIFI_VISIBLE_NETWORKS_UPDATED_EVENT_UUID, wifiScanResultCollection);
    }
}
