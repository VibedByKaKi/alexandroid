package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.AddChildToParentExtendedRequest;
import com.amazon.clouddrive.model.AddChildToParentRequest;
import com.amazon.clouddrive.model.serializer.AddChildRequestSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AddChildExtendedRequestSerializer implements JsonSerializer<AddChildToParentExtendedRequest> {
    public static final JsonSerializer<AddChildToParentExtendedRequest> INSTANCE = new AddChildExtendedRequestSerializer();
    private final AddChildExtendedRequestFieldSerializer mFieldSerializer = new AddChildExtendedRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AddChildExtendedRequestFieldSerializer extends AddChildRequestSerializer.AddChildRequestFieldSerializer {
        @Override // com.amazon.clouddrive.model.serializer.AddChildRequestSerializer.AddChildRequestFieldSerializer, com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends AddChildToParentRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            super.serializeFields((AddChildExtendedRequestFieldSerializer) u, jsonGenerator);
            if (u instanceof AddChildToParentExtendedRequest) {
                AddChildToParentExtendedRequest addChildToParentExtendedRequest = (AddChildToParentExtendedRequest) u;
                if (addChildToParentExtendedRequest.getChildOwnerId() != null) {
                    jsonGenerator.writeFieldName("childOwnerId");
                    SimpleSerializers.serializeString(addChildToParentExtendedRequest.getChildOwnerId(), jsonGenerator);
                }
            }
        }
    }

    private AddChildExtendedRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(AddChildToParentExtendedRequest addChildToParentExtendedRequest, JsonGenerator jsonGenerator) throws IOException {
        if (addChildToParentExtendedRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((AddChildExtendedRequestFieldSerializer) addChildToParentExtendedRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
