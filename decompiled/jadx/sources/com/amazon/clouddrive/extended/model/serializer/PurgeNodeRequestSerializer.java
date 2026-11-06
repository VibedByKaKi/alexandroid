package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.PurgeNodeRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PurgeNodeRequestSerializer implements JsonSerializer<PurgeNodeRequest> {
    public static final JsonSerializer<PurgeNodeRequest> INSTANCE = new PurgeNodeRequestSerializer();
    private final PurgeNodeRequestFieldSerializer mFieldSerializer = new PurgeNodeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PurgeNodeRequestFieldSerializer implements JsonFieldSerializer<PurgeNodeRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends PurgeNodeRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getRecurse() != null) {
                jsonGenerator.writeFieldName("recurse");
                SimpleSerializers.serializeString(u.getRecurse().toString(), jsonGenerator);
            }
        }
    }

    private PurgeNodeRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(PurgeNodeRequest purgeNodeRequest, JsonGenerator jsonGenerator) throws IOException {
        if (purgeNodeRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((PurgeNodeRequestFieldSerializer) purgeNodeRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
