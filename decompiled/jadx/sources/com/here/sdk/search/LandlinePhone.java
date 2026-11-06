package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LandlinePhone {

    @NonNull
    public List<PlaceCategory> categories;

    @NonNull
    public String phoneNumber;

    public LandlinePhone() {
        this.phoneNumber = "";
        this.categories = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LandlinePhone)) {
            return false;
        }
        LandlinePhone landlinePhone = (LandlinePhone) obj;
        return Objects.equals(this.phoneNumber, landlinePhone.phoneNumber) && Objects.equals(this.categories, landlinePhone.categories);
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        List<PlaceCategory> list = this.categories;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public LandlinePhone(@NonNull String str, @NonNull List<PlaceCategory> list) {
        this.phoneNumber = str;
        this.categories = list;
    }
}
