package com.amazon.clouddrive.model.serializer;

import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.clouddrive.model.RemoveChildFromParentRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemoveChildRequestSerializer implements JsonSerializer<RemoveChildFromParentRequest> {
    public static final JsonSerializer<RemoveChildFromParentRequest> INSTANCE = new RemoveChildRequestSerializer();
    private final RemoveChildRequestFieldSerializer mFieldSerializer = new RemoveChildRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RemoveChildRequestFieldSerializer implements JsonFieldSerializer<RemoveChildFromParentRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends RemoveChildFromParentRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName(Message.SERIALIZED_NAME_PARENT_ID);
            SimpleSerializers.serializeString(u.getParentId(), jsonGenerator);
            jsonGenerator.writeFieldName("childId");
            SimpleSerializers.serializeString(u.getChildId(), jsonGenerator);
        }
    }

    private RemoveChildRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(RemoveChildFromParentRequest removeChildFromParentRequest, JsonGenerator jsonGenerator) throws IOException {
        if (removeChildFromParentRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((RemoveChildRequestFieldSerializer) removeChildFromParentRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
