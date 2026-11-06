package com.amazon.alexa.voice.tta.dependencies;

import com.amazon.alexa.voice.tta.suggestions.SimbaResponse;
import com.amazon.alexa.voice.tta.suggestions.SimbaSuggestionQuery;
import com.amazon.alexa.voice.tta.suggestions.TtaSuggestionItem;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AutoValueGson_AutoValueAdapterFactory extends AutoValueAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (SimbaResponse.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SimbaResponse.typeAdapter(gson);
        }
        if (SimbaSuggestionQuery.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SimbaSuggestionQuery.typeAdapter(gson);
        }
        if (TtaSuggestionItem.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TtaSuggestionItem.typeAdapter(gson);
        }
        return null;
    }
}
