package com.facebook.react.bridge;

import android.util.JsonWriter;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.auth.BuildConfig;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010H\u0002J\u001c\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/bridge/JsonWriterHelper;", "", "<init>", "()V", "value", "", "writer", "Landroid/util/JsonWriter;", "dynamicValue", "Lcom/facebook/react/bridge/Dynamic;", "readableMapValue", "Lcom/facebook/react/bridge/ReadableMap;", "readableArrayValue", "Lcom/facebook/react/bridge/ReadableArray;", "mapValue", BuildConfig.FLAVOR_authType, "", "listValue", "list", "", "objectValue", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonWriterHelper {

    @NotNull
    public static final JsonWriterHelper INSTANCE = new JsonWriterHelper();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private JsonWriterHelper() {
    }

    private final void dynamicValue(JsonWriter writer, Dynamic value) throws IOException {
        switch (WhenMappings.$EnumSwitchMapping$0[value.getType().ordinal()]) {
            case 1:
                writer.nullValue();
                break;
            case 2:
                writer.value(value.asBoolean());
                break;
            case 3:
                writer.value(value.asDouble());
                break;
            case 4:
                writer.value(value.asString());
                break;
            case 5:
                ReadableMap asMap = value.asMap();
                if (asMap == null) {
                    Single$$ExternalSyntheticBUOutline0.m$2("Required value was null.");
                    break;
                } else {
                    readableMapValue(writer, asMap);
                    Unit unit = Unit.INSTANCE;
                    break;
                }
            case 6:
                ReadableArray asArray = value.asArray();
                if (asArray == null) {
                    Single$$ExternalSyntheticBUOutline0.m$2("Required value was null.");
                    break;
                } else {
                    readableArrayValue(writer, asArray);
                    Unit unit2 = Unit.INSTANCE;
                    break;
                }
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                break;
        }
    }

    private final void listValue(JsonWriter writer, List<?> list) throws IOException {
        writer.beginArray();
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            objectValue(writer, it2.next());
        }
        writer.endArray();
    }

    private final void mapValue(JsonWriter writer, Map<?, ?> map) throws IOException {
        writer.beginObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            writer.name(String.valueOf(key));
            value(writer, value);
        }
        writer.endObject();
    }

    private final void objectValue(JsonWriter writer, Object value) throws IOException {
        if (value == null) {
            writer.nullValue();
            return;
        }
        if (value instanceof String) {
            writer.value((String) value);
            return;
        }
        if (value instanceof Number) {
            writer.value((Number) value);
        } else if (value instanceof Boolean) {
            writer.value(((Boolean) value).booleanValue());
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(value, "Unknown value: "));
        }
    }

    @JvmStatic
    public static final void readableArrayValue(@NotNull JsonWriter writer, @NotNull ReadableArray value) throws IOException {
        writer.getClass();
        value.getClass();
        writer.beginArray();
        try {
            int size = value.size();
            for (int i = 0; i < size; i++) {
                switch (WhenMappings.$EnumSwitchMapping$0[value.getType(i).ordinal()]) {
                    case 1:
                        writer.nullValue();
                        break;
                    case 2:
                        writer.value(value.getBoolean(i));
                        break;
                    case 3:
                        writer.value(value.getDouble(i));
                        break;
                    case 4:
                        writer.value(value.getString(i));
                        break;
                    case 5:
                        ReadableMap map = value.getMap(i);
                        JsonWriterHelper jsonWriterHelper = INSTANCE;
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        jsonWriterHelper.readableMapValue(writer, map);
                        Unit unit = Unit.INSTANCE;
                        break;
                    case 6:
                        ReadableArray array = value.getArray(i);
                        if (array == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableArrayValue(writer, array);
                        Unit unit2 = Unit.INSTANCE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            writer.endArray();
        } catch (Throwable th) {
            writer.endArray();
            throw th;
        }
    }

    private final void readableMapValue(JsonWriter writer, ReadableMap value) throws IOException {
        writer.beginObject();
        try {
            ReadableMapKeySetIterator keySetIterator = value.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                writer.name(nextKey);
                switch (WhenMappings.$EnumSwitchMapping$0[value.getType(nextKey).ordinal()]) {
                    case 1:
                        writer.nullValue();
                        break;
                    case 2:
                        writer.value(value.getBoolean(nextKey));
                        break;
                    case 3:
                        writer.value(value.getDouble(nextKey));
                        break;
                    case 4:
                        writer.value(value.getString(nextKey));
                        break;
                    case 5:
                        ReadableMap map = value.getMap(nextKey);
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableMapValue(writer, map);
                        Unit unit = Unit.INSTANCE;
                        break;
                    case 6:
                        ReadableArray array = value.getArray(nextKey);
                        if (array == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        readableArrayValue(writer, array);
                        Unit unit2 = Unit.INSTANCE;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            writer.endObject();
        } catch (Throwable th) {
            writer.endObject();
            throw th;
        }
    }

    @JvmStatic
    public static final void value(@NotNull JsonWriter writer, @Nullable Object value) throws IOException {
        writer.getClass();
        if (value instanceof Map) {
            INSTANCE.mapValue(writer, (Map) value);
            return;
        }
        if (value instanceof List) {
            INSTANCE.listValue(writer, (List) value);
            return;
        }
        if (value instanceof ReadableMap) {
            INSTANCE.readableMapValue(writer, (ReadableMap) value);
            return;
        }
        if (value instanceof ReadableArray) {
            readableArrayValue(writer, (ReadableArray) value);
        } else if (value instanceof Dynamic) {
            INSTANCE.dynamicValue(writer, (Dynamic) value);
        } else {
            INSTANCE.objectValue(writer, value);
        }
    }
}
