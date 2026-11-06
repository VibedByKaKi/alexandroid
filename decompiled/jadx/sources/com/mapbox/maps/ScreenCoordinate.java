package com.mapbox.maps;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ScreenCoordinate implements Serializable {
    private final double x;
    private final double y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ScreenCoordinate(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScreenCoordinate.class != obj.getClass()) {
            return false;
        }
        ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
        return PartialEq.compare(this.x, screenCoordinate.x) && PartialEq.compare(this.y, screenCoordinate.y);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.x), Double.valueOf(this.y));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[x: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.x, ", y: ", sb);
        sb.append(RecordUtils.fieldToString(Double.valueOf(this.y)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
