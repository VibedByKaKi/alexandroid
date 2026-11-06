package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetAccountInfoResponse;
import com.amazon.clouddrive.model.serializer.GetAccountInfoRequestSerializer;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAccountInfoResponseSerializer implements JsonSerializer<GetAccountInfoResponse> {
    public static final JsonSerializer<GetAccountInfoResponse> INSTANCE = new GetAccountInfoResponseSerializer();
    private final GetAccountInfoRequestSerializer.GetAccountInfoResponseFieldSerializer mFieldSerializer = new GetAccountInfoRequestSerializer.GetAccountInfoResponseFieldSerializer();

    private GetAccountInfoResponseSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetAccountInfoResponse getAccountInfoResponse, JsonGenerator jsonGenerator) throws IOException {
        if (getAccountInfoResponse == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetAccountInfoRequestSerializer.GetAccountInfoResponseFieldSerializer) getAccountInfoResponse, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
