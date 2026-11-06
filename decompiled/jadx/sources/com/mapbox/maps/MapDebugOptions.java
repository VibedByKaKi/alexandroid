package com.mapbox.maps;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum MapDebugOptions {
    TILE_BORDERS,
    PARSE_STATUS,
    TIMESTAMPS,
    COLLISION,
    OVERDRAW,
    STENCIL_CLIP,
    DEPTH_BUFFER,
    MODEL_BOUNDS,
    TERRAIN_WIREFRAME,
    LAYERS2_DWIREFRAME,
    LAYERS3_DWIREFRAME,
    LIGHT,
    ELEVATION_ID,
    OCCLUSION;

    private int getValue() {
        return ordinal();
    }
}
