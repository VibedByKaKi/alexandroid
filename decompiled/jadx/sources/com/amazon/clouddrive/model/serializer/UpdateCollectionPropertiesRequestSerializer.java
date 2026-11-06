package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.UpdateCollectionPropertiesRequest;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UpdateCollectionPropertiesRequestSerializer implements JsonSerializer<UpdateCollectionPropertiesRequest> {
    public static final JsonSerializer<UpdateCollectionPropertiesRequest> INSTANCE = new UpdateCollectionPropertiesRequestSerializer();

    private UpdateCollectionPropertiesRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(UpdateCollectionPropertiesRequest updateCollectionPropertiesRequest, JsonGenerator jsonGenerator) throws IOException {
        if (updateCollectionPropertiesRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("id");
        SimpleSerializers.serializeString(updateCollectionPropertiesRequest.getId(), jsonGenerator);
        jsonGenerator.writeFieldName("operations");
        CollectionPropertiesUpdateObjectListSerializer.INSTANCE.serialize(updateCollectionPropertiesRequest.getOperations(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
