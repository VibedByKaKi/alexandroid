package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class Metrics implements Serializable {

    @NonNull
    private final String name;

    @NonNull
    private final Value value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Metrics(@NonNull String str, @NonNull Value value) {
        this.name = str;
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metrics.class != obj.getClass()) {
            return false;
        }
        Metrics metrics = (Metrics) obj;
        return Objects.equals(this.name, metrics.name) && Objects.equals(this.value, metrics.value);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getName() {
        return this.name;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.value);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.name, ", value: ", sb);
        sb.append(RecordUtils.fieldToString(this.value));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
