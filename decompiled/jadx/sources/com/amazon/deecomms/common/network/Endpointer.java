package com.amazon.deecomms.common.network;

import com.amazon.deecomms.remoteConfig.ArcusConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Endpointer {
    private final ArcusConfig arcusConfig;

    public Endpointer(ArcusConfig arcusConfig) {
        this.arcusConfig = arcusConfig;
    }

    public String getACMSEndpoint() {
        return this.arcusConfig.getConfigString("ACMS.Endpoints.PFM.${PFM}");
    }

    public String getDUIEndpoint() {
        return this.arcusConfig.getConfigString("DUI.Endpoints.PFM.${PFM}");
    }

    public String getSipProxyEndpoint() {
        return this.arcusConfig.getConfigString("SIPProxy.Endpoints.PFM.${PFM}");
    }
}
