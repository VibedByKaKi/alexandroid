package com.amazon.devicesetup.provisioning.data.wifi;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.GenericTreeSetCollection;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WifiScanResultCollection extends GenericTreeSetCollection<WifiScanResult> {
    public WifiScanResultCollection() {
    }

    public boolean contains(String str, WifiKeyManagement wifiKeyManagement) {
        if (this.values == null) {
            return false;
        }
        return this.values.contains(new WifiScanResult(str, wifiKeyManagement));
    }

    public WifiScanResultCollection(Collection<WifiScanResult> collection) {
        super(collection);
    }
}
