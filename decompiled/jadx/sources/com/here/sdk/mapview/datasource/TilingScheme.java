package com.here.sdk.mapview.datasource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum TilingScheme {
    HALF_QUAD_TREE_IDENTITY(0),
    HALF_QUAD_TREE_MERCATOR(1),
    HALF_QUAD_TREE_EQUIRECTANGULAR(2),
    QUAD_TREE_IDENTITY(3),
    QUAD_TREE_MERCATOR(4),
    QUAD_TREE_EQUIRECTANGULAR(5);

    public final int value;

    TilingScheme(int i) {
        this.value = i;
    }
}
