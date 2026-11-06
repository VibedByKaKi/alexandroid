package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.clouddrive.extended.model.ResubscribeRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ResubscribeRequestSerializer implements JsonSerializer<ResubscribeRequest> {
    public static final JsonSerializer<ResubscribeRequest> INSTANCE = new ResubscribeRequestSerializer();
    private final ResubscribeRequestFieldSerializer mFieldSerializer = new ResubscribeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ResubscribeRequestFieldSerializer implements JsonFieldSerializer<ResubscribeRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends ResubscribeRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("planIdToSubscribe");
            SimpleSerializers.serializeString(u.getPlanIdToSubscribe(), jsonGenerator);
            jsonGenerator.writeFieldName("pendingPlanId");
            SimpleSerializers.serializeString(u.getPendingPlanId(), jsonGenerator);
            jsonGenerator.writeFieldName("marketplaceId");
            SimpleSerializers.serializeString(u.getMarketplaceId(), jsonGenerator);
            jsonGenerator.writeFieldName("paymentInstrumentId");
            SimpleSerializers.serializeString(u.getPaymentInstrumentId(), jsonGenerator);
            jsonGenerator.writeFieldName(WebConstants.UriConstants.SUBSCRIPTION_ID);
            SimpleSerializers.serializeString(u.getSubscriptionId(), jsonGenerator);
            jsonGenerator.writeFieldName("refundPercent");
            SimpleSerializers.serializeDouble(u.getRefundPercent(), jsonGenerator);
        }
    }

    private ResubscribeRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(ResubscribeRequest resubscribeRequest, JsonGenerator jsonGenerator) throws IOException {
        if (resubscribeRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((ResubscribeRequestFieldSerializer) resubscribeRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
