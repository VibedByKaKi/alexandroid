package com.mapbox.maps;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Size implements Serializable {
    private final float height;
    private final float width;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Size(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Size.class != obj.getClass()) {
            return false;
        }
        Size size = (Size) obj;
        return PartialEq.compare(this.width, size.width) && PartialEq.compare(this.height, size.height);
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.width), Float.valueOf(this.height));
    }

    public String toString() {
        return "[width: " + RecordUtils.fieldToString(Float.valueOf(this.width)) + ", height: " + RecordUtils.fieldToString(Float.valueOf(this.height)) + MarkdownConstants.RIGHT_BRACKET;
    }
}
