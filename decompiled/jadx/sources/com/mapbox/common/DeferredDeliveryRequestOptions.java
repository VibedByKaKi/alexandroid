package com.mapbox.common;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class DeferredDeliveryRequestOptions implements Serializable {
    private final long ttl;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DeferredDeliveryRequestOptions() {
        this.ttl = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.ttl == ((DeferredDeliveryRequestOptions) obj).ttl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.ttl));
    }

    public String toString() {
        return "[ttl: " + RecordUtils.fieldToString(Long.valueOf(this.ttl)) + MarkdownConstants.RIGHT_BRACKET;
    }

    public DeferredDeliveryRequestOptions(long j) {
        this.ttl = j;
    }
}
