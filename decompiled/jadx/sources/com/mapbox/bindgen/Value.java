package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Value {

    @Nullable
    private Object contents;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.mapbox.bindgen.Value$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public Value(double d) {
        this.contents = Double.valueOf(d);
    }

    private void buildJson(JsonWriter jsonWriter) throws IOException {
        Object obj = this.contents;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Double) {
            jsonWriter.value(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            jsonWriter.value(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof List) {
            jsonWriter.beginArray();
            Iterator it2 = ((List) this.contents).iterator();
            while (it2.hasNext()) {
                ((Value) it2.next()).buildJson(jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        if (!(obj instanceof HashMap)) {
            Single$$ExternalSyntheticBUOutline0.m("Unhandled value type");
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((HashMap) this.contents).entrySet()) {
            jsonWriter.name((String) entry.getKey());
            ((Value) entry.getValue()).buildJson(jsonWriter);
        }
        jsonWriter.endObject();
    }

    @NonNull
    public static Expected<String, Value> fromJson(@NonNull String str) {
        try {
            return ExpectedFactory.createValue(fromJsonHelper(str));
        } catch (IOException e) {
            return ExpectedFactory.createError(e.getMessage());
        }
    }

    @NonNull
    private static Value fromJsonHelper(@NonNull String str) throws IOException {
        return read(new JsonReader(new StringReader(str)));
    }

    @NonNull
    public static Value nullValue() {
        return new Value();
    }

    @NonNull
    private static Value read(JsonReader jsonReader) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
            case 1:
                return new Value(jsonReader.nextString());
            case 2:
                String nextString = jsonReader.nextString();
                return (nextString.indexOf(46) > -1 || nextString.contains("e") || nextString.contains(ExifInterface.LONGITUDE_EAST)) ? new Value(Double.valueOf(nextString)) : new Value(Long.valueOf(nextString));
            case 3:
                return new Value(jsonReader.nextBoolean());
            case 4:
                jsonReader.nextNull();
                return new Value();
            case 5:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(read(jsonReader));
                }
                jsonReader.endArray();
                return new Value((List<Value>) arrayList);
            case 6:
                HashMap hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return new Value((HashMap<String, Value>) hashMap);
            default:
                Single$$ExternalSyntheticBUOutline0.m$3("Invalid JSON string stream");
                return null;
        }
    }

    @NonNull
    public static Value valueOf(double d) {
        return new Value(Double.valueOf(d));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Value) {
            Object obj2 = this.contents;
            if (obj2 == null && ((Value) obj).contents == null) {
                return true;
            }
            if (obj2 == null) {
                return false;
            }
            Value value = (Value) obj;
            if (value.contents == null) {
                return false;
            }
            if (obj2.getClass().isAssignableFrom(value.contents.getClass())) {
                return this.contents.equals(value.contents);
            }
        }
        return this.contents.equals(obj);
    }

    @Nullable
    public Object getContents() {
        return this.contents;
    }

    public int hashCode() {
        Object obj = this.contents;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NonNull
    public String toJson() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                buildJson(jsonWriter);
                jsonWriter.close();
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringWriter.toString();
    }

    public String toString() {
        Object obj = this.contents;
        return obj == null ? "" : obj.toString();
    }

    private Value(@Nullable Object obj) {
        this.contents = obj;
    }

    @NonNull
    public static Value valueOf(long j) {
        return new Value(Long.valueOf(j));
    }

    @NonNull
    public static Value valueOf(boolean z) {
        return new Value(Boolean.valueOf(z));
    }

    public Value(long j) {
        this.contents = Long.valueOf(j);
    }

    @NonNull
    public static Value valueOf(@NonNull String str) {
        return new Value(str);
    }

    @NonNull
    public static Value valueOf(@NonNull List<Value> list) {
        return new Value(list);
    }

    public Value(boolean z) {
        this.contents = Boolean.valueOf(z);
    }

    @NonNull
    public static Value valueOf(@NonNull HashMap<String, Value> hashMap) {
        return new Value(hashMap);
    }

    public Value(@NonNull String str) {
        this.contents = str;
    }

    public Value(@NonNull List<Value> list) {
        this.contents = list;
    }

    public Value(@NonNull HashMap<String, Value> hashMap) {
        this.contents = hashMap;
    }

    private Value() {
        this.contents = null;
    }
}
