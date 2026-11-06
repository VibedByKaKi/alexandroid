package com.amazon.clouddrive.model.serializer;

import com.amazon.clouddrive.model.UsageDetail;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UsageDetailSerializer implements JsonSerializer<UsageDetail> {
    public static final JsonSerializer<UsageDetail> INSTANCE = new UsageDetailSerializer();
    private final UsageDetailFieldSerializer mFieldSerializer = new UsageDetailFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UsageDetailFieldSerializer implements JsonFieldSerializer<UsageDetail> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends UsageDetail> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("bytes");
            SimpleSerializers.serializePrimitiveLong(u.getBytes(), jsonGenerator);
            jsonGenerator.writeFieldName("count");
            SimpleSerializers.serializePrimitiveLong(u.getCount(), jsonGenerator);
        }
    }

    private UsageDetailSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(UsageDetail usageDetail, JsonGenerator jsonGenerator) throws IOException {
        if (usageDetail == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((UsageDetailFieldSerializer) usageDetail, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
