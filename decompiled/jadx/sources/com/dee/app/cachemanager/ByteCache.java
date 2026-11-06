package com.dee.app.cachemanager;

import androidx.annotation.NonNull;
import com.dee.app.function.Callback;
import com.google.common.base.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ByteCache {
    void clear() throws CacheException;

    void forEach(@NonNull Callback<byte[]> callback) throws CacheException;

    Optional<byte[]> get(@NonNull String str) throws CacheException;

    void put(@NonNull String str, @NonNull byte[] bArr) throws CacheException;

    void remove(@NonNull String str) throws CacheException;
}
