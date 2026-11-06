package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.CreateFaceClusterRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleListSerializers;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateFaceClusterRequestSerializer implements JsonSerializer<CreateFaceClusterRequest> {
    public static final JsonSerializer<CreateFaceClusterRequest> INSTANCE = new CreateFaceClusterRequestSerializer();
    private final CreateFaceClusterRequestFieldSerializer mFieldSerializer = new CreateFaceClusterRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CreateFaceClusterRequestFieldSerializer implements JsonFieldSerializer<CreateFaceClusterRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends CreateFaceClusterRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getClusterIdList() != null) {
                jsonGenerator.writeFieldName("clusterIds");
                SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getClusterIdList(), jsonGenerator);
            }
            if (u.getNewName() != null) {
                jsonGenerator.writeFieldName("newName");
                SimpleSerializers.serializeString(u.getNewName(), jsonGenerator);
            }
            if (u.getContext() != null) {
                jsonGenerator.writeFieldName("context");
                SimpleSerializers.serializeString(u.getContext(), jsonGenerator);
            }
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(CreateFaceClusterRequest createFaceClusterRequest, JsonGenerator jsonGenerator) throws IOException {
        if (createFaceClusterRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((CreateFaceClusterRequestFieldSerializer) createFaceClusterRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
