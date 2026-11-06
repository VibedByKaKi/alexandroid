package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class StyleDataLoaded implements Serializable {

    @NonNull
    private final EventTimeInterval timeInterval;

    @NonNull
    private final StyleDataLoadedType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleDataLoaded(@NonNull StyleDataLoadedType styleDataLoadedType, @NonNull EventTimeInterval eventTimeInterval) {
        this.type = styleDataLoadedType;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleDataLoaded.class != obj.getClass()) {
            return false;
        }
        StyleDataLoaded styleDataLoaded = (StyleDataLoaded) obj;
        return Objects.equals(this.type, styleDataLoaded.type) && Objects.equals(this.timeInterval, styleDataLoaded.timeInterval);
    }

    @NonNull
    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    @NonNull
    public StyleDataLoadedType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.timeInterval);
    }

    public String toString() {
        return "[type: " + RecordUtils.fieldToString(this.type) + ", timeInterval: " + RecordUtils.fieldToString(this.timeInterval) + MarkdownConstants.RIGHT_BRACKET;
    }
}
