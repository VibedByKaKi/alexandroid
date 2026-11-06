package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.GetFacesForNodeRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetFacesForNodeRequestSerializer implements JsonSerializer<GetFacesForNodeRequest> {
    public static final JsonSerializer<GetFacesForNodeRequest> INSTANCE = new GetFacesForNodeRequestSerializer();
    private final GetFacesForNodeRequestFieldSerializer mFieldSerializer = new GetFacesForNodeRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GetFacesForNodeRequestFieldSerializer implements JsonFieldSerializer<GetFacesForNodeRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetFacesForNodeRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u.getNodeId() != null) {
                jsonGenerator.writeFieldName(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID);
                SimpleSerializers.serializeString(u.getNodeId(), jsonGenerator);
            }
        }
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetFacesForNodeRequest getFacesForNodeRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getFacesForNodeRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((GetFacesForNodeRequestFieldSerializer) getFacesForNodeRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
