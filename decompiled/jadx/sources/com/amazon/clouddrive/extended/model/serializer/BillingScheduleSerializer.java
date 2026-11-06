package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.BillingSchedule;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BillingScheduleSerializer implements JsonSerializer<BillingSchedule> {
    public static final JsonSerializer<BillingSchedule> INSTANCE = new BillingScheduleSerializer();
    private final BillingScheduleFieldSerializer mFieldSerializer = new BillingScheduleFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BillingScheduleFieldSerializer implements JsonFieldSerializer<BillingSchedule> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends BillingSchedule> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("billingPeriod");
            PeriodSerializer.INSTANCE.serialize(u.getBillingPeriod(), jsonGenerator);
            jsonGenerator.writeFieldName("currencyCode");
            SimpleSerializers.serializeString(u.getCurrencyCode(), jsonGenerator);
            jsonGenerator.writeFieldName("price");
            SimpleSerializers.serializeString(u.getPrice(), jsonGenerator);
        }
    }

    private BillingScheduleSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(BillingSchedule billingSchedule, JsonGenerator jsonGenerator) throws IOException {
        if (billingSchedule == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((BillingScheduleFieldSerializer) billingSchedule, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
