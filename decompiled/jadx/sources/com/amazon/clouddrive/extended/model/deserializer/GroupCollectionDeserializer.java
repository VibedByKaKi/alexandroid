package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.clouddrive.extended.model.GroupCollection;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.SimpleDeserializers;
import com.amazon.clouddrive.model.deserializer.SimpleListDeserializers;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupCollectionDeserializer implements JsonDeserializer<GroupCollection> {
    public static final JsonDeserializer<GroupCollection> INSTANCE = new GroupCollectionDeserializer();
    private final GroupCollectionFieldDeserializer mFieldHandler = new GroupCollectionFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupCollectionFieldDeserializer implements JsonFieldDeserializer<GroupCollection> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends GroupCollection> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if (ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME.equals(str)) {
                u.setKind(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("collectionId".equals(str)) {
                u.setCollectionId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (FragmentMetaData.GROUP_ID.equals(str)) {
                u.setGroupId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY.equals(str)) {
                u.setOwnerId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("caption".equals(str)) {
                u.setCaption(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("name".equals(str)) {
                u.setName(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("dateAdded".equals(str)) {
                u.setDateAdded(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("contentAggregations".equals(str)) {
                u.setContentAggregations(ContentAggregationsDeserializer.INSTANCE.deserialize(jsonParser));
                return true;
            }
            if (!"eventIds".equals(str)) {
                return false;
            }
            u.setEventIds(SimpleListDeserializers.STRING_LIST_DESERIALIZER.deserialize(jsonParser));
            return true;
        }
    }

    private GroupCollectionDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public GroupCollection deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        GroupCollection groupCollection = new GroupCollection();
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
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (String) groupCollection)) {
                jsonParser.skipChildren();
            }
        }
        return groupCollection;
    }
}
