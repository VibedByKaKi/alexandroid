package com.amazon.alexa.biloba.model.cardV2.data;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonAdapter(Adapter.class)
/* loaded from: classes17.dex */
public enum TemplateType {
    HALO("HALO");

    private String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter extends TypeAdapter<TemplateType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public TemplateType read(JsonReader jsonReader) throws IOException {
            return TemplateType.fromValue(String.valueOf(jsonReader.nextString()));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, TemplateType templateType) throws IOException {
            jsonWriter.value(templateType.getValue());
        }
    }

    TemplateType(String str) {
        this.value = str;
    }

    public static TemplateType fromValue(String str) {
        for (TemplateType templateType : values()) {
            if (String.valueOf(templateType.value).equals(str)) {
                return templateType;
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
