package com.amazon.alexa.hho.navigation.dependency;

import com.amazon.alexa.hho.navigation.payload.CancelNavigationPayload;
import com.amazon.alexa.hho.navigation.payload.SetDestinationPayload;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
final class AutoValueGson_AutoValueAdapterFactory extends AutoValueAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (CancelNavigationPayload.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CancelNavigationPayload.typeAdapter(gson);
        }
        if (SetDestinationPayload.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SetDestinationPayload.typeAdapter(gson);
        }
        if (SetDestinationPayload.Destination.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SetDestinationPayload.Destination.typeAdapter(gson);
        }
        if (SetDestinationPayload.Destination.Coordinate.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SetDestinationPayload.Destination.Coordinate.typeAdapter(gson);
        }
        return null;
    }
}
