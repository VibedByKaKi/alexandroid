package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.TruckClass;
import com.here.sdk.transport.TruckFuelType;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TruckFuel {

    @Nullable
    public TruckClass maximumTruckClass = null;

    @NonNull
    public TruckFuelType type;

    public TruckFuel(@NonNull TruckFuelType truckFuelType) {
        this.type = truckFuelType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TruckFuel)) {
            return false;
        }
        TruckFuel truckFuel = (TruckFuel) obj;
        return Objects.equals(this.type, truckFuel.type) && Objects.equals(this.maximumTruckClass, truckFuel.maximumTruckClass);
    }

    public int hashCode() {
        TruckFuelType truckFuelType = this.type;
        int hashCode = (JfifUtil.MARKER_EOI + (truckFuelType != null ? truckFuelType.hashCode() : 0)) * 31;
        TruckClass truckClass = this.maximumTruckClass;
        return hashCode + (truckClass != null ? truckClass.hashCode() : 0);
    }
}
