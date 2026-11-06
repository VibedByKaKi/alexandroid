package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Image implements Serializable {

    @NonNull
    private final DataRef data;
    private final int height;
    private final int width;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Image(int i, int i2, @NonNull DataRef dataRef) {
        this.width = i;
        this.height = i2;
        this.data = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Image.class != obj.getClass()) {
            return false;
        }
        Image image = (Image) obj;
        return this.width == image.width && this.height == image.height && Objects.equals(this.data, image.data);
    }

    @NonNull
    public DataRef getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.width), Integer.valueOf(this.height), this.data);
    }

    public String toString() {
        return "[width: " + RecordUtils.fieldToString(Integer.valueOf(this.width)) + ", height: " + RecordUtils.fieldToString(Integer.valueOf(this.height)) + ", data: " + RecordUtils.fieldToString(this.data) + MarkdownConstants.RIGHT_BRACKET;
    }
}
