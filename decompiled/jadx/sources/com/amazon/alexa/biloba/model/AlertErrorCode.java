package com.amazon.alexa.biloba.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonAdapter(Adapter.class)
/* loaded from: classes17.dex */
public enum AlertErrorCode {
    ALERT_CONFIGURATION_LIMIT_EXCEEDED("ALERT_CONFIGURATION_LIMIT_EXCEEDED"),
    ALERT_CONFIGURATION_DUPLICATE_NAME("ALERT_CONFIGURATION_DUPLICATE_NAME");

    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter extends TypeAdapter<AlertErrorCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public AlertErrorCode read(JsonReader jsonReader) throws IOException {
            return AlertErrorCode.fromValue(String.valueOf(jsonReader.nextString()));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, AlertErrorCode alertErrorCode) throws IOException {
            jsonWriter.value(alertErrorCode.getValue());
        }
    }

    AlertErrorCode(String str) {
        this.value = str;
    }

    public static AlertErrorCode fromValue(String str) {
        for (AlertErrorCode alertErrorCode : values()) {
            if (String.valueOf(alertErrorCode.value).equals(str)) {
                return alertErrorCode;
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
