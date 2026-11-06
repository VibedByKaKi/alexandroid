package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.GetAccountEndpointRequest;
import com.amazon.clouddrive.model.GetAccountEndpointResponse;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetEndpointRequestSerializer implements JsonSerializer<GetAccountEndpointRequest> {
    public static final JsonSerializer<GetAccountEndpointRequest> INSTANCE = new GetEndpointRequestSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetEndpointResponseFieldSerializer implements JsonFieldSerializer<GetAccountEndpointResponse> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetAccountEndpointResponse> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("contentUrl");
            SimpleSerializers.serializeString(u.getContentUrl(), jsonGenerator);
            jsonGenerator.writeFieldName("marketplaceAtSignup");
            SimpleSerializers.serializeString(u.getMarketplaceAtSignup(), jsonGenerator);
            jsonGenerator.writeFieldName("countryAtSignup");
            SimpleSerializers.serializeString(u.getCountryAtSignup(), jsonGenerator);
            jsonGenerator.writeFieldName("customerExists");
            SimpleSerializers.serializePrimitiveBoolean(u.isCustomerExists(), jsonGenerator);
            jsonGenerator.writeFieldName("metadataUrl");
            SimpleSerializers.serializeString(u.getMetadataUrl(), jsonGenerator);
            jsonGenerator.writeFieldName("region");
            SimpleSerializers.serializeString(u.getRegion(), jsonGenerator);
            jsonGenerator.writeFieldName("retailUrl");
            SimpleSerializers.serializeString(u.getRetailUrl(), jsonGenerator);
        }
    }

    private GetEndpointRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetAccountEndpointRequest getAccountEndpointRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getAccountEndpointRequest == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeEndObject();
        }
    }
}
