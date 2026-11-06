package com.mapbox.common;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class ResourceLoadProgress implements Serializable {
    private final long bytes;

    @Nullable
    private final Long totalBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadProgress(long j, @Nullable Long l) {
        this.bytes = j;
        this.totalBytes = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadProgress resourceLoadProgress = (ResourceLoadProgress) obj;
        return this.bytes == resourceLoadProgress.bytes && Objects.equals(this.totalBytes, resourceLoadProgress.totalBytes);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getBytes() {
        return this.bytes;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.bytes), this.totalBytes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[bytes: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.bytes, ", totalBytes: ", sb);
        sb.append(RecordUtils.fieldToString(this.totalBytes));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
