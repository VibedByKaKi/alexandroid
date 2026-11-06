package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.MediaTypeUsage;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaTypeUsageSerializer implements JsonSerializer<MediaTypeUsage> {
    public static final JsonSerializer<MediaTypeUsage> INSTANCE = new MediaTypeUsageSerializer();

    private MediaTypeUsageSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(MediaTypeUsage mediaTypeUsage, JsonGenerator jsonGenerator) throws IOException {
        if (mediaTypeUsage == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("lastUploadedTime");
        SimpleSerializers.serializeString(mediaTypeUsage.getLastUploadedTime(), jsonGenerator);
        jsonGenerator.writeFieldName("count");
        SimpleSerializers.serializePrimitiveLong(mediaTypeUsage.getCount(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
