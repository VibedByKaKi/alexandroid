package com.mapbox.maps;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes8.dex */
public enum OfflineRegionErrorType {
    NOT_FOUND,
    SERVER,
    CONNECTION,
    RATE_LIMIT,
    DISK_FULL,
    TILE_COUNT_LIMIT_EXCEEDED,
    OTHER;

    private int getValue() {
        return ordinal();
    }
}
