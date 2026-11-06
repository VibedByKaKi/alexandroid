package com.amazon.alexa.benefits.models.customAdapters;

import com.amazon.alexa.benefits.api.models.enums.Reasons;
import com.amazon.alexa.benefits.util.LogUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ReasonsListAdapter implements JsonDeserializer {
    private static final String TAG = "com.amazon.alexa.benefits.models.customAdapters.ReasonsListAdapter";

    @Override // com.google.gson.JsonDeserializer
    public Reasons[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Reasons reasons;
        if (!jsonElement.isJsonArray()) {
            return new Reasons[0];
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it2 = asJsonArray.iterator();
        while (it2.hasNext()) {
            try {
                reasons = Reasons.valueOf(it2.next().getAsString());
            } catch (IllegalArgumentException unused) {
                LogUtils.e(TAG, "Received unknown Reasons value, defaulting to OTHER");
                reasons = Reasons.OTHER;
            }
            arrayList.add(reasons);
        }
        return (Reasons[]) arrayList.toArray(new Reasons[0]);
    }
}
