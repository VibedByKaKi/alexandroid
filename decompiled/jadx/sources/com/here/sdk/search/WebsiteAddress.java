package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class WebsiteAddress {

    @NonNull
    public String address;

    @NonNull
    public List<PlaceCategory> categories;

    public WebsiteAddress(@NonNull String str, @NonNull List<PlaceCategory> list) {
        this.address = str;
        this.categories = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebsiteAddress)) {
            return false;
        }
        WebsiteAddress websiteAddress = (WebsiteAddress) obj;
        return Objects.equals(this.address, websiteAddress.address) && Objects.equals(this.categories, websiteAddress.categories);
    }

    public int hashCode() {
        String str = this.address;
        int hashCode = (JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31;
        List<PlaceCategory> list = this.categories;
        return hashCode + (list != null ? list.hashCode() : 0);
    }
}
