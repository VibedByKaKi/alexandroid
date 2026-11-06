package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.clouddrive.extended.model.CreateMemberRequest;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateMemberRequestSerializer implements JsonSerializer<CreateMemberRequest> {
    public static CreateMemberRequestSerializer INSTANCE = new CreateMemberRequestSerializer();

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(CreateMemberRequest createMemberRequest, JsonGenerator jsonGenerator) throws IOException {
        if (createMemberRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        if (createMemberRequest.getGroupId() != null) {
            jsonGenerator.writeStringField(FragmentMetaData.GROUP_ID, createMemberRequest.getGroupId());
        }
        if (createMemberRequest.getShareToken() != null) {
            jsonGenerator.writeStringField("shareToken", createMemberRequest.getShareToken());
        }
        if (createMemberRequest.getInviteToken() != null) {
            jsonGenerator.writeStringField("inviteToken", createMemberRequest.getInviteToken());
        }
        if (createMemberRequest.getInviteTag() != null) {
            jsonGenerator.writeStringField("inviteTag", createMemberRequest.getInviteTag());
        }
        jsonGenerator.writeEndObject();
    }
}
