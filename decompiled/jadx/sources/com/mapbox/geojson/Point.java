package com.mapbox.geojson;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes8.dex */
public final class Point implements FlattenedCoordinateContainer<List<Double>, double[]> {
    static final String TYPE = "Point";

    @Nullable
    private final BoundingBox bbox;

    @NonNull
    private final double[] coordinates;

    @NonNull
    private final String type;

    public Point(@NonNull String str, @Nullable BoundingBox boundingBox, @NonNull double[] dArr) {
        this.type = str;
        this.bbox = boundingBox;
        if (dArr.length != 0) {
            this.coordinates = dArr;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null coordinates");
            throw null;
        }
    }

    public static Point fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (Point) gsonBuilder.create().fromJson(str, Point.class);
    }

    public static Point fromLngLat(@NonNull double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }

    public static TypeAdapter<Point> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public double altitude() {
        double[] dArr = this.coordinates;
        if (dArr.length < 3) {
            return Double.NaN;
        }
        return dArr[2];
    }

    @Override // com.mapbox.geojson.GeoJson
    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    @NonNull
    @Deprecated
    public List<Double> coordinates() {
        ArrayList arrayList = new ArrayList(this.coordinates.length);
        for (double d : this.coordinates) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return Objects.equals(this.type, point.type) && Objects.equals(this.bbox, point.bbox) && Objects.deepEquals(this.coordinates, point.coordinates);
    }

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return Arrays.hashCode(this.coordinates) ^ ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003);
    }

    public double latitude() {
        return this.coordinates[1];
    }

    public double longitude() {
        return this.coordinates[0];
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        String m;
        int length = this.coordinates.length;
        double[] dArr = this.coordinates;
        if (length > 2) {
            StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
            sb.append(dArr[0]);
            sb.append(", ");
            sb.append(this.coordinates[1]);
            sb.append(", ");
            m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(this.coordinates[2], MarkdownConstants.RIGHT_BRACKET, sb);
        } else {
            StringBuilder sb2 = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
            sb2.append(dArr[0]);
            sb2.append(", ");
            m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(this.coordinates[1], MarkdownConstants.RIGHT_BRACKET, sb2);
        }
        return "Point{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + m + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // com.mapbox.geojson.GeoJson
    @NonNull
    public String type() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Point, List<Double>, double[]> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfDoublesCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Double>> createCoordinateContainer(String str, BoundingBox boundingBox, double[] dArr) {
            if (str == null) {
                str = Point.TYPE;
            }
            return new Point(str, boundingBox, dArr);
        }

        @Override // com.google.gson.TypeAdapter
        public Point read(JsonReader jsonReader) throws IOException {
            return (Point) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Point point) throws IOException {
            writeFlattenedCoordinateContainer(jsonWriter, point);
        }
    }

    @Override // com.mapbox.geojson.FlattenedCoordinateContainer
    public double[] flattenCoordinates() {
        return this.coordinates;
    }

    public static Point fromLngLat(double d, double d2, @Nullable BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shift(d, d2));
    }

    public static Point fromLngLat(double d, double d2, double d3) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shift(d, d2, d3));
    }

    public static Point fromLngLat(double d, double d2, double d3, @Nullable BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shift(d, d2, d3));
    }

    public static Point fromLngLat(double d, double d2) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shift(d, d2));
    }
}
