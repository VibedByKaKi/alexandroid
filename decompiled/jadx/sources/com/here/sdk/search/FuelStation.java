package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class FuelStation {

    @NonNull
    public List<GenericFuel> fuels = new ArrayList();

    @NonNull
    public List<TruckFuel> truckFuels = new ArrayList();

    @Nullable
    public Boolean payAtThePump = null;

    @Nullable
    public Boolean highVolumePumps = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuelStation)) {
            return false;
        }
        FuelStation fuelStation = (FuelStation) obj;
        return Objects.equals(this.fuels, fuelStation.fuels) && Objects.equals(this.truckFuels, fuelStation.truckFuels) && Objects.equals(this.payAtThePump, fuelStation.payAtThePump) && Objects.equals(this.highVolumePumps, fuelStation.highVolumePumps);
    }

    public int hashCode() {
        List<GenericFuel> list = this.fuels;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<TruckFuel> list2 = this.truckFuels;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.payAtThePump;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.highVolumePumps;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
