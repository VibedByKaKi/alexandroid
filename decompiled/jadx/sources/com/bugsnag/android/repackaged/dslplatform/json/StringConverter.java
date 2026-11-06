package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class StringConverter {
    public static final JsonReader.ReadObject<String> READER = new JsonReader.ReadObject<String>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.StringConverter.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public String read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return jsonReader.readString();
        }
    };
    public static final JsonWriter.WriteObject<String> WRITER = new JsonWriter.WriteObject<String>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.StringConverter.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable String str) {
            StringConverter.serializeNullable(str, jsonWriter);
        }
    };
    public static final JsonWriter.WriteObject<CharSequence> WRITER_CHARS = new JsonWriter.WriteObject<CharSequence>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.StringConverter.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable CharSequence charSequence) {
            if (charSequence == null) {
                jsonWriter.writeNull();
            } else {
                jsonWriter.writeString(charSequence);
            }
        }
    };
    public static final JsonReader.ReadObject<StringBuilder> READER_BUILDER = new JsonReader.ReadObject<StringBuilder>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.StringConverter.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public StringBuilder read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return jsonReader.appendString(new StringBuilder());
        }
    };
    public static final JsonReader.ReadObject<StringBuffer> READER_BUFFER = new JsonReader.ReadObject<StringBuffer>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.StringConverter.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public StringBuffer read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return jsonReader.appendString(new StringBuffer());
        }
    };

    public static String deserialize(JsonReader jsonReader) throws IOException {
        return jsonReader.readString();
    }

    public static ArrayList<String> deserializeCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(READER);
    }

    @Nullable
    public static String deserializeNullable(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() != 110) {
            return jsonReader.readString();
        }
        if (jsonReader.wasNull()) {
            return null;
        }
        throw jsonReader.newParseErrorAt("Expecting 'null' for null constant", 0);
    }

    public static ArrayList<String> deserializeNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(READER);
    }

    public static void serialize(List<String> list, JsonWriter jsonWriter) {
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (list.size() != 0) {
            jsonWriter.writeString(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                jsonWriter.writeString(list.get(i));
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public static void serializeNullable(@Nullable String str, JsonWriter jsonWriter) {
        if (str == null) {
            jsonWriter.writeNull();
        } else {
            jsonWriter.writeString(str);
        }
    }

    public static void serializeShort(String str, JsonWriter jsonWriter) {
        jsonWriter.writeString(str);
    }

    public static void serializeShortNullable(@Nullable String str, JsonWriter jsonWriter) {
        if (str == null) {
            jsonWriter.writeNull();
        } else {
            jsonWriter.writeString(str);
        }
    }

    public static void deserializeCollection(JsonReader jsonReader, Collection<String> collection) throws IOException {
        jsonReader.deserializeCollection(READER, collection);
    }

    public static void deserializeNullableCollection(JsonReader jsonReader, Collection<String> collection) throws IOException {
        jsonReader.deserializeNullableCollection(READER, collection);
    }

    public static void serialize(String str, JsonWriter jsonWriter) {
        jsonWriter.writeString(str);
    }
}
