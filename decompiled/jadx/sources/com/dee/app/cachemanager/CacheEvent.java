package com.dee.app.cachemanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CacheEvent {
    public static final int CLEAR = 2;
    public static final int CLEAR_ERROR = 6;
    public static final int EVICTION = 7;
    public static final int GET_ERROR = 3;
    public static final int HIT = 0;
    public static final int MISS = 1;
    public static final int PUT_ERROR = 4;
    public static final int REMOVE_ERROR = 5;

    @NonNull
    public final CacheMetadata cacheMetadata;

    @Nullable
    public final String key;
    public final int type;

    @Nullable
    public final Object value;

    public CacheEvent(int i, @Nullable String str, @NonNull CacheMetadata cacheMetadata, @Nullable Object obj) {
        this.type = i;
        this.key = str;
        this.cacheMetadata = cacheMetadata;
        this.value = obj;
    }
}
