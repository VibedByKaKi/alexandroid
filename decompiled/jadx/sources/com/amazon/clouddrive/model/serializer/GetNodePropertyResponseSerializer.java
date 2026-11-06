package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetNodePropertyResponse;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetNodePropertyResponseSerializer implements JsonSerializer<GetNodePropertyResponse> {
    public static final JsonSerializer<GetNodePropertyResponse> INSTANCE = new GetNodePropertyResponseSerializer();
    private final GetNodePropertyResponseFieldSerializer mFieldSerializer = new GetNodePropertyResponseFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetNodePropertyResponseFieldSerializer implements JsonFieldSerializer<GetNodePropertyResponse> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetNodePropertyResponse> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("value");
            SimpleSerializers.serializeString(u.getValue(), jsonGenerator);
            jsonGenerator.writeFieldName("key");
            SimpleSerializers.serializeString(u.getKey(), jsonGenerator);
        }
    }

    private GetNodePropertyResponseSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetNodePropertyResponse getNodePropertyResponse, JsonGenerator jsonGenerator) throws IOException {
        if (getNodePropertyResponse == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetNodePropertyResponseFieldSerializer) getNodePropertyResponse, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
