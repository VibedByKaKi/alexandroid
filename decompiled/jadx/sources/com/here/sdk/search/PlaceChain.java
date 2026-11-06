package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class PlaceChain {

    @NonNull
    public String id;

    public PlaceChain(@NonNull String str) {
        this.id = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceChain) {
            return Objects.equals(this.id, ((PlaceChain) obj).id);
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        return JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0);
    }
}
