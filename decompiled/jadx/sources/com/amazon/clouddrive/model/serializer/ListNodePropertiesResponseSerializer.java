package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.ListNodePropertiesResponse;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListNodePropertiesResponseSerializer implements JsonSerializer<ListNodePropertiesResponse> {
    public static final JsonSerializer<ListNodePropertiesResponse> INSTANCE = new ListNodePropertiesResponseSerializer();
    private final ListNodePropertiesResponseFieldSerializer mFieldSerializer = new ListNodePropertiesResponseFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListNodePropertiesResponseFieldSerializer implements JsonFieldSerializer<ListNodePropertiesResponse> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends ListNodePropertiesResponse> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("data");
            PropertyMapSerializer.INSTANCE.serialize(u.getData(), jsonGenerator);
            jsonGenerator.writeFieldName("count");
            SimpleSerializers.serializePrimitiveLong(u.getCount(), jsonGenerator);
        }
    }

    private ListNodePropertiesResponseSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(ListNodePropertiesResponse listNodePropertiesResponse, JsonGenerator jsonGenerator) throws IOException {
        if (listNodePropertiesResponse == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((ListNodePropertiesResponseFieldSerializer) listNodePropertiesResponse, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
