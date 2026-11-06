package com.amazon.alexa.client.core.componentstate;

import com.amazon.alexa.client.core.componentstate.AutoValue_ComponentStateHeader;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ComponentStateHeader {
    public static ComponentStateHeader create(Namespace namespace, Name name) {
        return new AutoValue_ComponentStateHeader(namespace, name);
    }

    public static TypeAdapter<ComponentStateHeader> typeAdapter(Gson gson) {
        return new AutoValue_ComponentStateHeader.GsonTypeAdapter(gson);
    }

    public abstract Name getName();

    public abstract Namespace getNamespace();
}
