package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetAccountEndpointResponse;
import com.amazon.clouddrive.model.serializer.GetEndpointRequestSerializer;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetEndpointResponseSerializer implements JsonSerializer<GetAccountEndpointResponse> {
    public static final JsonSerializer<GetAccountEndpointResponse> INSTANCE = new GetEndpointResponseSerializer();
    private final GetEndpointRequestSerializer.GetEndpointResponseFieldSerializer mFieldSerializer = new GetEndpointRequestSerializer.GetEndpointResponseFieldSerializer();

    private GetEndpointResponseSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetAccountEndpointResponse getAccountEndpointResponse, JsonGenerator jsonGenerator) throws IOException {
        if (getAccountEndpointResponse == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetEndpointRequestSerializer.GetEndpointResponseFieldSerializer) getAccountEndpointResponse, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
