package com.mapbox.geojson;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.IOException;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes8.dex */
public final class Feature implements GeoJson {
    private static final String TYPE = "Feature";

    @JsonAdapter(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final Geometry geometry;
    private final String id;
    private final JsonObject properties;
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GsonTypeAdapter extends TypeAdapter<Feature> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private volatile TypeAdapter<Geometry> geometryTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<JsonObject> jsonObjectTypeAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Feature read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            BoundingBox boundingBox = null;
            String str2 = null;
            Geometry geometry = null;
            JsonObject jsonObject = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextName.getClass();
                    switch (nextName) {
                        case "properties":
                            TypeAdapter<JsonObject> typeAdapter = this.jsonObjectTypeAdapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.getAdapter(JsonObject.class);
                                this.jsonObjectTypeAdapter = typeAdapter;
                            }
                            jsonObject = typeAdapter.read(jsonReader);
                            break;
                        case "id":
                            TypeAdapter<String> typeAdapter2 = this.stringTypeAdapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.getAdapter(String.class);
                                this.stringTypeAdapter = typeAdapter2;
                            }
                            str2 = typeAdapter2.read(jsonReader);
                            break;
                        case "bbox":
                            TypeAdapter<BoundingBox> typeAdapter3 = this.boundingBoxTypeAdapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.getAdapter(BoundingBox.class);
                                this.boundingBoxTypeAdapter = typeAdapter3;
                            }
                            boundingBox = typeAdapter3.read(jsonReader);
                            break;
                        case "type":
                            TypeAdapter<String> typeAdapter4 = this.stringTypeAdapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.getAdapter(String.class);
                                this.stringTypeAdapter = typeAdapter4;
                            }
                            str = typeAdapter4.read(jsonReader);
                            break;
                        case "geometry":
                            TypeAdapter<Geometry> typeAdapter5 = this.geometryTypeAdapter;
                            if (typeAdapter5 == null) {
                                typeAdapter5 = this.gson.getAdapter(Geometry.class);
                                this.geometryTypeAdapter = typeAdapter5;
                            }
                            geometry = typeAdapter5.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return new Feature(str, boundingBox, str2, geometry, jsonObject);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Feature feature) throws IOException {
            if (feature == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (feature.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.stringTypeAdapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, feature.type());
            }
            jsonWriter.name("bbox");
            if (feature.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxTypeAdapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxTypeAdapter = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, feature.bbox());
            }
            jsonWriter.name("id");
            if (feature.id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.stringTypeAdapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, feature.id());
            }
            jsonWriter.name("geometry");
            if (feature.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Geometry> typeAdapter4 = this.geometryTypeAdapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.getAdapter(Geometry.class);
                    this.geometryTypeAdapter = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, feature.geometry());
            }
            jsonWriter.name("properties");
            if (feature.properties() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<JsonObject> typeAdapter5 = this.jsonObjectTypeAdapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.getAdapter(JsonObject.class);
                    this.jsonObjectTypeAdapter = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, feature.properties());
            }
            jsonWriter.endObject();
        }
    }

    public Feature(String str, @Nullable BoundingBox boundingBox, @Nullable String str2, @Nullable Geometry geometry, @Nullable JsonObject jsonObject) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        this.id = str2;
        this.geometry = geometry;
        this.properties = jsonObject;
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, null, geometry, jsonObject);
    }

    public static Feature fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        Feature feature = (Feature) gsonBuilder.create().fromJson(str, Feature.class);
        return feature.properties() != null ? feature : new Feature(TYPE, feature.bbox(), feature.id(), feature.geometry(), new JsonObject());
    }

    public static TypeAdapter<Feature> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch) {
        properties().addProperty(str, ch);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    @Override // com.mapbox.geojson.GeoJson
    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        String str;
        Geometry geometry;
        JsonObject jsonObject;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (this.type.equals(feature.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(feature.bbox()) : feature.bbox() == null) && ((str = this.id) != null ? str.equals(feature.id()) : feature.id() == null) && ((geometry = this.geometry) != null ? geometry.equals(feature.geometry()) : feature.geometry() == null) && ((jsonObject = this.properties) != null ? jsonObject.equals(feature.properties()) : feature.properties() == null)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Geometry geometry() {
        return this.geometry;
    }

    public Boolean getBooleanProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Boolean.valueOf(jsonElement.getAsBoolean());
    }

    public Character getCharacterProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Character.valueOf(jsonElement.getAsCharacter());
    }

    public Number getNumberProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsNumber();
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public String getStringProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public boolean hasNonNullValueForProperty(String str) {
        return hasProperty(str) && !getProperty(str).isJsonNull();
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int hashCode2 = (hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        String str = this.id;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Geometry geometry = this.geometry;
        int hashCode4 = (hashCode3 ^ (geometry == null ? 0 : geometry.hashCode())) * 1000003;
        JsonObject jsonObject = this.properties;
        return hashCode4 ^ (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public JsonObject properties() {
        return this.properties;
    }

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        Gson create = new GsonBuilder().registerTypeAdapterFactory(GeoJsonAdapterFactory.create()).registerTypeAdapterFactory(GeometryAdapterFactory.create()).create();
        if (properties().size() == 0) {
            this = new Feature(TYPE, bbox(), id(), geometry(), null);
        }
        return create.toJson(this);
    }

    public String toString() {
        return "Feature{type=" + this.type + ", bbox=" + this.bbox + ", id=" + this.id + ", geometry=" + this.geometry + ", properties=" + this.properties + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // com.mapbox.geojson.GeoJson
    @NonNull
    public String type() {
        return this.type;
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable BoundingBox boundingBox) {
        return new Feature(TYPE, boundingBox, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(@Nullable Geometry geometry) {
        return new Feature(TYPE, null, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable JsonObject jsonObject, @Nullable BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, null, geometry, jsonObject);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable JsonObject jsonObject, @Nullable String str) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, str, geometry, jsonObject);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @NonNull JsonObject jsonObject, @Nullable String str, @Nullable BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, str, geometry, jsonObject);
    }
}
