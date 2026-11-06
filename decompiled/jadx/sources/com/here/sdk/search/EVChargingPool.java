package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class EVChargingPool {

    @NonNull
    public List<EVChargingStation> chargingStations;

    @NonNull
    public List<EMobilityServiceProvider> eMobilityServiceProviders;

    @Nullable
    public EVChargingPoolDetails details = null;

    @Nullable
    public String id = null;

    @Nullable
    public String cpoId = null;

    @NonNull
    public List<Evse> evseInfo = new ArrayList();

    public EVChargingPool(@NonNull List<EVChargingStation> list, @NonNull List<EMobilityServiceProvider> list2) {
        this.chargingStations = list;
        this.eMobilityServiceProviders = list2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVChargingPool)) {
            return false;
        }
        EVChargingPool eVChargingPool = (EVChargingPool) obj;
        return Objects.equals(this.chargingStations, eVChargingPool.chargingStations) && Objects.equals(this.eMobilityServiceProviders, eVChargingPool.eMobilityServiceProviders) && Objects.equals(this.details, eVChargingPool.details) && Objects.equals(this.id, eVChargingPool.id) && Objects.equals(this.cpoId, eVChargingPool.cpoId) && Objects.equals(this.evseInfo, eVChargingPool.evseInfo);
    }

    public int hashCode() {
        List<EVChargingStation> list = this.chargingStations;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<EMobilityServiceProvider> list2 = this.eMobilityServiceProviders;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        EVChargingPoolDetails eVChargingPoolDetails = this.details;
        int hashCode3 = (hashCode2 + (eVChargingPoolDetails != null ? eVChargingPoolDetails.hashCode() : 0)) * 31;
        String str = this.id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.cpoId;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Evse> list3 = this.evseInfo;
        return hashCode5 + (list3 != null ? list3.hashCode() : 0);
    }
}
