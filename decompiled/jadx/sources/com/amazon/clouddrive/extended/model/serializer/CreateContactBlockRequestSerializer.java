package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.clouddrive.extended.model.CreateContactBlockRequest;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateContactBlockRequestSerializer implements JsonSerializer<CreateContactBlockRequest> {
    public static CreateContactBlockRequestSerializer INSTANCE = new CreateContactBlockRequestSerializer();

    private CreateContactBlockRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(CreateContactBlockRequest createContactBlockRequest, JsonGenerator jsonGenerator) throws IOException {
        if (createContactBlockRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        if (createContactBlockRequest.getGroupId() != null) {
            jsonGenerator.writeStringField(FragmentMetaData.GROUP_ID, createContactBlockRequest.getGroupId());
        }
        if (createContactBlockRequest.getBlockedCustomerId() != null) {
            jsonGenerator.writeStringField("blockedCustomerId", createContactBlockRequest.getBlockedCustomerId());
        }
        if (createContactBlockRequest.getBlockType() != null) {
            jsonGenerator.writeStringField("blockType", createContactBlockRequest.getBlockType());
        }
        if (createContactBlockRequest.getLang() != null) {
            jsonGenerator.writeStringField("lang", createContactBlockRequest.getLang());
        }
        jsonGenerator.writeEndObject();
    }
}
