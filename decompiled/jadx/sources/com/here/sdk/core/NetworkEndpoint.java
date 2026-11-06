package com.here.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.net.InetAddress;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class NetworkEndpoint {

    @NonNull
    public InetAddress address;

    @Nullable
    public Integer port;

    public NetworkEndpoint(@NonNull InetAddress inetAddress) {
        this.address = inetAddress;
        this.port = null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkEndpoint)) {
            return false;
        }
        NetworkEndpoint networkEndpoint = (NetworkEndpoint) obj;
        return Objects.equals(this.address, networkEndpoint.address) && Objects.equals(this.port, networkEndpoint.port);
    }

    public int hashCode() {
        InetAddress inetAddress = this.address;
        int hashCode = (JfifUtil.MARKER_EOI + (inetAddress != null ? inetAddress.hashCode() : 0)) * 31;
        Integer num = this.port;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public NetworkEndpoint(@NonNull InetAddress inetAddress, @Nullable Integer num) {
        this.address = inetAddress;
        this.port = num;
    }
}
