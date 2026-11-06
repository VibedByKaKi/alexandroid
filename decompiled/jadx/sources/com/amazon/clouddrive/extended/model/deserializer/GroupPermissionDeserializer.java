package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.clouddrive.extended.model.GroupPermission;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.SimpleDeserializers;
import com.amazon.clouddrive.model.deserializer.SimpleListDeserializers;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPermissionDeserializer implements JsonDeserializer<GroupPermission> {
    public static final JsonDeserializer<GroupPermission> INSTANCE = new GroupPermissionDeserializer();
    private final GroupPermissionFieldDeserializer mFieldHandler = new GroupPermissionFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupPermissionFieldDeserializer implements JsonFieldDeserializer<GroupPermission> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends GroupPermission> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if ("lastModifiedTime".equals(str)) {
                u.setLastModifiedTime(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (FragmentMetaData.GROUP_ID.equals(str)) {
                u.setGroupId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (!"albumIds".equals(str)) {
                return false;
            }
            u.setAlbumIds(SimpleListDeserializers.STRING_LIST_DESERIALIZER.deserialize(jsonParser));
            return true;
        }
    }

    private GroupPermissionDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public GroupPermission deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        GroupPermission groupPermission = new GroupPermission();
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
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (String) groupPermission)) {
                jsonParser.skipChildren();
            }
        }
        return groupPermission;
    }
}
