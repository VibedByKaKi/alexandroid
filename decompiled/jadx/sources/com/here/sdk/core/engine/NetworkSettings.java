package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.NetworkEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class NetworkSettings {

    @Nullable
    public ProxySettings proxySettings = null;

    @NonNull
    public List<NetworkEndpoint> domainNameSystemServers = new ArrayList();

    @Nullable
    public CertificateSettings certificates = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkSettings)) {
            return false;
        }
        NetworkSettings networkSettings = (NetworkSettings) obj;
        return Objects.equals(this.proxySettings, networkSettings.proxySettings) && Objects.equals(this.domainNameSystemServers, networkSettings.domainNameSystemServers) && Objects.equals(this.certificates, networkSettings.certificates);
    }

    public int hashCode() {
        ProxySettings proxySettings = this.proxySettings;
        int hashCode = (JfifUtil.MARKER_EOI + (proxySettings != null ? proxySettings.hashCode() : 0)) * 31;
        List<NetworkEndpoint> list = this.domainNameSystemServers;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        CertificateSettings certificateSettings = this.certificates;
        return hashCode2 + (certificateSettings != null ? certificateSettings.hashCode() : 0);
    }
}
