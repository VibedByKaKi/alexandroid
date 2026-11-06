package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.android.media.MediaObject;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_MediaObjectFilter extends MediaObjectFilter {
    private final MediaObject mediaObject;

    public AutoValue_MediaObjectFilter(MediaObject mediaObject) {
        if (mediaObject != null) {
            this.mediaObject = mediaObject;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null mediaObject");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaObjectFilter) {
            return this.mediaObject.equals(((MediaObjectFilter) obj).mediaObject());
        }
        return false;
    }

    public int hashCode() {
        return this.mediaObject.hashCode() ^ 1000003;
    }

    @Override // com.amazon.apl.android.sgcontent.filters.MediaObjectFilter
    public MediaObject mediaObject() {
        return this.mediaObject;
    }

    public String toString() {
        return "MediaObjectFilter{mediaObject=" + this.mediaObject + StringSubstitutor.DEFAULT_VAR_END;
    }
}
