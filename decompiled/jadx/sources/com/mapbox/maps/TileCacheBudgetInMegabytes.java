package com.mapbox.maps;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class TileCacheBudgetInMegabytes implements Serializable {
    private final long size;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public TileCacheBudgetInMegabytes(long j) {
        this.size = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.size == ((TileCacheBudgetInMegabytes) obj).size;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.size));
    }

    public String toString() {
        return "[size: " + RecordUtils.fieldToString(Long.valueOf(this.size)) + MarkdownConstants.RIGHT_BRACKET;
    }
}
