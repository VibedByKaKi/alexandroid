package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.CropBox;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CropBoxSerializer implements JsonSerializer<CropBox> {
    public static final JsonSerializer<CropBox> INSTANCE = new CropBoxSerializer();

    private CropBoxSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(CropBox cropBox, JsonGenerator jsonGenerator) throws IOException {
        if (cropBox == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        if (cropBox.getOffsetX() >= 0) {
            jsonGenerator.writeFieldName("offsetX");
            SimpleSerializers.serializePrimitiveLong(cropBox.getOffsetX(), jsonGenerator);
        }
        if (cropBox.getOffsetY() >= 0) {
            jsonGenerator.writeFieldName("offsetY");
            SimpleSerializers.serializePrimitiveLong(cropBox.getOffsetY(), jsonGenerator);
        }
        if (cropBox.getCropWidth() > 0) {
            jsonGenerator.writeFieldName("cropWidth");
            SimpleSerializers.serializePrimitiveLong(cropBox.getCropWidth(), jsonGenerator);
        }
        if (cropBox.getCropHeight() > 0) {
            jsonGenerator.writeFieldName("cropHeight");
            SimpleSerializers.serializePrimitiveLong(cropBox.getCropHeight(), jsonGenerator);
        }
        jsonGenerator.writeEndObject();
    }
}
