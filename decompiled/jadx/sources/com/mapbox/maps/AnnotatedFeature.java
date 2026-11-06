package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.mapbox.geojson.Geometry;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class AnnotatedFeature {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        GEOMETRY,
        ANNOTATED_LAYER_FEATURE
    }

    public AnnotatedFeature(@NonNull Geometry geometry) {
        this.type = Type.GEOMETRY;
        this.value = geometry;
    }

    public static AnnotatedFeature valueOf(@NonNull Geometry geometry) {
        return new AnnotatedFeature(geometry);
    }

    @NonNull
    public AnnotatedLayerFeature getAnnotatedLayerFeature() {
        if (isAnnotatedLayerFeature()) {
            return (AnnotatedLayerFeature) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (AnnotatedLayerFeature)");
        return null;
    }

    @NonNull
    public Geometry getGeometry() {
        if (isGeometry()) {
            return (Geometry) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (Geometry)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isAnnotatedLayerFeature() {
        return this.type == Type.ANNOTATED_LAYER_FEATURE;
    }

    public boolean isGeometry() {
        return this.type == Type.GEOMETRY;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static AnnotatedFeature valueOf(@NonNull AnnotatedLayerFeature annotatedLayerFeature) {
        return new AnnotatedFeature(annotatedLayerFeature);
    }

    public AnnotatedFeature(@NonNull AnnotatedLayerFeature annotatedLayerFeature) {
        this.type = Type.ANNOTATED_LAYER_FEATURE;
        this.value = annotatedLayerFeature;
    }
}
