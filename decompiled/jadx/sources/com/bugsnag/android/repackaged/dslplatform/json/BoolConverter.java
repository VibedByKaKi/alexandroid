package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class BoolConverter {
    public static final boolean[] EMPTY_ARRAY = new boolean[0];
    public static final JsonReader.ReadObject<Boolean> READER = new JsonReader.ReadObject<Boolean>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Boolean read(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(BoolConverter.deserialize(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Boolean> NULLABLE_READER = new JsonReader.ReadObject<Boolean>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Boolean.valueOf(BoolConverter.deserialize(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Boolean> WRITER = new JsonWriter.WriteObject<Boolean>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable Boolean bool) {
            BoolConverter.serializeNullable(bool, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<boolean[]> ARRAY_READER = new JsonReader.ReadObject<boolean[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        @Nullable
        public boolean[] read(JsonReader jsonReader) throws IOException {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() != 91) {
                throw jsonReader.newParseError("Expecting '[' for boolean array start");
            }
            jsonReader.getNextToken();
            return BoolConverter.deserializeBoolArray(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<boolean[]> ARRAY_WRITER = new JsonWriter.WriteObject<boolean[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable boolean[] zArr) {
            BoolConverter.serialize(zArr, jsonWriter);
        }
    };

    public static boolean deserialize(JsonReader jsonReader) throws IOException {
        if (jsonReader.wasTrue()) {
            return true;
        }
        if (jsonReader.wasFalse()) {
            return false;
        }
        throw jsonReader.newParseErrorAt("Found invalid boolean value", 0);
    }

    public static boolean[] deserializeBoolArray(JsonReader jsonReader) throws IOException {
        if (jsonReader.last() == 93) {
            return EMPTY_ARRAY;
        }
        boolean[] zArr = new boolean[4];
        zArr[0] = deserialize(jsonReader);
        int i = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i == zArr.length) {
                zArr = Arrays.copyOf(zArr, zArr.length << 1);
            }
            zArr[i] = deserialize(jsonReader);
            i++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(zArr, i);
    }

    public static ArrayList<Boolean> deserializeCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeCollectionCustom(READER);
    }

    public static ArrayList<Boolean> deserializeNullableCollection(JsonReader jsonReader) throws IOException {
        return jsonReader.deserializeNullableCollectionCustom(READER);
    }

    public static void serialize(@Nullable boolean[] zArr, JsonWriter jsonWriter) {
        if (zArr == null) {
            jsonWriter.writeNull();
            return;
        }
        if (zArr.length == 0) {
            jsonWriter.writeAscii(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        jsonWriter.writeAscii(zArr[0] ? "true" : "false");
        for (int i = 1; i < zArr.length; i++) {
            jsonWriter.writeAscii(zArr[i] ? ",true" : ",false");
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public static void serializeNullable(@Nullable Boolean bool, JsonWriter jsonWriter) {
        if (bool == null) {
            jsonWriter.writeNull();
        } else if (bool.booleanValue()) {
            jsonWriter.writeAscii("true");
        } else {
            jsonWriter.writeAscii("false");
        }
    }

    public static void deserializeCollection(JsonReader jsonReader, Collection<Boolean> collection) throws IOException {
        jsonReader.deserializeCollection(READER, collection);
    }

    public static void deserializeNullableCollection(JsonReader jsonReader, Collection<Boolean> collection) throws IOException {
        jsonReader.deserializeNullableCollection(READER, collection);
    }

    public static void serialize(boolean z, JsonWriter jsonWriter) {
        if (z) {
            jsonWriter.writeAscii("true");
        } else {
            jsonWriter.writeAscii("false");
        }
    }
}
