package com.amazon.alexa.sharing.util;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class GsonUtil {
    private GsonUtil() {
    }

    public static boolean getBooleanFromJson(@NonNull JsonObject jsonObject, @NonNull String str, boolean z) {
        return jsonObject.has(str) ? jsonObject.get(str).getAsBoolean() : z;
    }

    public static double getDoubleFromJson(@NonNull JsonObject jsonObject, @NonNull String str, double d) {
        return !jsonObject.has(str) ? d : jsonObject.get(str).getAsDouble();
    }

    public static int getIntFromJson(@NonNull JsonObject jsonObject, @NonNull String str, int i) {
        return !jsonObject.has(str) ? i : jsonObject.get(str).getAsInt();
    }

    public static String getStringFromJson(@NonNull JsonObject jsonObject, @NonNull String str, String str2) {
        return !jsonObject.has(str) ? str2 : jsonObject.get(str).getAsString();
    }
}
