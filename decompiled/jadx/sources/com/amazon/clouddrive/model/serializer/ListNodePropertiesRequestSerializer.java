package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.ListNodePropertiesRequest;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNodePropertiesRequestSerializer implements JsonSerializer<ListNodePropertiesRequest> {
    public static final JsonSerializer<ListNodePropertiesRequest> INSTANCE = new ListNodePropertiesRequestSerializer();
    private final ListNodePropertiesRequestFieldSerializer mFieldSerializer = new ListNodePropertiesRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListNodePropertiesRequestFieldSerializer implements JsonFieldSerializer<ListNodePropertiesRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends ListNodePropertiesRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName(MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER);
            SimpleSerializers.serializeString(u.getOwner(), jsonGenerator);
            jsonGenerator.writeFieldName("id");
            SimpleSerializers.serializeString(u.getId(), jsonGenerator);
        }
    }

    private ListNodePropertiesRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(ListNodePropertiesRequest listNodePropertiesRequest, JsonGenerator jsonGenerator) throws IOException {
        if (listNodePropertiesRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((ListNodePropertiesRequestFieldSerializer) listNodePropertiesRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
