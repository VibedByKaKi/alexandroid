package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.GroupCoverPhoto;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.SimpleDeserializers;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupCoverPhotoDeserializer implements JsonDeserializer<GroupCoverPhoto> {
    public static final JsonDeserializer<GroupCoverPhoto> INSTANCE = new GroupCoverPhotoDeserializer();
    private final GroupCoverPhotoFieldDeserializer mFieldHandler = new GroupCoverPhotoFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupCoverPhotoFieldDeserializer implements JsonFieldDeserializer<GroupCoverPhoto> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends GroupCoverPhoto> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if (AlexaDeviceBackgroundImageBridge.KEY_NODE_ID.equals(str)) {
                u.setNodeId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY.equals(str)) {
                u.setOwnerId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("cropBox".equals(str)) {
                u.setCropBox(CropBoxDeserializer.INSTANCE.deserialize(jsonParser));
                return true;
            }
            if (!"url".equals(str)) {
                return false;
            }
            u.setUrl(SimpleDeserializers.deserializeString(jsonParser));
            return true;
        }
    }

    private GroupCoverPhotoDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public GroupCoverPhoto deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        GroupCoverPhoto groupCoverPhoto = new GroupCoverPhoto();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken() != JsonToken.FIELD_NAME) {
                XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected field name, got ", currentToken), jsonParser.getTokenLocation());
                return null;
            }
            String currentName = jsonParser.getCurrentName();
            if (jsonParser.nextToken() == null) {
                XML$$ExternalSyntheticBUOutline0.m("Unexpected end of input", jsonParser.getTokenLocation());
                return null;
            }
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (String) groupCoverPhoto)) {
                jsonParser.skipChildren();
            }
        }
        return groupCoverPhoto;
    }
}
