package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class IndoorLocationDataInternal {
    public int levelZIndex;

    @NonNull
    public String venueId;

    public IndoorLocationDataInternal(@NonNull String str, int i) {
        this.venueId = str;
        this.levelZIndex = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IndoorLocationDataInternal)) {
            return false;
        }
        IndoorLocationDataInternal indoorLocationDataInternal = (IndoorLocationDataInternal) obj;
        return Objects.equals(this.venueId, indoorLocationDataInternal.venueId) && this.levelZIndex == indoorLocationDataInternal.levelZIndex;
    }

    public int hashCode() {
        String str = this.venueId;
        return ((JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31) + this.levelZIndex;
    }
}
