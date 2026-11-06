package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.BulkAddRemoveRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.NodeIdListSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class BulkAddRemoveRequestFieldSerializer implements JsonFieldSerializer<BulkAddRemoveRequest> {
    @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
    public <U extends BulkAddRemoveRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeFieldName("value");
        NodeIdListSerializer.INSTANCE.serialize(u.getNodeIds(), jsonGenerator);
        jsonGenerator.writeFieldName("op");
        SimpleSerializers.serializeString(u.getOp(), jsonGenerator);
        jsonGenerator.writeFieldName("resourceVersion");
        SimpleSerializers.serializeString(u.getResourceVersion(), jsonGenerator);
    }
}
