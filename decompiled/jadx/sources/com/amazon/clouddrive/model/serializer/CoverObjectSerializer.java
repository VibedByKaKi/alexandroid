package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.CoverObject;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CoverObjectSerializer implements JsonSerializer<CoverObject> {
    public static final JsonSerializer<CoverObject> INSTANCE = new CoverObjectSerializer();

    private CoverObjectSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(CoverObject coverObject, JsonGenerator jsonGenerator) throws IOException {
        if (coverObject == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("id");
        SimpleSerializers.serializeString(coverObject.getId(), jsonGenerator);
        jsonGenerator.writeFieldName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY);
        SimpleSerializers.serializeString(coverObject.getOwnerId(), jsonGenerator);
        jsonGenerator.writeFieldName("tempLink");
        SimpleSerializers.serializeString(coverObject.getTempLink(), jsonGenerator);
        jsonGenerator.writeFieldName("isDefault");
        SimpleSerializers.serializeBoolean(coverObject.isDefault(), jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
