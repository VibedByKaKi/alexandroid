package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.UpdateGroupRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateGroupRequestSerializer implements JsonSerializer<UpdateGroupRequest> {
    public static final JsonSerializer<UpdateGroupRequest> INSTANCE = new UpdateGroupRequestSerializer();
    private final UpdateGroupRequestFieldSerializer mFieldSerializer = new UpdateGroupRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UpdateGroupRequestFieldSerializer implements JsonFieldSerializer<UpdateGroupRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends UpdateGroupRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getName() != null) {
                jsonGenerator.writeFieldName("name");
                SimpleSerializers.serializeString(u.getName(), jsonGenerator);
            }
            if (u.getDescription() != null) {
                jsonGenerator.writeFieldName("description");
                SimpleSerializers.serializeString(u.getDescription(), jsonGenerator);
            }
            if (u.getCoverNodeId() != null) {
                jsonGenerator.writeFieldName("coverNodeId");
                SimpleSerializers.serializeString(u.getCoverNodeId(), jsonGenerator);
            }
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(UpdateGroupRequest updateGroupRequest, JsonGenerator jsonGenerator) throws IOException {
        if (updateGroupRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((UpdateGroupRequestFieldSerializer) updateGroupRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
