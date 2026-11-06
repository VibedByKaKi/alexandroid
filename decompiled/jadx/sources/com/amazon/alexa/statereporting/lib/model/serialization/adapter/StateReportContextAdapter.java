package com.amazon.alexa.statereporting.lib.model.serialization.adapter;

import com.amazon.alexa.statereporting.lib.model.api.context.StateReportContext;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Type;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class StateReportContextAdapter<PropertyKey> implements JsonDeserializer<StateReportContext<PropertyKey>> {
    private final Class<? extends StateReportContext> stateReportContextClass;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StateReportContextAdapter(Class<? extends StateReportContext> cls) {
        this.stateReportContextClass = cls;
    }

    @Override // com.google.gson.JsonDeserializer
    public StateReportContext<PropertyKey> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return (StateReportContext) jsonDeserializationContext.deserialize(jsonElement, this.stateReportContextClass);
    }
}
