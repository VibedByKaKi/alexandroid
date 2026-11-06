package com.amazon.alexa.smarthomecameras.util;

import com.google.gson.Gson;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class GsonHelper {
    private static final Gson gson = new Gson();

    private GsonHelper() {
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) gson.fromJson(str, (Class) cls);
    }

    public static <T> String toJson(T t) {
        return gson.toJson(t);
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) gson.fromJson(str, type);
    }
}
