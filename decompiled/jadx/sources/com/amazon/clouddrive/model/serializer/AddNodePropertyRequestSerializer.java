package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.AddNodePropertyRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddNodePropertyRequestSerializer implements JsonSerializer<AddNodePropertyRequest> {
    public static final JsonSerializer<AddNodePropertyRequest> INSTANCE = new AddNodePropertyRequestSerializer();
    private final AddNodePropertyRequestFieldSerializer mFieldSerializer = new AddNodePropertyRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AddNodePropertyRequestFieldSerializer implements JsonFieldSerializer<AddNodePropertyRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends AddNodePropertyRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("value");
            SimpleSerializers.serializeString(u.getValue(), jsonGenerator);
        }
    }

    private AddNodePropertyRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(AddNodePropertyRequest addNodePropertyRequest, JsonGenerator jsonGenerator) throws IOException {
        if (addNodePropertyRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((AddNodePropertyRequestFieldSerializer) addNodePropertyRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
