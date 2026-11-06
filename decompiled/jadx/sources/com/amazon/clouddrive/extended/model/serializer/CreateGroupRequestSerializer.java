package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.CreateGroupRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateGroupRequestSerializer implements JsonSerializer<CreateGroupRequest> {
    public static final JsonSerializer<CreateGroupRequest> INSTANCE = new CreateGroupRequestSerializer();
    private final CreateGroupRequestFieldSerializer mFieldSerializer = new CreateGroupRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CreateGroupRequestFieldSerializer implements JsonFieldSerializer<CreateGroupRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends CreateGroupRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getName() != null) {
                jsonGenerator.writeFieldName("name");
                SimpleSerializers.serializeString(u.getName(), jsonGenerator);
            }
            if (u.getDescription() != null) {
                jsonGenerator.writeFieldName("description");
                SimpleSerializers.serializeString(u.getDescription(), jsonGenerator);
            }
            if (u.getLang() != null) {
                jsonGenerator.writeFieldName("lang");
                SimpleSerializers.serializeString(u.getLang(), jsonGenerator);
            }
            if (u.getKind() != null) {
                jsonGenerator.writeFieldName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME);
                SimpleSerializers.serializeString(u.getKind(), jsonGenerator);
            }
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(CreateGroupRequest createGroupRequest, JsonGenerator jsonGenerator) throws IOException {
        if (createGroupRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((CreateGroupRequestFieldSerializer) createGroupRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
