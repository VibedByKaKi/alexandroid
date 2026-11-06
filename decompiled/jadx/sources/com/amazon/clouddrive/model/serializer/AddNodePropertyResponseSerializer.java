package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.AddNodePropertyResponse;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddNodePropertyResponseSerializer implements JsonSerializer<AddNodePropertyResponse> {
    public static final JsonSerializer<AddNodePropertyResponse> INSTANCE = new AddNodePropertyResponseSerializer();
    private final AddNodePropertyResponseFieldSerializer mFieldSerializer = new AddNodePropertyResponseFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AddNodePropertyResponseFieldSerializer implements JsonFieldSerializer<AddNodePropertyResponse> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends AddNodePropertyResponse> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("value");
            SimpleSerializers.serializeString(u.getValue(), jsonGenerator);
            jsonGenerator.writeFieldName("location");
            SimpleSerializers.serializeString(u.getLocation(), jsonGenerator);
            jsonGenerator.writeFieldName("key");
            SimpleSerializers.serializeString(u.getKey(), jsonGenerator);
        }
    }

    private AddNodePropertyResponseSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(AddNodePropertyResponse addNodePropertyResponse, JsonGenerator jsonGenerator) throws IOException {
        if (addNodePropertyResponse == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((AddNodePropertyResponseFieldSerializer) addNodePropertyResponse, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
