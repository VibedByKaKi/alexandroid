package com.mapbox.bindgen;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class VariantOptionalTypeWrapper {

    @Nullable
    private final Object value;

    public VariantOptionalTypeWrapper(@Nullable Object obj) {
        this.value = obj;
    }

    public static VariantOptionalTypeWrapper valueOf(@Nullable Object obj) {
        return new VariantOptionalTypeWrapper(obj);
    }

    @Nullable
    public Object getValue() {
        return this.value;
    }
}
