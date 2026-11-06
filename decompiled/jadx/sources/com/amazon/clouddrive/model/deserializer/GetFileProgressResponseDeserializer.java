package com.amazon.clouddrive.model.deserializer;

import com.amazon.clouddrive.model.GetFileProgressResponse;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class GetFileProgressResponseDeserializer<Response extends GetFileProgressResponse> implements JsonDeserializer<Response> {
    private final UploadFileProgressFieldDeserializer mFieldHandler = new UploadFileProgressFieldDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UploadFileProgressFieldDeserializer implements JsonFieldDeserializer<GetFileProgressResponse> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public boolean handleField(JsonParser jsonParser, String str, GetFileProgressResponse getFileProgressResponse) throws IOException {
            if ("uploadState".equals(str)) {
                getFileProgressResponse.setIsProgressAvailable(true);
                getFileProgressResponse.setResumeState(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (AlexaDeviceBackgroundImageBridge.KEY_NODE_ID.equals(str)) {
                getFileProgressResponse.setNodeId(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("contentLink".equals(str)) {
                getFileProgressResponse.setContentLink(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if ("receivedBytes".equals(str)) {
                getFileProgressResponse.setBytesReceived(SimpleDeserializers.deserializeLong(jsonParser).longValue());
                return true;
            }
            if ("expectedMd5".equals(str)) {
                getFileProgressResponse.setExpectedMd5(SimpleDeserializers.deserializeString(jsonParser));
                return true;
            }
            if (!"started".equals(str)) {
                return false;
            }
            getFileProgressResponse.setStartedTime(SimpleDeserializers.deserializeString(jsonParser));
            return true;
        }
    }

    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public Response deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_OBJECT) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of object, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        Response newResponseInstance = newResponseInstance();
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
            if (!this.mFieldHandler.handleField(jsonParser, currentName, (GetFileProgressResponse) newResponseInstance)) {
                jsonParser.skipChildren();
            }
        }
        return newResponseInstance;
    }

    public abstract Response newResponseInstance();
}
