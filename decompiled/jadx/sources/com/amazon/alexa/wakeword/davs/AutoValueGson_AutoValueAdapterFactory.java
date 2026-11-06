package com.amazon.alexa.wakeword.davs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValueGson_AutoValueAdapterFactory extends AutoValueAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (ArtifactManifest.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ArtifactManifest.typeAdapter(gson);
        }
        if (ArtifactRequest.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ArtifactRequest.typeAdapter(gson);
        }
        if (Checksum.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Checksum.typeAdapter(gson);
        }
        return null;
    }
}
