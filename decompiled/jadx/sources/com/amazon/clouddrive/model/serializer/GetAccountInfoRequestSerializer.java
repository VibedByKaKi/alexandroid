package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetAccountInfoRequest;
import com.amazon.clouddrive.model.GetAccountInfoResponse;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAccountInfoRequestSerializer implements JsonSerializer<GetAccountInfoRequest> {
    public static final JsonSerializer<GetAccountInfoRequest> INSTANCE = new GetAccountInfoRequestSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetAccountInfoResponseFieldSerializer implements JsonFieldSerializer<GetAccountInfoResponse> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetAccountInfoResponse> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("termsOfUse");
            SimpleSerializers.serializeString(u.getTermsOfUse(), jsonGenerator);
            jsonGenerator.writeFieldName("status");
            SimpleSerializers.serializeString(u.getStatus(), jsonGenerator);
        }
    }

    private GetAccountInfoRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetAccountInfoRequest getAccountInfoRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getAccountInfoRequest == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeEndObject();
        }
    }
}
