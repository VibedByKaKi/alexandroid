package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.Invitee;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class InviteeSerializer implements JsonSerializer<Invitee> {
    public static final JsonSerializer<Invitee> INSTANCE = new InviteeSerializer();

    private InviteeSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(Invitee invitee, JsonGenerator jsonGenerator) throws IOException {
        if (invitee == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        if (invitee.getAddress() != null) {
            jsonGenerator.writeFieldName("address");
            InviteAddressSerializer.INSTANCE.serialize(invitee.getAddress(), jsonGenerator);
        }
        if (invitee.getName() != null) {
            jsonGenerator.writeFieldName("name");
            SimpleSerializers.serializeString(invitee.getName(), jsonGenerator);
        }
        if (invitee.getInviteDeliveryType() != null) {
            jsonGenerator.writeFieldName("inviteDeliveryType");
            SimpleSerializers.serializeString(invitee.getInviteDeliveryType(), jsonGenerator);
        }
        jsonGenerator.writeEndObject();
    }
}
