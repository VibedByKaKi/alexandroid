package com.mapbox.bindgen;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RecordUtils {
    private RecordUtils() {
    }

    public static String fieldToString(@Nullable Object obj) {
        return obj == null ? "" : obj instanceof byte[] ? new String((byte[]) obj) : obj.toString();
    }
}
