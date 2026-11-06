package com.dee.app.data.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum EvictionTier {
    EVICTION_TIER_1("1", 0),
    EVICTION_TIER_2("2", 1);

    private int appDataCacheEvictionTier;
    private String value;

    EvictionTier(@NonNull String str, int i) {
        this.value = str;
        this.appDataCacheEvictionTier = i;
    }

    public static EvictionTier fromValue(@Nullable String str) {
        EvictionTier evictionTier = EVICTION_TIER_1;
        return evictionTier.value.equals(str) ? evictionTier : EVICTION_TIER_2;
    }

    public int getAppDataCacheEvictionTier() {
        return this.appDataCacheEvictionTier;
    }

    public String getValue() {
        return this.value;
    }
}
