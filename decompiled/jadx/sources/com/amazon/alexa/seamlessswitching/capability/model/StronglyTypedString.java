package com.amazon.alexa.seamlessswitching.capability.model;

import androidx.annotation.Nullable;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface StronglyTypedString {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class StronglyTypedStringAdapter<T extends StronglyTypedString> extends TypeAdapter<T> {
        public abstract T instantiate(String str);

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            return instantiate(jsonReader.nextString());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, @Nullable T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(t.getValue());
            }
        }
    }

    String getValue();
}
