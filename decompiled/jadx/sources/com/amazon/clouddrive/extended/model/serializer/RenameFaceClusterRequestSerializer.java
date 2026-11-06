package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.RenameFaceClusterRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RenameFaceClusterRequestSerializer implements JsonSerializer<RenameFaceClusterRequest> {
    public static final JsonSerializer<RenameFaceClusterRequest> INSTANCE = new RenameFaceClusterRequestSerializer();
    private final RenameFaceClusterRequestFieldSerializer mFieldSerializer = new RenameFaceClusterRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RenameFaceClusterRequestFieldSerializer implements JsonFieldSerializer<RenameFaceClusterRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends RenameFaceClusterRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getSourceClusterId() != null) {
                jsonGenerator.writeFieldName("sourceCluster");
                SimpleSerializers.serializeString(u.getSourceClusterId(), jsonGenerator);
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
    public void serialize(RenameFaceClusterRequest renameFaceClusterRequest, JsonGenerator jsonGenerator) throws IOException {
        if (renameFaceClusterRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((RenameFaceClusterRequestFieldSerializer) renameFaceClusterRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
