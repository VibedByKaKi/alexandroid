package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Evse {

    @Nullable
    public String id = null;

    @Nullable
    public String cpoId = null;

    @Nullable
    public String cpoEvseEmi3Id = null;

    @Nullable
    public EVSEStatus status = null;

    @Nullable
    public Date lastUpdated = null;

    @NonNull
    public List<EVSEConnector> connectors = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Evse)) {
            return false;
        }
        Evse evse = (Evse) obj;
        return Objects.equals(this.id, evse.id) && Objects.equals(this.cpoId, evse.cpoId) && Objects.equals(this.cpoEvseEmi3Id, evse.cpoEvseEmi3Id) && Objects.equals(this.status, evse.status) && Objects.equals(this.lastUpdated, evse.lastUpdated) && Objects.equals(this.connectors, evse.connectors);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.cpoId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cpoEvseEmi3Id;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        EVSEStatus eVSEStatus = this.status;
        int hashCode4 = (hashCode3 + (eVSEStatus != null ? eVSEStatus.hashCode() : 0)) * 31;
        Date date = this.lastUpdated;
        int hashCode5 = (hashCode4 + (date != null ? date.hashCode() : 0)) * 31;
        List<EVSEConnector> list = this.connectors;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }
}
