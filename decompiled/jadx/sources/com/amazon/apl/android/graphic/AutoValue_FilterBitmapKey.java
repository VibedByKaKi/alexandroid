package com.amazon.apl.android.graphic;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_FilterBitmapKey extends FilterBitmapKey {
    private final int groupId;
    private final int height;
    private final int width;

    public AutoValue_FilterBitmapKey(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.groupId = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FilterBitmapKey) {
            FilterBitmapKey filterBitmapKey = (FilterBitmapKey) obj;
            if (this.width == filterBitmapKey.width() && this.height == filterBitmapKey.height() && this.groupId == filterBitmapKey.groupId()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.graphic.FilterBitmapKey
    public int groupId() {
        return this.groupId;
    }

    public int hashCode() {
        return this.groupId ^ ((((this.width ^ 1000003) * 1000003) ^ this.height) * 1000003);
    }

    @Override // com.amazon.apl.android.graphic.FilterBitmapKey
    public int height() {
        return this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterBitmapKey{width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", groupId=");
        return a$$ExternalSyntheticOutline0.m(sb, this.groupId, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.apl.android.graphic.FilterBitmapKey
    public int width() {
        return this.width;
    }
}
