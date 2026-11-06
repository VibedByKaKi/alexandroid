package com.dee.app.cachemanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
final class CacheMutation<T> {
    static final int PUT = 1;
    static final int REMOVE = 0;

    @NonNull
    final String key;
    final int type;

    @Nullable
    final T value;

    public CacheMutation(@NonNull String str, @Nullable T t, int i) {
        Preconditions.checkNotNull(str);
        boolean z = true;
        if ((i != 1 || t == null) && (i != 0 || t != null)) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.key = str;
        this.value = t;
        this.type = i;
    }

    public static <U> CacheMutation<U> put(@NonNull String str, @NonNull U u) {
        return new CacheMutation<>(str, u, 1);
    }

    public static <U> CacheMutation<U> remove(@NonNull String str) {
        return new CacheMutation<>(str, null, 0);
    }
}
