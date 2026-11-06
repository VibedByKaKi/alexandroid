package com.mapbox.common;

import com.amazon.coral.profiler.ProfilerCategory;
import com.mapbox.annotation.MapboxExperimental;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@MapboxExperimental
/* loaded from: classes8.dex */
public enum TileStoreImportErrorType {
    CANCELED("Canceled"),
    DOES_NOT_EXIST("DoesNotExist"),
    DISK_FULL("DiskFull"),
    OTHER(ProfilerCategory.OTHER),
    INTEGRITY_CHECK_ERROR("IntegrityCheckError");

    private String str;

    TileStoreImportErrorType(String str) {
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
