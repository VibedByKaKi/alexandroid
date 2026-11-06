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
public final class TileStoreGenericEvent implements Serializable {

    @NonNull
    private final Value data;

    @NonNull
    private final String name;

    @NonNull
    private final String text;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStoreGenericEvent(@NonNull String str, @NonNull String str2, @NonNull Value value) {
        this.name = str;
        this.text = str2;
        this.data = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileStoreGenericEvent.class != obj.getClass()) {
            return false;
        }
        TileStoreGenericEvent tileStoreGenericEvent = (TileStoreGenericEvent) obj;
        return Objects.equals(this.name, tileStoreGenericEvent.name) && Objects.equals(this.text, tileStoreGenericEvent.text) && Objects.equals(this.data, tileStoreGenericEvent.data);
    }

    @NonNull
    public Value getData() {
        return this.data;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.text, this.data);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.name, ", text: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.text, ", data: ", sb);
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
