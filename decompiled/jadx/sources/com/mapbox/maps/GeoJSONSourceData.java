package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class GeoJSONSourceData {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        GEOMETRY,
        FEATURE,
        LIST,
        STRING
    }

    public GeoJSONSourceData(@NonNull Geometry geometry) {
        this.type = Type.GEOMETRY;
        this.value = geometry;
    }

    public static GeoJSONSourceData valueOf(@NonNull Geometry geometry) {
        return new GeoJSONSourceData(geometry);
    }

    @NonNull
    public Feature getFeature() {
        if (isFeature()) {
            return (Feature) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (Feature)");
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

    @NonNull
    public List<Feature> getList() {
        if (isList()) {
            return (List) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (List<Feature>)");
        return null;
    }

    @NonNull
    public String getString() {
        if (isString()) {
            return (String) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (String)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isFeature() {
        return this.type == Type.FEATURE;
    }

    public boolean isGeometry() {
        return this.type == Type.GEOMETRY;
    }

    public boolean isList() {
        return this.type == Type.LIST;
    }

    public boolean isString() {
        return this.type == Type.STRING;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static GeoJSONSourceData valueOf(@NonNull Feature feature) {
        return new GeoJSONSourceData(feature);
    }

    public static GeoJSONSourceData valueOf(@NonNull List<Feature> list) {
        return new GeoJSONSourceData(list);
    }

    public static GeoJSONSourceData valueOf(@NonNull String str) {
        return new GeoJSONSourceData(str);
    }

    public GeoJSONSourceData(@NonNull Feature feature) {
        this.type = Type.FEATURE;
        this.value = feature;
    }

    public GeoJSONSourceData(@NonNull List<Feature> list) {
        this.type = Type.LIST;
        this.value = list;
    }

    public GeoJSONSourceData(@NonNull String str) {
        this.type = Type.STRING;
        this.value = str;
    }
}
