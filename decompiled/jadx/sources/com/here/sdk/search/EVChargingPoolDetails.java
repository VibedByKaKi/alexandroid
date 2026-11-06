package com.here.sdk.search;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVChargingPoolDetails {

    @Nullable
    public Boolean evChargingOnSite = null;

    @Nullable
    public String evNetwork = null;

    @Nullable
    public String ownerInformation = null;

    @Nullable
    @Deprecated
    public Boolean paymentIsRequired = null;

    @Nullable
    public Boolean reservable = null;

    @Nullable
    @Deprecated
    public Boolean subscriptionIsRequired = null;

    @Nullable
    public Long totalNumberOfStations = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVChargingPoolDetails)) {
            return false;
        }
        EVChargingPoolDetails eVChargingPoolDetails = (EVChargingPoolDetails) obj;
        return Objects.equals(this.evChargingOnSite, eVChargingPoolDetails.evChargingOnSite) && Objects.equals(this.evNetwork, eVChargingPoolDetails.evNetwork) && Objects.equals(this.ownerInformation, eVChargingPoolDetails.ownerInformation) && Objects.equals(this.paymentIsRequired, eVChargingPoolDetails.paymentIsRequired) && Objects.equals(this.reservable, eVChargingPoolDetails.reservable) && Objects.equals(this.subscriptionIsRequired, eVChargingPoolDetails.subscriptionIsRequired) && Objects.equals(this.totalNumberOfStations, eVChargingPoolDetails.totalNumberOfStations);
    }

    public int hashCode() {
        Boolean bool = this.evChargingOnSite;
        int hashCode = (JfifUtil.MARKER_EOI + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.evNetwork;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.ownerInformation;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool2 = this.paymentIsRequired;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.reservable;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.subscriptionIsRequired;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Long l = this.totalNumberOfStations;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }
}
