package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.model.DeleteNodePropertyRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PurgePropertyRequestSerializer implements JsonSerializer<DeleteNodePropertyRequest> {
    public static final JsonSerializer<DeleteNodePropertyRequest> INSTANCE = new PurgePropertyRequestSerializer();
    private final PurgePropertyRequestFieldSerializer mFieldSerializer = new PurgePropertyRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PurgePropertyRequestFieldSerializer implements JsonFieldSerializer<DeleteNodePropertyRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends DeleteNodePropertyRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("key");
            SimpleSerializers.serializeString(u.getKey(), jsonGenerator);
            jsonGenerator.writeFieldName("id");
            SimpleSerializers.serializeString(u.getId(), jsonGenerator);
            jsonGenerator.writeFieldName(MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER);
            SimpleSerializers.serializeString(u.getOwner(), jsonGenerator);
        }
    }

    private PurgePropertyRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(DeleteNodePropertyRequest deleteNodePropertyRequest, JsonGenerator jsonGenerator) throws IOException {
        if (deleteNodePropertyRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((PurgePropertyRequestFieldSerializer) deleteNodePropertyRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
