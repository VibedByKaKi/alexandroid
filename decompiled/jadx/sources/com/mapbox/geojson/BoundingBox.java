package com.mapbox.geojson;

import androidx.annotation.FloatRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes8.dex */
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    public BoundingBox(Point point, Point point2) {
        if (point == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null southwest");
            throw null;
        }
        this.southwest = point;
        if (point2 != null) {
            this.northeast = point2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null northeast");
            throw null;
        }
    }

    @Deprecated
    public static BoundingBox fromCoordinates(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, @FloatRange(from = -180.0d, to = 180.0d) double d3, @FloatRange(from = -90.0d, to = 90.0d) double d4) {
        return fromLngLats(d, d2, d3, d4);
    }

    public static BoundingBox fromJson(String str) {
        return (BoundingBox) new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().fromJson(str, BoundingBox.class);
    }

    public static BoundingBox fromLngLats(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, @FloatRange(from = -180.0d, to = 180.0d) double d3, @FloatRange(from = -90.0d, to = 90.0d) double d4) {
        return new BoundingBox(Point.fromLngLat(d, d2), Point.fromLngLat(d3, d4));
    }

    public static BoundingBox fromPoints(@NonNull Point point, @NonNull Point point2) {
        return new BoundingBox(point, point2);
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new BoundingBoxTypeAdapter();
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundingBox) {
            BoundingBox boundingBox = (BoundingBox) obj;
            if (this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.northeast.hashCode() ^ ((this.southwest.hashCode() ^ 1000003) * 1000003);
    }

    public final double north() {
        return northeast().latitude();
    }

    @NonNull
    public Point northeast() {
        return this.northeast;
    }

    public final double south() {
        return southwest().latitude();
    }

    @NonNull
    public Point southwest() {
        return this.southwest;
    }

    public final String toJson() {
        return new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().toJson(this, BoundingBox.class);
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + StringSubstitutor.DEFAULT_VAR_END;
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, double d3, @FloatRange(from = -180.0d, to = 180.0d) double d4, @FloatRange(from = -90.0d, to = 90.0d) double d5, double d6) {
        return fromLngLats(d, d2, d3, d4, d5, d6);
    }

    public static BoundingBox fromLngLats(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, double d3, @FloatRange(from = -180.0d, to = 180.0d) double d4, @FloatRange(from = -90.0d, to = 90.0d) double d5, double d6) {
        return new BoundingBox(Point.fromLngLat(d, d2, d3), Point.fromLngLat(d4, d5, d6));
    }
}
