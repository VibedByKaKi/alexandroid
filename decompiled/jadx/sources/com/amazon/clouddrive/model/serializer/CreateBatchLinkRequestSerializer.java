package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.CreateBatchLinkRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateBatchLinkRequestSerializer implements JsonSerializer<CreateBatchLinkRequest> {
    public static final JsonSerializer<CreateBatchLinkRequest> INSTANCE = new CreateBatchLinkRequestSerializer();
    private final BatchNodeRequestFieldSerializer mFieldSerializer = new BatchNodeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BatchNodeRequestFieldSerializer implements JsonFieldSerializer<CreateBatchLinkRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends CreateBatchLinkRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getNodeIds() != null) {
                jsonGenerator.writeFieldName("nodeIds");
                SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getNodeIds(), jsonGenerator);
            }
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(CreateBatchLinkRequest createBatchLinkRequest, JsonGenerator jsonGenerator) throws IOException {
        if (createBatchLinkRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((BatchNodeRequestFieldSerializer) createBatchLinkRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
