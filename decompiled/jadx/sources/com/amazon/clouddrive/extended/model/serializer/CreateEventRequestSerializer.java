package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.CreateEventRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import java.util.Map;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateEventRequestSerializer implements JsonSerializer<CreateEventRequest> {
    public static final JsonSerializer<CreateEventRequest> INSTANCE = new CreateEventRequestSerializer();
    private final CreateEventRequestFieldSerializer mFieldSerializer = new CreateEventRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CreateEventRequestFieldSerializer implements JsonFieldSerializer<CreateEventRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends CreateEventRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("eventType");
            SimpleSerializers.serializeString(u.getEventType(), jsonGenerator);
            jsonGenerator.writeFieldName("parametersMap");
            Map<String, String> parametersMap = u.getParametersMap();
            if (parametersMap == null) {
                jsonGenerator.writeNull();
                return;
            }
            jsonGenerator.writeStartObject();
            for (Map.Entry<String, String> entry : parametersMap.entrySet()) {
                jsonGenerator.writeFieldName(entry.getKey());
                SimpleSerializers.serializeString(entry.getValue(), jsonGenerator);
            }
            jsonGenerator.writeEndObject();
        }
    }

    private CreateEventRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(CreateEventRequest createEventRequest, JsonGenerator jsonGenerator) throws IOException {
        if (createEventRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((CreateEventRequestFieldSerializer) createEventRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
