package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.MediaTypeUsage;
import java.io.IOException;
import java.util.Map;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaTypeUsageMapSerializer implements JsonSerializer<Map<String, MediaTypeUsage>> {
    public static final JsonSerializer<Map<String, MediaTypeUsage>> INSTANCE = new MediaTypeUsageMapSerializer();

    private MediaTypeUsageMapSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(Map<String, MediaTypeUsage> map, JsonGenerator jsonGenerator) throws IOException {
        if (map == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        for (Map.Entry<String, MediaTypeUsage> entry : map.entrySet()) {
            jsonGenerator.writeFieldName(entry.getKey());
            MediaTypeUsageSerializer.INSTANCE.serialize(entry.getValue(), jsonGenerator);
        }
        jsonGenerator.writeEndObject();
    }
}
