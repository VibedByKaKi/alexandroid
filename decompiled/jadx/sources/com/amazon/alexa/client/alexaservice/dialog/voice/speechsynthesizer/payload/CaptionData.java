package com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload;

import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload.AutoValue_CaptionData;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CaptionData {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CaptionType {
        STRING,
        WEBVTT
    }

    public static CaptionData create(String str) {
        return create(str, CaptionType.STRING);
    }

    public static TypeAdapter<CaptionData> typeAdapter(Gson gson) {
        return new CustomGsonTypeAdapter(gson);
    }

    public abstract String getContent();

    public abstract CaptionType getType();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CustomGsonTypeAdapter extends TypeAdapter<CaptionData> {
        private static final String CONTENT_KEY_NAME = "content";
        private static final String TYPE_KEY_NAME = "type";
        private final TypeAdapter<CaptionType> captionTypeAdapter;
        private final TypeAdapter<String> stringAdapter;
        private final TypeAdapter<CaptionData> typeAdapter;

        public CustomGsonTypeAdapter(Gson gson) {
            this.stringAdapter = gson.getAdapter(String.class);
            this.captionTypeAdapter = gson.getAdapter(CaptionType.class);
            this.typeAdapter = new AutoValue_CaptionData.GsonTypeAdapter(gson);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public CaptionData read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                jsonReader.beginObject();
                CaptionType captionType = CaptionType.STRING;
                String str = "";
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        nextName.getClass();
                        if (nextName.equals("type")) {
                            captionType = this.captionTypeAdapter.read(jsonReader);
                        } else if (nextName.equals("content")) {
                            str = this.stringAdapter.read(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                jsonReader.endObject();
                return CaptionData.create(str, captionType);
            } catch (Exception unused) {
                return CaptionData.create(jsonReader.nextString());
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, CaptionData captionData) throws IOException {
            this.typeAdapter.write(jsonWriter, captionData);
        }
    }

    public static CaptionData create(String str, CaptionType captionType) {
        return new AutoValue_CaptionData(str, captionType);
    }
}
