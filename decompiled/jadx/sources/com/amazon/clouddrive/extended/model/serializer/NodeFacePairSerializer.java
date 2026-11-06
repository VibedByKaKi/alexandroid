package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.NodeFacePair;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeFacePairSerializer implements JsonSerializer<NodeFacePair> {
    public static final JsonSerializer<NodeFacePair> INSTANCE = new NodeFacePairSerializer();
    private final NodeFacePairFieldSerializer mFieldSerializer = new NodeFacePairFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NodeFacePairFieldSerializer implements JsonFieldSerializer<NodeFacePair> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends NodeFacePair> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("faceId");
            SimpleSerializers.serializeString(u.getFaceId(), jsonGenerator);
            jsonGenerator.writeFieldName(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID);
            SimpleSerializers.serializeString(u.getNodeId(), jsonGenerator);
        }
    }

    private NodeFacePairSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(NodeFacePair nodeFacePair, JsonGenerator jsonGenerator) throws IOException {
        if (nodeFacePair == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((NodeFacePairFieldSerializer) nodeFacePair, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
