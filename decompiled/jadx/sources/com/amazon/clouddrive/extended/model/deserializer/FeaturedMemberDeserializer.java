package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.clouddrive.extended.model.FeaturedMember;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.SimpleDeserializers;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.android.gms.common.Scopes;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FeaturedMemberDeserializer implements JsonDeserializer<FeaturedMember> {
    public static final JsonDeserializer<FeaturedMember> INSTANCE = new FeaturedMemberDeserializer();
    private final FeaturedMemberFieldDeserializer mFieldHandler = new FeaturedMemberFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FeaturedMemberFieldDeserializer implements JsonFieldDeserializer<FeaturedMember> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends FeaturedMember> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if ("createdBy".equals(str)) {
                u.setCreatedBy(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("createdDate".equals(str)) {
                u.setCreatedDate(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (BizMetricsConstants.CUSTOMER_ID.equals(str)) {
                u.setCustomerId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (FragmentMetaData.GROUP_ID.equals(str)) {
                u.setGroupId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("modifiedBy".equals(str)) {
                u.setModifiedBy(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (Message.SERIALIZED_NAME_MODIFIED_DATE.equals(str)) {
                u.setModifiedDate(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("lastViewedDate".equals(str)) {
                u.setLastViewedDate(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("lastViewStatus".equals(str)) {
                u.setLastViewStatus(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (Scopes.PROFILE.equals(str)) {
                u.setProfile(ProfileDeserializer.INSTANCE.deserialize(jsonParser));
                return true;
            }
            if ("role".equals(str)) {
                u.setRole(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (!"version".equals(str)) {
                return false;
            }
            u.setVersion(SimpleDeserializers.deserializePrimitiveLong(jsonParser));
            return true;
        }
    }

    private FeaturedMemberDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public FeaturedMember deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        FeaturedMember featuredMember = new FeaturedMember();
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
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (String) featuredMember)) {
                jsonParser.skipChildren();
            }
        }
        return featuredMember;
    }
}
