package com.mapbox.maps;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CanonicalTileID implements Serializable {
    private final int x;
    private final int y;
    private final byte z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CanonicalTileID(byte b, int i, int i2) {
        this.z = b;
        this.x = i;
        this.y = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CanonicalTileID.class != obj.getClass()) {
            return false;
        }
        CanonicalTileID canonicalTileID = (CanonicalTileID) obj;
        return this.z == canonicalTileID.z && this.x == canonicalTileID.x && this.y == canonicalTileID.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public byte getZ() {
        return this.z;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.z), Integer.valueOf(this.x), Integer.valueOf(this.y));
    }

    public String toString() {
        return "[z: " + RecordUtils.fieldToString(Byte.valueOf(this.z)) + ", x: " + RecordUtils.fieldToString(Integer.valueOf(this.x)) + ", y: " + RecordUtils.fieldToString(Integer.valueOf(this.y)) + MarkdownConstants.RIGHT_BRACKET;
    }
}
