package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetNodeRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetNodeRequestSerializer implements JsonSerializer<GetNodeRequest> {
    public static final JsonSerializer<GetNodeRequest> INSTANCE = new GetNodeRequestSerializer();
    private final GetNodeRequestFieldSerializer mFieldSerializer = new GetNodeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetNodeRequestFieldSerializer implements JsonFieldSerializer<GetNodeRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetNodeRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("id");
            SimpleSerializers.serializeString(u.getId(), jsonGenerator);
            jsonGenerator.writeFieldName("fields");
            SimpleSerializers.serializeString(u.getFields(), jsonGenerator);
            jsonGenerator.writeFieldName("assetMapping");
            SimpleSerializers.serializeString(u.getAssetMapping(), jsonGenerator);
            jsonGenerator.writeFieldName("tempLink");
            SimpleSerializers.serializeBoolean(u.getTempLink(), jsonGenerator);
        }
    }

    private GetNodeRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetNodeRequest getNodeRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getNodeRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetNodeRequestFieldSerializer) getNodeRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
