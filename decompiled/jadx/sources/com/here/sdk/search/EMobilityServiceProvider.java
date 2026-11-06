package com.here.sdk.search;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EMobilityServiceProvider {

    @Nullable
    public String name = null;

    @Nullable
    public String partnerId = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EMobilityServiceProvider)) {
            return false;
        }
        EMobilityServiceProvider eMobilityServiceProvider = (EMobilityServiceProvider) obj;
        return Objects.equals(this.name, eMobilityServiceProvider.name) && Objects.equals(this.partnerId, eMobilityServiceProvider.partnerId);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.partnerId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
