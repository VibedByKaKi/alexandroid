package com.here.sdk.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.transport.VehicleProfile;
import com.here.sdk.transport.VehicleType;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransportProfile {

    @NonNull
    public PedestrianProfile pedestrianProfile = new PedestrianProfile();

    @Nullable
    public VehicleProfile vehicleProfile = new VehicleProfile(VehicleType.CAR);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportProfile)) {
            return false;
        }
        TransportProfile transportProfile = (TransportProfile) obj;
        return Objects.equals(this.pedestrianProfile, transportProfile.pedestrianProfile) && Objects.equals(this.vehicleProfile, transportProfile.vehicleProfile);
    }

    public int hashCode() {
        PedestrianProfile pedestrianProfile = this.pedestrianProfile;
        int hashCode = (JfifUtil.MARKER_EOI + (pedestrianProfile != null ? pedestrianProfile.hashCode() : 0)) * 31;
        VehicleProfile vehicleProfile = this.vehicleProfile;
        return hashCode + (vehicleProfile != null ? vehicleProfile.hashCode() : 0);
    }
}
