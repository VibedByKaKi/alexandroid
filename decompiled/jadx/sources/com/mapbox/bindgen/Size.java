package com.mapbox.bindgen;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Size {

    @IntRange(from = 0)
    private final int height;

    @IntRange(from = 0)
    private final int width;

    public Size(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    @IntRange(from = 0)
    public int getHeight() {
        return this.height;
    }

    @IntRange(from = 0)
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = this.height;
        int i2 = this.width;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
