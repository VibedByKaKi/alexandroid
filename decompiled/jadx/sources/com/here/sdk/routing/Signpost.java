package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Signpost {

    @NonNull
    public List<SignpostLabel> labels;

    public Signpost(@NonNull List<SignpostLabel> list) {
        this.labels = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Signpost) {
            return Objects.equals(this.labels, ((Signpost) obj).labels);
        }
        return false;
    }

    public int hashCode() {
        List<SignpostLabel> list = this.labels;
        return JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0);
    }
}
