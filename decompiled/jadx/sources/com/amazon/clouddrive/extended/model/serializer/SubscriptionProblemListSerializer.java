package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.SubscriptionProblem;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SubscriptionProblemListSerializer implements JsonSerializer<List<SubscriptionProblem>> {
    public static final JsonSerializer<List<SubscriptionProblem>> INSTANCE = new SubscriptionProblemListSerializer();

    private SubscriptionProblemListSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(List<SubscriptionProblem> list, JsonGenerator jsonGenerator) throws IOException {
        if (list == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartArray();
        Iterator<SubscriptionProblem> it2 = list.iterator();
        while (it2.hasNext()) {
            SubscriptionProblemSerializer.INSTANCE.serialize(it2.next(), jsonGenerator);
        }
        jsonGenerator.writeEndArray();
    }
}
