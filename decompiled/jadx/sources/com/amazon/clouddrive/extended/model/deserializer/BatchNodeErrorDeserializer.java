package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.BatchNodeError;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.SimpleDeserializers;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BatchNodeErrorDeserializer implements JsonDeserializer<BatchNodeError> {
    public static final JsonDeserializer<BatchNodeError> INSTANCE = new BatchNodeErrorDeserializer();
    private final BatchNodeErrorFieldDeserializer mFieldHandler = new BatchNodeErrorFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BatchNodeErrorFieldDeserializer implements JsonFieldDeserializer<BatchNodeError> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends BatchNodeError> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if (!AlexaDeviceBackgroundImageBridge.KEY_NODE_ID.equals(str)) {
                return false;
            }
            u.setNodeId(SimpleDeserializers.deserializeString(jsonParser));
            return true;
        }
    }

    private BatchNodeErrorDeserializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public BatchNodeError deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        BatchNodeError batchNodeError = new BatchNodeError();
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
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (String) batchNodeError)) {
                jsonParser.skipChildren();
            }
        }
        return batchNodeError;
    }
}
