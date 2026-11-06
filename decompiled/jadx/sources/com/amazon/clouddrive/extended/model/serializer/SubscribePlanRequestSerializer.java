package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.SubscribePlanRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SubscribePlanRequestSerializer implements JsonSerializer<SubscribePlanRequest> {
    public static final JsonSerializer<SubscribePlanRequest> INSTANCE = new SubscribePlanRequestSerializer();
    private final SubscribePlanRequestFieldSerializer mFieldSerializer = new SubscribePlanRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SubscribePlanRequestFieldSerializer implements JsonFieldSerializer<SubscribePlanRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends SubscribePlanRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("planId");
            SimpleSerializers.serializeString(u.getPlanId(), jsonGenerator);
            jsonGenerator.writeFieldName("pendingPlanId");
            SimpleSerializers.serializeString(u.getPendingPlanId(), jsonGenerator);
            jsonGenerator.writeFieldName("paymentInstrumentId");
            SimpleSerializers.serializeString(u.getPaymentInstrumentId(), jsonGenerator);
            jsonGenerator.writeFieldName("marketplaceId");
            SimpleSerializers.serializeString(u.getMarketplaceId(), jsonGenerator);
        }
    }

    private SubscribePlanRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(SubscribePlanRequest subscribePlanRequest, JsonGenerator jsonGenerator) throws IOException {
        if (subscribePlanRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((SubscribePlanRequestFieldSerializer) subscribePlanRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
