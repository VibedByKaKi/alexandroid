package com.amazon.whisperjoin.common.sharedtypes.ble.events;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConnectionDetails;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WifiConnectionUpdatedEvent extends ProvisionableEvent<WifiConnectionDetails> {
    public WifiConnectionUpdatedEvent(WifiConnectionDetails wifiConnectionDetails) {
        super(ProvisionableEvents.WIFI_CONNECTION_DETAILS_UPDATED_EVENT_UUID, wifiConnectionDetails);
    }
}
