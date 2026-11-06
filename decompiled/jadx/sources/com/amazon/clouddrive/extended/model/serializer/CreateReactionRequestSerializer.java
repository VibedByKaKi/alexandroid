package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.CreateReactionRequest;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateReactionRequestSerializer implements JsonSerializer<CreateReactionRequest> {
    public static JsonSerializer<CreateReactionRequest> INSTANCE = new CreateReactionRequestSerializer();

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(CreateReactionRequest createReactionRequest, JsonGenerator jsonGenerator) throws IOException {
        if (createReactionRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        String kind = createReactionRequest.getKind();
        if (kind != null) {
            jsonGenerator.writeFieldName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME);
            SimpleSerializers.serializeString(kind, jsonGenerator);
        }
        String body = createReactionRequest.getBody();
        if (body != null) {
            jsonGenerator.writeFieldName("body");
            SimpleSerializers.serializeString(body, jsonGenerator);
        }
        String topic = createReactionRequest.getTopic();
        if (topic != null) {
            jsonGenerator.writeFieldName("topic");
            SimpleSerializers.serializeString(topic, jsonGenerator);
        }
        String reactionId = createReactionRequest.getReactionId();
        if (reactionId != null) {
            jsonGenerator.writeFieldName("reactionId");
            SimpleSerializers.serializeString(reactionId, jsonGenerator);
        }
        jsonGenerator.writeEndObject();
    }
}
