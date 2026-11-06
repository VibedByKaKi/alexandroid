package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.MoveNodeToTrashRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MoveNodeToTrashRequestSerializer implements JsonSerializer<MoveNodeToTrashRequest> {
    public static final JsonSerializer<MoveNodeToTrashRequest> INSTANCE = new MoveNodeToTrashRequestSerializer();
    private final MoveNodeToTrashRequestFieldSerializer mFieldSerializer = new MoveNodeToTrashRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MoveNodeToTrashRequestFieldSerializer implements JsonFieldSerializer<MoveNodeToTrashRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends MoveNodeToTrashRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getDedupeContext() == null || u.getDedupeContext().length() <= 0) {
                return;
            }
            jsonGenerator.writeFieldName("dedupeContext");
            SimpleSerializers.serializeString(u.getDedupeContext(), jsonGenerator);
        }
    }

    private MoveNodeToTrashRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(MoveNodeToTrashRequest moveNodeToTrashRequest, JsonGenerator jsonGenerator) throws IOException {
        if (moveNodeToTrashRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((MoveNodeToTrashRequestFieldSerializer) moveNodeToTrashRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
