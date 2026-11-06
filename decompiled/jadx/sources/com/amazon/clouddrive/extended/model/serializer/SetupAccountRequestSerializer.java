package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.SetupAccountRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetupAccountRequestSerializer implements JsonSerializer<SetupAccountRequest> {
    public static final JsonSerializer<SetupAccountRequest> INSTANCE = new SetupAccountRequestSerializer();
    private final SetupAccountRequestFieldSerializer mFieldSerializer = new SetupAccountRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SetupAccountRequestFieldSerializer implements JsonFieldSerializer<SetupAccountRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends SetupAccountRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("termsOfUse");
            SimpleSerializers.serializeString(u.getTermsOfUse(), jsonGenerator);
        }
    }

    private SetupAccountRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(SetupAccountRequest setupAccountRequest, JsonGenerator jsonGenerator) throws IOException {
        if (setupAccountRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((SetupAccountRequestFieldSerializer) setupAccountRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
