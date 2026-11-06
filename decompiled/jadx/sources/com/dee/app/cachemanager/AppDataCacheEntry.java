package com.dee.app.cachemanager;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AppDataCacheEntry implements Serializable {
    public static final int MEMORY_EVICTION_TIER_ONE = 0;
    public static final int MEMORY_EVICTION_TIER_TWO = 1;
    private String data;
    private boolean encrypt;
    private int evictionTier;
    private final long modificationDate;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface EvictionTier {
    }

    public AppDataCacheEntry(String str, int i, boolean z) {
        this.evictionTier = i;
        this.encrypt = z;
        this.modificationDate = System.currentTimeMillis();
        this.data = str;
    }

    public boolean encrypt() {
        return this.encrypt;
    }

    public String getData() {
        return this.data;
    }

    public int getEvictionTier() {
        return this.evictionTier;
    }

    public long getModificationDate() {
        return this.modificationDate;
    }

    public void setData(String str) {
        this.data = str;
    }

    private AppDataCacheEntry() {
        this.encrypt = true;
        this.modificationDate = System.currentTimeMillis();
    }
}
