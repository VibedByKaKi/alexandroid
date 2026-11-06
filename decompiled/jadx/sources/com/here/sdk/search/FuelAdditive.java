package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.FuelAdditiveType;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class FuelAdditive {

    @NonNull
    public FuelAdditiveType type = FuelAdditiveType.AUS32;

    @Nullable
    public Boolean availableInCans = null;

    @Nullable
    public Boolean availableAtPump = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuelAdditive)) {
            return false;
        }
        FuelAdditive fuelAdditive = (FuelAdditive) obj;
        return Objects.equals(this.type, fuelAdditive.type) && Objects.equals(this.availableInCans, fuelAdditive.availableInCans) && Objects.equals(this.availableAtPump, fuelAdditive.availableAtPump);
    }

    public int hashCode() {
        FuelAdditiveType fuelAdditiveType = this.type;
        int hashCode = (JfifUtil.MARKER_EOI + (fuelAdditiveType != null ? fuelAdditiveType.hashCode() : 0)) * 31;
        Boolean bool = this.availableInCans;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.availableAtPump;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
