package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.GetFamilyChangesRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetFamilyChangesRequestSerializer implements JsonSerializer<GetFamilyChangesRequest> {
    public static final JsonSerializer<GetFamilyChangesRequest> INSTANCE = new GetFamilyChangesRequestSerializer();
    private final GetFamilyChangesRequestFieldSerializer mFieldSerializer = new GetFamilyChangesRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetFamilyChangesRequestFieldSerializer implements JsonFieldSerializer<GetFamilyChangesRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetFamilyChangesRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getCheckpoint() != null && u.getCheckpoint().length() > 0) {
                jsonGenerator.writeFieldName("checkpoint");
                SimpleSerializers.serializeString(u.getCheckpoint(), jsonGenerator);
            }
            if (u.getIncludePurged() == null || u.getIncludePurged().length() <= 0) {
                return;
            }
            jsonGenerator.writeFieldName("includePurged");
            SimpleSerializers.serializeString(u.getIncludePurged(), jsonGenerator);
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(GetFamilyChangesRequest getFamilyChangesRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getFamilyChangesRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetFamilyChangesRequestFieldSerializer) getFamilyChangesRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
