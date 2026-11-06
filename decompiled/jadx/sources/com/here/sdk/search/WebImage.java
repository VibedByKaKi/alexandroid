package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class WebImage {

    @NonNull
    public Date date;

    @NonNull
    public WebSource source;

    public WebImage(@NonNull Date date, @NonNull WebSource webSource) {
        this.date = date;
        this.source = webSource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return Objects.equals(this.date, webImage.date) && Objects.equals(this.source, webImage.source);
    }

    public int hashCode() {
        Date date = this.date;
        int hashCode = (JfifUtil.MARKER_EOI + (date != null ? date.hashCode() : 0)) * 31;
        WebSource webSource = this.source;
        return hashCode + (webSource != null ? webSource.hashCode() : 0);
    }
}
