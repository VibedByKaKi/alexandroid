package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class WebDetails {

    @NonNull
    public List<WebImage> images = new ArrayList();

    @NonNull
    public List<WebEditorial> editorials = new ArrayList();

    @NonNull
    public List<WebRating> ratings = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebDetails)) {
            return false;
        }
        WebDetails webDetails = (WebDetails) obj;
        return Objects.equals(this.images, webDetails.images) && Objects.equals(this.editorials, webDetails.editorials) && Objects.equals(this.ratings, webDetails.ratings);
    }

    public int hashCode() {
        List<WebImage> list = this.images;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<WebEditorial> list2 = this.editorials;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<WebRating> list3 = this.ratings;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
