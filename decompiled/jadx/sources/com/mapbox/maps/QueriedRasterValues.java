package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class QueriedRasterValues implements Serializable {

    @NonNull
    private final HashMap<String, List<Float>> layers;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public QueriedRasterValues(@NonNull HashMap<String, List<Float>> hashMap) {
        this.layers = hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && QueriedRasterValues.class == obj.getClass() && Objects.equals(this.layers, ((QueriedRasterValues) obj).layers);
    }

    @NonNull
    public HashMap<String, List<Float>> getLayers() {
        return this.layers;
    }

    public int hashCode() {
        return Objects.hash(this.layers);
    }

    public String toString() {
        return "[layers: " + RecordUtils.fieldToString(this.layers) + MarkdownConstants.RIGHT_BRACKET;
    }
}
