package com.amazon.alexa.ra.core.data.utils;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00030\b¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"kotlinxAwareGson", "Lcom/google/gson/Gson;", "toObject", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "", "(Ljava/lang/String;)Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class JsonUtilsKt {

    @NotNull
    private static final Gson kotlinxAwareGson;

    static {
        Gson create = new GsonBuilder().registerTypeHierarchyAdapter(JsonElement.class, new JsonSerializer<JsonElement>() { // from class: com.amazon.alexa.ra.core.data.utils.JsonUtilsKt$kotlinxAwareGson$1
            @Override // com.google.gson.JsonSerializer
            public com.google.gson.JsonElement serialize(JsonElement src, Type typeOfSrc, JsonSerializationContext context) {
                src.getClass();
                typeOfSrc.getClass();
                context.getClass();
                com.google.gson.JsonElement parseString = JsonParser.parseString(src.toString());
                parseString.getClass();
                return parseString;
            }
        }).registerTypeHierarchyAdapter(JsonElement.class, new JsonDeserializer<JsonElement>() { // from class: com.amazon.alexa.ra.core.data.utils.JsonUtilsKt$kotlinxAwareGson$2
            @Override // com.google.gson.JsonDeserializer
            public JsonElement deserialize(com.google.gson.JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                json.getClass();
                typeOfT.getClass();
                context.getClass();
                Json.Companion companion = Json.INSTANCE;
                String jsonElement = json.toString();
                jsonElement.getClass();
                return companion.parseToJsonElement(jsonElement);
            }
        }).create();
        create.getClass();
        kotlinxAwareGson = create;
    }

    @NotNull
    public static final <T extends JSONConvertible> T toObject(@NotNull String str, @NotNull Class<T> cls) {
        str.getClass();
        cls.getClass();
        Object fromJson = kotlinxAwareGson.fromJson(str, (Class<Object>) cls);
        fromJson.getClass();
        return (T) fromJson;
    }

    public static final /* synthetic */ <T extends JSONConvertible> T toObject(String str) {
        str.getClass();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) toObject(str, JSONConvertible.class);
    }
}
