package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.FuelType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GenericFuel {

    @NonNull
    public List<FuelAdditive> additives = new ArrayList();

    @NonNull
    public FuelType type;

    public GenericFuel(@NonNull FuelType fuelType) {
        this.type = fuelType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenericFuel)) {
            return false;
        }
        GenericFuel genericFuel = (GenericFuel) obj;
        return Objects.equals(this.type, genericFuel.type) && Objects.equals(this.additives, genericFuel.additives);
    }

    public int hashCode() {
        FuelType fuelType = this.type;
        int hashCode = (JfifUtil.MARKER_EOI + (fuelType != null ? fuelType.hashCode() : 0)) * 31;
        List<FuelAdditive> list = this.additives;
        return hashCode + (list != null ? list.hashCode() : 0);
    }
}
