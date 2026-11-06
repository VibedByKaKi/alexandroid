package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.GetFacesForPersonRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetFacesForPersonRequestSerializer implements JsonSerializer<GetFacesForPersonRequest> {
    public static final JsonSerializer<GetFacesForPersonRequest> INSTANCE = new GetFacesForPersonRequestSerializer();
    private final GetFacesForPersonRequestFieldSerializer mFieldSerializer = new GetFacesForPersonRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetFacesForPersonRequestFieldSerializer implements JsonFieldSerializer<GetFacesForPersonRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetFacesForPersonRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            List<String> nodeIds = u.getNodeIds();
            if (nodeIds != null) {
                jsonGenerator.writeFieldName("nodeIds");
                jsonGenerator.writeStartArray();
                Iterator<String> it2 = nodeIds.iterator();
                while (it2.hasNext()) {
                    SimpleSerializers.serializeString(it2.next(), jsonGenerator);
                }
                jsonGenerator.writeEndArray();
            }
            if (u.getPersonId() != null) {
                jsonGenerator.writeFieldName("personId");
                SimpleSerializers.serializeString(u.getPersonId(), jsonGenerator);
            }
        }
    }

    private GetFacesForPersonRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(GetFacesForPersonRequest getFacesForPersonRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getFacesForPersonRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetFacesForPersonRequestFieldSerializer) getFacesForPersonRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
