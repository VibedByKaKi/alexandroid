package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.BaseBatchNodeRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleListSerializers;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BatchNodeRequestSerializer implements JsonSerializer<BaseBatchNodeRequest> {
    public static final JsonSerializer<BaseBatchNodeRequest> INSTANCE = new BatchNodeRequestSerializer();
    private final BatchNodeRequestFieldSerializer mFieldSerializer = new BatchNodeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BatchNodeRequestFieldSerializer implements JsonFieldSerializer<BaseBatchNodeRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends BaseBatchNodeRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getNodeIds() != null) {
                jsonGenerator.writeFieldName("nodeIds");
                SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getNodeIds(), jsonGenerator);
            }
            if (u.getGroupIds() != null) {
                jsonGenerator.writeFieldName("groupIds");
                SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getGroupIds(), jsonGenerator);
            }
            if (u.getEventKey() != null) {
                jsonGenerator.writeFieldName("eventKey");
                SimpleSerializers.serializeString(u.getEventKey(), jsonGenerator);
            }
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(BaseBatchNodeRequest baseBatchNodeRequest, JsonGenerator jsonGenerator) throws IOException {
        if (baseBatchNodeRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((BatchNodeRequestFieldSerializer) baseBatchNodeRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
