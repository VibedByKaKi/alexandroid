package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetNodePropertyRequest;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetNodePropertyRequestSerializer implements JsonSerializer<GetNodePropertyRequest> {
    public static final JsonSerializer<GetNodePropertyRequest> INSTANCE = new GetNodePropertyRequestSerializer();
    private final GetNodePropertyRequestFieldSerializer mFieldSerializer = new GetNodePropertyRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetNodePropertyRequestFieldSerializer implements JsonFieldSerializer<GetNodePropertyRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetNodePropertyRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("key");
            SimpleSerializers.serializeString(u.getKey(), jsonGenerator);
            jsonGenerator.writeFieldName("id");
            SimpleSerializers.serializeString(u.getId(), jsonGenerator);
            jsonGenerator.writeFieldName(MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER);
            SimpleSerializers.serializeString(u.getOwner(), jsonGenerator);
        }
    }

    private GetNodePropertyRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetNodePropertyRequest getNodePropertyRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getNodePropertyRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetNodePropertyRequestFieldSerializer) getNodePropertyRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
