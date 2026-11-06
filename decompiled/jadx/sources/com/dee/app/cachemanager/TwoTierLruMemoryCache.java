package com.dee.app.cachemanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dee.app.function.BiCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface TwoTierLruMemoryCache<T> {
    public static final int MEMORY_EVICTION_TIER_ONE = 0;
    public static final int MEMORY_EVICTION_TIER_TWO = 1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface EvictionTier {
    }

    void clear();

    void forEach(@NonNull BiCallback<String, T> biCallback);

    @Nullable
    T get(@NonNull String str);

    boolean put(@NonNull String str, @NonNull T t, int i, int i2);

    boolean remove(@NonNull String str);
}
