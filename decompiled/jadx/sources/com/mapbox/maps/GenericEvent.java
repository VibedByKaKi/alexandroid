package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class GenericEvent implements Serializable {

    @NonNull
    private final Value data;

    @NonNull
    private final String name;

    @NonNull
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public GenericEvent(@NonNull String str, @NonNull Value value, @NonNull EventTimeInterval eventTimeInterval) {
        this.name = str;
        this.data = value;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GenericEvent.class != obj.getClass()) {
            return false;
        }
        GenericEvent genericEvent = (GenericEvent) obj;
        return Objects.equals(this.name, genericEvent.name) && Objects.equals(this.data, genericEvent.data) && Objects.equals(this.timeInterval, genericEvent.timeInterval);
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
    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.data, this.timeInterval);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.name, ", data: ", sb);
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append(", timeInterval: ");
        sb.append(RecordUtils.fieldToString(this.timeInterval));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
