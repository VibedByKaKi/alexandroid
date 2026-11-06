package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetChangesRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetChangesRequestSerializer implements JsonSerializer<GetChangesRequest> {
    public static final JsonSerializer<GetChangesRequest> INSTANCE = new GetChangesRequestSerializer();
    private final GetChangesRequestFieldSerializer mFieldSerializer = new GetChangesRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetChangesRequestFieldSerializer implements JsonFieldSerializer<GetChangesRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetChangesRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("includePurged");
            SimpleSerializers.serializeString(u.getIncludePurged(), jsonGenerator);
            jsonGenerator.writeFieldName("chunkSize");
            SimpleSerializers.serializeInteger(u.getChunkSize(), jsonGenerator);
            jsonGenerator.writeFieldName("checkpoint");
            SimpleSerializers.serializeString(u.getCheckpoint(), jsonGenerator);
            jsonGenerator.writeFieldName("maxNodes");
            SimpleSerializers.serializeInteger(u.getMaxNodes(), jsonGenerator);
            String num = u.getLimit() != null ? u.getLimit().toString() : null;
            jsonGenerator.writeFieldName("limit");
            SimpleSerializers.serializeString(num, jsonGenerator);
        }
    }

    private GetChangesRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetChangesRequest getChangesRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getChangesRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetChangesRequestFieldSerializer) getChangesRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
