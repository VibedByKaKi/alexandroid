package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.NodeFacePair;
import com.amazon.clouddrive.extended.model.RemoveFacesFromPersonRequest;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RemoveFacesFromPersonRequestSerializer implements JsonSerializer<RemoveFacesFromPersonRequest> {
    public static final JsonSerializer<RemoveFacesFromPersonRequest> INSTANCE = new RemoveFacesFromPersonRequestSerializer();

    private RemoveFacesFromPersonRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(RemoveFacesFromPersonRequest removeFacesFromPersonRequest, JsonGenerator jsonGenerator) throws IOException {
        if (removeFacesFromPersonRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        List<NodeFacePair> faces = removeFacesFromPersonRequest.getFaces();
        if (faces == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("faceList");
        jsonGenerator.writeStartArray();
        Iterator<NodeFacePair> it2 = faces.iterator();
        while (it2.hasNext()) {
            NodeFacePairSerializer.INSTANCE.serialize(it2.next(), jsonGenerator);
        }
        jsonGenerator.writeEndArray();
        jsonGenerator.writeEndObject();
    }
}
