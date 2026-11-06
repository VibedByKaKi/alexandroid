package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetAccountQuotaResponse;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetQuotaResponseSerializer implements JsonSerializer<GetAccountQuotaResponse> {
    public static final JsonSerializer<GetAccountQuotaResponse> INSTANCE = new GetQuotaResponseSerializer();
    private final GetQuotaResponseFieldSerializer mFieldSerializer = new GetQuotaResponseFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetQuotaResponseFieldSerializer implements JsonFieldSerializer<GetAccountQuotaResponse> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetAccountQuotaResponse> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("quota");
            SimpleSerializers.serializePrimitiveLong(u.getQuota(), jsonGenerator);
            jsonGenerator.writeFieldName("lastCalculated");
            SimpleSerializers.serializeString(u.getLastCalculated(), jsonGenerator);
            jsonGenerator.writeFieldName("available");
            SimpleSerializers.serializePrimitiveLong(u.getAvailable(), jsonGenerator);
        }
    }

    private GetQuotaResponseSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetAccountQuotaResponse getAccountQuotaResponse, JsonGenerator jsonGenerator) throws IOException {
        if (getAccountQuotaResponse == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetQuotaResponseFieldSerializer) getAccountQuotaResponse, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
