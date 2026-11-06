package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.ListChildrenRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListChildrenRequestSerializer implements JsonSerializer<ListChildrenRequest> {
    public static final JsonSerializer<ListChildrenRequest> INSTANCE = new ListChildrenRequestSerializer();
    private final ListChildrenRequestFieldSerializer mFieldSerializer = new ListChildrenRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListChildrenRequestFieldSerializer implements JsonFieldSerializer<ListChildrenRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends ListChildrenRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("assetMapping");
            SimpleSerializers.serializeString(u.getAssetMapping(), jsonGenerator);
            jsonGenerator.writeFieldName("id");
            SimpleSerializers.serializeString(u.getId(), jsonGenerator);
            jsonGenerator.writeFieldName("tempLink");
            SimpleSerializers.serializeBoolean(u.getTempLink(), jsonGenerator);
        }
    }

    private ListChildrenRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(ListChildrenRequest listChildrenRequest, JsonGenerator jsonGenerator) throws IOException {
        if (listChildrenRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((ListChildrenRequestFieldSerializer) listChildrenRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
