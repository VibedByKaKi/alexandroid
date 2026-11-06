package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.RestoreNodeFromTrashRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RestoreNodeFromTrashRequestSerializer implements JsonSerializer<RestoreNodeFromTrashRequest> {
    public static final JsonSerializer<RestoreNodeFromTrashRequest> INSTANCE = new RestoreNodeFromTrashRequestSerializer();
    private final RestoreNodeFromTrashRequestFieldSerializer mFieldSerializer = new RestoreNodeFromTrashRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RestoreNodeFromTrashRequestFieldSerializer implements JsonFieldSerializer<RestoreNodeFromTrashRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends RestoreNodeFromTrashRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("id");
            SimpleSerializers.serializeString(u.getId(), jsonGenerator);
        }
    }

    private RestoreNodeFromTrashRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(RestoreNodeFromTrashRequest restoreNodeFromTrashRequest, JsonGenerator jsonGenerator) throws IOException {
        if (restoreNodeFromTrashRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((RestoreNodeFromTrashRequestFieldSerializer) restoreNodeFromTrashRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
