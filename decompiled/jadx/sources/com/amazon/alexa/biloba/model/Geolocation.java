package com.amazon.alexa.biloba.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Geolocation {

    @SerializedName("type")
    private GeolocationTypeEnum type = null;

    @SerializedName("latitude")
    private Double latitude = null;

    @SerializedName("longitude")
    private Double longitude = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonAdapter(Adapter.class)
    public enum GeolocationTypeEnum {
        ON_THE_GO_FALL_LOCATION("ON_THE_GO_FALL_LOCATION"),
        UNKNOWN("UNKNOWN");

        private String value;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Adapter extends TypeAdapter<GeolocationTypeEnum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public GeolocationTypeEnum read(JsonReader jsonReader) throws IOException {
                return GeolocationTypeEnum.fromValue(String.valueOf(jsonReader.nextString()));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, GeolocationTypeEnum geolocationTypeEnum) throws IOException {
                jsonWriter.value(geolocationTypeEnum.getValue());
            }
        }

        GeolocationTypeEnum(String str) {
            this.value = str;
        }

        public static GeolocationTypeEnum fromValue(String str) {
            for (GeolocationTypeEnum geolocationTypeEnum : values()) {
                if (String.valueOf(geolocationTypeEnum.value).equals(str)) {
                    return geolocationTypeEnum;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Geolocation geolocation = (Geolocation) obj;
            if (Objects.equals(this.type, geolocation.type) && Objects.equals(this.latitude, geolocation.latitude) && Objects.equals(this.longitude, geolocation.longitude)) {
                return true;
            }
        }
        return false;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public GeolocationTypeEnum getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.latitude, this.longitude);
    }

    public Geolocation latitude(Double d) {
        this.latitude = d;
        return this;
    }

    public Geolocation longitude(Double d) {
        this.longitude = d;
        return this;
    }

    public void setLatitude(Double d) {
        this.latitude = d;
    }

    public void setLongitude(Double d) {
        this.longitude = d;
    }

    public void setType(GeolocationTypeEnum geolocationTypeEnum) {
        this.type = geolocationTypeEnum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Geolocation {\n    type: ");
        sb.append(toIndentedString(this.type));
        sb.append("\n    latitude: ");
        sb.append(toIndentedString(this.latitude));
        sb.append("\n    longitude: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.longitude), "\n}");
    }

    public Geolocation type(GeolocationTypeEnum geolocationTypeEnum) {
        this.type = geolocationTypeEnum;
        return this;
    }
}
