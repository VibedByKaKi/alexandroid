package com.here.sdk.transport;

import com.facebook.imageutils.JfifUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class VehicleEquipment {
    public boolean hasSnowChains = false;
    public boolean hasWinterTyres = false;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VehicleEquipment)) {
            return false;
        }
        VehicleEquipment vehicleEquipment = (VehicleEquipment) obj;
        return this.hasSnowChains == vehicleEquipment.hasSnowChains && this.hasWinterTyres == vehicleEquipment.hasWinterTyres;
    }

    public int hashCode() {
        return ((JfifUtil.MARKER_EOI + (this.hasSnowChains ? 79 : 97)) * 31) + (this.hasWinterTyres ? 79 : 97);
    }
}
