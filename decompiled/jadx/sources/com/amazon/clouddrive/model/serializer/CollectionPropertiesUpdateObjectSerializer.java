package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.CollectionPropertiesUpdateObject;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionPropertiesUpdateObjectSerializer implements JsonSerializer<CollectionPropertiesUpdateObject> {
    public static final JsonSerializer<CollectionPropertiesUpdateObject> INSTANCE = new CollectionPropertiesUpdateObjectSerializer();

    private CollectionPropertiesUpdateObjectSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(CollectionPropertiesUpdateObject collectionPropertiesUpdateObject, JsonGenerator jsonGenerator) throws IOException {
        if (collectionPropertiesUpdateObject == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("collectionProperties");
        CollectionPropertiesSerializer.INSTANCE.serialize(collectionPropertiesUpdateObject.getCollectionProperties(), jsonGenerator);
        jsonGenerator.writeFieldName("op");
        SimpleSerializers.serializeString(collectionPropertiesUpdateObject.getOp(), jsonGenerator);
        jsonGenerator.writeFieldName("path");
        SimpleSerializers.serializeString(collectionPropertiesUpdateObject.getPath(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
