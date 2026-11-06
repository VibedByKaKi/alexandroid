package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TollOptions {

    @NonNull
    public List<String> transponders = new ArrayList();

    @Nullable
    public VehicleCategory vehicleCategory = null;

    @Nullable
    public EmissionType emissionType = null;

    @Nullable
    public Integer co2Class = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum EmissionType {
        EURO1(0),
        EURO2(1),
        EURO3(2),
        EURO4(3),
        EURO5(4),
        EURO6(5),
        EURO_EEV(6);

        public final int value;

        EmissionType(int i) {
            this.value = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VehicleCategory {
        MINIBUS(0);

        public final int value;

        VehicleCategory(int i) {
            this.value = i;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TollOptions)) {
            return false;
        }
        TollOptions tollOptions = (TollOptions) obj;
        return Objects.equals(this.transponders, tollOptions.transponders) && Objects.equals(this.vehicleCategory, tollOptions.vehicleCategory) && Objects.equals(this.emissionType, tollOptions.emissionType) && Objects.equals(this.co2Class, tollOptions.co2Class);
    }

    public int hashCode() {
        List<String> list = this.transponders;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        VehicleCategory vehicleCategory = this.vehicleCategory;
        int hashCode2 = (hashCode + (vehicleCategory != null ? vehicleCategory.hashCode() : 0)) * 31;
        EmissionType emissionType = this.emissionType;
        int hashCode3 = (hashCode2 + (emissionType != null ? emissionType.hashCode() : 0)) * 31;
        Integer num = this.co2Class;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }
}
