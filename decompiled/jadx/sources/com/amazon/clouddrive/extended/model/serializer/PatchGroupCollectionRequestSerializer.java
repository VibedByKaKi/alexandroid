package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.PatchGroupCollectionRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PatchGroupCollectionRequestSerializer implements JsonSerializer<PatchGroupCollectionRequest> {
    public static final JsonSerializer<PatchGroupCollectionRequest> INSTANCE = new PatchGroupCollectionRequestSerializer();
    private final PatchGroupCollectionRequestFieldSerializer mFieldSerializer = new PatchGroupCollectionRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PatchGroupCollectionRequestFieldSerializer implements JsonFieldSerializer<PatchGroupCollectionRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends PatchGroupCollectionRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getName() != null) {
                jsonGenerator.writeFieldName("name");
                SimpleSerializers.serializeString(u.getName(), jsonGenerator);
            }
            if (u.getCaption() != null) {
                jsonGenerator.writeFieldName("caption");
                SimpleSerializers.serializeString(u.getCaption(), jsonGenerator);
            }
            if (u.getLang() != null) {
                jsonGenerator.writeFieldName("lang");
                SimpleSerializers.serializeString(u.getLang(), jsonGenerator);
            }
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(PatchGroupCollectionRequest patchGroupCollectionRequest, JsonGenerator jsonGenerator) throws IOException {
        if (patchGroupCollectionRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((PatchGroupCollectionRequestFieldSerializer) patchGroupCollectionRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
