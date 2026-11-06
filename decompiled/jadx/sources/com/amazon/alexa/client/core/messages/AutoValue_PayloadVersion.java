package com.amazon.alexa.client.core.messages;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PayloadVersion extends C$AutoValue_PayloadVersion {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GsonTypeAdapter extends TypeAdapter<PayloadVersion> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public PayloadVersion read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.getClass();
                    if ("value".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.string_adapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(String.class);
                            this.string_adapter = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_PayloadVersion(str);
        }

        public String toString() {
            return "TypeAdapter(PayloadVersion)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, PayloadVersion payloadVersion) throws IOException {
            if (payloadVersion == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("value");
            if (payloadVersion.getValue() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.string_adapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.getAdapter(String.class);
                    this.string_adapter = typeAdapter;
                }
                typeAdapter.write(jsonWriter, payloadVersion.getValue());
            }
            jsonWriter.endObject();
        }
    }

    public AutoValue_PayloadVersion(final String str) {
        new PayloadVersion(str) { // from class: com.amazon.alexa.client.core.messages.$AutoValue_PayloadVersion
            private final String value;

            {
                if (str != null) {
                    this.value = str;
                } else {
                    Single$$ExternalSyntheticBUOutline0.m$1("Null value");
                    throw null;
                }
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof PayloadVersion) {
                    return this.value.equals(((PayloadVersion) obj).getValue());
                }
                return false;
            }

            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString
            public String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() ^ 1000003;
            }

            public String toString() {
                return a$$ExternalSyntheticOutline0.m(new StringBuilder("PayloadVersion{value="), this.value, StringSubstitutor.DEFAULT_VAR_END);
            }
        };
    }
}
