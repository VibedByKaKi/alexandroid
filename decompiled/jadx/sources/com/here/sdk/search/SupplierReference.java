package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SupplierReference {

    @NonNull
    public String id;

    @NonNull
    public String supplier;

    public SupplierReference() {
        this.supplier = "";
        this.id = "";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupplierReference)) {
            return false;
        }
        SupplierReference supplierReference = (SupplierReference) obj;
        return Objects.equals(this.supplier, supplierReference.supplier) && Objects.equals(this.id, supplierReference.id);
    }

    public int hashCode() {
        String str = this.supplier;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public SupplierReference(@NonNull String str, @NonNull String str2) {
        this.supplier = str;
        this.id = str2;
    }
}
