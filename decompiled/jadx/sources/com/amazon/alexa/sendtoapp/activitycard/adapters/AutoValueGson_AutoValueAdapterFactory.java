package com.amazon.alexa.sendtoapp.activitycard.adapters;

import com.amazon.alexa.sendtoapp.activitycard.model.Card;
import com.amazon.alexa.sendtoapp.activitycard.model.P13NMetadata;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.Actions;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.CustomData;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.Icon;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.LaunchConfig;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.Target;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AutoValueGson_AutoValueAdapterFactory extends AutoValueAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Actions.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Actions.typeAdapter(gson);
        }
        if (Card.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Card.typeAdapter(gson);
        }
        if (CustomData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CustomData.typeAdapter(gson);
        }
        if (Icon.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Icon.typeAdapter(gson);
        }
        if (LaunchConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LaunchConfig.typeAdapter(gson);
        }
        if (P13NMetadata.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) P13NMetadata.typeAdapter(gson);
        }
        if (Target.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Target.typeAdapter(gson);
        }
        return null;
    }
}
