package com.mapbox.maps;

import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class CustomRasterSourceClient {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK,
        CUSTOM_RASTER_SOURCE_TILE_RENDERER
    }

    public CustomRasterSourceClient(@NonNull CustomRasterSourceTileStatusChangedCallback customRasterSourceTileStatusChangedCallback) {
        this.type = Type.CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK;
        this.value = customRasterSourceTileStatusChangedCallback;
    }

    public static CustomRasterSourceClient valueOf(@NonNull CustomRasterSourceTileStatusChangedCallback customRasterSourceTileStatusChangedCallback) {
        return new CustomRasterSourceClient(customRasterSourceTileStatusChangedCallback);
    }

    @NonNull
    public CustomRasterSourceTileRenderer getCustomRasterSourceTileRenderer() {
        if (isCustomRasterSourceTileRenderer()) {
            return (CustomRasterSourceTileRenderer) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (CustomRasterSourceTileRenderer)");
        return null;
    }

    @NonNull
    public CustomRasterSourceTileStatusChangedCallback getCustomRasterSourceTileStatusChangedCallback() {
        if (isCustomRasterSourceTileStatusChangedCallback()) {
            return (CustomRasterSourceTileStatusChangedCallback) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (CustomRasterSourceTileStatusChangedCallback)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isCustomRasterSourceTileRenderer() {
        return this.type == Type.CUSTOM_RASTER_SOURCE_TILE_RENDERER;
    }

    public boolean isCustomRasterSourceTileStatusChangedCallback() {
        return this.type == Type.CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static CustomRasterSourceClient valueOf(@NonNull CustomRasterSourceTileRenderer customRasterSourceTileRenderer) {
        return new CustomRasterSourceClient(customRasterSourceTileRenderer);
    }

    public CustomRasterSourceClient(@NonNull CustomRasterSourceTileRenderer customRasterSourceTileRenderer) {
        this.type = Type.CUSTOM_RASTER_SOURCE_TILE_RENDERER;
        this.value = customRasterSourceTileRenderer;
    }
}
