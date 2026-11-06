package com.amazon.clouddrive.model.deserializer;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.clouddrive.model.CloudDriveGrant;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CloudDriveGrantDeserializer implements JsonDeserializer<CloudDriveGrant> {
    public static final JsonDeserializer<CloudDriveGrant> INSTANCE = new CloudDriveGrantDeserializer();
    private final CloudDriveGrantFieldDeserializer mFieldHandler = new CloudDriveGrantFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CloudDriveGrantFieldDeserializer implements JsonFieldDeserializer<CloudDriveGrant> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends CloudDriveGrant> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if ("grantStorage".equals(str)) {
                u.setGrantStorage(SimpleDeserializers.deserializePrimitiveLong(jsonParser));
                return true;
            }
            if ("grantId".equals(str)) {
                u.setGrantId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("isStackable".equals(str)) {
                u.setStackable(SimpleDeserializers.deserializeBoolean(jsonParser).booleanValue());
                return true;
            }
            if (!FragmentMetaData.EXPIRATION.equals(str)) {
                return false;
            }
            u.setExpiration(SimpleDeserializers.deserializeString(jsonParser));
            return true;
        }
    }

    private CloudDriveGrantDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public CloudDriveGrant deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        CloudDriveGrant cloudDriveGrant = new CloudDriveGrant();
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
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (String) cloudDriveGrant)) {
                jsonParser.skipChildren();
            }
        }
        return cloudDriveGrant;
    }
}
