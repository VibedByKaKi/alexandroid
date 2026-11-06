package com.amazon.alexa.client.alexaservice.networking.adapters;

import com.amazon.alexa.client.core.messages.Endpoint;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EndpointAdapter implements JsonDeserializer<Endpoint> {
    private static final String ENDPOINT_ID_KEY = "endpointId";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Endpoint deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("endpointId");
        String asString = (jsonElement2 == null || !jsonElement2.isJsonPrimitive()) ? null : jsonElement2.getAsString();
        if (asString != null) {
            return Endpoint.create(asString);
        }
        return null;
    }
}
