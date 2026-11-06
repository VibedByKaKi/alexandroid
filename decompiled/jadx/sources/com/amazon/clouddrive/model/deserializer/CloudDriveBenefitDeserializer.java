package com.amazon.clouddrive.model.deserializer;

import com.amazon.alexa.benefits.consumer.BenefitsConsumerConstants;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.clouddrive.model.CloudDriveBenefit;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CloudDriveBenefitDeserializer implements JsonDeserializer<CloudDriveBenefit> {
    public static final JsonDeserializer<CloudDriveBenefit> INSTANCE = new CloudDriveBenefitDeserializer();
    private final CloudDriveBenefitFieldDeserializer mFieldHandler = new CloudDriveBenefitFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CloudDriveBenefitFieldDeserializer implements JsonFieldDeserializer<CloudDriveBenefit> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends CloudDriveBenefit> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if (FragmentMetaData.EXPIRATION.equals(str)) {
                u.setExpiration(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (!BenefitsConsumerConstants.COLUMN_BENEFIT.equals(str)) {
                return false;
            }
            u.setBenefit(SimpleDeserializers.deserializeString(jsonParser));
            return true;
        }
    }

    private CloudDriveBenefitDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public CloudDriveBenefit deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        CloudDriveBenefit cloudDriveBenefit = new CloudDriveBenefit();
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
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (String) cloudDriveBenefit)) {
                jsonParser.skipChildren();
            }
        }
        return cloudDriveBenefit;
    }
}
