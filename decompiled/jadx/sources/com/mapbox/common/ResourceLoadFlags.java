package com.mapbox.common;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public enum ResourceLoadFlags {
    NONE(0),
    CRITICAL(1),
    ACCEPT_EXPIRED(2),
    FORCE_LOAD(4),
    SKIP_DATA_LOADING(8),
    SKIP_DATA_TRANSFER(24),
    FORCE_EXPIRED(32),
    SKIP_DECOMPRESSION(64),
    CHECK_INTEGRITY(128);

    public final int value;

    ResourceLoadFlags(int i) {
        this.value = i;
    }

    private int getValue() {
        return this.value;
    }
}
