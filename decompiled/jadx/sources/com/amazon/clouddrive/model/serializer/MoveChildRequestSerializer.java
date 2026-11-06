package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.MoveChildRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MoveChildRequestSerializer implements JsonSerializer<MoveChildRequest> {
    public static final JsonSerializer<MoveChildRequest> INSTANCE = new MoveChildRequestSerializer();
    private final MoveChildRequestFieldSerializer mFieldSerializer = new MoveChildRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MoveChildRequestFieldSerializer implements JsonFieldSerializer<MoveChildRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends MoveChildRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("childId");
            SimpleSerializers.serializeString(u.getChildId(), jsonGenerator);
            jsonGenerator.writeFieldName("fromParent");
            SimpleSerializers.serializeString(u.getFromParentId(), jsonGenerator);
            jsonGenerator.writeFieldName("toParent");
            SimpleSerializers.serializeString(u.getToParentId(), jsonGenerator);
        }
    }

    private MoveChildRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(MoveChildRequest moveChildRequest, JsonGenerator jsonGenerator) throws IOException {
        if (moveChildRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((MoveChildRequestFieldSerializer) moveChildRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
