package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class StylePropertyValue implements Serializable {

    @NonNull
    private final StylePropertyValueKind kind;

    @NonNull
    private final Value value;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePropertyValue(@NonNull Value value, @NonNull StylePropertyValueKind stylePropertyValueKind) {
        this.value = value;
        this.kind = stylePropertyValueKind;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePropertyValue.class != obj.getClass()) {
            return false;
        }
        StylePropertyValue stylePropertyValue = (StylePropertyValue) obj;
        return Objects.equals(this.value, stylePropertyValue.value) && Objects.equals(this.kind, stylePropertyValue.kind);
    }

    @NonNull
    public StylePropertyValueKind getKind() {
        return this.kind;
    }

    @NonNull
    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.value, this.kind);
    }

    public String toString() {
        return "[value: " + RecordUtils.fieldToString(this.value) + ", kind: " + RecordUtils.fieldToString(this.kind) + MarkdownConstants.RIGHT_BRACKET;
    }
}
