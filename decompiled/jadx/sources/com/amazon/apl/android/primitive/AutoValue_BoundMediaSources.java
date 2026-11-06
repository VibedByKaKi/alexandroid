package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.primitive.BoundMediaSources;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_BoundMediaSources extends BoundMediaSources {
    private final List<BoundMediaSources.MediaSource> list;

    public AutoValue_BoundMediaSources(List<BoundMediaSources.MediaSource> list) {
        if (list != null) {
            this.list = list;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null list");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundMediaSources) {
            return this.list.equals(((BoundMediaSources) obj).list());
        }
        return false;
    }

    public int hashCode() {
        return this.list.hashCode() ^ 1000003;
    }

    @Override // com.amazon.apl.android.primitive.IterableProperty
    public List<BoundMediaSources.MediaSource> list() {
        return this.list;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.list, new StringBuilder("BoundMediaSources{list="));
    }
}
