package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.SubscriptionProblem;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SubscriptionProblemSerializer implements JsonSerializer<SubscriptionProblem> {
    public static final JsonSerializer<SubscriptionProblem> INSTANCE = new SubscriptionProblemSerializer();
    private final SubscriptionProblemFieldSerializer mFieldSerializer = new SubscriptionProblemFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SubscriptionProblemFieldSerializer implements JsonFieldSerializer<SubscriptionProblem> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends SubscriptionProblem> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("effectiveDate");
            SimpleSerializers.serializeString(u.getEffectiveDate(), jsonGenerator);
            jsonGenerator.writeFieldName("billingPeriodNumber");
            SimpleSerializers.serializePrimitiveLong(u.getBillingPeriodNumber(), jsonGenerator);
            jsonGenerator.writeFieldName("problemID");
            SimpleSerializers.serializeString(u.getProblemID(), jsonGenerator);
            jsonGenerator.writeFieldName("problemCode");
            SimpleSerializers.serializeString(u.getProblemCode(), jsonGenerator);
            jsonGenerator.writeFieldName("problemStatus");
            SimpleSerializers.serializeString(u.getProblemStatus(), jsonGenerator);
        }
    }

    private SubscriptionProblemSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(SubscriptionProblem subscriptionProblem, JsonGenerator jsonGenerator) throws IOException {
        if (subscriptionProblem == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((SubscriptionProblemFieldSerializer) subscriptionProblem, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
