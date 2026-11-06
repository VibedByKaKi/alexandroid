package com.mapbox.maps;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes8.dex */
public enum TileStoreUsageMode {
    DISABLED(BucketLifecycleConfiguration.DISABLED),
    READ_ONLY("ReadOnly"),
    READ_AND_UPDATE("ReadAndUpdate");

    private String str;

    TileStoreUsageMode(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
