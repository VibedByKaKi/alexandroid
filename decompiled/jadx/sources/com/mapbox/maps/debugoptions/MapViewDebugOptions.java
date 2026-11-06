package com.mapbox.maps.debugoptions;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "", "name", "", "(Ljava/lang/String;)V", "getName$maps_sdk_release", "()Ljava/lang/String;", "component1", "component1$maps_sdk_release", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MapViewDebugOptions {

    @NotNull
    private final String name;

    @JvmField
    @NotNull
    public static final MapViewDebugOptions TILE_BORDERS = new MapViewDebugOptions("TILE_BORDERS");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions PARSE_STATUS = new MapViewDebugOptions("PARSE_STATUS");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions TIMESTAMPS = new MapViewDebugOptions("TIMESTAMPS");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions COLLISION = new MapViewDebugOptions("COLLISION");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions OVERDRAW = new MapViewDebugOptions("OVERDRAW");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions STENCIL_CLIP = new MapViewDebugOptions("STENCIL_CLIP");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions DEPTH_BUFFER = new MapViewDebugOptions("DEPTH_BUFFER");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions MODEL_BOUNDS = new MapViewDebugOptions("MODEL_BOUNDS");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions TERRAIN_WIREFRAME = new MapViewDebugOptions("TERRAIN_WIREFRAME");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions LAYERS2_DWIREFRAME = new MapViewDebugOptions("LAYERS2_DWIREFRAME");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions LAYERS3_DWIREFRAME = new MapViewDebugOptions("LAYERS3_DWIREFRAME");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions LIGHT = new MapViewDebugOptions("LIGHT");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions CAMERA = new MapViewDebugOptions("CAMERA");

    @JvmField
    @NotNull
    public static final MapViewDebugOptions PADDING = new MapViewDebugOptions("PADDING");

    public MapViewDebugOptions(@NotNull String str) {
        str.getClass();
        this.name = str;
    }

    public static /* synthetic */ MapViewDebugOptions copy$default(MapViewDebugOptions mapViewDebugOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mapViewDebugOptions.name;
        }
        return mapViewDebugOptions.copy(str);
    }

    @NotNull
    /* renamed from: component1$maps_sdk_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final MapViewDebugOptions copy(@NotNull String name) {
        name.getClass();
        return new MapViewDebugOptions(name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapViewDebugOptions) && Intrinsics.areEqual(this.name, ((MapViewDebugOptions) other).name);
    }

    @NotNull
    public final String getName$maps_sdk_release() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.name, new StringBuilder("MapViewDebugOptions(name="));
    }
}
