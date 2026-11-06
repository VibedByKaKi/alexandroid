package com.mapbox.maps;

import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class TileCacheBudget {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        TILE_CACHE_BUDGET_IN_MEGABYTES,
        TILE_CACHE_BUDGET_IN_TILES
    }

    public TileCacheBudget(@NonNull TileCacheBudgetInMegabytes tileCacheBudgetInMegabytes) {
        this.type = Type.TILE_CACHE_BUDGET_IN_MEGABYTES;
        this.value = tileCacheBudgetInMegabytes;
    }

    public static TileCacheBudget valueOf(@NonNull TileCacheBudgetInMegabytes tileCacheBudgetInMegabytes) {
        return new TileCacheBudget(tileCacheBudgetInMegabytes);
    }

    @NonNull
    public TileCacheBudgetInMegabytes getTileCacheBudgetInMegabytes() {
        if (isTileCacheBudgetInMegabytes()) {
            return (TileCacheBudgetInMegabytes) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (TileCacheBudgetInMegabytes)");
        return null;
    }

    @NonNull
    public TileCacheBudgetInTiles getTileCacheBudgetInTiles() {
        if (isTileCacheBudgetInTiles()) {
            return (TileCacheBudgetInTiles) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (TileCacheBudgetInTiles)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isTileCacheBudgetInMegabytes() {
        return this.type == Type.TILE_CACHE_BUDGET_IN_MEGABYTES;
    }

    public boolean isTileCacheBudgetInTiles() {
        return this.type == Type.TILE_CACHE_BUDGET_IN_TILES;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static TileCacheBudget valueOf(@NonNull TileCacheBudgetInTiles tileCacheBudgetInTiles) {
        return new TileCacheBudget(tileCacheBudgetInTiles);
    }

    public TileCacheBudget(@NonNull TileCacheBudgetInTiles tileCacheBudgetInTiles) {
        this.type = Type.TILE_CACHE_BUDGET_IN_TILES;
        this.value = tileCacheBudgetInTiles;
    }
}
