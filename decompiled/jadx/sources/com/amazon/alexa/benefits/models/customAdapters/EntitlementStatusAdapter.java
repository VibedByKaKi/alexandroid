package com.amazon.alexa.benefits.models.customAdapters;

import com.amazon.alexa.benefits.api.models.enums.EntitlementStatus;
import com.amazon.alexa.benefits.util.LogUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EntitlementStatusAdapter implements JsonDeserializer {
    private static final String TAG = "com.amazon.alexa.benefits.models.customAdapters.EntitlementStatusAdapter";

    @Override // com.google.gson.JsonDeserializer
    public EntitlementStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            return EntitlementStatus.valueOf(jsonElement.getAsString());
        } catch (IllegalArgumentException unused) {
            LogUtils.e(TAG, "Received unknown EntitlementStatus, defaulting to not entitled");
            return EntitlementStatus.NOT_ENTITLED;
        }
    }
}
