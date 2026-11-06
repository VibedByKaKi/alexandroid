package com.amazon.whisperjoin.provisionerSDK.data.provisioning;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning.GenericDeviceStatus;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.registration.CBLRegistrationDetails;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConnectionDetails;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class AmazonWifiDeviceStatus extends GenericDeviceStatus<WifiConnectionDetails, CBLRegistrationDetails> {
    public AmazonWifiDeviceStatus(WifiConnectionDetails wifiConnectionDetails, Collection<CBLRegistrationDetails> collection) {
        super(wifiConnectionDetails, collection);
    }
}
