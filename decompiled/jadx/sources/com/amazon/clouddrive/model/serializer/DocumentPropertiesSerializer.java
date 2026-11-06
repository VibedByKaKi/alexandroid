package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.DocumentProperties;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DocumentPropertiesSerializer implements JsonSerializer<DocumentProperties> {
    public static final JsonSerializer<DocumentProperties> INSTANCE = new DocumentPropertiesSerializer();
    private final DocumentPropertiesFieldSerializer mFieldSerializer = new DocumentPropertiesFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DocumentPropertiesFieldSerializer implements JsonFieldSerializer<DocumentProperties> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends DocumentProperties> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("title");
            SimpleSerializers.serializeString(u.getTitle(), jsonGenerator);
            jsonGenerator.writeFieldName("authors");
            AuthorListSerializer.INSTANCE.serialize(u.getAuthors(), jsonGenerator);
            jsonGenerator.writeFieldName("documentVersion");
            SimpleSerializers.serializeString(u.getDocumentVersion(), jsonGenerator);
        }
    }

    private DocumentPropertiesSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(DocumentProperties documentProperties, JsonGenerator jsonGenerator) throws IOException {
        if (documentProperties == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((DocumentPropertiesFieldSerializer) documentProperties, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
