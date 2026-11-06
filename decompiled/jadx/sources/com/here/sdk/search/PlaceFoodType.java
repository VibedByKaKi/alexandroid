package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PlaceFoodType {

    @NonNull
    public String id;

    @Nullable
    public String name = null;
    public boolean primary = false;

    public PlaceFoodType(@NonNull String str) {
        this.id = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceFoodType)) {
            return false;
        }
        PlaceFoodType placeFoodType = (PlaceFoodType) obj;
        return Objects.equals(this.id, placeFoodType.id) && Objects.equals(this.name, placeFoodType.name) && this.primary == placeFoodType.primary;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.primary ? 79 : 97);
    }
}
