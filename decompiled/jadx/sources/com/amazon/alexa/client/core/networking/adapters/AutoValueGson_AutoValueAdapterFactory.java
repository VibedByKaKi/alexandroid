package com.amazon.alexa.client.core.networking.adapters;

import com.amazon.alexa.client.core.componentstate.ComponentStateHeader;
import com.amazon.alexa.client.core.messages.CorrelationToken;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.core.messages.PackageName;
import com.amazon.alexa.client.core.messages.PayloadVersion;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValueGson_AutoValueAdapterFactory extends AutoValueAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (ComponentStateHeader.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ComponentStateHeader.typeAdapter(gson);
        }
        if (CorrelationToken.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) CorrelationToken.getTypeAdapter();
        }
        if (DialogRequestIdentifier.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) DialogRequestIdentifier.getTypeAdapter();
        }
        if (Name.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Name.getTypeAdapter();
        }
        if (Namespace.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Namespace.getTypeAdapter();
        }
        if (PackageName.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PackageName.getTypeAdapter();
        }
        if (PayloadVersion.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PayloadVersion.getTypeAdapter();
        }
        return null;
    }
}
