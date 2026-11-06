package com.amazon.alexa.shortcuts.shortcutscapabilityagent.dependency;

import com.amazon.alexa.shortcuts.shortcutscapabilityagent.model.Connection;
import com.amazon.alexa.shortcuts.shortcutscapabilityagent.model.DeviceInfo;
import com.amazon.alexa.shortcuts.shortcutscapabilityagent.model.IOComponent;
import com.amazon.alexa.shortcuts.shortcutscapabilityagent.model.IOComponentState;
import com.amazon.alexa.shortcuts.shortcutscapabilityagent.model.ShortcutInitiatedEventPayload;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AutoValueGson_AutoValueAdapterFactory extends AutoValueAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Connection.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Connection.typeAdapter(gson);
        }
        if (DeviceInfo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) DeviceInfo.typeAdapter(gson);
        }
        if (IOComponent.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) IOComponent.typeAdapter(gson);
        }
        if (IOComponentState.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) IOComponentState.typeAdapter(gson);
        }
        if (ShortcutInitiatedEventPayload.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ShortcutInitiatedEventPayload.typeAdapter(gson);
        }
        return null;
    }
}
