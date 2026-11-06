package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.FuelType;
import com.here.sdk.transport.TruckClass;
import com.here.sdk.transport.TruckFuelType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PlaceFilter {

    @NonNull
    public List<FuelType> fuelTypes = new ArrayList();

    @NonNull
    public List<TruckFuelType> truckFuelTypes = new ArrayList();

    @Nullable
    public TruckClass truckClass = null;

    @NonNull
    public Ev ev = new Ev();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Ev {

        @NonNull
        public List<String> supplierNames = new ArrayList();

        @NonNull
        public List<String> connectorTypeIDs = new ArrayList();

        @Nullable
        public Double minPowerInKilowatts = null;

        @NonNull
        public List<String> eMobilityServiceProviderPartnerIDs = new ArrayList();

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ev)) {
                return false;
            }
            Ev ev = (Ev) obj;
            return Objects.equals(this.supplierNames, ev.supplierNames) && Objects.equals(this.connectorTypeIDs, ev.connectorTypeIDs) && Objects.equals(this.minPowerInKilowatts, ev.minPowerInKilowatts) && Objects.equals(this.eMobilityServiceProviderPartnerIDs, ev.eMobilityServiceProviderPartnerIDs);
        }

        public int hashCode() {
            List<String> list = this.supplierNames;
            int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
            List<String> list2 = this.connectorTypeIDs;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            Double d = this.minPowerInKilowatts;
            int hashCode3 = (hashCode2 + (d != null ? d.hashCode() : 0)) * 31;
            List<String> list3 = this.eMobilityServiceProviderPartnerIDs;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return Objects.equals(this.fuelTypes, placeFilter.fuelTypes) && Objects.equals(this.truckFuelTypes, placeFilter.truckFuelTypes) && Objects.equals(this.truckClass, placeFilter.truckClass) && Objects.equals(this.ev, placeFilter.ev);
    }

    public int hashCode() {
        List<FuelType> list = this.fuelTypes;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<TruckFuelType> list2 = this.truckFuelTypes;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        TruckClass truckClass = this.truckClass;
        int hashCode3 = (hashCode2 + (truckClass != null ? truckClass.hashCode() : 0)) * 31;
        Ev ev = this.ev;
        return hashCode3 + (ev != null ? ev.hashCode() : 0);
    }
}
