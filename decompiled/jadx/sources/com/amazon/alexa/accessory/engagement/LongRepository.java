package com.amazon.alexa.accessory.engagement;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
interface LongRepository {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface Factory {
        LongRepository create(String str);
    }

    boolean contains(@NonNull String str);

    long get(@NonNull String str);

    void put(@NonNull String str, long j);
}
