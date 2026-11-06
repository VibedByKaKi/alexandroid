package com.amazon.crypto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface KeyManager<T> {
    boolean contains(@Nullable String str) throws SecurityException;

    @NonNull
    T generate(@NonNull String str) throws IllegalArgumentException, SecurityException;

    void remove(@NonNull String str) throws IllegalArgumentException, SecurityException;

    @NonNull
    T retrieve(@NonNull String str) throws IllegalArgumentException, SecurityException;
}
