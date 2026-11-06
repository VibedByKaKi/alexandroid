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
public class InteractionContext implements Serializable {

    @NonNull
    private final CoordinateInfo coordinateInfo;

    @NonNull
    private final ScreenCoordinate screenCoordinate;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public InteractionContext(@NonNull CoordinateInfo coordinateInfo, @NonNull ScreenCoordinate screenCoordinate) {
        this.coordinateInfo = coordinateInfo;
        this.screenCoordinate = screenCoordinate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractionContext interactionContext = (InteractionContext) obj;
        return Objects.equals(this.coordinateInfo, interactionContext.coordinateInfo) && Objects.equals(this.screenCoordinate, interactionContext.screenCoordinate);
    }

    @NonNull
    public CoordinateInfo getCoordinateInfo() {
        return this.coordinateInfo;
    }

    @NonNull
    public ScreenCoordinate getScreenCoordinate() {
        return this.screenCoordinate;
    }

    public int hashCode() {
        return Objects.hash(this.coordinateInfo, this.screenCoordinate);
    }

    public String toString() {
        return "[coordinateInfo: " + RecordUtils.fieldToString(this.coordinateInfo) + ", screenCoordinate: " + RecordUtils.fieldToString(this.screenCoordinate) + MarkdownConstants.RIGHT_BRACKET;
    }
}
