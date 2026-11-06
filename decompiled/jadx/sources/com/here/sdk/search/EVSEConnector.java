package com.here.sdk.search;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVSEConnector {

    @Nullable
    public String id = null;

    @Nullable
    public String cpoId = null;

    @Nullable
    public String typeId = null;

    @Nullable
    public Double maxPowerInKilowatts = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVSEConnector)) {
            return false;
        }
        EVSEConnector eVSEConnector = (EVSEConnector) obj;
        return Objects.equals(this.id, eVSEConnector.id) && Objects.equals(this.cpoId, eVSEConnector.cpoId) && Objects.equals(this.typeId, eVSEConnector.typeId) && Objects.equals(this.maxPowerInKilowatts, eVSEConnector.maxPowerInKilowatts);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.cpoId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.typeId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Double d = this.maxPowerInKilowatts;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }
}
