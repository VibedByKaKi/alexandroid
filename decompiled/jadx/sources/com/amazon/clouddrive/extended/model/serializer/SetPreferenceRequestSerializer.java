package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.SetPreferenceRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import com.dee.app.contacts.common.network.gateway.PreferenceServiceGateway;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetPreferenceRequestSerializer implements JsonSerializer<SetPreferenceRequest> {
    public static final JsonSerializer<SetPreferenceRequest> INSTANCE = new SetPreferenceRequestSerializer();
    private final SetPreferenceRequestFieldSerializer mFieldSerializer = new SetPreferenceRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SetPreferenceRequestFieldSerializer implements JsonFieldSerializer<SetPreferenceRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends SetPreferenceRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName(PreferenceServiceGateway.PREFERENCE_VALUE);
            SimpleSerializers.serializeString(u.getPreferenceValue(), jsonGenerator);
        }
    }

    private SetPreferenceRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(SetPreferenceRequest setPreferenceRequest, JsonGenerator jsonGenerator) throws IOException {
        if (setPreferenceRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((SetPreferenceRequestFieldSerializer) setPreferenceRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
