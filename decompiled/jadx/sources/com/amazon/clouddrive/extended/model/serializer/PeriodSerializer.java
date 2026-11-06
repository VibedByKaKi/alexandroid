package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.Period;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PeriodSerializer implements JsonSerializer<Period> {
    public static final JsonSerializer<Period> INSTANCE = new PeriodSerializer();
    private final PeriodFieldSerializer mFieldSerializer = new PeriodFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PeriodFieldSerializer implements JsonFieldSerializer<Period> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends Period> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("timeInterval");
            SimpleSerializers.serializeString(u.getTimeInterval(), jsonGenerator);
            jsonGenerator.writeFieldName("numberOfIntervals");
            SimpleSerializers.serializePrimitiveLong(u.getNumberOfIntervals(), jsonGenerator);
        }
    }

    private PeriodSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(Period period, JsonGenerator jsonGenerator) throws IOException {
        if (period == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((PeriodFieldSerializer) period, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
