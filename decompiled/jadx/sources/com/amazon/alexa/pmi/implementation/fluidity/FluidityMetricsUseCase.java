package com.amazon.alexa.pmi.implementation.fluidity;

import android.annotation.SuppressLint;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.Channels;
import com.amazon.alexa.routing.data.RouteName;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"WrongConstant"})
/* loaded from: classes18.dex */
class FluidityMetricsUseCase {
    public static final Map<String, FluidityMetricsUseCase> ROUTE_MAPPING;
    final String name;
    final String ownerIdentifier;

    static {
        HashMap hashMap = new HashMap();
        ROUTE_MAPPING = hashMap;
        hashMap.put(RouteName.HOME, new FluidityMetricsUseCase(Channels.HOME, "b3d450dc-27f9-4658-8cce-2784e86f06e9"));
        hashMap.put(RouteName.CHANNELS_DEVICES, new FluidityMetricsUseCase("devices", OwnerIdentifier.DEVICES_CHANNEL_DEVICE_SETTINGS));
        hashMap.put(RouteName.NAV_MORE_MENU, new FluidityMetricsUseCase("more", OwnerIdentifier.ALEXA_MOBILE_GROWTH));
    }

    public FluidityMetricsUseCase(String str, String str2) {
        this.name = str;
        this.ownerIdentifier = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FluidityMetricsUseCase fluidityMetricsUseCase = (FluidityMetricsUseCase) obj;
        if (this.name.equals(fluidityMetricsUseCase.name)) {
            return this.ownerIdentifier.equals(fluidityMetricsUseCase.ownerIdentifier);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.ownerIdentifier);
    }
}
