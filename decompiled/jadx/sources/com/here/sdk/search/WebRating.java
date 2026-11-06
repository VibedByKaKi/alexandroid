package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class WebRating {
    public double average;
    public int count;

    @NonNull
    public WebSource source;

    public WebRating() {
        this.count = 0;
        this.average = 0.0d;
        this.source = new WebSource();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebRating)) {
            return false;
        }
        WebRating webRating = (WebRating) obj;
        return this.count == webRating.count && Double.compare(this.average, webRating.average) == 0 && Objects.equals(this.source, webRating.source);
    }

    public int hashCode() {
        int doubleToLongBits = (((JfifUtil.MARKER_EOI + this.count) * 31) + ((int) (Double.doubleToLongBits(this.average) ^ (Double.doubleToLongBits(this.average) >>> 32)))) * 31;
        WebSource webSource = this.source;
        return doubleToLongBits + (webSource != null ? webSource.hashCode() : 0);
    }

    public WebRating(int i, double d, @NonNull WebSource webSource) {
        this.count = i;
        this.average = d;
        this.source = webSource;
    }
}
