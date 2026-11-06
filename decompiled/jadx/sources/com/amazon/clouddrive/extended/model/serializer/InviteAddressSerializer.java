package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.InviteAddress;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class InviteAddressSerializer implements JsonSerializer<InviteAddress> {
    public static final JsonSerializer<InviteAddress> INSTANCE = new InviteAddressSerializer();

    private InviteAddressSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(InviteAddress inviteAddress, JsonGenerator jsonGenerator) throws IOException {
        if (inviteAddress == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        if (inviteAddress.getType() != null) {
            jsonGenerator.writeFieldName("type");
            SimpleSerializers.serializeString(inviteAddress.getType().name(), jsonGenerator);
        }
        if (inviteAddress.getTarget() != null) {
            jsonGenerator.writeFieldName("target");
            SimpleSerializers.serializeString(inviteAddress.getTarget(), jsonGenerator);
        }
        jsonGenerator.writeEndObject();
    }
}
