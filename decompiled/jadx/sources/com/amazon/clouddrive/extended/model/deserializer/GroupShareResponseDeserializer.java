package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.GroupShareResponse;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.SimpleDeserializers;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupShareResponseDeserializer extends AbstractDeserializer<GroupShareResponse, GroupShareResponse> {
    public static final JsonDeserializer<GroupShareResponse> INSTANCE = new GroupShareResponseDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupShareResponseFieldDeserializer implements JsonFieldDeserializer<GroupShareResponse> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends GroupShareResponse> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if (str.equals("shareUrl")) {
                u.setShareUrl(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (str.equals("shareToken")) {
                u.setShareToken(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (!str.equals("inviteUrl")) {
                return false;
            }
            u.setInviteUrl(SimpleDeserializers.deserializeString(jsonParser));
            return true;
        }
    }

    private GroupShareResponseDeserializer() {
        super(new GroupShareResponseFieldDeserializer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.deserializer.AbstractDeserializer
    public GroupShareResponse createValue() {
        return new GroupShareResponse();
    }
}
