package com.amazon.clouddrive.model.serializer;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListSerializer<T> implements JsonSerializer<List<T>> {
    private final JsonSerializer<T> mSerializer;

    public ListSerializer(JsonSerializer<T> jsonSerializer) {
        this.mSerializer = jsonSerializer;
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(List<T> list, JsonGenerator jsonGenerator) throws IOException {
        if (list == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartArray();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            this.mSerializer.serialize(it2.next(), jsonGenerator);
        }
        jsonGenerator.writeEndArray();
    }
}
