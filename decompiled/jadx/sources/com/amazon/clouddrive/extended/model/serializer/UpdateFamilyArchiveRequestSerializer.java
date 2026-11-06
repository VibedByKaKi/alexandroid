package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.UpdateFamilyArchiveRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleListSerializers;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateFamilyArchiveRequestSerializer implements JsonSerializer<UpdateFamilyArchiveRequest> {
    public static final JsonSerializer<UpdateFamilyArchiveRequest> INSTANCE = new UpdateFamilyArchiveRequestSerializer();
    private final UpdateFamilyArchiveRequestFieldSerializer mFieldSerializer = new UpdateFamilyArchiveRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UpdateFamilyArchiveRequestFieldSerializer implements JsonFieldSerializer<UpdateFamilyArchiveRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends UpdateFamilyArchiveRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getFamilyId() != null) {
                jsonGenerator.writeFieldName("familyId");
                SimpleSerializers.serializeString(u.getFamilyId(), jsonGenerator);
            }
            jsonGenerator.writeFieldName("nodesToAdd");
            JsonSerializer<List<String>> jsonSerializer = SimpleListSerializers.STRING_LIST_SERIALIZER;
            jsonSerializer.serialize(u.getNodesToAdd(), jsonGenerator);
            jsonGenerator.writeFieldName("nodesToRemove");
            jsonSerializer.serialize(u.getNodesToRemove(), jsonGenerator);
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(UpdateFamilyArchiveRequest updateFamilyArchiveRequest, JsonGenerator jsonGenerator) throws IOException {
        if (updateFamilyArchiveRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((UpdateFamilyArchiveRequestFieldSerializer) updateFamilyArchiveRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
