package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.BulkGetReactionSummariesRequest;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleListSerializers;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkGetReactionSummariesRequestSerializer implements JsonSerializer<BulkGetReactionSummariesRequest> {
    public static JsonSerializer<BulkGetReactionSummariesRequest> INSTANCE = new BulkGetReactionSummariesRequestSerializer();

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(BulkGetReactionSummariesRequest bulkGetReactionSummariesRequest, JsonGenerator jsonGenerator) throws IOException {
        if (bulkGetReactionSummariesRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        List<String> topics = bulkGetReactionSummariesRequest.getTopics();
        if (topics != null) {
            jsonGenerator.writeFieldName("topics");
            SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(topics, jsonGenerator);
        }
        jsonGenerator.writeEndObject();
    }
}
