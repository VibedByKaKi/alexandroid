package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.UsageDetail;
import com.amazon.clouddrive.model.UsageSummary;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UsageSummarySerializer implements JsonSerializer<UsageSummary> {
    public static final JsonSerializer<UsageSummary> INSTANCE = new UsageSummarySerializer();
    private final UsageSummaryFieldSerializer mFieldSerializer = new UsageSummaryFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UsageSummaryFieldSerializer implements JsonFieldSerializer<UsageSummary> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends UsageSummary> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("billable");
            JsonSerializer<UsageDetail> jsonSerializer = UsageDetailSerializer.INSTANCE;
            jsonSerializer.serialize(u.getBillable(), jsonGenerator);
            jsonGenerator.writeFieldName("total");
            jsonSerializer.serialize(u.getTotal(), jsonGenerator);
        }
    }

    private UsageSummarySerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(UsageSummary usageSummary, JsonGenerator jsonGenerator) throws IOException {
        if (usageSummary == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((UsageSummaryFieldSerializer) usageSummary, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
