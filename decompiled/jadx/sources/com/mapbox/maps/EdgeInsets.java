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
public final class EdgeInsets implements Serializable {
    private final double bottom;
    private final double left;
    private final double right;
    private final double top;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public EdgeInsets(double d, double d2, double d3, double d4) {
        this.top = d;
        this.left = d2;
        this.bottom = d3;
        this.right = d4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EdgeInsets.class != obj.getClass()) {
            return false;
        }
        EdgeInsets edgeInsets = (EdgeInsets) obj;
        return PartialEq.compare(this.top, edgeInsets.top) && PartialEq.compare(this.left, edgeInsets.left) && PartialEq.compare(this.bottom, edgeInsets.bottom) && PartialEq.compare(this.right, edgeInsets.right);
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.top), Double.valueOf(this.left), Double.valueOf(this.bottom), Double.valueOf(this.right));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[top: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.top, ", left: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.left, ", bottom: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.bottom, ", right: ", sb);
        sb.append(RecordUtils.fieldToString(Double.valueOf(this.right)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
