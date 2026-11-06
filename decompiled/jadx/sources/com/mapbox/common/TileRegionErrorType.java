package com.mapbox.common;

import com.amazon.coral.profiler.ProfilerCategory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum TileRegionErrorType {
    CANCELED("Canceled"),
    DOES_NOT_EXIST("DoesNotExist"),
    TILESET_DESCRIPTOR("TilesetDescriptor"),
    DISK_FULL("DiskFull"),
    OTHER(ProfilerCategory.OTHER),
    TILE_COUNT_EXCEEDED("TileCountExceeded");

    private String str;

    TileRegionErrorType(String str) {
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
