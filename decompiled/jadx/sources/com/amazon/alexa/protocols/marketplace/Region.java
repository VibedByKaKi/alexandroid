package com.amazon.alexa.protocols.marketplace;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.credentiallocker.CustomerRegion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum Region {
    EUROPE(CustomerRegion.EU),
    FAR_EAST("FE"),
    NORTH_AMERICA_AND_WORLD(CustomerRegion.NA);

    private final String region;

    Region(@NonNull String str) {
        this.region = str;
    }

    @Nullable
    public static Region fromString(@Nullable String str) {
        for (Region region : values()) {
            if (region.toString().equals(str)) {
                return region;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.region;
    }
}
