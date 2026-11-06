package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.BulkGetFaceClusterRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleListSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkGetFaceClusterRequestSerializer implements JsonSerializer<BulkGetFaceClusterRequest> {
    public static final JsonSerializer<BulkGetFaceClusterRequest> INSTANCE = new BulkGetFaceClusterRequestSerializer();
    private final BulkFaceClusterRequestFieldSerializer mFieldSerializer = new BulkFaceClusterRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BulkFaceClusterRequestFieldSerializer implements JsonFieldSerializer<BulkGetFaceClusterRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends BulkGetFaceClusterRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("clusterIdList");
            SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getClusterIdList(), jsonGenerator);
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(BulkGetFaceClusterRequest bulkGetFaceClusterRequest, JsonGenerator jsonGenerator) throws IOException {
        if (bulkGetFaceClusterRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((BulkFaceClusterRequestFieldSerializer) bulkGetFaceClusterRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
