package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.Color;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class MapViewOptions {

    @NonNull
    public MapProjection projection = MapProjection.GLOBE;

    @Nullable
    public Color initialBackgroundColor = null;

    @NonNull
    public MapRenderMode renderMode = MapRenderMode.SURFACE;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapViewOptions)) {
            return false;
        }
        MapViewOptions mapViewOptions = (MapViewOptions) obj;
        return Objects.equals(this.projection, mapViewOptions.projection) && Objects.equals(this.initialBackgroundColor, mapViewOptions.initialBackgroundColor) && Objects.equals(this.renderMode, mapViewOptions.renderMode);
    }

    public int hashCode() {
        MapProjection mapProjection = this.projection;
        int hashCode = (JfifUtil.MARKER_EOI + (mapProjection != null ? mapProjection.hashCode() : 0)) * 31;
        Color color = this.initialBackgroundColor;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 31;
        MapRenderMode mapRenderMode = this.renderMode;
        return hashCode2 + (mapRenderMode != null ? mapRenderMode.hashCode() : 0);
    }
}
