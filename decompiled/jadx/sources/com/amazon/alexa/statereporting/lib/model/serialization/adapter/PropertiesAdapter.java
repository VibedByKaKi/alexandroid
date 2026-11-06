package com.amazon.alexa.statereporting.lib.model.serialization.adapter;

import com.amazon.alexa.statereporting.lib.model.api.discovery.Properties;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Type;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class PropertiesAdapter<PropertyKey> implements JsonDeserializer<Properties<PropertyKey>> {
    private final Class<? extends Properties> propertiesClass;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PropertiesAdapter(Class<? extends Properties> cls) {
        this.propertiesClass = cls;
    }

    @Override // com.google.gson.JsonDeserializer
    public Properties<PropertyKey> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return (Properties) jsonDeserializationContext.deserialize(jsonElement, this.propertiesClass);
    }
}
