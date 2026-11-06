package com.amazon.clouddrive.model.deserializer;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.clouddrive.model.PaginatedCloudDriveResponse;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PaginatedCloudDriveResponseFieldDeserializer implements JsonFieldDeserializer<PaginatedCloudDriveResponse> {
    @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
    public <U extends PaginatedCloudDriveResponse> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
        if (AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN.equals(str)) {
            u.setNextToken(SimpleDeserializers.deserializeString(jsonParser));
            return true;
        }
        if (!"count".equals(str)) {
            return false;
        }
        u.setCount(SimpleDeserializers.deserializeInteger(jsonParser).intValue());
        return true;
    }
}
