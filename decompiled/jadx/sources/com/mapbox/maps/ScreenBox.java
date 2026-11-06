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
public final class ScreenBox implements Serializable {

    @NonNull
    private final ScreenCoordinate max;

    @NonNull
    private final ScreenCoordinate min;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ScreenBox(@NonNull ScreenCoordinate screenCoordinate, @NonNull ScreenCoordinate screenCoordinate2) {
        this.min = screenCoordinate;
        this.max = screenCoordinate2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScreenBox.class != obj.getClass()) {
            return false;
        }
        ScreenBox screenBox = (ScreenBox) obj;
        return Objects.equals(this.min, screenBox.min) && Objects.equals(this.max, screenBox.max);
    }

    @NonNull
    public ScreenCoordinate getMax() {
        return this.max;
    }

    @NonNull
    public ScreenCoordinate getMin() {
        return this.min;
    }

    public int hashCode() {
        return Objects.hash(this.min, this.max);
    }

    public String toString() {
        return "[min: " + RecordUtils.fieldToString(this.min) + ", max: " + RecordUtils.fieldToString(this.max) + MarkdownConstants.RIGHT_BRACKET;
    }
}
