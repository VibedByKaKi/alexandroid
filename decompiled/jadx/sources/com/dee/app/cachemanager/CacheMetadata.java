package com.dee.app.cachemanager;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CacheMetadata {
    public static final CacheMetadata EMPTY = new CacheMetadata(0, null);

    @Nullable
    public final String module;

    @Nullable
    public String ownerIdentifier;
    public final int priority;

    public CacheMetadata() {
        this.priority = 0;
        this.module = null;
    }

    public CacheMetadata(@Nullable String str) {
        this.priority = 0;
        this.module = str;
    }

    public CacheMetadata(int i) {
        this.priority = i;
        this.module = null;
    }

    public CacheMetadata(int i, @Nullable String str) {
        this.priority = i;
        this.module = str;
    }
}
