package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.BulkResponse;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.SimpleDeserializers;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class BulkResponseFieldDeserializer implements JsonFieldDeserializer<BulkResponse> {
    @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
    public <U extends BulkResponse> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
        if ("errorMap".equals(str)) {
            u.setErrorMap(ErrorMapDeserializer.INSTANCE.deserialize(jsonParser));
            return true;
        }
        if (!"message".equals(str)) {
            return false;
        }
        u.setMessage(SimpleDeserializers.deserializeString(jsonParser));
        return true;
    }
}
