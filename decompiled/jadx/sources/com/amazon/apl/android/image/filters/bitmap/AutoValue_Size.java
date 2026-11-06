package com.amazon.apl.android.image.filters.bitmap;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_Size extends Size {
    private final int height;
    private final int width;

    public AutoValue_Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width() && this.height == size.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.height ^ ((this.width ^ 1000003) * 1000003);
    }

    @Override // com.amazon.apl.android.image.filters.bitmap.Size
    public int height() {
        return this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Size{width=");
        sb.append(this.width);
        sb.append(", height=");
        return a$$ExternalSyntheticOutline0.m(sb, this.height, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.apl.android.image.filters.bitmap.Size
    public int width() {
        return this.width;
    }
}
