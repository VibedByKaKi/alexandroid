package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CatalogIdentifier {

    @NonNull
    public String hrn = "hrn:here:data::olp-here:ocm";

    @Nullable
    public Long version = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatalogIdentifier)) {
            return false;
        }
        CatalogIdentifier catalogIdentifier = (CatalogIdentifier) obj;
        return Objects.equals(this.hrn, catalogIdentifier.hrn) && Objects.equals(this.version, catalogIdentifier.version);
    }

    public int hashCode() {
        String str = this.hrn;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.version;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
