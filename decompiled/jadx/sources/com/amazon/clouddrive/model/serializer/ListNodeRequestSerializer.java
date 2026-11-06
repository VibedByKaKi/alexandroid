package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.ListNodesRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNodeRequestSerializer implements JsonSerializer<ListNodesRequest> {
    public static final JsonSerializer<ListNodesRequest> INSTANCE = new ListNodeRequestSerializer();
    private final ListNodeRequestFieldSerializer mFieldSerializer = new ListNodeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListNodeRequestFieldSerializer implements JsonFieldSerializer<ListNodesRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends ListNodesRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("tempLink");
            SimpleSerializers.serializeBoolean(u.getTempLink(), jsonGenerator);
            jsonGenerator.writeFieldName("assetMapping");
            SimpleSerializers.serializeString(u.getAssetMapping(), jsonGenerator);
            if (u.getDedupeContext() == null || u.getDedupeContext().length() <= 0) {
                return;
            }
            jsonGenerator.writeFieldName("dedupeContext");
            SimpleSerializers.serializeString(u.getDedupeContext(), jsonGenerator);
        }
    }

    private ListNodeRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(ListNodesRequest listNodesRequest, JsonGenerator jsonGenerator) throws IOException {
        if (listNodesRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((ListNodeRequestFieldSerializer) listNodesRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
