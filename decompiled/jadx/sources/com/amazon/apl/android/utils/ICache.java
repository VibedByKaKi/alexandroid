package com.amazon.apl.android.utils;

import android.content.ComponentCallbacks2;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ICache<K, V> extends ComponentCallbacks2 {
    @Nullable
    V get(@NonNull K k);

    int getSize();

    void put(@NonNull K k, @NonNull V v);
}
