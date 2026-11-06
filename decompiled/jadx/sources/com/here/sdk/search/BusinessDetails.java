package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class BusinessDetails {

    @NonNull
    public List<Contact> contacts = new ArrayList();

    @NonNull
    public List<OpeningHours> openingHours = new ArrayList();

    @Nullable
    public EVChargingPool evChargingPool = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessDetails)) {
            return false;
        }
        BusinessDetails businessDetails = (BusinessDetails) obj;
        return Objects.equals(this.contacts, businessDetails.contacts) && Objects.equals(this.openingHours, businessDetails.openingHours) && Objects.equals(this.evChargingPool, businessDetails.evChargingPool);
    }

    public int hashCode() {
        List<Contact> list = this.contacts;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<OpeningHours> list2 = this.openingHours;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        EVChargingPool eVChargingPool = this.evChargingPool;
        return hashCode2 + (eVChargingPool != null ? eVChargingPool.hashCode() : 0);
    }
}
